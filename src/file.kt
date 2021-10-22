import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
fun main(){
    val userRegistrationRequest = UserRegistrarionRequest(
        "adekvatnij@mail.ru",
    "cheburek",
    "larrys"
    )
    val request = Repository
        .userReference
        .registration(userRegistrationRequest)
    val responce = request.execute()
    println(responce.message())
    println(responce.code())
    println(responce.headers())
    println(responce.body())
    val userRequestAuthorization = UserRequestAuthorization(
        "adekvatnij@mail.ru",
        "cheburek"
    )
    val borsig = Repository
        .userReference
        .authorization(userRequestAuthorization)
    val rhm = borsig.execute()
    println(rhm.message())
    println(rhm.code())
    println(rhm.headers())
    println(rhm.body())
}