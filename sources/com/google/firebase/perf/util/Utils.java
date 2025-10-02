package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.perf.logging.AndroidLogger;

/* loaded from: classes.dex */
public class Utils {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f15727a;

    public static boolean a(Context context) {
        Boolean bool = f15727a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f15727a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            AndroidLogger.e().a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    public static int b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
