package com.example.uasmi3beddoyulianda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import Adapter.UserAdapter;
import model.UserModel;

public class InsertProductActivity extends AppCompatActivity {

    private LinearLayoutManager linearLayoutManager;
    private ProgressBar progressBar;
    private RecyclerView recyclerView;
    private List<UserModel> userModelList= new ArrayList<>();
    private UserAdapter userAdapter;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_product);
        progressBar = findViewById(R.id.progress);
        recyclerView = findViewById(R.id.recuser);
        fab = findViewById(R.id.btnAdd);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(InsertProductActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        userAdapter = new UserAdapter(this, userModelList);
        recyclerView.setAdapter(userAdapter);

    }

}