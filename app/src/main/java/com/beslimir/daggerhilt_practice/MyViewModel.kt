package com.beslimir.daggerhilt_practice

import androidx.lifecycle.ViewModel
import com.beslimir.daggerhilt_practice.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {

}