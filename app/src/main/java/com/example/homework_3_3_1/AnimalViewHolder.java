package com.example.homework_3_3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView animal;
    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        animal = itemView.findViewById(R.id.animal);
    }
    public void bind(String count){
animal.setText(count);
    }
}
