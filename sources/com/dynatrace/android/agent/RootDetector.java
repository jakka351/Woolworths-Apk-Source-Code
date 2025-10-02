package com.dynatrace.android.agent;

import java.io.File;

/* loaded from: classes.dex */
public class RootDetector {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14080a;
    public static final File b;
    public static final String[] c;

    static {
        boolean z = Global.f14077a;
        f14080a = "dtxRootDetector";
        b = new File("/system/app/Superuser.apk");
        c = new String[]{"/system/xbin/which", "su"};
    }
}
