package com.beslimir.daggerhilt_practice.data.repository

import android.app.Application
import com.beslimir.daggerhilt_practice.R
import com.beslimir.daggerhilt_practice.data.remote.MyApi
import com.beslimir.daggerhilt_practice.domain.repository.MyRepository

class MyRepositoryImpl(
    private val myApi: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {
        myApi.doNetworkCall()
    }
}