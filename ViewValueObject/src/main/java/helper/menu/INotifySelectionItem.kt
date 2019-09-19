package helper.menu

import android.app.Fragment


/**
 * Interface que notifica la selección sobre el menú
 */
interface INotifySelectionItem {
    /**
     * Método encargado de notificar la posición seleccionada y si anima o no
     * la transición entre páginas
     *
     * @param position posición que se selecciona en el menú
     * @param smoothScroll si anima o no la transición entre páginas
     */
    fun onItemListSelected(position: Int,smoothScroll : Boolean)

    fun onChangeNextPage(fragmentTab: Fragment?)

    fun onChangePreviousPage(fragmentTab: Fragment?)

    fun validateRequiredPage(fragmentTab: Fragment?,complete:Boolean)
}
