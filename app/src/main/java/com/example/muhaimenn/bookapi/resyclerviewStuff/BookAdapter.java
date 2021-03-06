package com.example.muhaimenn.bookapi.resyclerviewStuff;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.muhaimenn.bookapi.OnItemClick;
import com.example.muhaimenn.bookapi.R;
import com.example.muhaimenn.bookapi.model.Response;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewholder> {
    List<Response> responseList;
    OnItemClick itemClick;

    public BookAdapter(List<Response> responseList, OnItemClick itemClick) {
        this.responseList = responseList;
        this.itemClick=itemClick;
    }

    @NonNull
    @Override
    public BookViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.books_itemview, viewGroup, false);
        return new BookViewholder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull final BookViewholder bookViewholder, final int i) {
        bookViewholder.title.setText(responseList.get(i).getName());
        bookViewholder.author.setText(responseList.get(i).getAuthor());
        bookViewholder.genre.setText(responseList.get(i).getGenreS());
        bookViewholder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClick.onItemClicked(responseList.get(i));
            }
        });

    }

    @Override
    public int getItemCount() {
        return responseList.size();
    }

    public class BookViewholder extends RecyclerView.ViewHolder {
        TextView title, author, genre;

        public BookViewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.bookTitle);
            author = itemView.findViewById(R.id.bookAuthor);
            genre = itemView.findViewById(R.id.genre);
        }
    }
}


// add