package id.kotaktech.mvvm_architecture_component_test

import io.reactivex.Single

interface DataRepository {
    fun register(bodyRegister: BodyRegister): Single<RegisterResponse>
    fun services(): ApiServices
}