package com.rachid_abbad.gosmart.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebServiceCnx {

    public static boolean isNetworkAvailable(){
        try{
            URL url = new URL("https://www.google.com");
            HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
            urlConnect.setConnectTimeout(2000);
            urlConnect.setReadTimeout(2000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnect.getInputStream()));
            return true;
        }catch (Exception ex){
            return true;
        }
    }

}
