package com.raymond.mockgag.api.model

data class ApiGag(val _id: Long,
                  val title: String = "",
                  val type: String = "",
                  val url: String = "",
                  val width: Int = 0,
                  val height: Int = 0,
                  val nsfw: Int = 0
)