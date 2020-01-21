package com.softpal.softpalpermission;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.softpal.softpalpermissions.PermissionActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnPermission = findViewById(R.id.btn_permissions);
		
		btnPermission.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				if(PermissionActivity.Check_CAMERA(MainActivity.this) && PermissionActivity.Check_READ_EXTERNAL_STORAGE(MainActivity.this) && PermissionActivity.Check_WRITE_EXTERNAL_STORAGE(MainActivity.this))
				{
					Toast.makeText(MainActivity.this,"Already permissions are granted.",Toast.LENGTH_SHORT).show();
				}
				else
				{
					Intent intent = new Intent(MainActivity.this,PermissionActivity.class);
					ArrayList<String> permList = new ArrayList<>();
					permList.add(Manifest.permission.ACCESS_FINE_LOCATION);
					permList.add(Manifest.permission.ACCESS_COARSE_LOCATION);
					permList.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
					permList.add(Manifest.permission.CAMERA);
					intent.putStringArrayListExtra(PermissionActivity.PERMISSION_LIST,permList);
					startActivityForResult(intent,113);
				}
			
			}
		});
	}
	
	@Override
	protected void onActivityResult(int requestCode,int resultCode,@Nullable Intent data)
	{
		super.onActivityResult(requestCode,resultCode,data);
		if(requestCode == 113)
		{
			switch(resultCode)
			{
				case RESULT_OK:
					Toast.makeText(this,"Permissions granted successfully",Toast.LENGTH_SHORT).show();
					break;
				case RESULT_CANCELED:
					Toast.makeText(this,"Permissions denied",Toast.LENGTH_SHORT).show();
					break;
				default:
					finish();
					break;
			}
		}
	}
}
