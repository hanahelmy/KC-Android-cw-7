package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Books> books = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Books book1 = new Books("The ABC Murder", R.drawable.abcmurders, 4.34, "detective");
        Books book2 = new Books("Harry Potter:the Goblet of Fire", R.drawable.harrypotter,  1.93, "fictional");
        Books book3 = new Books("Dairy of a Wimpy Kid", R.drawable.wimpykid, 2.41, "diaries");
        Books book4 = new Books("Rich Dad Poor Dad", R.drawable.richpoor, 2.21, "finance");
        Books book5 = new Books("digital minimalism", R.drawable.digitalmini, 4.30, "self-development");
        Books book6 = new Books("The Myth of Mental illness", R.drawable.mythofmill,  4.30, "psychology");


        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        BooksAdapter booksAdapter = new BooksAdapter(this, 0, books);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(booksAdapter);
    }
}