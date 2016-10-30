package com.example.asiagibson.runners;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

/**
 * Created by asiagibson on 10/29/16.
 */

public class CharacterListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Character> characterList = Arrays.asList(
        new Character(R.drawable.ninjaRed),
        new Character(R.drawable.ninjablue),
        new Character (R.drawable.ninjagreen),
        new Character(R.drawable.ninjaorange),
        new Character(R.drawable.ninjared)
    );

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CharacterViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CharacterViewHolder viewHolder = (CharacterViewHolder) holder;
        Character employee = characterList.get(position);
        viewHolder.bind(employee);
    }

    @Override
    public int getItemCount() {
        return characterList.size();
    }
}
