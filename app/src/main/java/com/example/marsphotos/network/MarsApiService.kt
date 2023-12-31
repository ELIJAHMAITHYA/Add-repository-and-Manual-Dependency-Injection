

package com.example.marsphotos.network

import com.example.marsphotos.model.MarsPhoto
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET

    /**
     * Retrofit service object for creating api calls
     */
    interface MarsApiService {
        @GET("photos")
        suspend fun getPhotos(): List<MarsPhoto>
    }

    /**
     * A public Api object that exposes the lazy-initialized Retrofit service
     */

