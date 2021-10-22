import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

const val API_KEY = "YmY3MzY0OTEtN2Q3MC00OTcwLTgwMWMtN2U3NDZkOTE2NzMw"
interface UserReference {
    @Headers("Authorization: Bearer $API_KEY")
    @POST("v1/user/Create")
    fun registration(
        @Body userRegistrarionRequest: UserRegistrarionRequest
    ): Call<UserRegistrationResponce>
    @Headers("Authorization: Bearer $API_KEY")
    @POST("v1/user/Login")
    fun authorization(
        @Body userRequestAuthorization:  UserRequestAuthorization
    ): Call<session>
}
