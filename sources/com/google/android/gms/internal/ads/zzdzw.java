package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
public final class zzdzw {
    private final zzgpd zza;
    private final zzdzb zzb;
    private final zzhpr zzc;

    public zzdzw(zzgpd zzgpdVar, zzdzb zzdzbVar, zzhpr zzhprVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdzbVar;
        this.zzc = zzhprVar;
    }

    private final ListenableFuture zzg(final zzbuv zzbuvVar, zzdzm zzdzmVar, final zzdzm zzdzmVar2, final zzgob zzgobVar) {
        ListenableFuture listenableFutureZzh;
        String str = zzbuvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzG(str)) {
            listenableFutureZzh = zzgot.zzc(new zzdzk(1));
        } else {
            listenableFutureZzh = zzgot.zzh(zzdzmVar.zza(zzbuvVar), ExecutionException.class, zzdzv.zza, this.zza);
        }
        zzgpd zzgpdVar = this.zza;
        return (zzgol) zzgot.zzh((zzgol) zzgot.zzj((zzgol) zzgot.zzj(zzgol.zzw(listenableFutureZzh), zzdzo.zza, zzgpdVar), zzgobVar, zzgpdVar), zzdzk.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdzp
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzdzmVar2, zzbuvVar, zzgobVar, (zzdzk) obj);
            }
        }, zzgpdVar);
    }

    public final ListenableFuture zza(final zzbuv zzbuvVar) {
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str = new String(zzgmo.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzbuv zzbuvVar2 = zzbuvVar;
                zzbuvVar2.zzj = str;
                return zzgot.zza(zzbuvVar2);
            }
        };
        final zzdzb zzdzbVar = this.zzb;
        Objects.requireNonNull(zzdzbVar);
        return zzg(zzbuvVar, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzn
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ ListenableFuture zza(zzbuv zzbuvVar2) {
                return zzdzbVar.zza(zzbuvVar2);
            }
        }, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ ListenableFuture zza(zzbuv zzbuvVar2) {
                return this.zza.zzd(zzbuvVar2);
            }
        }, zzgobVar);
    }

    public final ListenableFuture zzb(zzbuv zzbuvVar) {
        return zzg(zzbuvVar, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzt
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ ListenableFuture zza(zzbuv zzbuvVar2) {
                return this.zza.zze(zzbuvVar2);
            }
        }, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzu
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ ListenableFuture zza(zzbuv zzbuvVar2) {
                return this.zza.zzf(zzbuvVar2);
            }
        }, zzdzs.zza);
    }

    public final /* synthetic */ ListenableFuture zzc(zzdzm zzdzmVar, zzbuv zzbuvVar, zzgob zzgobVar, zzdzk zzdzkVar) {
        return zzgot.zzj(zzdzmVar.zza(zzbuvVar), zzgobVar, this.zza);
    }

    public final /* synthetic */ ListenableFuture zzd(zzbuv zzbuvVar) {
        return ((zzeap) this.zzc.zzb()).zzc(zzbuvVar, Binder.getCallingUid());
    }

    public final /* synthetic */ ListenableFuture zze(zzbuv zzbuvVar) {
        return this.zzb.zzd(zzbuvVar.zzh);
    }

    public final /* synthetic */ ListenableFuture zzf(zzbuv zzbuvVar) {
        return ((zzeap) this.zzc.zzb()).zzd(zzbuvVar.zzh);
    }
}
