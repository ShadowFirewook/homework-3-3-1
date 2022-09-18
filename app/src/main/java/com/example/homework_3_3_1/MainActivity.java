package com.example.homework_3_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    public ArrayList<String> animalList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Collections.addAll(animalList,"Хамелеон","Тигр","Змея","Панда","Медведь","Кролик","Аксолотль","Лиса","Волк","Ящерица","Баран","Кот","Пес","Мышь","Курица","Воробей","Ворон","Еж","Сова","Страус");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.resyclerView);
        AnimalAdapter adapter = new AnimalAdapter(animalList);
recyclerView.setAdapter(adapter);
    }
}