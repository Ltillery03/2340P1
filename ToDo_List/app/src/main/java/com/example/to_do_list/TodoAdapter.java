package com.example.to_do_list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.ViewHolder> {
    private ArrayList<String> mTodoItems;
    public TodoAdapter(ArrayList<String> todoItems) {
        mTodoItems = todoItems;
    }

    @NonNull
    @Override
    public TodoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoAdapter.ViewHolder holder, int position) {
        holder.itemView.setText(mTodoItems.get(position));
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemView;

        ViewHolder(View view) {
            super(view);
            itemView = view.findViewById(android.R.id.text1);
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
