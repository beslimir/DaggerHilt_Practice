package com.beslimir.daggerhilt_practice.data.repository

import com.beslimir.daggerhilt_practice.data.remote.MyApi
import com.beslimir.daggerhilt_practice.domain.repository.MyRepository

class MyRepositoryImpl(
    private val myApi: MyApi
): MyRepository {

    override suspend fun doNetworkCall() {
        myApi.doNetworkCall()
    }
}