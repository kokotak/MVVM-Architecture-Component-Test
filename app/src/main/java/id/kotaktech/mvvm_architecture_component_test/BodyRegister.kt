package id.kotaktech.mvvm_architecture_component_test

import com.google.gson.annotations.SerializedName

data class BodyRegister(

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("username")
	val username: String? = null
)
