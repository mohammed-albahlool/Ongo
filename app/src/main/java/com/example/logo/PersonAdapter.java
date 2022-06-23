package com.example.logo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    ArrayList<Person> persons ;
   Context context ;

    public PersonAdapter(ArrayList<Person> persons, Context context) {
        this.persons = persons;
        this.context = context;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recycler,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {

        Person person = persons.get(position);
        holder.nameit.setText(person.name);
        holder.emailit.setText(person.email);
        holder.imageButton.setImageResource(person.imagebutton);


    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    class PersonViewHolder extends RecyclerView.ViewHolder {

        TextView nameit , emailit ;
        ImageButton imageButton ;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);

            nameit = itemView.findViewById(R.id.info1);
            emailit = itemView.findViewById(R.id.info2);
            imageButton = itemView.findViewById(R.id.imageitem);


        }
    }
}
