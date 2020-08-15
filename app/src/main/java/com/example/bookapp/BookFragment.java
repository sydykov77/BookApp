package com.example.bookapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bookapp.data.TestRepository;
import com.example.bookapp.model.BooksModels;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookFragment extends Fragment {
    private TextView bookName, bookDesc;
    private ArrayList<BooksModels> booksList = new ArrayList<>();
    private BooksModels models;

    public BookFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            int position = (int) bundle.get("position"); // Key
            models= TestRepository.getBookByPosition(position);
            booksList.add(models);
        }
        return inflater.inflate(R.layout.fragment_book, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bookName = view.findViewById(R.id.bookName);
        bookDesc = view.findViewById(R.id.bookDesc);
        if (models != null) {
            bookName.setText(models.getBookName());
            bookDesc.setText(models.getBookDesc());
        }
    }
}
