package com.cupix.module.hiltpractice

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DiModule {
    @Singleton
    @Provides
    fun providePreferenceRepository(
        @ApplicationContext context: Context
    ): PreferenceRepository {
        return PreferenceRepository(context)
    }
}