package com.example.mytestproject.modelclasses

import com.google.gson.annotations.SerializedName

class CmntLstDetails (
    @SerializedName("Id"           ) var Id          : String? = null,
    @SerializedName("Type"         ) var Type        : String? = null,
    @SerializedName("Name"         ) var Name        : String? = null,
    @SerializedName("Emp_comments" ) var EmpComments : String? = null,
    @SerializedName("Cmnt_date"    ) var CmntDate    : String? = null
)