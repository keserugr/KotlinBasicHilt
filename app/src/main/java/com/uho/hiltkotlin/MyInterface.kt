package com.uho.hiltkotlin

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {
    fun myPrintFunction(): String
}

@InstallIn(SingletonComponent::class)
@Module
class MyModule{

    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction(): MyInterface{
        return MyFirstInterfaceImp()
    }

    @SecondImplementor
    @Singleton
    @Provides
    fun provideSecondFunction(): MyInterface{
        return MySecondInterfaceImp()
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor