package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> movies =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //создание списка вызываем метод setData
        setData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        //меняет вертикальную прокрутку на горизонтальную
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, true));
        //создаём адаптер
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, movies);
        //устанавливаем адаптер в RecyclerView
        recyclerView.setAdapter(adapter);
    }

    private void setData() {
        movies.add(new Model(R.drawable.chelpauk, "Человек Паук"));
        movies.add(new Model(R.drawable.in, "Железный человек"));
        movies.add(new Model(R.drawable.ventura, "Эйс Вентура"));
        movies.add(new Model(R.drawable.mstiteli, "Мстители"));
    }
}