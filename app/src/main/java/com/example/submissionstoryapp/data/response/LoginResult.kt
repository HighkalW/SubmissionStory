package com.example.submissionstoryapp.data.response

import com.google.gson.annotations.SerializedName

data class LoginResult(
    @field:SerializedName("token")
    val token: String
)
