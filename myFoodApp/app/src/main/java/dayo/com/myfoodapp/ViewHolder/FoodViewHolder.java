package dayo.com.myfoodapp.ViewHolder;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import dayo.com.myfoodapp.Interface.itemClickListener;
import dayo.com.myfoodapp.R;

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView food_name;
    public ImageView food_image;

    private itemClickListener itemClickListener;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);

        food_name = itemView.findViewById(R.id.food_name);
        food_image = itemView.findViewById(R.id.food_image);

        itemView.setOnClickListener(this);

    }

    public void setItemClickListener(itemClickListener itemClickListener){
        //Prosper, this is all I added
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        Log.e("Adapter Position", String.valueOf(getAdapterPosition()));
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }
}
