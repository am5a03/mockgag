package com.raymond.mockgag.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Gag {
    // API URL = https://mock-api.9gaginc.com/
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

    var title: String? = ""

    var type: String = ""

    var url: String = ""

    var width: Int = 0

    var height: Int = 0

    var nsfw: Int = 0
}