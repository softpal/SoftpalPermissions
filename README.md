# SoftpalPermissions


### Developed by
[Softpal](https://www.github.com/softpal)

[![](https://jitpack.io/v/softpal/LocationUtils.svg)](https://jitpack.io/#softpal/LocationUtils)

**Features**

This Library is used for asking Run time permissions in a full screen.

## Installation

Add repository url and dependency in application module gradle file:
  
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

### Gradle
[![](https://jitpack.io/v/softpal/LocationUtils.svg)](https://jitpack.io/#softpal/LocationUtils)
```javascript
dependencies {
    implementation 'com.github.softpal:softpalpermissions:1.0'
}
```

## Usage

### 1. Get Current Location

```javascript
        // Call when the app wants to ask run time permissions bt passing required permissions through intent.
       if(PermissionActivity.Check_CAMERA(MainActivity.this) &&
       PermissionActivity.Check_READ_EXTERNAL_STORAGE(MainActivity.this) && PermissionActivity.Check_WRITE_EXTERNAL_STORAGE(MainActivity.this))
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
```
