package skate.bogota.webservicegoskate

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import skate.bogota.webservicegoskate.AuthService.ResponseUser

interface ServicePost  {

    @FormUrlEncoded
    @POST("api/auth/signup")
    fun postUser(@Field("name")name:String,
                 @Field("email")email:String,
                 @Field("password")password:String,
                 @Field("gender")age:String,
                 @Field("age")gender: String): Call<ResponseUser>
}