package com.lloyd.data.services

import com.lloyd.data.dto.DogBreedDto
import com.lloyd.data.dto.DogDetailsDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface DogService {

    @GET("breeds/list/all")
    suspend fun getAllBreeds(): Response<DogBreedDto>

    @GET("breed/{breed_name}/images/random")
    suspend fun getDogDetailsByBreedName(@Path("breed_name") dogBreedName : String): Response<DogDetailsDto>
}