package com.android.installreferrer.commons;

import android.util.Log;

/* loaded from: classes.dex */
public final class InstallReferrerCommons {
    public static void a(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void b(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }
}
