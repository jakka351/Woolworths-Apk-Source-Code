package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zzhl {
    private final zza zza;

    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    public zzhl(zza zzaVar) {
        Preconditions.checkNotNull(zzaVar);
        this.zza = zzaVar;
    }

    @MainThread
    public final void zza(Context context, Intent intent) {
        zzic zzicVarZzy = zzic.zzy(context, null, null);
        zzgu zzguVarZzaV = zzicVarZzy.zzaV();
        if (intent == null) {
            zzguVarZzaV.zze().zza("Receiver called with null intent");
            return;
        }
        zzicVarZzy.zzaU();
        String action = intent.getAction();
        zzguVarZzaV.zzk().zzb("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzguVarZzaV.zze().zza("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzguVarZzaV.zzk().zza("Starting wakeful intent.");
            this.zza.doStartService(context, className);
        }
    }
}
