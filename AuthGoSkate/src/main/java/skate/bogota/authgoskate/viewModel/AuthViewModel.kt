package skate.bogota.authgoskate.viewModel

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import skate.bogota.authgoskate.ui.NewUser
import skate.bogota.webservicegoskate.AuthService.GoSkateRest
import skate.bogota.webservicegoskate.AuthService.ResponseUser


class AuthViewModel(application: Application) : AndroidViewModel(application){


    fun registrerData(name : String, email:String, password:String , gendeer:String ,age:String){

        GoSkateRest.instance.postUser(name, email , password , gendeer ,age )
            .enqueue(object : Callback<ResponseUser> {

                override fun onFailure(call: Call<ResponseUser>, t: Throwable) {
                    Log.w("FFF","${t.message}")
                }


                override fun onResponse(
                    call: Call<ResponseUser>,
                    response: Response<ResponseUser>
                ) {
                    Log.w("FFF","${response.body()?.message}")
                }

            })
    }

    }

