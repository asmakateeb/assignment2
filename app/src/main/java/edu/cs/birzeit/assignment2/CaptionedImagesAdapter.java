package edu.cs.birzeit.assignment2;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;

public class CaptionedImagesAdapter
        extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>{

    private String[] captions;
    private String[] screens;
    private String[] os;
    private String[] memory;
    private String[] weight;
    private String[] battery;

    public CaptionedImagesAdapter(String[] captions, String[] screens, String[] os, String[] memory, String[] weight, String[] battery) {
        this.captions = captions;
        this.screens = screens;
        this.os = os;
        this.memory = memory;
        this.weight = weight;
        this.battery = battery;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.crad_detalis, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;

        TextView txt = (TextView)cardView.findViewById(R.id.txtName);
        txt.setText(captions[position]);
        TextView textView=(TextView)cardView.findViewById(R.id.txtscreen) ;
        textView.setText(screens[position]);
        TextView textView1=(TextView)cardView.findViewById(R.id.txtos) ;
        textView1.setText(os[position]);
        TextView textView2=(TextView)cardView.findViewById(R.id.txtbattery) ;
        textView2.setText(battery[position]);
        TextView textView3=(TextView)cardView.findViewById(R.id.txtmemory) ;
        textView3.setText(memory[position]);
        TextView textView4=(TextView)cardView.findViewById(R.id.txtweight) ;
        textView4.setText(weight[position]);


        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //
            }
        });
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;

        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
}