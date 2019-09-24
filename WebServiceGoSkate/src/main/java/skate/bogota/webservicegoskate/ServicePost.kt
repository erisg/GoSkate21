package skate.bogota.webservicegoskate

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import skate.bogota.webservicegoskate.AuthService.ResponseUser

interface ServicePost  {


    /**
     * Funcion que inserta los datos de registro de usuario  al servicio
     * @author : Geral
     * @version : 09/18/2019
     */


    @FormUrlEncoded
    @POST("api/auth/signup")
    fun postUser(@Field("name")name:String,
                 @Field("email")email:String,
                 @Field("password")password:String,
                 @Field("gender")age:String,
                 @Field("age")gender: String): Call<ResponseUser>

    /**
     * Funcion que inserta los datos del login al servicio
     * @author : Geral
     * @version : 09/22/2019
     */

    @FormUrlEncoded
    @POST("api/auth/login")
    fun postUserLogin(@Field("name")email:String,
                      @Field("password")password:String): Call<ResponseUser>


}