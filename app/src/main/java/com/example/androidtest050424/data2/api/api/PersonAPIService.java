package com.example.androidtest050424.data2.api.api;

import com.example.androidtest050424.RetrofitService;
import com.example.androidtest050424.data2.api.api.PersonApi;

public class PersonAPIService {
    private static PersonApi personApi;
    private static PersonApi create() {
        return RetrofitService.getInstance().create(PersonApi.class);
    }

    public static PersonApi getInstance() {
        if (personApi == null) personApi = create();
        return personApi;
    }
}
