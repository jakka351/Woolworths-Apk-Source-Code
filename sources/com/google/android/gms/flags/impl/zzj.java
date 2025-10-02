package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes5.dex */
public final class zzj {
    private static SharedPreferences zzw;

    public static SharedPreferences zza(Context context) throws Exception {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (zzw == null) {
                    zzw = (SharedPreferences) com.google.android.gms.internal.flags.zze.zza(new zzk(context));
                }
                sharedPreferences = zzw;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }
}
