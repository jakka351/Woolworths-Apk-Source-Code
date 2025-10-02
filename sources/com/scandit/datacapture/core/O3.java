package com.scandit.datacapture.core;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class O3 {
    public static final void a(String message) {
        Intrinsics.h(message, "message");
        Log.i("sdc-core", message);
    }

    public static final void a(String message, Exception e) {
        Intrinsics.h(message, "message");
        Intrinsics.h(e, "e");
        Log.e("sdc-core", message);
        e.printStackTrace();
    }
}
