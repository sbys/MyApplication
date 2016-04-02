package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
     Toolbar toolbar1;
    private ListView lv;
    Button button;
    String[] str1={"正品迪卡蝴蝶王超级张继科ZLC乒乓底板包邮","莹恋STIGA斯蒂卡玫瑰5五斯蒂卡玫瑰七CL七XO乒乓球底板球拍正品","【莹恋】银河U-2乒乓球底板球拍天王星U1U2U3纯木快攻弧圈横握","正品银河乒乓球底板球拍天王星U2 7层纯木乒乓球底板快攻弧圈横直握","原装特价正品防伪迪卡蝴蝶王乒乓球拍碳素底板20060直拍30041横拍","正品斯蒂卡黑檀7/七乒乓球底板纯木乒乓球拍底板衡拍直拍","蝴蝶波尔 原装进口球拍 乒乓球拍乒乓底板","正品红双喜乒乓球底板劲极15黑檀快攻弧圈纯木乒乓球拍底板","正品包邮STIGA斯蒂卡玫瑰五/七玫瑰/5乒乓底板 斯蒂卡乒乓球底板","正品行货STIGA斯蒂卡乒乓球拍 黑檀木 黑檀57 斯蒂卡乒乓球拍底板","YAOSIR DHS红双喜狂飙龙五马龙乒乓球拍底板","蝴蝶底板单支只要96包邮","正品行货STIGA斯蒂卡乒乓球拍 黑檀木 黑檀57 斯蒂卡乒乓球拍底板","【天猫】STIGA斯蒂卡CLR斯蒂卡七层纯木乒乓球底板CL CR WRB 乒乓球拍底板","2折高端乒乓球底板 正品Bestray百斯锐纳米碳王乒乓球拍底板","斯蒂卡乒乓球拍 正品斯蒂卡纳米9.8底板STIGA红黑碳王7.6横直球拍","【天猫】正品STIGA斯蒂卡黑檀5/无黑檀/七乒乓球底板斯蒂卡乒乓球底板","【天猫】STIGA睇睇咯乒乓球拍红黑碳王7.6斯蒂卡乒乓球拍乒乓球拍底板","【天猫】STIGA斯蒂卡CLCRWRB刘国梁CLCR CC 乒乓球拍底板","【天猫】正品STIGA斯蒂卡乒乓球拍CLCR WRB 斯蒂卡乒乓球拍底板"};
    String[] str2={"包邮  扬州","包邮  北京","运费 ￥6  北京","运费 ￥6  金华","包邮  扬州","包邮  宁波","包邮  广州","包邮  金华","运费 ￥12  上海","包邮  上海","包邮  石家庄","包邮  石家庄","包邮  杭州","包邮  石家庄","包邮  沈阳","包邮  上海","包邮  上海","包邮  上海","包邮  北京","包邮  北京"};
    String[] str3={"卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分","卖家积分"};
    String[] str4={"￥105","￥773.50","￥84","￥88","￥98","￥328","￥198","￥129","￥88","￥809","￥1194","￥880","￥130","￥1194","￥408","￥196","￥88","￥1134","￥557.60","￥408"};
    String[] str5={"15人付款","103人付款","412人付款","776人付款","251人付款","198人付款","117人付款","251人付款","136人付款","42人付款","24人付款","31人付款","0人付款","24人付款","201人付款","391人付款","150人付款","61人付款","49人付款","65人付款"};


    private   class adapter extends Activity {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar1 = (Toolbar) findViewById(R.id.toolbar1);
        button=(Button)findViewById(R.id.sort);
        button.setText("综合排序");

        ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < 20; i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("ItemImage",( R.drawable.p1)+i);
            map.put("text1", str1[i].toString());
            map.put("text2", str2[i].toString());
            map.put("text3", str3[i].toString());
            map.put("text4", str4[i].toString());
            map.put("text5",str5[i].toString());
            listItem.add(map);}
            SimpleAdapter mSimpleAdapter = new SimpleAdapter(this, listItem, R.layout.item, new String[]{"ItemImage","text1","text2","text3","text4","text5"}, new int[]{R.id.imageview,R.id.text1,R.id.text2,R.id.text3,R.id.text4,R.id.text5});
            lv.setAdapter(mSimpleAdapter);
            setSupportActionBar(toolbar1);


        }
        public void button2(View view){
            showPopupMenu((Button)view);

        }
    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
         popupMenu.getMenuInflater().inflate(R.menu.menu1, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener()

            {
                @Override
                public boolean onMenuItemClick (MenuItem item){
                button.setText(item.getTitle());
                return false;
            }
        });
 popupMenu.show();
    }
 public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
        public void button1(View v){
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }}

