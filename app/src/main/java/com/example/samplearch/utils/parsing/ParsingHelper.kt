package com.example.samplearch.utils.parsing

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okio.BufferedSource

object ParsingHelper {

    fun <T> getListFromJsonArray(objectJson: BufferedSource, classType: Class<T>): T? {
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        val typeCustom = Types.newParameterizedType(classType, classType)
        return try {
            moshi.adapter<T>(typeCustom).fromJson(objectJson)
        } catch (ex: Exception) {
            ex.printStackTrace()
            null
        }
    }
}
