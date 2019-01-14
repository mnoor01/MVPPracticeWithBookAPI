package com.example.muhaimenn.bookapi.resyclerviewStuff;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewholder> {
    @NonNull
    @Override
    public BookViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewholder bookViewholder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BookViewholder extends RecyclerView.ViewHolder{
        public BookViewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
// add.