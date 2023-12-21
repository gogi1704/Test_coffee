package com.l_george.test_cofee.di

import android.content.Context
import com.l_george.test_cofee.AppAuth
import com.l_george.test_cofee.app.CoffeeApp
import com.l_george.test_cofee.data.repository.AuthRepository
import com.l_george.test_cofee.ui.viewModels.authViewModel.AuthViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule (private val context: Context) {

    @Provides
    @Singleton
    fun provideAuthViewModelFactory(authRepository: AuthRepository): AuthViewModelFactory =
        AuthViewModelFactory(authRepository)

    @Provides
    @Singleton
    fun provideAppAuth(): AppAuth = AppAuth(context)
}