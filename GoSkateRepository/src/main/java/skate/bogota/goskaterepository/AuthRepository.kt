package skate.bogota.goskaterepository

import android.app.Application
import android.util.Log
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import skate.bogota.webservicegoskate.AuthService.GoSkateRest
import skate.bogota.webservicegoskate.AuthService.ResponseUser

class AuthRepository(application: Application)  {


    /***
     * Funcion que recibe informacion del view model para insertar al servicio
     * @author : Geral
     * @author: 09/18/2019
     */

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



    /***
     * Funcion que recibe informacion del view model para insertar al servicio de Login
     * @author : Geral
     * @author: 09/20/2019
     */

    fun lgoginUser(email:String, password:String){

        GoSkateRest.instance.postUserLogin(email,password)
            .enqueue(object : Callback<ResponseUser>{

                override fun onFailure(call: Call<ResponseUser>, t: Throwable) {
                    Log.w("UUU","${t.message}")
                }

                override fun onResponse(
                    call: Call<ResponseUser>,
                    response: Response<ResponseUser>
                ) {
                    Log.w("UUU","${response.message()}")
                }

            })
    }

}