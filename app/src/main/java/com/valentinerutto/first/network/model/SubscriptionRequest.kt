package com.valentinerutto.first.network.model


data class SubscriptionRequest(
    val amountPaid: Int?, val serviceName: String?, val subscriberEmail: String?
)