package com.innaval.omeletefake.data.api

import androidx.lifecycle.LiveData
import com.innaval.omeletefake.BuildConfig
import com.innaval.omeletefake.data.api.response.ApiResponse
import com.innaval.omeletefake.data.api.response.MovieDetailsResponse
import com.innaval.omeletefake.data.api.response.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MoviesApi {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("page") page: Int = 1,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ): LiveData<ApiResponse<MoviesResponse>>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("page") page: Int = 1,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ): LiveData<ApiResponse<MoviesResponse>>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("page") page: Int = 1,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ): LiveData<ApiResponse<MoviesResponse>>

    @GET("search/movie")
    fun searchMovies(
        @Query("query") query: String? = null,
        @Query("page") page: Int = 1,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ): LiveData<ApiResponse<MoviesResponse>>

    @GET("movie/{id}")
    fun getMovieDetail(
        @Path("id") id: Long,
        @Query("append_to_response") details: String = "videos,credits,reviews",
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ): LiveData<ApiResponse<MovieDetailsResponse>>
}