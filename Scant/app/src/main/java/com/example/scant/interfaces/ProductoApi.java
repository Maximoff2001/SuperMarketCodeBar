package com.example.scant.interfaces;

import com.example.scant.models.Producto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductoApi {
    @GET("products/{id}")
    public Call<Producto> find(@Path("id")String id);

}
