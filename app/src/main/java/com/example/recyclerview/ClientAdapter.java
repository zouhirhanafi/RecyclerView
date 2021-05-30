package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class ClientAdapter extends RecyclerView.Adapter<ClientViewHolder> {

    private ArrayList<Client> data;

    public ClientAdapter(ArrayList<Client> data) {
        this.data = data;
    }

    public ClientViewHolder onCreateViewHolder(ViewGroup parent, int t) {
        LayoutInflater inf = LayoutInflater.from(parent.getContext());
        View v = inf.inflate(R.layout.client_item, null);

        return new ClientViewHolder(v);
    }

    public void onBindViewHolder(ClientViewHolder holder, int pos) {
        holder.afficher(data.get(pos));
    }

    public int getItemCount() {
        return data.size();
    }
}
