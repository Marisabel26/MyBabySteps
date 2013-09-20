package com.example.mybabysteps;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;

public class Citas extends Activity {
	
	private ListView list;
	private Button btnAtras;
    private ArrayList<String> items = new ArrayList<String>();
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_citas);
		// Show the Up button in the action bar.
		setupActionBar();
		llenarListView();
		
		//Se le asignan los eventos al listView
		list = (ListView)findViewById(R.id.listView1);
		final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
		
		list.setAdapter(adaptador);
		list.setOnItemClickListener(new OnItemClickListener(){
			 
		    @Override
		    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		        // TODO Auto-generated method stub
		    	irEditarCitas(view);
		    }
		    
		});
		
		list.setOnItemLongClickListener(new OnItemLongClickListener(){

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long arg3) {
				items.remove(position);
				adaptador.notifyDataSetChanged();
				return false;
			}
		    
		});		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.citas, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void irEditarCitas(View view){
		Intent intento = new Intent(this, EditarCitas.class);
		startActivity(intento);
		finish();
	}
	
	public void irAAtras(View view) {
		Intent intento = new Intent(this, Categorias.class);
		startActivity(intento);
		finish();
	}
	
	public void CrearNuevoItem(View view) {
		Intent intento = new Intent(this, EditarCitas.class);
		startActivity(intento);
		finish();
	}
	
	private void llenarListView(){
		items.add("Cita 1");
		items.add("Cita 2");
		items.add("Cita 3");
	}
	
//	private void mostrarMensaje(){
//		AlertDialog ad = new AlertDialog.Builder(this).create();  
//		ad.setCancelable(false); // This blocks the 'BACK' button  
//		ad.setMessage("Hello World");
//		/*ad.setButton(1,"OK", new DialogInterface.OnClickListener() {  
//		    @Override  
//		    public void onClick(DialogInterface dialog, int which) {  
//		        //dialog.dismiss();
//		    	
//		    }  
//		});*/ 
//		ad.show(); 
//	}

}
