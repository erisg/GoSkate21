package skate.bogota.authgoskate.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import skate.bogota.goskaterepository.AuthRepository


class AuthViewModel(application: Application) : AndroidViewModel(application) {

    private val authRepository = AuthRepository(application)


    /***
     * Funcion que trae info del registro de usuario y la envia a el repository
     * @author : Geral
     * @version : 09/18/2019
     */

    fun registrerData(name: String, email: String, password: String, gendeer: String, age: String) {
        this.authRepository.registrerData(name, email, password, gendeer, age)
    }


    /**
     * Funcion que trae info del login de usuario y la envia a el repository
     * @author : Geral
     * @version : 09/22/2019
     */

    fun infoLoginUser(email: String , password: String){
        this.authRepository.lgoginUser(email, password)
    }

}

