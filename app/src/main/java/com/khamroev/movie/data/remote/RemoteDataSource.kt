package com.khamroev.movie.data.remote

//import com.khamroev.movie.util.Dispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

internal class RemoteDataSource(
    private val apiService: MovieService,
//    private val dispatcher: Dispatcher
) {

    suspend fun getMovies(page: Int) = withContext(Dispatchers.IO){
        apiService.getMovies(page = page)
    }

    suspend fun getMovie(movieId: Int) = withContext(Dispatchers.IO){
        apiService.getMovie(movieId = movieId)
    }
}