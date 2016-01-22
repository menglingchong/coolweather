package com.first.coolweather.receiver;

import com.first.coolweather.service.AutoUpdateService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoUpdateReceive extends BroadcastReceiver {

	@Override
	// Æô¶¯·þÎñ
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Intent i = new Intent(context, AutoUpdateService.class);
		context.startService(i);
	}

}
