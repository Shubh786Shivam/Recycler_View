package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder>{
    private List<Contact> contacts;
    private Context context;
    public ContactsAdapter(Context context, List<Contact> contacts) {
        this.context = context;
        this.contacts = contacts;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.contact_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the data model based on position
        Contact contact = contacts.get(position);

        // Set item views based on your views and data model
        TextView familyName = holder.familyName;
        familyName.setText(contact.getFamilyName());
        TextView firstName = holder.firstName;
        firstName.setText(contact.getFirstName());
        TextView houseNumber = holder.houseNumber;
        houseNumber.setText(Integer.toString(contact.getHouseNumber()));
        TextView street = holder.street;
        street.setText(contact.getStreet());
        TextView town = holder.town;
        town.setText(contact.getTown());
        TextView country = holder.country;
        country.setText(contact.getCountry());
        TextView pincode = holder.pincode;
        pincode.setText(Integer.toString(contact.getPincode()));
        TextView telephone = holder.telephone;
        telephone.setText(contact.getTelephone());
        TextView imageFile = holder.imageFileName;
        imageFile.setText(contact.getImageFileName());



    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView familyName, firstName, houseNumber, street, town, country, pincode, telephone, imageFileName;
        public ViewHolder(View itemView) {
            super(itemView);
            familyName = itemView.findViewById(R.id.familyName);
            firstName = itemView.findViewById(R.id.firstName);
            houseNumber = itemView.findViewById(R.id.houseNumber);
            street = itemView.findViewById(R.id.street);
            town = itemView.findViewById(R.id.town);
           country = itemView.findViewById(R.id.country);
            pincode = itemView.findViewById(R.id.pincode);
            telephone = itemView.findViewById(R.id.telephone);
            imageFileName = itemView.findViewById(R.id.imageFileName);
        }
    }


}

