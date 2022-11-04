package com.beslimir.daggerhilt_practice.di

import com.beslimir.daggerhilt_practice.data.repository.MyRepositoryImpl
import com.beslimir.daggerhilt_practice.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(myRepositoryImpl: MyRepositoryImpl): MyRepository

}