package com.l_george.test_cofee.ui.viewModels.locationsViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.l_george.test_cofee.data.repository.AuthRepository
import com.l_george.test_cofee.data.repository.LocationsRepository

class LocationViewModelFactory(
    private val repository: LocationsRepository,
    private val authRepository: AuthRepository
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return LocationViewModel(repository , authRepository) as T
    }
}