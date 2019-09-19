package helper.dialog

import android.app.Fragment
import androidx.appcompat.app.AppCompatActivity


abstract  class  FragmentPage : Fragment(){
   abstract fun chargeFragment()
   abstract fun dischargeFragment()
   abstract fun permissionResult(requestPermission : Int,permissions: Array<out String>, activity : AppCompatActivity)
}
