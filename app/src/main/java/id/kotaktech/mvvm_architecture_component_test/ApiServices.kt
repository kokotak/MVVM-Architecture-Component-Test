package id.kotaktech.mvvm_architecture_component_test

import io.reactivex.Single
import retrofit2.http.POST

//AppConstant

const val BASE_URL = "https://still-temple-51886.herokuapp.com"
const val REGISTER = "api/v1/user/register"

interface ApiServices {
    @POST(REGISTER)
    fun register(bodyRegister: BodyRegister): Single<RegisterResponse>
}