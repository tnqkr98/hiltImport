package com.cupix.module.hiltpractice

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) : ViewModel() {
    fun saveString(key: String, value: String) {
        preferenceRepository.saveString(key, value)
    }

    fun getString(key: String): String? {
        return preferenceRepository.getString(key)
    }
}