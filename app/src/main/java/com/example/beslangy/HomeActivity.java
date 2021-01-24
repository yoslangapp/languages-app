package com.example.beslangy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    List<Book> lstBook ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Vegitarian",R.drawable.thevigitarian));
        lstBook.add(new Book("The Wild Rob   ot",R.drawable.thewildrobot));
        lstBook.add(new Book("Maria Semples",R.drawable.mariasemples));
        lstBook.add(new Book("The Martian",R.drawable.themartian));
        lstBook.add(new Book("He Died with...",R.drawable.hediedwith));
        lstBook.add(new Book("The Vegitarian",R.drawable.thevigitarian));
        lstBook.add(new Book("The Wild Robot",R.drawable.thewildrobot));
        lstBook.add(new Book("Maria Semples",R.drawable.mariasemples));
        lstBook.add(new Book("The Martian",R.drawable.themartian));
        lstBook.add(new Book("He Died with...",R.drawable.hediedwith));
        lstBook.add(new Book("The Vegitarian",R.drawable.thevigitarian));
        lstBook.add(new Book("The Wild Robot",R.drawable.thewildrobot));
        lstBook.add(new Book("Maria Semples",R.drawable.mariasemples));
        lstBook.add(new Book("The Martian",R.drawable.themartian));
        lstBook.add(new Book("He Died with...",R.drawable.hediedwith));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
