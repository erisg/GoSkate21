package skate.bogota.authgoskate.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import skate.bogota.goskaterepository.AuthRepository


class AuthViewModel(application: Application) : AndroidViewModel(application) {

    private val authRepository = AuthRepository(application)


    fun registrerData(name: String, email: String, password: String, gendeer: String, age: String) {
        this.authRepository.registrerData(name, email, password, gendeer, age)
    }

}

