package com.randap.imgurclient.RestApi;

/**
 * Created by Lovleen on 25/10/16.
 */




import com.randap.imgurclient.Models.GalleryModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by User on 8/1/2016.
 */
public interface ApiInterface {

    @GET("gallery/hot/viral/0.json")
    Call<GalleryModel> getViralImages();

}


