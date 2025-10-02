package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzfqc {
    final /* synthetic */ zzfqd zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfqc(zzfqd zzfqdVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfqdVar);
        this.zza = zzfqdVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfqd zzfqdVar = this.zza;
            if (zzfqdVar.zzb) {
                zzfqg zzfqgVar = zzfqdVar.zza;
                zzfqgVar.zzg(this.zzb);
                zzfqgVar.zzh(this.zzc);
                zzfqgVar.zzi(this.zzd);
                zzfqgVar.zzf(null);
                zzfqgVar.zze();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }

    public final zzfqc zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final zzfqc zzc(int i) {
        this.zzd = i;
        return this;
    }
}
