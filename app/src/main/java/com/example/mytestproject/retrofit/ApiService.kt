package com.example.mytestproject.retrofit

import com.example.mytestproject.modelclasses.DataList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface ApiService {
    @GET("MTF/ViewMTF?")
    fun getRequViewList(
        @Header("Id") id: String,
        @Header("Token") token: String,
        @Query("mtf_id") rId: String
    ): Call<DataList>
}