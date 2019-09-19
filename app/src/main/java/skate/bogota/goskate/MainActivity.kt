package skate.bogota.goskate

import android.Manifest
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.annotation.RequiresApi
import helper.PermissionUtils
import helper.permissions.Networks
import skate.bogota.authgoskate.ui.login

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, login::class.java))
        finish()

        validateInternet()
    }


    companion object {
        //obtener estos permisos al inicio de la aplicacion
        val permissions = arrayOf(
            Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.ACCESS_FINE_LOCATION
        )


    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun validateInternet(){
        Handler(Looper.getMainLooper()).postDelayed({
            if (!PermissionUtils(this).checkPermission(Manifest.permission.READ_PHONE_STATE))
                PermissionUtils(this).requestPermission(permissions, 1)
            else {
                if (Networks().getInternetConnection(this)) {
                    var response: String? = null

                }
            }
        }, 0)
    }

}
