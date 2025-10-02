package com.google.androidbrowserhelper.trusted;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;
import java.util.List;

/* loaded from: classes6.dex */
public class LauncherActivityMetadata {

    /* renamed from: a, reason: collision with root package name */
    public final String f14782a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final int k;
    public final List l;
    public final String m;
    public final TrustedWebActivityDisplayMode n;
    public final int o;
    public final String p;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LauncherActivityMetadata(android.os.Bundle r13, android.content.res.Resources r14) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.androidbrowserhelper.trusted.LauncherActivityMetadata.<init>(android.os.Bundle, android.content.res.Resources):void");
    }

    public static LauncherActivityMetadata a(Context context) {
        Bundle bundle;
        Resources resources = context.getResources();
        try {
            bundle = context.getPackageManager().getActivityInfo(new ComponentName(context, context.getClass()), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            bundle = null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        return new LauncherActivityMetadata(bundle, resources);
    }
}
