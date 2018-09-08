package com.raymond.mockgag.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import mockgag.raymond.com.model.GagWrapper

class GagListViewModel: ViewModel() {
    var gagList: LiveData<PagedList<GagWrapper>>? = null

    private val pageSize = 10

    init {
        val config = PagedList.Config.Builder()
                .setPageSize(pageSize)
                .setInitialLoadSizeHint(pageSize)
                .setEnablePlaceholders(true)
                .build()


//        gagList = LiveP
    }
}