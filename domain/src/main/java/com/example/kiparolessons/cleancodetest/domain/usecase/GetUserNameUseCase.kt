package com.example.kiparolessons.cleancodetest.domain.usecase

import com.example.kiparolessons.cleancodetest.domain.models.UserName
import com.example.kiparolessons.cleancodetest.domain.repository.UserRepository
import javax.inject.Inject

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }
}