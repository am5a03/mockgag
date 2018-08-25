package mockgag.raymond.com.model.api

data class ApiPostListResponse(override val meta: Meta, val data: Data): ApiBaseResponse(meta) {
    class Data(val gags: List<ApiGag>,
               val has_next: Boolean,
               val next_page: String)
}