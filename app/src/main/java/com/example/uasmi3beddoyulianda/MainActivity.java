package com.example.uasmi3beddoyulianda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import api.InsertAPI;
import model.UserModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    EditText kode,nama,harga1,jumlah,gambar,promo,harga,bayar;
    Button btn;
    String URL ="https://eddoyulianda.000webhostapp.com/";
    private  static Retrofit retrofit = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kode = findViewById(R.id.kode);
        nama = findViewById(R.id.namabrg);
        harga1 = findViewById(R.id.hargaSatuan);
        jumlah = findViewById(R.id.JmlhBeli);
        promo = findViewById(R.id.hargaPromo);
        gambar = findViewById(R.id.Gmbr);
        harga = findViewById(R.id.harga);
        bayar = findViewById(R.id.bayar);
        btn = findViewById(R.id.btnInput);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {insertData();
            }
        });
    }

    private void insertData() {
        retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        InsertAPI insertAPI=retrofit.create(InsertAPI.class);

        Call<UserModel> call = insertAPI.insertData(kode.getText().toString(), nama.getText().toString(), harga1.getText().toString(), jumlah.getText().toString(), promo.getText().toString(), gambar.getText().toString(), harga.getText().toString(), bayar.getText().toString());
        call.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                kode.setText("");
                nama.setText("");
                harga1.setText("");
                jumlah.setText("");
                promo.setText("");
                gambar.setText("");
                harga.setText("");
                bayar.setText("");

                Toast.makeText(getApplicationContext(), response.toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();

            }
        });
    }


}