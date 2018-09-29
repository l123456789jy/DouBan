package com.douban.kt

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.douban.kt.adapter.NowShowMoveAdapter
import com.douban.kt.api.DoubanRetrofit
import com.douban.kt.api.RetrofitCallBack
import com.douban.kt.enty.NowSHowMove
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Response

class MainActivity : AppCompatActivity(), RetrofitCallBack<NowSHowMove> {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DoubanRetrofit().getData(this);
    }

    override fun succes(response: Response<NowSHowMove>) {
        rv.adapter= NowShowMoveAdapter(response.body()!!);
    }


    override fun faile() {

    }


}
