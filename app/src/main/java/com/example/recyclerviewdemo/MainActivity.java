package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Lookup the recyclerview in activity layout
        RecyclerView recView = (RecyclerView) findViewById(R.id.recView);

        // Initialize contacts
        contacts = new ArrayList<>();
        contacts.add(new Contact("Pal Family", "Shubham", 1448, "Yogendra Vihar", "Naubasta", "India", 208021, "9971623803", "Shubh_Image" ));
        contacts.add(new Contact("Sharma Family", "Utkarsh", 135, "Sanjay Gandhi Nagar", "Naubasta", "India", 208021, "9935074037", "Utkarsh_Image" ));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        // Create adapter passing in the sample user data
        ContactsAdapter adapter = new ContactsAdapter(this, contacts);
        // Attach the adapter to the recyclerview to populate items
        recView.setAdapter(adapter);
        // Set layout manager to position the items
      recView.setLayoutManager(linearLayoutManager);
        // That's all!
    }
}