package com.douban.kt.enty


import com.google.gson.annotations.SerializedName

data class Images(@SerializedName("small")
                  val small: String = "",
                  @SerializedName("large")
                  val large: String = "",
                  @SerializedName("medium")
                  val medium: String = "")


data class NowSHowMove(@SerializedName("total")
                       val total: Int = 0,
                       @SerializedName("entries")
                       val entries: List<EntriesItem>?,
                       @SerializedName("title")
                       val title: String = "")


data class EntriesItem(@SerializedName("wish")
                       val wish: Int = 0,
                       @SerializedName("orignal_title")
                       val orignalTitle: String = "",
                       @SerializedName("images")
                       val images: Images,
                       @SerializedName("original_title")
                       val originalTitle: String = "",
                       @SerializedName("rating")
                       val rating: String = "",
                       @SerializedName("collection")
                       val collection: Int = 0,
                       @SerializedName("stars")
                       val stars: String = "",
                       @SerializedName("id")
                       val id: String = "",
                       @SerializedName("title")
                       val title: String = "",
                       @SerializedName("pubdate")
                       val pubdate: String = "")


