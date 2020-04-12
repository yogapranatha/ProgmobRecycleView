package com.example.recyleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycleView;

    String Image[],Deskripsi[];
    int Images[] = {R.drawable.brodo, R.drawable.compass,R.drawable.exodos,R.drawable.fyc,
            R.drawable.gmx,R.drawable.nah,R.drawable.patrobas,R.drawable.ventela,R.drawable.warrior,
            R.drawable.wd};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = findViewById(R.id.recyleView);

        Image = getResources().getStringArray(R.array.LocalBrand);
        Deskripsi = getResources().getStringArray(R.array.Deskripsi);

        MyAdapter myAdapter = new MyAdapter( this, Image, Deskripsi, Images);
        recycleView.setAdapter(myAdapter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
    }
}
