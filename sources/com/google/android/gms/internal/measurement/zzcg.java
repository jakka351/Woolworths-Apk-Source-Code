package com.google.android.gms.internal.measurement;

import android.os.Build;

/* loaded from: classes.dex */
public final class zzcg {
    public static final int zza;

    static {
        zza = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
