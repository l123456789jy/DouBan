package com.douban.kt.adapter


/**
 *
 * 项目名称：DouBan
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2018/9/29 10:41
 * 修改人：Administrator
 * 修改时间：2018/9/29 10:41
 * 修改备注：
 * 联系方式：906514731@qq.com
 * @version
 *
 */
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.douban.kt.App
import com.douban.kt.R
import com.douban.kt.enty.EntriesItem
import com.douban.kt.enty.NowSHowMove
import kotlinx.android.synthetic.main.item_now_show_move.view.*

class NowShowMoveAdapter(private val mNowSHowMove: NowSHowMove) : RecyclerView.Adapter<NowShowMoveAdapter.RecyclerHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, postion: Int): RecyclerHolder {
        val view = LayoutInflater.from(App.instance).inflate(R.layout.item_now_show_move, parent, false)
        return RecyclerHolder(view);
    }

    override fun getItemCount(): Int {
        return mNowSHowMove.entries!!.size;
    }

    override fun onBindViewHolder(vh: RecyclerHolder, postion: Int) {
        vh.setData(mNowSHowMove.entries!![postion]);
    }

    class RecyclerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(entriesItem: EntriesItem) {
            itemView.tv.text=entriesItem.title;
            itemView.tv_show_time.text="上映时间： "+entriesItem.pubdate;
            itemView.tv_rating.text="评分： "+entriesItem.rating;
            Glide.with(itemView.context).load(entriesItem.images.large!!).into(itemView.iv);
        }
    }


}