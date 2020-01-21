package com.softpal.softpalpermissions.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softpal.softpalpermissions.Model.Permission;
import com.softpal.softpalpermissions.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

public class PermissionAdapter extends RecyclerView.Adapter<PermissionAdapter.PermissionHolder>
{
	private ArrayList<Permission> list;
	private AppCompatActivity mActivity;
	
	public PermissionAdapter(ArrayList<Permission> list,Context mContext)
	{
		this.list = list;
		this.mActivity = (AppCompatActivity)mContext;
	}
	
	@NonNull
	@Override
	public PermissionHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType)
	{
		LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.permission_adapter_layout,parent,false);
		return new PermissionHolder(view);
	}
	
	@Override
	public void onBindViewHolder(@NonNull PermissionHolder holder,int position)
	{
		if(list != null && list.size() > 0 && list.get(position) != null)
		{
			holder.ivIcon.setImageResource(list.get(position).getImageId());
			holder.tvTitle.setText(list.get(position).getPermissionTitle());
			holder.tvDescription.setText(list.get(position).getPermissionDescription());
		}
	}
	
	@Override
	public int getItemCount()
	{
		return list.size();
	}
	
	public class PermissionHolder extends RecyclerView.ViewHolder
	{
		AppCompatImageView ivIcon;
		AppCompatTextView tvTitle,tvDescription;
		public PermissionHolder(@NonNull View itemView)
		{
			super(itemView);
			
			ivIcon = itemView.findViewById(R.id.iv_permission);
			tvTitle = itemView.findViewById(R.id.tv_permission_list_title);
			tvDescription = itemView.findViewById(R.id.tv_permission_list_description);
		}
	}
}
