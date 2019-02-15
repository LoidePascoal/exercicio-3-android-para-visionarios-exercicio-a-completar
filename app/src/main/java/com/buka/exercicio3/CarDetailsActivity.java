package com.buka.exercicio3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class CarDetailsActivity extends AppCompatActivity {
    public static final String EXTRA_MANUFACTURER = "extra_manufacturer";
    public static final String EXTRA_MODEL = "extra_model";
    public static final String EXTRA_YEAR = "extra_year";
    public static final String EXTRA_COLOR = "extra_color";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        TextView manufacturerTextView = findViewById(R.id.textview_manufacturer);
        TextView modelTextView = findViewById(R.id.textview_model);
        TextView yearTextView = findViewById(R.id.textview_year);
        TextView colorTextView = findViewById(R.id.textview_color);
        if (intent!=null) {
// TODO: Passo 12 - Passe todos os atributos do carro como argumento no Intent
            String manufacturer = intent.getStringExtra(EXTRA_MANUFACTURER);
            String model = intent.getStringExtra(EXTRA_MODEL);
            int year = intent.getIntExtra(EXTRA_YEAR, -1);
            String color = intent.getStringExtra(EXTRA_COLOR);

            manufacturerTextView.setText(manufacturer);
            modelTextView.setText(model);
            yearTextView.setText(year);
            colorTextView.setText(color);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.menu.id.home){
            NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }
}

