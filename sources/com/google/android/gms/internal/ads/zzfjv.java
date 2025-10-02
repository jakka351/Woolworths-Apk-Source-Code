package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzfjv {
    private final Context zza;
    private final Executor zzb;
    private final zzgpe zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfjn zze;
    private final zzfie zzf;

    public zzfjv(Context context, Executor executor, zzgpe zzgpeVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfjn zzfjnVar, zzfie zzfieVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgpeVar;
        this.zzd = zzuVar;
        this.zze = zzfjnVar;
        this.zzf = zzfieVar;
    }

    public final void zza(List list, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final String str, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar, @Nullable zzfib zzfibVar, @Nullable zzcyh zzcyhVar) {
        ListenableFuture listenableFutureSubmit;
        zzfhr zzfhrVarZzn = null;
        if (zzfie.zza() && ((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            zzfhrVarZzn = zzfhr.zzn(this.zza, 14);
            zzfhrVarZzn.zza();
        }
        if (zzvVar != null) {
            listenableFutureSubmit = new zzfjm(zzvVar.zza(), this.zzd, this.zzc, this.zze).zza(str);
        } else {
            listenableFutureSubmit = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfju
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(str);
                }
            });
        }
        zzgot.zzq(listenableFutureSubmit, new zzfjt(this, zzfhrVarZzn, zzfibVar, zzcyhVar), this.zzb);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        return this.zzd.zza(str);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    public final /* synthetic */ zzfie zze() {
        return this.zzf;
    }
}
