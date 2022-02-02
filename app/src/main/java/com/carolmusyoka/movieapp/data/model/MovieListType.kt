package com.carolmusyoka.movieapp.data.model

enum class MovieListType {
    NOW_SHOWING {
        override fun toString() = "Now Showing"
    },
    UPCOMING {
        override fun toString() = "Up-Coming"
    },
    IN_THEATERS {
        override fun toString() = "In Theaters"
    },
    TRENDING {

    }
}
