package com.example.androidtest050424.data2.api.repository;

import com.example.androidtest050424.data2.api.api.PersonAPIService;
import com.example.androidtest050424.domain.Person;

import retrofit2.Call;

public class PersonRepository {
    public static Call<Person> getPerson(long id) {
        return PersonAPIService.getInstance().getPerson(id);
    }
}
