package hual.fannynews.Utils

import android.widget.Toast
import hual.fannynews.MyApplication

/**
 * Created by zhanghui on 2018/5/14.
 */

object ToastUtils {
    fun showTxt(text: String){
        Toast.makeText(MyApplication.getInstance(), text, Toast.LENGTH_LONG).show()
    }
}