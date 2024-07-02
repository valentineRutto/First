package com.valentinerutto.first.di


import com.valentinerutto.App
import com.valentinerutto.first.network.ApiService
import com.valentinerutto.first.network.RetrofitClient.createOkClient
import com.valentinerutto.first.network.RetrofitClient.createRetrofit
import com.valentinerutto.first.ui.FirstViewModel
import com.valentinerutto.first.utils.Constants
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit


val networkingModule = module {
    single { App.INSTANCE }

    single<ApiService> { (get() as Retrofit).create(ApiService::class.java) }

    single { createOkClient() }

    single {
        createRetrofit(
            baseUrl = Constants.BASE_URL, get()
        )
    }
}

val viewmodelModule = module {

    viewModel { FirstViewModel(get()) }

}

