package com.example.mytestproject.viewmodels

import android.app.Activity
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mytestproject.modelclasses.DataList
import com.example.mytestproject.retrofit.ApiService
import com.example.mytestproject.retrofit.RetrofitClient
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class VmViewPageRequ : ViewModel() {
    private val TAG = "Vm Attendance Regularization"
    private val mutableLiveData: MutableLiveData<DataList> = MutableLiveData()

    fun getMutableLiveData(): MutableLiveData<DataList> {
        return mutableLiveData
    }

    fun apiCallEmpViewList(activity: Activity, user_id: String) {

        val call = RetrofitClient.getApiInterface.getRequViewList("327516363", "a27abd27-b64e-4277-86b7-203130e98aa6", user_id)
        Log.w(TAG, "Vm Attendance Regularization View Api Url : " + call.request().url)

        call.enqueue(object : Callback<DataList> {

            override fun onResponse(call: Call<DataList>, response: Response<DataList>) {

                Log.w(TAG, "Vm Attendance Regularization View Api response  --> " + Gson().toJsonTree(response.body()))
                if (response.code() == 401) {
                      Log.e(TAG, "response Token expired  " + response.message())
                } else if (response.isSuccessful) {
                    mutableLiveData.postValue(response.body())
                } else {
                    Log.e(TAG, "response unsuccessful  " + response.message())
                }
            }

            override fun onFailure(call: Call<DataList>, t: Throwable) {
                Log.e(TAG, "onFailure: post list " + t.message)
            }
        })
    }
}