package com.bilibililevel6.home.popular.state

import com.bilibililevel6.home.popular.entity.Popular
import com.bilibililevel6.home.popular.entity.PopularData

/**
 * author：liuzipeng
 * time: 2022/11/19 00:25
 */
data class PopularListUiState(
    val isLoading: Boolean = false,
    val noMore: Boolean = false,
    val isEmpty: Boolean = false,
    val popularList: List<Popular> = listOf(),
    val insertPopularList: List<Popular> = listOf()
) {

}
