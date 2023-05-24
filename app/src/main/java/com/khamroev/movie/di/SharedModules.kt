package com.khamroev.movie.di

import com.khamroev.movie.data.remote.MovieService
import com.khamroev.movie.data.remote.RemoteDataSource
import com.khamroev.movie.data.repository.MovieRepositoryImpl
import com.khamroev.movie.domain.repository.MovieRepository
import com.khamroev.movie.domain.usecase.GetMovieUseCase
import com.khamroev.movie.domain.usecase.GetMoviesUseCase
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get()) }
    factory { MovieService() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule)

fun getSharedModules() = sharedModules












