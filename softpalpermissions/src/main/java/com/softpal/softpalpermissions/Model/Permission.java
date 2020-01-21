package com.softpal.softpalpermissions.Model;

public class Permission
{
	int imageId;
	String permissionTitle;
	String permissionDescription;
	String permission;
	boolean isDangerous;
	
	public Permission(int imageId,String permissionTitle,String permissionDescription,String permission,boolean isDangerous)
	{
		this.imageId = imageId;
		this.permissionTitle = permissionTitle;
		this.permissionDescription = permissionDescription;
		this.permission = permission;
		this.isDangerous = isDangerous;
	}
	
	public boolean isDangerous()
	{
		return isDangerous;
	}
	
	public void setDangerous(boolean dangerous)
	{
		isDangerous = dangerous;
	}
	
	public int getImageId()
	{
		return imageId;
	}
	
	public void setImageId(int imageId)
	{
		this.imageId = imageId;
	}
	
	public String getPermissionTitle()
	{
		return permissionTitle;
	}
	
	public void setPermissionTitle(String permissionTitle)
	{
		this.permissionTitle = permissionTitle;
	}
	
	public String getPermissionDescription()
	{
		return permissionDescription;
	}
	
	public void setPermissionDescription(String permissionDescription)
	{
		this.permissionDescription = permissionDescription;
	}
	
	public String getPermission()
	{
		return permission;
	}
	
	public void setPermission(String permission)
	{
		this.permission = permission;
	}
}
