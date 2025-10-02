package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzesp implements zzeup {
    private final zzgpd zza;
    private final zzfdc zzb;

    @Nullable
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzesp(zzgpd zzgpdVar, zzfdc zzfdcVar, @Nullable PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgpdVar;
        this.zzb = zzfdcVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeso
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 26;
    }

    public final /* synthetic */ zzesq zzc() {
        return new zzesq(this.zzb, this.zzc, this.zzd);
    }
}
