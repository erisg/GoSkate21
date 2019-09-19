package skate.bogota.authgoskate.ui

import android.os.Bundle
import android.renderscript.Sampler
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.newuser.*
import retrofit2.Callback
import skate.bogota.authgoskate.Presenter
import skate.bogota.authgoskate.R
import skate.bogota.authgoskate.databinding.ActivityMainBinding
import skate.bogota.authgoskate.viewModel.AuthViewModel
import skate.bogota.viewvalueobject.UserVO
import skate.bogota.webservicegoskate.AuthService.GoSkateRest
import skate.bogota.webservicegoskate.AuthService.ResponseUser

class NewUser : AppCompatActivity(), RadioGroup.OnCheckedChangeListener {

    var gender: String = ""
    private val authViewModel by lazy { AuthViewModel(application) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newuser)


        btnNewuser.setOnClickListener {

            var name = nameRegis.text.toString().trim()
            var email = emailNew.text.toString().trim()
            var password = passNewU.text.toString().trim()
            var gendeer = "F"
            var age = ageUser.text.toString().trim()


            if (name.isEmpty()) {
                nameRegis.error = "Nombre Requerido"
                nameRegis.requestFocus()
                return@setOnClickListener
            }
            if (email.isEmpty()) {
                emailNew.error = "Email Requerido"
                emailNew.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                passNewU.error = "Contraseña Requerido"
                passNewU.requestFocus()
                return@setOnClickListener
            }

            if (gendeer.isEmpty()) {
                Toast.makeText(this, "Genero Requerido", Toast.LENGTH_LONG).show()
            }
            if (age.isEmpty()) {
                ageUser.error = "Edad Requerido"
                ageUser.requestFocus()
                return@setOnClickListener
            }
            authViewModel.registrerData(name, email ,password , gendeer ,age)



        }
    }


    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {

        if (checkedId == R.id.btnWomen) {
            gender = "F"
        } else if (checkedId == R.id.btnMen) {
            gender = "M"
        }
    }


}