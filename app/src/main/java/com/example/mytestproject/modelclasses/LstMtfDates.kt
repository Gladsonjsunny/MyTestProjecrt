package com.example.mytestproject.modelclasses

import com.google.gson.annotations.SerializedName

class LstMtfDates(
    @SerializedName("Id")
    var Id: String? = null,
    @SerializedName("Mtf_Date")
    var MtfDate: String? = null,
    @SerializedName("Mtf_Reason")
    var MtfReason: String? = null,
    @SerializedName("Mtf_status")
    var MtfStatus: String? = null,
    @SerializedName("Mtf_Remarks")
    var MtfRemarks: String? = null,
    @SerializedName("CheckIN_Date")
    var CheckINDate: String? = null,
    @SerializedName("CheckIn")
    var CheckIn: String? = null,
    @SerializedName("CheckOut_Date")
    var CheckOutDate: String? = null,
    @SerializedName("CheckOut")
    var CheckOut: String? = null,
    @SerializedName("Total_Hrs")
    var TotalHrs: String? = null,
    @SerializedName("Missed")
    var Missed: String? = null,
    /*@SerializedName("Mtf_Rem_Id")
    var MtfRemId: ArrayList<Int> = arrayListOf()*/


)