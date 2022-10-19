package com.example.recyclerview_td;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import books.Book;
import category.Category;
import category.CategoryAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCategory= findViewById(R.id.rcv_caregory);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);


        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }

    private List<Category> getListCategory(){
        List<Category> list= new ArrayList<>();

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(R.drawable.bi,"bidao"));
        bookList.add(new Book(R.drawable.cachua,"cachua"));
        bookList.add(new Book(R.drawable.cam,"cam"));
        bookList.add(new Book(R.drawable.bi,"bidao"));

        bookList.add(new Book(R.drawable.bi,"bidao"));
        bookList.add(new Book(R.drawable.cachua,"cachua"));
        bookList.add(new Book(R.drawable.cam,"cam"));
        bookList.add(new Book(R.drawable.bi,"bidao"));

        list.add(new Category("Category 1",bookList));
        list.add(new Category("Category 2",bookList));
        list.add(new Category("Category 3",bookList));
        list.add(new Category("Category 4",bookList));

        return list;
    }
}