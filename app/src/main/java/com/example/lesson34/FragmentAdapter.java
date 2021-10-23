package com.example.lesson34;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FragmentAdapter extends RecyclerView.Adapter<FragmentAdapter.myViewHolder> {

    ArrayList<Model> songs = new ArrayList<>();
    private OnClick onClick;

    public void setSongs(ArrayList<Model> songs,OnClick onClick) {
        this.songs = new ArrayList<>();
        this.songs.addAll(songs);
        this.onClick = onClick;
        notifyDataSetChanged();
    }


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public FragmentAdapter.myViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        return new myViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull FragmentAdapter.myViewHolder holder, int position) {
            holder.onBind(songs.get(position));
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        private TextView number, blankSpace, taylorShift, time;

        public myViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.tv_number);
            blankSpace = itemView.findViewById(R.id.tv_blankSpace);
            taylorShift = itemView.findViewById(R.id.tv_saylorShift);
            time = itemView.findViewById(R.id.tv_time);
        }
        public void onBind(Model model) {
            number.setText(String.valueOf(model.getNumber()));
            blankSpace.setText(String.valueOf(model.getBlankSpace()));
            taylorShift.setText(String.valueOf(model.getTaylorShift()));
            time.setText(String.valueOf(model.getTime()));
            itemView.setOnClickListener(v -> {
                onClick.onItemClick(model);
            });

        }
    }
        public interface OnClick {
            void onItemClick(Model model);
        }
}
