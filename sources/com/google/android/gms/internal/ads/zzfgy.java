package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class zzfgy {
    final /* synthetic */ zzfgz zza;
    private final Object zzb;

    @Nullable
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    public /* synthetic */ zzfgy(zzfgz zzfgzVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2, byte[] bArr) {
        this(zzfgzVar, obj, null, listenableFuture, list, listenableFuture2);
    }

    public final zzfgy zza(String str) {
        return new zzfgy(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfgy zzb(final zzfgm zzfgmVar) {
        return zzc(new zzgob() { // from class: com.google.android.gms.internal.ads.zzfgx
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgot.zza(zzfgmVar.zza(obj));
            }
        });
    }

    public final zzfgy zzc(zzgob zzgobVar) {
        return zzd(zzgobVar, this.zza.zze());
    }

    public final zzfgy zzd(zzgob zzgobVar, Executor executor) {
        return new zzfgy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgot.zzj(this.zzf, zzgobVar, executor));
    }

    public final zzfgy zze(final ListenableFuture listenableFuture) {
        return zzd(new zzgob() { // from class: com.google.android.gms.internal.ads.zzfgu
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return listenableFuture;
            }
        }, zzbzh.zzg);
    }

    public final zzfgy zzf(Class cls, final zzfgm zzfgmVar) {
        return zzg(cls, new zzgob(zzfgmVar) { // from class: com.google.android.gms.internal.ads.zzfgv
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgot.zza("");
            }
        });
    }

    public final zzfgy zzg(Class cls, zzgob zzgobVar) {
        zzfgz zzfgzVar = this.zza;
        zzgpd zzgpdVarZze = zzfgzVar.zze();
        return new zzfgy(zzfgzVar, this.zzb, this.zzc, this.zzd, this.zze, zzgot.zzh(this.zzf, cls, zzgobVar, zzgpdVarZze));
    }

    public final zzfgy zzh(long j, TimeUnit timeUnit) {
        zzfgz zzfgzVar = this.zza;
        ScheduledExecutorService scheduledExecutorServiceZzf = zzfgzVar.zzf();
        return new zzfgy(zzfgzVar, this.zzb, this.zzc, this.zzd, this.zze, zzgot.zzi(this.zzf, j, timeUnit, scheduledExecutorServiceZzf));
    }

    public final zzfgo zzi() {
        Object obj = this.zzb;
        String strZzc = this.zzc;
        if (strZzc == null) {
            strZzc = this.zza.zzc(obj);
        }
        final zzfgo zzfgoVar = new zzfgo(obj, strZzc, this.zzf);
        this.zza.zzg().zza(zzfgoVar);
        ListenableFuture listenableFuture = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzg().zzb(zzfgoVar);
            }
        };
        zzgpd zzgpdVar = zzbzh.zzg;
        listenableFuture.addListener(runnable, zzgpdVar);
        zzgot.zzq(zzfgoVar, new zzfgt(this, zzfgoVar), zzgpdVar);
        return zzfgoVar;
    }

    public final zzfgy zzj(Object obj) {
        return this.zza.zza(obj, zzi());
    }

    private zzfgy(zzfgz zzfgzVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        Objects.requireNonNull(zzfgzVar);
        this.zza = zzfgzVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }
}
