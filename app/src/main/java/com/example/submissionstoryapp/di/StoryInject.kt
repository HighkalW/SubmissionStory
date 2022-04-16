package com.example.submissionstoryapp.di

import com.example.submissionstoryapp.data.repo.StoryRepository
import com.example.submissionstoryapp.data.retrofit.ApiConfig


object StoryInject {
    fun provideRepository(): StoryRepository {
        val apiService = ApiConfig.getApiService()
        return StoryRepository.getInstance(apiService)
    }
}