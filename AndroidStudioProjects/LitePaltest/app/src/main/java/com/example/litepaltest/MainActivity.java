package com.example.litepaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button createDatebase = (Button) findViewById(R.id.create_database);
        createDatebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LitePal.getDatabase();
            }
        });

        Button addData = (Button) findViewById(R.id.add_data);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setName("The Da Vinci Code");
                book.setAuthor("Dan Brown");
                book.setPages(454);
                book.setPrice(16.96);
                book.setPress("Unkonw");
                book.save();
            }
        });

        Button updataData = (Button) findViewById(R.id.updata_data);
        updataData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setPrice(14.96);
                book.setPress("Anchor");
                book.setToDefault("price");
                book.setToDefault("press");
                book.updateAll("name = ? and author = ?", "The Lost Symbol", "Dan Brown");
            }
        });

        Button deleteData = (Button) findViewById(R.id.delete_data);
        deleteData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //DataSupport.deleteAll(Book.class, "price < ?", "15");
                Book book = new Book();
                book.delete();
            }
        });

        Button queryButton = (Button) findViewById(R.id.query_data);
        queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Book> books = DataSupport.findAll(Book.class);
                for(Book book : books) {
                    Log.d("MainActivity:", "book name is " + book.getName());
                    Log.d("MainActivity:", "book author is " + book.getAuthor());
                    Log.d("MainActivity:", "book pages is " + book.getPages());
                    Log.d("MainActivity:", "book price is " + book.getPrice());
                    Log.d("MainActivity:", "book press is " + book.getPress());
                }
            }
        });
    }
}
