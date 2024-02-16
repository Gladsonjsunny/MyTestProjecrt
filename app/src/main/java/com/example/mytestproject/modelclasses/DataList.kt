package com.example.mytestproject.modelclasses

import com.google.gson.annotations.SerializedName

class DataList (
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("status")
    var status: Boolean? = null,
    @SerializedName("message")
    var message: String? = null,
    @SerializedName("data")
    var data: DataView? = DataView(),
    @SerializedName("error")
    var error: Boolean? = null


)
