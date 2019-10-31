package com.sid.grootlogin;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.text.Editable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;


import android.view.View;

public class BookingActivity extends AppCompatActivity {
    CheckBox Tea,Coffee,White_Rice,Brown_Rice,Chicken_Biryani,Veg_Biryani,Steam_Rice,Shahi_Paneer,Dal_Tadka,Roti,Papad,Ice_Creame,Sweet_Dish,Fish_curry;
   Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Tea = (CheckBox)findViewById(R.id.checkBox3);
        Coffee = (CheckBox)findViewById(R.id.checkBox4);
        Brown_Rice = (CheckBox)findViewById(R.id.checkBox6);
        White_Rice = (CheckBox)findViewById(R.id.checkBox5);
        Steam_Rice = (CheckBox)findViewById(R.id.checkBox7);
        Chicken_Biryani = (CheckBox)findViewById(R.id.checkBox8);
        Veg_Biryani = (CheckBox)findViewById(R.id.checkBox9);
        Ice_Creame = (CheckBox)findViewById(R.id.checkBox10);
        Fish_curry = (CheckBox)findViewById(R.id.checkBox11);
        Dal_Tadka = (CheckBox)findViewById(R.id.checkBox12);
        Shahi_Paneer = (CheckBox)findViewById(R.id.checkBox13);
        Roti = (CheckBox)findViewById(R.id.checkBox14);
        Papad = (CheckBox)findViewById(R.id.checkBox15);
        Sweet_Dish = (CheckBox)findViewById(R.id.checkBox16);

        final ArrayList<String> list = new ArrayList<String>();





        Tea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Tea.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Tea is selected", Toast.LENGTH_SHORT).show();
                    list.add("Tea");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Tea is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Coffee.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Coffee.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Coffee is selected", Toast.LENGTH_SHORT).show();
                    list.add("Coffee");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Coffee is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });

        White_Rice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(White_Rice.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"White Rice is selected", Toast.LENGTH_SHORT).show();
                    list.add("White rice");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"White Rice is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Brown_Rice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Brown_Rice.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Brown Rice is selected", Toast.LENGTH_SHORT).show();
                    list.add("Brown Rice");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Brown Rice is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Steam_Rice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Steam_Rice.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Steam Rice is selected", Toast.LENGTH_SHORT).show();
                    list.add("Steam Rice");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Steam Rice is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Chicken_Biryani.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Chicken_Biryani.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Chicken Biryani is selected", Toast.LENGTH_SHORT).show();
                    list.add("Chicken Biryani");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Chicken Biryani is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Veg_Biryani.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Veg_Biryani.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Veg Biryani is selected", Toast.LENGTH_SHORT).show();
                    list.add("Veg Biryani");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Veg Biryani is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Ice_Creame.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Ice_Creame.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Ice-Creame is selected", Toast.LENGTH_SHORT).show();
                    list.add("Ice Creame");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Ice-Creame is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Fish_curry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Fish_curry.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Fish Curry is selected", Toast.LENGTH_SHORT).show();
                    list.add("Fish Curry");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Fish Curry is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Dal_Tadka.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Dal_Tadka.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Dal Tadka is selected", Toast.LENGTH_SHORT).show();
                    list.add("Dal Tadka");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Dal Tadka is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Shahi_Paneer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Shahi_Paneer.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Shahi Paneer is selected", Toast.LENGTH_SHORT).show();
                    list.add("Shahi Paneer");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Shahi Paneer is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Roti.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Roti.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Roti is selected", Toast.LENGTH_SHORT).show();
                    list.add("Roti");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Roti is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Papad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Papad.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Papad is selected", Toast.LENGTH_SHORT).show();
                    list.add("Papad");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Papad is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Sweet_Dish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Sweet_Dish.isChecked())
                {
                    Toast.makeText(BookingActivity.this,"Sweet Dish is selected", Toast.LENGTH_SHORT).show();
                    list.add("Sweet Dish");
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"Sweet Dish is not selected", Toast.LENGTH_SHORT).show();
                }

            }
        });

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        String table = mySpinner.getSelectedItem().toString();
        list.add(table);
        Spinner mySpinner1 = (Spinner) findViewById(R.id.spinner3);
        String time = mySpinner1.getSelectedItem().toString();
        list.add(time);

// Locate the button in activity_main.xml
        confirm = (Button) findViewById(R.id.button13);

        // Capture button clicks
        confirm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(BookingActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });



    }

}
