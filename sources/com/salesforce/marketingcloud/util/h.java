package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

@SuppressLint
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static String f17081a;
    public static final String[] b;

    static {
        b = Build.VERSION.SDK_INT >= 29 ? new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"} : new String[]{"android.permission.ACCESS_FINE_LOCATION"};
    }

    private h() {
    }

    @NonNull
    public static String a(Context context) throws PackageManager.NameNotFoundException {
        if (!TextUtils.isEmpty(f17081a)) {
            return f17081a;
        }
        f17081a = "";
        if (context == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            f17081a = packageInfo.versionName + " : " + packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            com.salesforce.marketingcloud.g.b(l.c, e, "Failed to get Application Version from the PackageManager.", new Object[0]);
        }
        return f17081a;
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        for (String str : b) {
            if (!a(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return a(context, "android.permission.BLUETOOTH_SCAN") && a(context, "android.permission.BLUETOOTH_CONNECT");
        }
        return true;
    }

    public static boolean a(@NonNull Context context, @NonNull String str) {
        return ContextCompat.a(context, str) == 0;
    }

    @SuppressLint
    public static boolean b(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentServices(intent, 65536).size() > 0;
    }

    @SuppressLint
    public static boolean a(PackageManager packageManager, Intent intent) {
        return packageManager.queryBroadcastReceivers(intent, 0).size() > 0;
    }
}
