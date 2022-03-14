package com.example.lap_04;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ListView lvGoods;
        com.example.lap_04.CustomGoodsAdapter adt;
        ArrayList<com.example.lap_04.Goods> arrayList;
        @Override
        protected void onCreate(Bundle savedInstancesState){
                super.onCreate(savedInstancesState);
                setContentView(R.layout.activity_main);
                lvGoods = findViewById(R.id.lvGoods);

                arrayList = new ArrayList<>();
                arrayList.add
                        (new com.example.lap_04.Goods("Ca nấu lẩu, nấu mì mini","Shop Devang",R.drawable.ca_nau_lau));
                arrayList.add
                        (new com.example.lap_04.Goods("1KG khô gà bơ tỏi","Shop LTD Food",R.drawable.ga_bo_toi));
                arrayList.add
                        (new com.example.lap_04.Goods("Xe cần cẩu đa năng","Shop thế giới đồ chơi",R.drawable.xa_can_cau));
                arrayList.add(new com.example.lap_04.Goods("Đồ chơi dạng mô hình" ,"Shop thế giới đồ chơi",R.drawable.do_choi_dang_mo_hinh));
                arrayList.add(new com.example.lap_04.Goods("Lãnh đạo đơn giản","Shop Minh Long book",R.drawable.lanh_dao_gian_don));
                arrayList.add(new com.example.lap_04.Goods("Hiểu lòng con trẻ","Shop Minh Long book",R.drawable.hieu_long_con_tre));
                adt = new com.example.lap_04.CustomGoodsAdapter(this,R.layout.item_listview,arrayList);

                lvGoods.setAdapter(adt);
        }

}