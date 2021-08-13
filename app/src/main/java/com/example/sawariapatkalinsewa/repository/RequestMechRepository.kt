package com.example.sawariapatkalinsewa.repository

import com.example.sawariapatkalinsewa.api.AddRequestAPI
import com.example.sawariapatkalinsewa.api.MyApiRequest
import com.example.sawariapatkalinsewa.api.ServiceBuilder
import com.example.sawariapatkalinsewa.api.VehicleAPI
import com.example.sawariapatkalinsewa.entity.Request
import com.example.sawariapatkalinsewa.entity.Vehicle
import com.example.sawariapatkalinsewa.response.GetVehicleResponse
import com.example.sawariapatkalinsewa.response.RequestMechResponse
import com.example.sawariapatkalinsewa.response.VehicleResponse

class RequestMechRepository : MyApiRequest() {
    private val requestAPI = ServiceBuilder.buildService(AddRequestAPI::class.java)

    suspend fun requestMech(request: Request) : RequestMechResponse {
        return apiRequest {
            requestAPI.requestmech(
                    ServiceBuilder.token!!,
                    ServiceBuilder.username!!,
                    request
            )
        }
    }

}