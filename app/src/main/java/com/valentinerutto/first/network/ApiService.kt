package com.valentinerutto.first.network

import com.valentinerutto.first.network.model.GetServicesResponse
import com.valentinerutto.first.network.model.LoginRequest
import com.valentinerutto.first.network.model.LoginResponse
import com.valentinerutto.first.network.model.RegisterRequest
import com.valentinerutto.first.network.model.RegisterResponse
import com.valentinerutto.first.network.model.SubscriptionRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {

    @POST("/api/v1/user/register")
    suspend fun register(@Body registerRequest: RegisterRequest): Response<RegisterResponse>

    @POST("access/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<LoginResponse>

    @GET("service/getServices")
    suspend fun getServices(@Header("Authorization") token: String): Response<GetServicesResponse>

    @POST("subscription/subscribe")
    suspend fun subscribeToService(
        @Header("Authorization") token: String, @Body subscriptionRequest: SubscriptionRequest
    ): Response<Body>

    @GET("subscription/subscriptions/{subscriberEmail}")
    suspend fun getCustomerSubscriptions(
        @Header("Authorization") token: String, @Path("subscriberEmail") email: String
    ): Response<Body>

}