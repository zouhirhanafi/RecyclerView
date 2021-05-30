package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Client> clients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clients = new ArrayList<>();
        clients.add(new Client("bennani", "zouhir", R.drawable.logo_1));
        clients.add(new Client("janati", "hanae", R.drawable.logo_2));

        RecyclerView list = findViewById(R.id.list);
        list.setLayoutManager(new GridLayoutManager(getApplicationContext(), 10));
        ClientAdapter adapter = new ClientAdapter(clients);
        list.setAdapter(adapter);
    }
}