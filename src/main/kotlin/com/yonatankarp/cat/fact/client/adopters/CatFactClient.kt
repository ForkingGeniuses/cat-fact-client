package com.yonatankarp.cat.fact.client.adopters

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import retrofit2.http.GET

internal interface CatFactClient {
    @GET("fact")
    suspend fun fact(): CatFactResponse
}

@JsonIgnoreProperties(ignoreUnknown = true)
internal data class CatFactResponse(
    var fact: String,
)
