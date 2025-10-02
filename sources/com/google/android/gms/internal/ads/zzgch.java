package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;

/* loaded from: classes.dex */
final class zzgch implements zzgcg {
    private final zzfvl zza;
    private final zzfvl zzb;
    private final zzhpr zzc;
    private final zzgea zzd;

    public zzgch(zzfvl zzfvlVar, zzfvl zzfvlVar2, zzhpr zzhprVar, zzgea zzgeaVar) {
        this.zza = zzfvlVar;
        this.zzb = zzfvlVar2;
        this.zzc = zzhprVar;
        this.zzd = zzgeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        this.zzd.zze(15302, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final ListenableFuture zzb(zzfwm zzfwmVar) {
        ListenableFuture listenableFutureZzc = this.zza.zzc(zzfwmVar);
        this.zzd.zze(15303, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final ListenableFuture zzc(byte[] bArr) {
        ListenableFuture listenableFutureZzc = this.zzb.zzc(bArr);
        this.zzd.zze(15305, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final File zzd() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final ListenableFuture zze(byte[] bArr) {
        ListenableFuture listenableFutureZzc = ((zzfvl) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(15307, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final File zzf() {
        return ((zzfvl) this.zzc.zzb()).zza();
    }
}
