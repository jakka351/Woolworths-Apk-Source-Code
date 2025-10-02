package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class zzdxh {
    private final zzgpd zza;
    private final zzgpd zzb;
    private final zzdyr zzc;
    private final zzhpr zzd;

    public zzdxh(zzgpd zzgpdVar, zzgpd zzgpdVar2, zzdyr zzdyrVar, zzhpr zzhprVar) {
        this.zza = zzgpdVar;
        this.zzb = zzgpdVar2;
        this.zzc = zzdyrVar;
        this.zzd = zzhprVar;
    }

    public final ListenableFuture zza(final zzbuv zzbuvVar) {
        ListenableFuture listenableFutureZzh;
        String str = zzbuvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzG(str)) {
            listenableFutureZzh = zzgot.zzc(new zzdzk(1));
        } else {
            listenableFutureZzh = zzgot.zzh(this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxg
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(zzbuvVar);
                }
            }), ExecutionException.class, zzdxd.zza, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgot.zzh(listenableFutureZzh, zzdzk.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdxe
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzbuvVar, callingUid, (zzdzk) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzdzl zzb(zzbuv zzbuvVar) {
        return (zzdzl) this.zzc.zza(zzbuvVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ ListenableFuture zzc(final zzbuv zzbuvVar, int i, zzdzk zzdzkVar) {
        Bundle bundle;
        if (zzbuvVar != null && (bundle = zzbuvVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgot.zzj(((zzeap) this.zzd.zzb()).zzb(zzbuvVar, i), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdxf
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgot.zza(new zzdzl((InputStream) obj, zzbuvVar));
            }
        }, this.zzb);
    }
}
