package com.douban.kt.api

import com.douban.kt.enty.NowSHowMove
import retrofit2.Call
import retrofit2.http.GET

/**
 *
 * 项目名称：DouBan
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2018/9/28 16:42
 * 修改人：Administrator
 * 修改时间：2018/9/28 16:42
 * 修改备注：
 * 联系方式：906514731@qq.com
 * @version
 *  http://api.douban.com/v2/movie/nowplaying?apikey=0df993c66c0c636e29ecbb5344252a4a
 */
interface DouBanApi {
    @GET("nowplaying?apikey=0df993c66c0c636e29ecbb5344252a4a")
    fun getNowSHowingMove(): Call<NowSHowMove>
}