package com.example.mytestproject.modelclasses

import com.google.gson.annotations.SerializedName

class DataView(
    @SerializedName("Id")
    var Id: String? = null,
    @SerializedName("Emp_Id")
    var EmpId: String? = null,
    @SerializedName("Code")
    var Code: String? = null,
    @SerializedName("Emp_Name")
    var EmpName: String? = null,
    @SerializedName("Request_Date")
    var RequestDate: String? = null,
    @SerializedName("Description")
    var Description: String? = null,
    @SerializedName("Remarks")
    var Remarks: String? = null,
    @SerializedName("Status_ID")
    var StatusID: String? = null,
    @SerializedName("Status")
    var Status: String? = null,
    @SerializedName("NextUserId")
    var NextUserId: String? = null,
    @SerializedName("LstMtfDates")
    var LstMtfDates: ArrayList<LstMtfDates> = arrayListOf(),
    @SerializedName("Images")
    var Images: ArrayList<String> = arrayListOf(),
    @SerializedName("CmntLstDetails")
    var CmntLstDetails: ArrayList<CmntLstDetails> = arrayListOf(),
    @SerializedName("MtfDatesAdded")
    var MtfDatesAdded: String? = null
)