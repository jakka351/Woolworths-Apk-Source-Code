package com.google.androidbrowserhelper.trusted;

import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class ChromeLegacyUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final List f14781a = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome", "com.chrome.canary", "com.chrome.dev", "com.chrome.beta", "com.android.chrome");
    public static final List b = Arrays.asList("com.chrome.beta", "com.android.chrome");
    public static final List c = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome");

    public static boolean a(PackageManager packageManager, String str, int i) {
        int longVersionCode;
        if (c.contains(str)) {
            return true;
        }
        try {
            longVersionCode = (int) packageManager.getPackageInfo(str, 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException unused) {
            longVersionCode = 0;
        }
        return longVersionCode >= i;
    }

    public static boolean b(PackageManager packageManager, String str) {
        if (f14781a.contains(str)) {
            return a(packageManager, str, 362600000);
        }
        return false;
    }
}
