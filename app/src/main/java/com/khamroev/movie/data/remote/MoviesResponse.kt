package com.khamroev.movie.data.remote

import com.khamroev.movie.data.remote.MovieRemote

@kotlinx.serialization.Serializable
internal data class MoviesResponse(
    val results: List<MovieRemote>
)
