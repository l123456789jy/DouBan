package com.douban.kt.api

import com.douban.kt.enty.NowSHowMove
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 *
 * 项目名称：DouBan
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2018/9/29 9:09
 * 修改人：Administrator
 * 修改时间：2018/9/29 9:09
 * 修改备注：
 * 联系方式：906514731@qq.com
 * @version
 *
 */
class DoubanRetrofit {
     fun getData( ca:RetrofitCallBack<NowSHowMove>) {
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl("http://api.douban.com/v2/movie/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val ipService = retrofit.create(DouBanApi::class.java)

        ipService.getNowSHowingMove().enqueue(object:Callback<NowSHowMove>{
            override fun onResponse(call: Call<NowSHowMove>?, response: Response<NowSHowMove>?) {
                if (response != null) {
                    ca?.succes(response)
                };

            }

            override fun onFailure(call: Call<NowSHowMove>?, t: Throwable?) {

            }

        })

    }

}