package com.randap.imgurclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.randap.imgurclient.Models.GalleryModel;
import com.randap.imgurclient.RestApi.ApiClient;
import com.randap.imgurclient.RestApi.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<GalleryModel> call = apiService.getViralImages();

        call.enqueue(new Callback<GalleryModel>() {
            @Override
            public void onResponse(Call<GalleryModel> call, Response<GalleryModel> response) {

            }
            @Override
            public void onFailure(Call<GalleryModel> call, Throwable t) {
            }
        });
    }
}
