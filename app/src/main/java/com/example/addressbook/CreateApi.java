package com.example.addressbook;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CreateApi {
    @POST("/api/ams/user/addresses/")
    Call<List<AddressListData>> createAddress(
            @Query("token") String token,
            @Query("address[firstname]") String firstName,
            @Query("address[address1]") String address1,
            @Query("address[city]") String city,
            @Query("address[country_id]")Integer countryId,
            @Query("address[state_id]") Integer stateId);


    @GET("/api/ams/user/addresses/")
    Call<List<AddressListData>> getAllAdddress (
            @Query("token") String token
    );

    @DELETE("/api/ams/user/addresses/14")
    Call<List<AddressListData>> deleteAddress (
            @Query("token") String token

    );

    @PUT("/api/ams/user/addresses/13")
    Call<List<AddressListData>> updateAddress(
              @Query("token") String token

    );



}
