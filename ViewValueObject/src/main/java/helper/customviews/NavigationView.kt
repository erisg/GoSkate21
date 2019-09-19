package helper.customviews

import android.app.Fragment
import android.content.Context
import android.util.AttributeSet
import android.view.ViewTreeObserver
import android.widget.LinearLayout
import helper.menu.INotifySelectionItem
import skate.bogota.viewvalueobject.R

class NavigationView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(context, attrs, defStyleAttr), INotifySelectionItem
    , ViewTreeObserver.OnGlobalLayoutListener{


    private var backgroundDarkTransparent: String? = null


    init {
        initView()
        backgroundDarkTransparent = context.theme.obtainStyledAttributes(attrs, R.styleable.LeftMenuView, 0, 0).getString(R.styleable.LeftMenuView_backgroundDarkTransparent)
        if (backgroundDarkTransparent == null) {
            backgroundDarkTransparent = "#00FFFFFF"
        } else {
          //  item.setPadding(0, 0, 0, 0)
        }
    }



    private fun initView() {
        inflate(context, R.layout.menuview, this)
    }


    override fun onItemListSelected(position: Int, smoothScroll: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onChangeNextPage(fragmentTab: Fragment?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onChangePreviousPage(fragmentTab: Fragment?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun validateRequiredPage(fragmentTab: Fragment?, complete: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onGlobalLayout() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}