package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.view.Window;

/* loaded from: classes6.dex */
class v6 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16747a = 24;

    public static int a() {
        return (i4.c().b().getResources().getDisplayMetrics().densityDpi * 24) / 160;
    }

    public static int b() {
        return i4.c().b().getResources().getIdentifier("status_bar_height", "dimen", "android");
    }

    public static boolean c() {
        return (b() > 0 ? i4.c().b().getResources().getDimensionPixelSize(i4.c().b().getResources().getIdentifier("status_bar_height", "dimen", "android")) : 0) > a();
    }

    public static int a(Context context, int i) {
        return context == null ? i : (i * context.getResources().getDisplayMetrics().densityDpi) / 160;
    }

    public static boolean b(Window window) {
        return ((window.getDecorView().getSystemUiVisibility() & 1024) == 0 && (window.getAttributes().flags & 67108864) == 0) ? false : true;
    }

    public static boolean a(Window window) {
        return (window.getDecorView().getSystemUiVisibility() & 512) != 0;
    }
}
