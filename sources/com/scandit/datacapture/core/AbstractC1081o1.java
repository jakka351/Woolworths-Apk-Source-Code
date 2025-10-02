package com.scandit.datacapture.core;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.o1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC1081o1 {
    public static final ConnectivityManager a(Context context) {
        Intrinsics.h(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }
}
