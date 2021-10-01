package com.example.radio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public boolean isPower = false;
    public ArrayList<HashMap<String, Object>> stations;
    public boolean isStations = true;
    public int cursorOfStations = 13;
    public SQLiteDatabase db;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = openOrCreateDatabase("bowser.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS favoritesstations (_id INTEGER PRIMARY KEY AUTOINCREMENT, station TEXT);");

        stations = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> station = new HashMap<String, Object>();
        station.put("number", "87.5");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "87.9");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "88.3");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "88.7");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "89.1");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "89.5");
        stations.add(station);
        station.put("number", "89.9");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "90.3");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "90.8");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "91.2");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "91.6");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "92.0");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "92.4");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "92.8");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "93.2");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "93.6");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "94.0");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "94.4");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "94.8");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "95.2");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "95.6");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "96.4");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "96.8");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "97.2");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "97.6");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "98.0");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "98.4");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "98.8");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "99.6");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "100.1");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "100.5");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "100.9");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "101.2");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "102.1");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "103.0");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "103.4");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "103.7");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "104.2");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "104.7");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "105.3");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "105.7");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "106.2");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "106.6");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "107.0");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "107.4");
        stations.add(station);
        station = new HashMap<String, Object>();
        station.put("number", "107.8");
        stations.add(station);

        LinearLayout layoutOfStations = findViewById(R.id.layoutOfStations);

        for(int stationIdx = 0; stationIdx < stations.size(); stationIdx++){
            LinearLayout layoutOfStation = new LinearLayout(MainActivity.this);
            TextView layoutOfStationNumber = new TextView(MainActivity.this);
            ImageView layoutOfStationFavorite = new ImageView(MainActivity.this);
            layoutOfStationFavorite.setImageResource(R.drawable.star);
            layoutOfStationFavorite.setLayoutParams(new ConstraintLayout.LayoutParams(75, 75));
            layoutOfStationNumber.setText(stations.get(stationIdx).get("number").toString());
            layoutOfStation.addView(layoutOfStationNumber);
            layoutOfStation.addView(layoutOfStationFavorite);
            layoutOfStations.addView(layoutOfStation);
        }

        Button tripleDot = findViewById(R.id.tipleDot);
        tripleDot.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                MenuItem downloads = menu.add(Menu.NONE, 101, Menu.NONE, "Загрузки");
                downloads.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        return false;
                    }
                });
            }
        });



        TextView switchFavorite = findViewById(R.id.switchFavorite);
        TextView switchStations = findViewById(R.id.switchStations);
        Button previousStationBtn = findViewById(R.id.previousStationBtn);
        Button nextStationBtn = findViewById(R.id.nextStationBtn);
        Button record = findViewById(R.id.record);
        TextView currentStation = findViewById(R.id.currentStation);
        TextView powerLabel = findViewById(R.id.powerLabel);
        ImageButton favoriteBtn = findViewById(R.id.favoriteBtn);
        TextView search = findViewById(R.id.search);
        TextView powerBtnLabel = findViewById(R.id.powerBtnLabel);
        Button power = findViewById(R.id.power);
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("mytag", "переключаем вкл/выкл радио");
                isPower = !isPower;
                if(isPower){
                    power.setTextColor(Color.rgb(0, 0, 255));
                    search.setTextColor(Color.rgb(0, 0, 0));
                    powerBtnLabel.setText("Играет " + "92.8");
                    record.setVisibility(View.VISIBLE);
                    currentStation.setTextColor(Color.rgb(0, 0, 0));
                    powerLabel.setText("");
                    previousStationBtn.setText("<");
                    previousStationBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Log.d("mytag", "на предыдущую станцию");
                            if(cursorOfStations > 0) {
                                cursorOfStations--;
                                currentStation.setText(stations.get(cursorOfStations).get("number").toString());
                            }
                        }
                    });
                    nextStationBtn.setText(">");
                    nextStationBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Log.d("mytag", "на следующую станцию");
                            if(cursorOfStations < stations.size() - 1) {
                                cursorOfStations++;
                                currentStation.setText(stations.get(cursorOfStations).get("number").toString());
                            }
                        }
                    });
                    favoriteBtn.setVisibility(View.VISIBLE);
                } else if(!isPower){
                    power.setTextColor(Color.rgb(175, 175, 175));
                    search.setTextColor(Color.rgb(175, 175, 175));
                    powerBtnLabel.setText("Включите радио");
                    record.setVisibility(View.INVISIBLE);
                    currentStation.setTextColor(Color.rgb(175, 175, 175));
                    powerLabel.setText("Включите радио");
                    previousStationBtn.setText("");
                    nextStationBtn.setText("");
                    favoriteBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Log.d("mytag", "добавляем/удаляем закладку для станции");
                            db.execSQL("INSERT INTO \"favoritesstations\"(station) VALUES (\"" + stations.get(cursorOfStations).get("number") + "\");");
                        }
                    });
                    favoriteBtn.setVisibility(View.INVISIBLE);
                }
            }
        });

        switchStations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("mytag", "переходим на станции");
                isStations = true;
            }
        });
        switchFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("mytag", "переходим на закладки");
                isStations = false;
            }
        });

    }
}