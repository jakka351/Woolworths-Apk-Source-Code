package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class zzdyb {
    private final ScheduledExecutorService zza;
    private final zzgpd zzb;
    private final zzgpd zzc;
    private final zzdyx zzd;
    private final zzhpr zze;

    public zzdyb(ScheduledExecutorService scheduledExecutorService, zzgpd zzgpdVar, zzgpd zzgpdVar2, zzdyx zzdyxVar, zzhpr zzhprVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgpdVar;
        this.zzc = zzgpdVar2;
        this.zzd = zzdyxVar;
        this.zze = zzhprVar;
    }

    public final ListenableFuture zza(final zzbuv zzbuvVar) {
        ListenableFuture listenableFutureSubmit;
        String str = zzbuvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzG(str)) {
            listenableFutureSubmit = zzgot.zzc(new zzdzk(1));
        } else {
            listenableFutureSubmit = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhU)).booleanValue() || ((Boolean) zzbet.zza.zze()).booleanValue()) ? this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxy
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(zzbuvVar);
                }
            }) : this.zzd.zza(zzbuvVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgol) zzgot.zzh((zzgol) zzgot.zzi(zzgol.zzw(listenableFutureSubmit), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdya
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbuvVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ ListenableFuture zzb(final zzbuv zzbuvVar, int i, Throwable th) {
        Bundle bundle;
        if (zzbuvVar != null && (bundle = zzbuvVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgot.zzj(((zzeap) this.zze.zzb()).zzj(zzbuvVar, i), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdxz
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgot.zza(new zzdzl((InputStream) obj, zzbuvVar));
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzdzl zzc(zzbuv zzbuvVar) {
        return (zzdzl) this.zzd.zza(zzbuvVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS);
    }
}
