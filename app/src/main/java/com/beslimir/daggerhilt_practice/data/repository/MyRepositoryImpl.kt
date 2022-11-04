package com.beslimir.daggerhilt_practice.data.repository

import android.app.Application
import com.beslimir.daggerhilt_practice.R
import com.beslimir.daggerhilt_practice.data.remote.MyApi
import com.beslimir.daggerhilt_practice.domain.repository.MyRepository
import javax.inject.Inject
import javax.inject.Named

class MyRepositoryImpl @Inject constructor(
    private val myApi: MyApi,
    private val appContext: Application,
    @Named("hello2") private val myString: String
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
        println("Hello from the repository. The string used here is $myString")
    }

    override suspend fun doNetworkCall() {
        myApi.doNetworkCall()
    }
}