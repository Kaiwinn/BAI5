package com.example.apppstore.retrofit;

import com.example.apppstore.model.LoaiSpModel;


import io.reactivex.rxjava3.core.Observable;

import retrofit2.http.GET;

public interface ApiBanHang {
    @GET("getloaisp.php")
    Observable<LoaiSpModel> getLoaisp();

}
