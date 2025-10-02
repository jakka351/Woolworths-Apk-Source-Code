package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzcay implements Runnable {
    public zzcay(zzcba zzcbaVar) {
        Objects.requireNonNull(zzcbaVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
