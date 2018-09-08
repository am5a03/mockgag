package com.raymond.mockgag.data

import com.raymond.mockgag.api.ApiService
import javax.inject.Inject

class PostRepository @Inject constructor(
        private val api: ApiService
) {
}