package com.rachid_abbad.gosmart.utils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class StaticData {
    public static OkHttpClient.Builder builderClient;
    public static OkHttpClient client;

    public static void initStaticData(){
        builderClient = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS);
        client = builderClient.build();
    }
}
