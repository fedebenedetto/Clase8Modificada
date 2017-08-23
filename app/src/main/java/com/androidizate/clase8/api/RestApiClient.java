package com.androidizate.clase8.api;

import com.androidizate.clase8.dao.Book;
import com.androidizate.clase8.dao.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

/**
 * Created by andres.oller on 23/08/17.
 */

public class RestApiClient implements RestApi {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private static final String BASE_URL_2 = "http://fakerestapi.azurewebsites.net/api/";

    @Override
    public Call<List<User>> getAllUsers() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(RestApi.class).getAllUsers();
    }

    @Override
    public Call<Book> createBook(@Body Book book) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL_2)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(RestApi.class).createBook(book);
    }
}
