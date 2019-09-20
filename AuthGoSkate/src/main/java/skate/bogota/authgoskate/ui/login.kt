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


class login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        btnRegistro.setOnClickListener {
            startActivity(Intent(this,NewUser::class.java))
        }

    }
}
