package com.example.asiagibson.runners;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by asiagibson on 10/29/16.
 */

public class CharacterViewHolder extends RecyclerView.ViewHolder {
        private   View view;
        private ImageView character;


    public CharacterViewHolder(ViewGroup parent) {
        super(inflateView(parent));

    }
    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.gamepic_viewholder, parent, false);
    }


    public void bind(Character character) {
    }
}
