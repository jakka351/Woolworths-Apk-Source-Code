package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import androidx.annotation.GuardedBy;

/* loaded from: classes5.dex */
public abstract class zza {

    @GuardedBy
    private static zza zza;

    public static zza zza(Context context) {
        zza zzaVar;
        synchronized (zza.class) {
            try {
                if (zza == null) {
                    zzai zzaiVar = new zzai(null);
                    zzaiVar.zzb((Application) context.getApplicationContext());
                    zza = zzaiVar.zza();
                }
                zzaVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzaVar;
    }

    public abstract zzj zzb();

    public abstract zzbo zzc();
}
