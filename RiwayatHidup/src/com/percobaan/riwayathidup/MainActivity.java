package com.percobaan.riwayathidup;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	Button tombol;
	TextView judul, ket, nama, isinama, ttl, isittl, jkelamin, isijkelamin,
	agama, isiagama, warga, isiwarga, status, isistatus,alamat, isialamat, nohp, isinohp,
	pendidikan, sd, isisd, smp, isismp, sma, isisma, d1, isid1, kuliah, isikuliah, kemampuan;
	
	ImageView foto;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tombol=(Button)findViewById(R.id.tombol);
		tombol=setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				Exit();
			}
			public void Exit() {
				finish();
			}
		});

		judul=(TextView)findViewById(R.id.judul);
		ket=(TextView)findViewById(R.id.ket);
		nama=(TextView)findViewById(R.id.nama);
		isinama=(TextView)findViewById(R.id.isinama);
		ttl=(TextView)findViewById(R.id.ttl);
		isittl=(TextView)findViewById(R.id.isittl);
		jkelamin=(TextView)findViewById(R.id.jkelamin);
		isijkelamin=(TextView)findViewById(R.id.isijkelamin);
		agama=(TextView)findViewById(R.id.agama);
		isiagama=(TextView)findViewById(R.id.isiagama);
		warga=(TextView)findViewById(R.id.warga);
		isiwarga=(TextView)findViewById(R.id.isiwarga);
		status=(TextView)findViewById(R.id.status);
		isistatus=(TextView)findViewById(R.id.isistatus);
		alamat=(TextView)findViewById(R.id.alamat);
		isialamat=(TextView)findViewById(R.id.isialamat);
		nohp=(TextView)findViewById(R.id.nohp);
		isinohp=(TextView)findViewById(R.id.isinohp);
		pendidikan=(TextView)findViewById(R.id.pendidikan);
		sd=(TextView)findViewById(R.id.sd);
		isisd=(TextView)findViewById(R.id.isisd);
		smp=(TextView)findViewById(R.id.smp);
		isismp=(TextView)findViewById(R.id.isismp);
		sma=(TextView)findViewById(R.id.sma);
		isisma=(TextView)findViewById(R.id.isisma);
		d1=(TextView)findViewById(R.id.d1);
		isid1=(TextView)findViewById(R.id.isid1);
		kuliah=(TextView)findViewById(R.id.kuliah);
		isikuliah=(TextView)findViewById(R.id.isikuliah);
		kemampuan=(TextView)findViewById(R.id.kemampuan);
		
		foto=(ImageView)findViewById(R.id.foto);
		foto.setOnLongClickListener(new View.OnLongClickListener() {
			public boolean onLongClick(View v) {
				Toast.makeText(MainActivity.this, "Foto Nur Halimah", Toast.LENGTH_SHORT).show();
				return true;
			}
		});
		
		foto.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				ket.setText("Ini adalah Foto Nur Halimah");
			}
		});
	}
	private Button setOnClickListener(OnClickListener onClickListener) {
		// TODO Auto-generated method stub
		return null;
	}
}

