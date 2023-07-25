package com.cupix.module.hiltpractice

import android.content.Context

class PreferenceRepository(context: Context) {
    private val sharedPreferences =
        context.getSharedPreferences("hilt_practice", Context.MODE_PRIVATE)

    fun saveString(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String): String? {
        return sharedPreferences.getString(key, null)
    }
}