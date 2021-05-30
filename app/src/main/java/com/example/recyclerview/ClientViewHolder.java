package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ClientViewHolder extends RecyclerView.ViewHolder {
    //
    private ImageView image;
    private TextView nom;

    public ClientViewHolder(View v) {
        super(v);

        image = v.findViewById(R.id.image);
        nom = v.findViewById(R.id.nom);
    }

    public void afficher(Client client) {
        image.setImageResource(client.getImage());
        nom.setText(client.getNom());
    }
}
