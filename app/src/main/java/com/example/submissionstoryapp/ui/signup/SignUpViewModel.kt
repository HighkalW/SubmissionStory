package com.example.submissionstoryapp.ui.signup

import androidx.lifecycle.ViewModel
import com.example.submissionstoryapp.data.repo.UserRepository

class SignupViewModel(private val repo: UserRepository) : ViewModel() {

    fun register(name: String, email: String, password: String) = repo.register(name, email, password)
}