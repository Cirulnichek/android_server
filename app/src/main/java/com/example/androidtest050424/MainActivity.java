package com.example.androidtest050424;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.androidtest050424.data2.api.repository.PersonRepository;
import com.example.androidtest050424.domain.Person;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonRepository.getPerson(1).enqueue(new Callback<Person>() {
            @Override
            public void onResponse(Call<Person> call, Response<Person> response) {
                Log.d("MainActivity Person", response.body().toString());
            }

            @Override
            public void onFailure(Call<Person> call, Throwable throwable) {
                Log.d("MainActivity Person", throwable.getMessage());
            }
        });
    }
}