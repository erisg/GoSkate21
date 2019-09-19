package helper.permissions

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

class Networks {

    /**
     * Obtiene el estado del internet
     * @return true si cumple de lo contrario false
     */
    fun getInternetConnection(activity: Activity): Boolean {
        val activeNetworkInfo: NetworkInfo? = (activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo
        return activeNetworkInfo?.isConnected ?: false
    }
}