package skate.bogota.goskaterepository

import android.app.Application
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import skate.bogota.webservicegoskate.AuthService.GoSkateRest
import skate.bogota.webservicegoskate.AuthService.ResponseUser

class AuthRepository(application: Application)  {


    fun registrerData(name : String, email:String, password:String , gendeer:String ,age:String){

        GoSkateRest.instance.postUser(name, email , password , gendeer ,age )
            .enqueue(object : Callback<ResponseUser> {

                override fun onFailure(call: Call<ResponseUser>, t: Throwable) {
                    Log.w("UUU","${t.message}")
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