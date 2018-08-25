package mockgag.raymond.com.model.api

abstract class ApiBaseResponse(open val meta: Meta) {
    data class Meta(val code: Int)
}