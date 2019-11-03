package com.example.keyboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainPage extends AppCompatActivity {
    private RecyclerView rvKeyboard;
    private ArrayList<Keyboard> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        rvKeyboard = findViewById(R.id.rv_keyboard);
        rvKeyboard.setHasFixedSize(true);

        list.addAll(KeyboardData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvKeyboard.setLayoutManager(new LinearLayoutManager(this));
        ListKeyboardAdapter listKeyboardAdapter = new ListKeyboardAdapter(list, this);
        rvKeyboard.setAdapter(listKeyboardAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        if (itemId == R.id.action_about) {
            startActivity(new Intent(this, AboutPage.class));
        }
    }

}
