package com.example.androidtest050424.data2.api.api;

import com.example.androidtest050424.domain.Person;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PersonApi {

    @GET("/person/(id}")
    Call<Person> getPerson(@Path("id") long id);
}
