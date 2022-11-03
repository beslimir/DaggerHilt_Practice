package com.beslimir.daggerhilt_practice.di

import android.app.Application
import com.beslimir.daggerhilt_practice.data.remote.MyApi
import com.beslimir.daggerhilt_practice.data.repository.MyRepositoryImpl
import com.beslimir.daggerhilt_practice.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
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
    fun provideMyRepository(myApi: MyApi, appContext: Application, @Named("hello2") myString: String): MyRepository {
        return MyRepositoryImpl(myApi, appContext, myString)
    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString01() = "Hello 01"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString02() = "Hello 02"

}