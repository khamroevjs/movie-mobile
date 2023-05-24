package com.khamroev.movie.data.repository

import com.khamroev.movie.data.remote.RemoteDataSource
import com.khamroev.movie.data.util.toMovie
import com.khamroev.movie.domain.model.Movie
import com.khamroev.movie.domain.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDateSource: RemoteDataSource
): MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDateSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDateSource.getMovie(movieId = movieId).toMovie()
    }
}