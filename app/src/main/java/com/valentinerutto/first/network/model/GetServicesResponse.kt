package com.valentinerutto.first.network.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetServicesResponse(
    @SerialName("data")
    val `data`: List<Data?>?,
    @SerialName("message")
    val message: String?
) {
    @Serializable
    data class Data(
        @SerialName("discountPercent")
        val discountPercent: Int?,
        @SerialName("id")
        val id: Int?,
        @SerialName("pricing")
        val pricing: Int?,
        @SerialName("serviceName")
        val serviceName: String?
    )
}