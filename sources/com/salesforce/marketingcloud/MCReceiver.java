package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@SuppressLint
/* loaded from: classes6.dex */
public class MCReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo
    public static final String f16825a = "com.salesforce.marketingcloud.WAKE_FOR_ALARM";
    private static final String b = "alarmName";
    private static final String c = g.a("MCReceiver");

    @RestrictTo
    public static Intent a(@NonNull Context context, String str) {
        return new Intent(context, (Class<?>) MCReceiver.class).setAction(context.getApplicationContext().getPackageName() + ".com.salesforce.marketingcloud.WAKE_FOR_ALARM").putExtra(b, str);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String strReplaceFirst;
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            g.a(c, "Action was empty %s", intent.toString());
        }
        strReplaceFirst = action.replaceFirst(context.getApplicationContext().getPackageName() + ".", "");
        g.d(c, "onReceive with action: %s", strReplaceFirst);
        strReplaceFirst.getClass();
        switch (strReplaceFirst) {
            case "android.intent.action.AIRPLANE_MODE":
            case "android.intent.action.TIMEZONE_CHANGED":
            case "android.intent.action.BOOT_COMPLETED":
            case "android.intent.action.MY_PACKAGE_REPLACED":
            case "android.intent.action.ACTION_SHUTDOWN":
                com.salesforce.marketingcloud.behaviors.a aVarA = com.salesforce.marketingcloud.behaviors.a.a(strReplaceFirst);
                if (aVarA != null) {
                    MCService.a(context, aVarA, intent.getExtras());
                    break;
                }
                break;
            case "com.salesforce.marketingcloud.WAKE_FOR_ALARM":
                MCService.a(context, intent.getStringExtra(b));
                break;
        }
    }
}
