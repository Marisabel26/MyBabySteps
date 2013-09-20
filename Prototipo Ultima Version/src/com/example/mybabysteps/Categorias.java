package com.example.mybabysteps;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;

public class Categorias extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_categorias, menu);
        return true;
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
	public void irVAcunas(View view){
		Intent intento = new Intent(this, Vacunas.class);
		startActivity(intento);
		finish();
	}
	
	public void irCitas(View view){
		Intent intento = new Intent(this, Citas.class);
		startActivity(intento);
		finish();
	}
	
	public void irLogros(View view){
		Intent intento = new Intent(this, Logros.class);
		startActivity(intento);
		finish();
	}
	public void irPaseos(View view){
		Intent intento = new Intent(this, Paseos.class);
		startActivity(intento);
		finish();
	}

}
