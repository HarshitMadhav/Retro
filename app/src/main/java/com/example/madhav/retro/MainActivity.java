package com.example.madhav.retro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = findViewById(R.id.tv);

        data();

    }

    public void data(){

        NetworkApi networkApi = ApiClient.getClient().create(NetworkApi.class);
        Call<Response> responseCall = networkApi.getData();

        responseCall.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                if (response.isSuccessful()){

                    String code = response.body().getCode();
                    String message = response.body().getMessage();



                    ArrayList<Data> dataArrayList = response.body().getDataArrayList();


                    String nine_ki_id = dataArrayList.get(9).getId();
                    String first_ka_name = dataArrayList.get(0).getName();

                    int size = dataArrayList.size();




                    Log.e("mainactivity", "code : " + code);
                t.setText(code +" " + message + " "+ first_ka_name + " "+ size + " " +nine_ki_id);


                }

            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

                Log.e("mainactivity", "error code : " + t.getMessage());

            }
        });
    }
}
