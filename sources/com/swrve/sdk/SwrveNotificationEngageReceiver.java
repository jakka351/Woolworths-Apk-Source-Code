package com.swrve.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public class SwrveNotificationEngageReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            new SwrveNotificationEngage(context).f(intent);
        } catch (Exception e) {
            SwrveLogger.c("SwrveNotificationEngageReceiver. Error processing intent. Intent: %s", e, intent.toString());
        }
    }
}
