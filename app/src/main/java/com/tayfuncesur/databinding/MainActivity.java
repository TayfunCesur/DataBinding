package com.tayfuncesur.databinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tayfuncesur.databinding.adapter.MainAdapter;
import com.tayfuncesur.databinding.model.places;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<places> mDummyList;
    private RecyclerView mRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycler = (RecyclerView) findViewById(R.id.rvMainRecycler);


        generateDummyData();

        mRecycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mRecycler.setAdapter(new MainAdapter(MainActivity.this,mDummyList));


    }

    private void generateDummyData(){
        mDummyList = new ArrayList<>();
        mDummyList.add(new places("The Great Barrier Reef","Australia","https://farm9.staticflickr.com/8040/8030811530_d4a03650f0_z.jpg"));
        mDummyList.add(new places("Pyramids of Giza","Egypt","https://farm4.staticflickr.com/3272/2746703411_a0f39012e1_z.jpg"));
        mDummyList.add(new places("Stonehenge Reef","England","https://farm4.staticflickr.com/3634/3425200141_7d3f57d3f5_z.jpg"));
        mDummyList.add(new places("Salar De Uyuni","Bolivia","https://farm8.staticflickr.com/7025/6641065685_928608ecd7_z.jpg"));
        mDummyList.add(new places("The Grand Canyon","USA","https://farm4.staticflickr.com/3147/2608439201_83473191f4_z.jpg"));
        mDummyList.add(new places("Antelope Canyon","USA","https://farm9.staticflickr.com/8205/8166360812_589908cc28_z.jpg"));
        mDummyList.add(new places("Easter Island","Chile","https://farm4.staticflickr.com/3510/3857006942_5e23b9ec6d_z.jpg"));
        mDummyList.add(new places("Reed Flute Caves","China","https://farm3.staticflickr.com/2457/3928867287_7316950875_z.jpg"));
        mDummyList.add(new places("The Great Wall of China","China","https://farm9.staticflickr.com/8191/8082531678_8afb793c05_z.jpg"));
        mDummyList.add(new places("Plitvice Lakes National Park","Croatia","https://farm3.staticflickr.com/2877/9453725600_efe8f00a12_z.jpg"));
        mDummyList.add(new places("Zhangye Danxia Landform","China","https://farm3.staticflickr.com/2475/4060913085_93905689a3_z.jpg"));
        mDummyList.add(new places("Redwood National Park","USA","https://farm3.staticflickr.com/2894/11901934485_c2fdc4f80e_z.jpg"));
        mDummyList.add(new places("Yellowstone National Park","USA","https://farm3.staticflickr.com/2843/13416208375_0890550b89_z.jpg"));
        mDummyList.add(new places("Bora Bora","French Polynesia","https://farm1.staticflickr.com/81/249803539_b17bb06013_z.jpg?zz=1"));
        mDummyList.add(new places("Taj Mahal, Agra, Uttar Pradesh","India","https://farm1.staticflickr.com/24/47752937_8a62d03d35_z.jpg?zz=1"));
        mDummyList.add(new places("Tianzi Mountains","China","https://farm3.staticflickr.com/2786/4402362498_793e6800cf_z.jpg"));
        mDummyList.add(new places("Angkor Wat","Cambodia","https://farm3.staticflickr.com/2437/3616505196_a6afaf27a3_z.jpg"));
        mDummyList.add(new places("Machu Picchu","Peru","https://farm3.staticflickr.com/2137/2327330969_b797f45356_z.jpg?zz=1"));
        mDummyList.add(new places("Glacier National Park","USA","https://farm8.staticflickr.com/7234/7198413770_fc8d3f2102_z.jpg"));
        mDummyList.add(new places("Pamukkale","Turkey","https://farm9.staticflickr.com/8070/8222808051_64c2a9e8e4_z.jpg"));
        mDummyList.add(new places("Victoria Falls","Zambia","https://farm7.staticflickr.com/6029/5921311744_1bd6ec6615_z.jpg"));
        mDummyList.add(new places("Venice","Italy","https://farm8.staticflickr.com/7189/6856341217_3094f1b9f3_z.jpg"));
        mDummyList.add(new places("Lençóis Maranhenses","Brazil","https://farm4.staticflickr.com/3281/5844039196_7e3349af54_z.jpg"));
        mDummyList.add(new places("The Great Blue Hole","Belize","https://farm8.staticflickr.com/7453/13281422593_d69ac42014_z.jpg"));
        mDummyList.add(new places("Highlands","Iceland","https://farm2.staticflickr.com/1099/1381943367_623d389ca1_z.jpg"));

    }


}
