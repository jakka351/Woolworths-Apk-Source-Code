package com.scandit.datacapture.core.extensions;

import android.util.Log;

/* loaded from: classes6.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18493a = new a();
    private static boolean b;

    private a() {
    }

    public final synchronized void a() {
        if (!b) {
            b = true;
            Log.i("sdc-core", "The method no longer supports rendering any kind of images. For further details about this backwards incompatible change, contact support@scandit.com.");
        }
    }
}
