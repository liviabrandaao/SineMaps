package com.example.lviabrando.sinemaps.activities.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Lívia Brandão on 17/02/2017.
 */

public class ConnectionServer {
    private static final String URL_BASE =
            "http://mobile-aceite.tcu.gov.br/mapa-da-saude/rest/emprego/";


    private static APIService service;
    private static ConnectionServer selfInstance = new ConnectionServer();

    public static ConnectionServer getInstance() {
        return selfInstance;
    }

    public APIService getService() {
        return service;
    }

    private ConnectionServer() {
        updateServiceAdress();
    }

    public void updateServiceAdress() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(APIService.class);
    }
}
