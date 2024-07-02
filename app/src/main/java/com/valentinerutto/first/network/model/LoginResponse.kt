package com.valentinerutto.first.network.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    @SerialName("data")
    val `data`: Data?,
    @SerialName("message")
    val message: String?
) {
    @Serializable
    data class Data(
        @SerialName("email")
        val email: String?,
        @SerialName("fullName")
        val fullName: String?,
        @SerialName("id")
        val id: Int?,
        @SerialName("token")
        val token: String?
    )
}