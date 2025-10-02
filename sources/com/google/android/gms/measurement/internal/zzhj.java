package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzhj implements ServiceConnection {
    final /* synthetic */ zzhk zza;
    private final String zzb;

    public zzhj(zzhk zzhkVar, String str) {
        Objects.requireNonNull(zzhkVar);
        this.zza = zzhkVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            c.C(this.zza.zza, "Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbq zzbqVarZzb = com.google.android.gms.internal.measurement.zzbp.zzb(iBinder);
            if (zzbqVarZzb == null) {
                this.zza.zza.zzaV().zze().zza("Install Referrer Service implementation was not found");
                return;
            }
            zzic zzicVar = this.zza.zza;
            zzicVar.zzaV().zzk().zza("Install Referrer Service connected");
            zzicVar.zzaW().zzj(new zzhi(this, zzbqVarZzb, this));
        } catch (RuntimeException e) {
            this.zza.zza.zzaV().zze().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzaV().zzk().zza("Install Referrer Service disconnected");
    }

    public final /* synthetic */ String zza() {
        return this.zzb;
    }
}
