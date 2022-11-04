package com.beslimir.daggerhilt_practice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.beslimir.daggerhilt_practice.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service() {

    @Inject
    lateinit var myRepository: MyRepository

    override fun onCreate() {
        super.onCreate()
//        myRepository.doNetworkCall()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}