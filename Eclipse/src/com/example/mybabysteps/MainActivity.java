package com.example.mybabysteps;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button btnCrear;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /*btnCrear = (Button)findViewById(R.id.btnCrear);
        btnCrear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,Categorias.class));
			}
		});*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
 
    
	public void irAcrear(View view) {
		Intent intento = new Intent(this, Categorias.class);
		startActivity(intento);
		finish();
	}
	
	public void irAcamara(View view) {
		Intent intento = new Intent(this, FotoRapida.class);
		startActivity(intento);
		finish();
	}
}
