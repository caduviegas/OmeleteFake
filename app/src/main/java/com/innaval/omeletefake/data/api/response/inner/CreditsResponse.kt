package com.innaval.omeletefake.data.api.response.inner

import com.google.gson.annotations.SerializedName
import com.innaval.omeletefake.data.models.Cast

class CreditsResponse {
    @SerializedName("cast")
    val casts:List<Cast>?=null
}