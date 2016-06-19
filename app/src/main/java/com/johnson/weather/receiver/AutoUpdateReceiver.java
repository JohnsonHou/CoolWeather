package com.johnson.weather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.johnson.weather.service.AutoUpdateService;

/**
 * Created by Administrator on 2016/6/15.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i=new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
