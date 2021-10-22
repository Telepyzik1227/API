import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Repository {
    val jsonPlaceHolderURL = "https://api.m3o.com"
    val retrofit = Retrofit.Builder()
        .baseUrl(jsonPlaceHolderURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val userReference = retrofit.create(UserReference::class.java)
}