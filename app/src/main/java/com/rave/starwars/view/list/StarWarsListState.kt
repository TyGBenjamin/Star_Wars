package com.rave.starwars.view.list

/**
 * data class to hold state for [StarWarsListFragment].
 *
 * @property isLoading true if fetching [listData] else false
 * @property listData list of objects from api
 * @property selectedListData selected object item from list
 * @constructor Create instsance of [StarWarsListState]
 */
data class StarWarsListState(
    val isLoading: Boolean = false,
    val listData: List<Any> = emptyList(),
    val selectedListData: Any = Any()
)
