package com.google.androidbrowserhelper.trusted;

import android.content.pm.PackageManager;

/* loaded from: classes6.dex */
public class ChromeOsSupport {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("org.chromium.arc");
    }
}
