package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* loaded from: classes5.dex */
public final class zzbck {
    public static Object zza(zzght zzghtVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzghtVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
