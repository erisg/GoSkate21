package skate.bogota.authgoskate.ui


import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.newuser.*
import skate.bogota.authgoskate.R
import skate.bogota.authgoskate.viewModel.AuthViewModel


class NewUser : AppCompatActivity(), RadioGroup.OnCheckedChangeListener {

    var gender: String = ""
    private val authViewModel by lazy { AuthViewModel(application) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newuser)


        btnNewusers.setOnClickListener {

            var name = nameRegis.text.toString().trim()
            var email = emailNew.text.toString().trim()
            var password = passNewU.text.toString().trim()
            var gendeer = "F"
            var age = ageUser.text.toString().trim()


            if (name.isEmpty()) {
                nameRegis.requestFocus()
                return@setOnClickListener
            }
            if (email.isEmpty()) {
                emailNew.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                passNewU.requestFocus()
                return@setOnClickListener
            }

            if (gendeer.isEmpty()) {
                Toast.makeText(this, "Genero Requerido", Toast.LENGTH_LONG).show()
            }
            if (age.isEmpty()) {
                ageUser.requestFocus()
                return@setOnClickListener
            }

            if(name.isNullOrEmpty() || email.isNullOrEmpty() || password.isNullOrEmpty() || gendeer.isNullOrEmpty() || age.isNullOrEmpty()){
                Toast.makeText(this.applicationContext, "FALTAN DATOS", Toast.LENGTH_LONG).show()
            }else{
                authViewModel.registrerData(name, email ,password , gendeer ,age)
                Toast.makeText(this.applicationContext, "EXITO", Toast.LENGTH_LONG).show()
            }


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