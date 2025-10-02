package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
final class zzfwr {
    private final zzhpr zza;
    private final zzhpr zzb;
    private final zzhpr zzc;
    private final zzgea zzd;

    public zzfwr(zzhpr zzhprVar, zzhpr zzhprVar2, zzhpr zzhprVar3, zzgea zzgeaVar) {
        this.zza = zzhprVar;
        this.zzb = zzhprVar2;
        this.zzc = zzhprVar3;
        this.zzd = zzgeaVar;
    }

    private final ListenableFuture zzd(int i) {
        zzfwn zzfwnVar;
        int i2 = i - 1;
        if (i2 == 1) {
            zzfwnVar = (zzfwn) this.zza.zzb();
        } else if (i2 == 2) {
            zzfwnVar = (zzfwn) this.zzb.zzb();
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException();
            }
            zzfwnVar = (zzfwn) this.zzc.zzb();
        }
        return zzgot.zzk(zzfwnVar.zzb(), zzggt.zza(zzfwnVar), zzgpk.zza());
    }

    public final /* synthetic */ zzgea zza() {
        return this.zzd;
    }

    public final ListenableFuture zzb(int i, boolean z) {
        ListenableFuture listenableFutureZzd = zzd(i);
        return (!z || i == 2) ? listenableFutureZzd : (zzgol) zzgot.zzj((zzgol) zzgot.zzg(zzgol.zzw(listenableFutureZzd), Throwable.class, zzfwq.zza, zzgpk.zza()), new zzfwp(this), zzgpk.zza());
    }

    public final /* synthetic */ ListenableFuture zzc(int i) {
        return zzd(2);
    }
}
