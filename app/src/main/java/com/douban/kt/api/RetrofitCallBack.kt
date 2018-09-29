package com.douban.kt.api

import retrofit2.Response

/**
 *
 * 项目名称：DouBan
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2018/9/29 9:48
 * 修改人：Administrator
 * 修改时间：2018/9/29 9:48
 * 修改备注：
 * 联系方式：906514731@qq.com
 * @version
 *
 */
interface RetrofitCallBack<T> {
    fun succes(response:Response<T>);
    fun faile();
}