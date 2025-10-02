package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
final class zzgal implements zzfwn {
    private final zzhpr zza;
    private final zzhpr zzb;
    private final ExecutorService zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    public zzgal(zzhpr zzhprVar, zzhpr zzhprVar2, ExecutorService executorService, boolean z, boolean z2, boolean z3) {
        this.zza = zzhprVar;
        this.zzb = zzhprVar2;
        this.zzc = executorService;
        this.zzd = z;
        this.zze = z2;
        this.zzf = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final String zza() {
        return ((zzgbn) this.zzb.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final ListenableFuture zzb() {
        if (this.zzf) {
            return (zzgol) zzgot.zzj((zzgol) zzgot.zzg(zzgol.zzw(((zzgbc) this.zza.zzb()).zza()), Throwable.class, zzgak.zza, zzgpk.zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgai
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzi((zzgbb) obj);
                }
            }, zzgpk.zza());
        }
        ListenableFuture listenableFutureZzb = ((zzgbn) this.zzb.zzb()).zzb();
        zzh();
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final ListenableFuture zzc(Context context) {
        if (!this.zzd) {
            zzh();
        }
        return ((zzgbn) this.zzb.zzb()).zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        if (!this.zzd) {
            zzh();
        }
        return ((zzgbn) this.zzb.zzb()).zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        if (!this.zzd) {
            zzh();
        }
        return ((zzgbn) this.zzb.zzb()).zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final void zzf(InputEvent inputEvent) {
        ((zzgbn) this.zzb.zzb()).zzf(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zzg() {
        ((zzgbn) this.zzb.zzb()).zzg();
        return 3;
    }

    public final ListenableFuture zzh() {
        try {
            return zzgot.zzj(((zzgbc) this.zza.zzb()).zza(), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgaj
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzj((zzgbb) obj);
                }
            }, this.zzc);
        } catch (Throwable th) {
            return zzgot.zzc(th);
        }
    }

    public final /* synthetic */ ListenableFuture zzi(zzgbb zzgbbVar) {
        return ((zzgbn) this.zzb.zzb()).zzb();
    }

    public final /* synthetic */ ListenableFuture zzj(zzgbb zzgbbVar) {
        return (this.zze && zzgbbVar == zzgbb.RESULT_UPDATED) ? ((zzgbn) this.zzb.zzb()).zzb() : zzgot.zzb();
    }
}
