package com.beslimir.daggerhilt_practice.di

import com.beslimir.daggerhilt_practice.data.remote.MyApi
import com.beslimir.daggerhilt_practice.data.repository.MyRepositoryImpl
import com.beslimir.daggerhilt_practice.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(myApi: MyApi): MyRepository {
        return MyRepositoryImpl(myApi)
    }

}