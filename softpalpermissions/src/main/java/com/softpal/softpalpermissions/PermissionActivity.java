package com.softpal.softpalpermissions;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;
import com.softpal.softpalpermissions.Adapter.PermissionAdapter;
import com.softpal.softpalpermissions.Model.Permission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PermissionActivity extends AppCompatActivity
{
	public static String PERMISSION_LIST = "permissionsList";
	public PermissionListener permissionListener = null;
	
	// READ_PHONE_STATE
	public static boolean Check_READ_PHONE_STATE(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.READ_PHONE_STATE);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// FINE_LOCATION
	public static boolean Check_FINE_LOCATION(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.ACCESS_FINE_LOCATION);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// COARSE_LOCATION
	public static boolean Check_COARSE_LOCATION(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.ACCESS_COARSE_LOCATION);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// READ_EXTERNAL_STORAGE
	public static boolean Check_READ_EXTERNAL_STORAGE(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.READ_EXTERNAL_STORAGE);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// WRITE_EXTERNAL_STORAGE
	public static boolean Check_WRITE_EXTERNAL_STORAGE(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.WRITE_EXTERNAL_STORAGE);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// CAMERA
	public static boolean Check_CAMERA(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.CAMERA);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// READ_CALENDAR
	public static boolean Check_READ_CALENDAR(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.READ_CALENDAR);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// WRITE_CALENDAR
	public static boolean Check_WRITE_CALENDAR(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.WRITE_CALENDAR);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// READ_CONTACTS
	public static boolean Check_READ_CONTACTS(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.READ_CONTACTS);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	//WRITE_CONTACTS
	public static boolean Check_WRITE_CONTACTS(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.WRITE_CONTACTS);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// GET_ACCOUNTS
	public static boolean Check_GET_ACCOUNTS(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.GET_ACCOUNTS);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// RECORD_AUDIO
	public static boolean Check_RECORD_AUDIO(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.RECORD_AUDIO);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// READ_PHONE_NUMBERS
	public static boolean Check_READ_PHONE_NUMBERS(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.READ_PHONE_NUMBERS);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// CALL_PHONE
	public static boolean Check_CALL_PHONE(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.CALL_PHONE);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// ANSWER_PHONE_CALLS
	public static boolean Check_ANSWER_PHONE_CALLS(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.ANSWER_PHONE_CALLS);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// READ_CALL_LOG
	public static boolean Check_READ_CALL_LOG(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.READ_CALL_LOG);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// WRITE_CALL_LOG
	public static boolean Check_WRITE_CALL_LOG(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.WRITE_CALL_LOG);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// ADD VOICEMAIL
	public static boolean Check_ADD_VOICEMAIL(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.ADD_VOICEMAIL);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// USE_SIP
	public static boolean Check_USE_SIP(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.USE_SIP);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	/*// PROCESS_OUTGOING_CALLS
	public static boolean Check_PROCESS_OUTGOING_CALLS(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.PROCESS_OUTGOING_CALLS);
		return result == PackageManager.PERMISSION_GRANTED;
	}*/
	
	// BODY_SENSORS
	public static boolean Check_BODY_SENSORS(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.BODY_SENSORS);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// SEND_SMS
	public static boolean Check_SEND_SMS(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.SEND_SMS);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// RECEIVE_SMS
	public static boolean Check_RECEIVE_SMS(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.RECEIVE_SMS);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// READ_SMS
	public static boolean Check_READ_SMS(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.READ_SMS);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// RECEIVE_WAP_PUSH
	public static boolean Check_RECEIVE_WAP_PUSH(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.RECEIVE_WAP_PUSH);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	// RECEIVE_MMS
	public static boolean Check_RECEIVE_MMS(Activity activity)
	{
		int result = ContextCompat.checkSelfPermission(activity,Manifest.permission.RECEIVE_MMS);
		return result == PackageManager.PERMISSION_GRANTED;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_permission);
		
		HashMap<String,Permission> listPemissions = new HashMap<String,Permission>();
		// Dangerous permissions
		Permission location = new Permission(R.drawable.perm_location,getResources().getString(R.string.location_title),getResources().getString(R.string.location_perm_desc),Manifest.permission.ACCESS_COARSE_LOCATION,true);
		
		listPemissions.put(Manifest.permission.ACCESS_COARSE_LOCATION,location);
		listPemissions.put(Manifest.permission.ACCESS_FINE_LOCATION,location);
		listPemissions.put(Manifest.permission.READ_PHONE_STATE,new Permission(R.drawable.perm_call,getResources().getString(R.string.read_phone_state_perm),getResources().getString(R.string.read_phone_state_perm_desc),Manifest.permission.READ_PHONE_STATE,true));
		listPemissions.put(Manifest.permission.READ_CALENDAR,new Permission(R.drawable.perm_calender,getResources().getString(R.string.read_calender_perm),getResources().getString(R.string.read_calender_perm_desc),Manifest.permission.READ_CALENDAR,true));
		listPemissions.put(Manifest.permission.WRITE_CALENDAR,new Permission(R.drawable.perm_calender,getResources().getString(R.string.write_calender_perm),getResources().getString(R.string.write_calender_perm_desc),Manifest.permission.WRITE_CALENDAR,true));
		listPemissions.put(Manifest.permission.CAMERA,new Permission(R.drawable.perm_camera,getResources().getString(R.string.camera_perm),getResources().getString(R.string.camera_perm_desc),Manifest.permission.CAMERA,true));
		listPemissions.put(Manifest.permission.READ_CONTACTS,new Permission(R.drawable.perm_contacts,getResources().getString(R.string.read_contacts_perm),getResources().getString(R.string.read_contacts_perm_desc),Manifest.permission.READ_CONTACTS,true));
		listPemissions.put(Manifest.permission.WRITE_CONTACTS,new Permission(R.drawable.perm_contacts,getResources().getString(R.string.write_contacts_perm),getResources().getString(R.string.write_contacts_perm_desc),Manifest.permission.WRITE_CONTACTS,true));
		listPemissions.put(Manifest.permission.GET_ACCOUNTS,new Permission(R.drawable.ic_call_permission,getResources().getString(R.string.get_accounts_perm),getResources().getString(R.string.get_accounts_perm_desc),Manifest.permission.GET_ACCOUNTS,true));
		listPemissions.put(Manifest.permission.RECORD_AUDIO,new Permission(R.drawable.perm_record_audio,getResources().getString(R.string.record_audio_perm),getResources().getString(R.string.record_audio_perm_desc),Manifest.permission.RECORD_AUDIO,true));
		listPemissions.put(Manifest.permission.READ_PHONE_NUMBERS,new Permission(R.drawable.perm_contacts,getResources().getString(R.string.read_phone_numbers_perm),getResources().getString(R.string.read_phone_numbers_perm_desc),Manifest.permission.READ_PHONE_NUMBERS,true));
		listPemissions.put(Manifest.permission.CALL_PHONE,new Permission(R.drawable.perm_call,getResources().getString(R.string.call_phone_perm),getResources().getString(R.string.call_phone_perm_desc),Manifest.permission.CALL_PHONE,true));
		listPemissions.put(Manifest.permission.ANSWER_PHONE_CALLS,new Permission(R.drawable.perm_call,getResources().getString(R.string.answer_phone_calls_perm),getResources().getString(R.string.answer_phone_calls_perm_desc),Manifest.permission.ANSWER_PHONE_CALLS,true));
		listPemissions.put(Manifest.permission.READ_CALL_LOG,new Permission(R.drawable.perm_call,getResources().getString(R.string.read_call_log_perm),getResources().getString(R.string.read_call_log_perm_desc),Manifest.permission.READ_CALL_LOG,true));
		listPemissions.put(Manifest.permission.WRITE_CALL_LOG,new Permission(R.drawable.perm_call,getResources().getString(R.string.write_call_log_perm),getResources().getString(R.string.write_call_log_perm_desc),Manifest.permission.WRITE_CALL_LOG,true));
		listPemissions.put(Manifest.permission.ADD_VOICEMAIL,new Permission(R.drawable.perm_voicemail,getResources().getString(R.string.add_voice_mail_perm),getResources().getString(R.string.add_voicemail_perm_desc),Manifest.permission.ADD_VOICEMAIL,true));
		listPemissions.put(Manifest.permission.USE_SIP,new Permission(R.drawable.perm_sip,getResources().getString(R.string.use_sip_perm),getResources().getString(R.string.use_sip_perm_desc),Manifest.permission.USE_SIP,true));
		//listPemissions.put(Manifest.permission.PROCESS_OUTGOING_CALLS,new Permission(R.drawable.perm_call,getResources().getString(R.string.process_outgoing_calls_perm),getResources().getString(R.string.process_outgoing_calls_perm_desc),Manifest.permission.PROCESS_OUTGOING_CALLS,true));
		listPemissions.put(Manifest.permission.BODY_SENSORS,new Permission(R.drawable.perm_body_sensors,getResources().getString(R.string.body_sensors_perm),getResources().getString(R.string.body_sensors_perm_desc),Manifest.permission.BODY_SENSORS,true));
		listPemissions.put(Manifest.permission.SEND_SMS,new Permission(R.drawable.perm_sms,getResources().getString(R.string.send_sms_perm),getResources().getString(R.string.send_sms_perm_desc),Manifest.permission.SEND_SMS,true));
		listPemissions.put(Manifest.permission.RECEIVE_SMS,new Permission(R.drawable.perm_sms,getResources().getString(R.string.receive_sms_perm),getResources().getString(R.string.receive_sms_perm_desc),Manifest.permission.RECEIVE_SMS,true));
		listPemissions.put(Manifest.permission.READ_SMS,new Permission(R.drawable.perm_sms,getResources().getString(R.string.read_sms_perm),getResources().getString(R.string.read_sms_perm_desc),Manifest.permission.READ_SMS,true));
		listPemissions.put(Manifest.permission.RECEIVE_WAP_PUSH,new Permission(R.drawable.ic_call_permission,getResources().getString(R.string.receive_wap_push_perm),getResources().getString(R.string.receive_wap_push_perm_desc),Manifest.permission.RECEIVE_WAP_PUSH,true));
		listPemissions.put(Manifest.permission.RECEIVE_MMS,new Permission(R.drawable.perm_mms,getResources().getString(R.string.receive_mms_perm),getResources().getString(R.string.receive_mms_perm_desc),Manifest.permission.RECEIVE_MMS,true));
		listPemissions.put(Manifest.permission.READ_EXTERNAL_STORAGE,new Permission(R.drawable.perm_storage,getResources().getString(R.string.read_external_storage_perm),getResources().getString(R.string.read_external_storage_perm_desc),Manifest.permission.READ_EXTERNAL_STORAGE,true));
		listPemissions.put(Manifest.permission.WRITE_EXTERNAL_STORAGE,new Permission(R.drawable.perm_storage,getResources().getString(R.string.write_external_storage_perm),getResources().getString(R.string.write_external_storage_perm_desc),Manifest.permission.WRITE_EXTERNAL_STORAGE,true));
		
		
		RecyclerView rvPermission = findViewById(R.id.rv_permissions);
		MaterialButton btnGrant = findViewById(R.id.btn_grant_permission);
		AppCompatImageView ivClose = findViewById(R.id.iv_close_permission);
		
		LinearLayoutManager layoutManager = new LinearLayoutManager(PermissionActivity.this);
		rvPermission.setLayoutManager(layoutManager);
		
		ivClose.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				finish();
				setResult(RESULT_CANCELED);
			}
		});
		
		Intent intent = getIntent();
		ArrayList<String> list = intent.getStringArrayListExtra("permissionsList");
		
		// Permissions list for display
		HashSet<Permission> permSet = new HashSet<>();
		for(String permission : list)
		{
			if(listPemissions.get(permission) != null)
			{
				if(listPemissions.get(permission).isDangerous())
				{
					permSet.add(listPemissions.get(permission));
				}
			}
		}
		ArrayList<Permission> listForDisplay = new ArrayList<>(permSet);
		
		// Permissions list for Ted
		final String[] strPermissions = new String[list.size()];
		for(int i = 0;i < list.size();i++)
		{
			strPermissions[i] = list.get(i);
		}
		
		PermissionAdapter languageAdapter = new PermissionAdapter(listForDisplay,PermissionActivity.this);
		rvPermission.setAdapter(languageAdapter);
		
		btnGrant.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				TedPermission.with(PermissionActivity.this).setPermissionListener(permissionListener).setPermissions(strPermissions).check();
			}
		});
		
		permissionListener = new PermissionListener()
		{
			@Override
			public void onPermissionGranted()
			{
				setResult(RESULT_OK);
				finish();
			}
			
			@Override
			public void onPermissionDenied(List<String> deniedPermissions)
			{
				setResult(RESULT_CANCELED);
			}
		};
	}
}
