package skate.bogota.authgoskate.ui


import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import helper.permissions.GenericAsync
import helper.permissions.Networks
import helper.PermissionUtils
import kotlinx.android.synthetic.main.login.*

import skate.bogota.authgoskate.R
import skate.bogota.authgoskate.viewModel.AuthViewModel


class login : AppCompatActivity() {

    private val authViewModel by lazy { AuthViewModel(application) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        /**
         * Valida si el usuario esta registrado si esta registrado ingresa a la apagina de inicio si no muestra un mensaje de indicando que es necesario el registro
         * @author : Geral
         * @version : 09/22/2019
         */

        btnLogin.setOnClickListener {
            validateLogin()
        }

        /**
         * Inicia actividad para registro de usuario
         * @author : Geral
         * @version : 09/10/2019
         */


        btnRegistro.setOnClickListener {
            startActivity(Intent(this, NewUser::class.java))
        }

    }

    /**
     *Funcion que valida que los campos esten bien diligenciados
     * @author : Geral
     * @version : 09/22/2019
     */

    fun validateLogin(){

        var email = emailLogin.text.toString().trim()
        var password = passwordLogin.text.toString().trim()

        if(email.isNullOrEmpty()){
            Toast.makeText(this.applicationContext, "FALTA EMAIL", Toast.LENGTH_LONG).show()
        }else if (password.isNullOrEmpty()){
            Toast.makeText(this.applicationContext, "FALTA PASSWORD", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this.applicationContext, "EXITO", Toast.LENGTH_LONG).show()
            authViewModel.infoLoginUser(email , password)
        }
    }
}
