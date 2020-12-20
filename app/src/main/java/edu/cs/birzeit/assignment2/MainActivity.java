package edu.cs.birzeit.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //test comment
        setContentView(R.layout.activity_main);

        RecyclerView recycler = (RecyclerView)findViewById(R.id.phone_recycler);

        String[] captions = new String[PhoneDetails.phones.length];
        String[] os =new String[PhoneDetails.phones.length];
        String[] screens =new String[PhoneDetails.phones.length];
        String[] memories =new String[PhoneDetails.phones.length];
        String[] batteries =new String[PhoneDetails.phones.length];
        String[] weights =new String[PhoneDetails.phones.length];


        for(int i = 0; i<captions.length;i++){
            captions[i] = PhoneDetails.phones[i].getName();
            screens[i]=PhoneDetails.phones[i].getScreen();
            os[i]=PhoneDetails.phones[i].getOs();
            batteries[i]=PhoneDetails.phones[i].getBattery();
            memories[i]=PhoneDetails.phones[i].getMemory();
            weights[i]=PhoneDetails.phones[i].getWeight();




        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions,screens,os,batteries,memories,weights);
        recycler.setAdapter(adapter);
    }
}