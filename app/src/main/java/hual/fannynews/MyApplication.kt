package hual.fannynews

import android.app.Application

/**
 * Created by zhanghui on 2018/5/14.
 */
class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        mContext = this
    }

    // 一部分静态方法存放模块
    companion object {

        private var mContext:MyApplication? = null

        fun getInstance() : MyApplication? {
            return mContext
        }
    }
}