package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.salesforce.marketingcloud.UrlHandler;

/* loaded from: classes5.dex */
public final class zzfci {
    private final Clock zza;
    private final zzdsm zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfci(Clock clock, zzdsm zzdsmVar) {
        this.zza = clock;
        this.zzb = zzdsmVar;
    }

    private final void zze() {
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgt)).longValue() <= jCurrentTimeMillis) {
                        this.zze = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzf(int i, int i2) {
        zze();
        Object obj = this.zzc;
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zze != i) {
                    return;
                }
                this.zze = i2;
                if (this.zze == 3) {
                    this.zzd = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznS)).booleanValue()) {
            zzdsl zzdslVarZza = this.zzb.zza();
            zzdslVarZza.zzc(UrlHandler.ACTION, "mbs_state");
            zzdslVarZza.zzc("mbs_state", true != z ? "0" : "1");
            zzdslVarZza.zzd();
        }
        if (z) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzb() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 2;
        }
        return z;
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 3;
        }
        return z;
    }

    public final void zzd() {
        zzf(2, 3);
    }
}
