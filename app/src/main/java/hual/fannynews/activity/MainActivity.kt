package hual.fannynews.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import hual.fannynews.R
import hual.fannynews.Utils.ToastUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ToastTest(view: View?) {
        ToastUtils.showTxt("hello kotlin!")
    }
}
