package com.google.android.gms.internal.phenotype;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes5.dex */
public final class zzh<T> {
    private static final Object zzak = new Object();

    @SuppressLint
    private static Context zzal = null;
    private static boolean zzam = false;
    private static volatile Boolean zzan;
    private static volatile Boolean zzbq;

    public static void init(Context context) {
        Context applicationContext;
        synchronized (zzak) {
            try {
                if (!context.isDeviceProtectedStorage() && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (zzal != context) {
                    zzan = null;
                }
                zzal = context;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzam = false;
    }

    public static void maybeInit(Context context) {
        if (zzal == null) {
            init(context);
        }
    }
}
