package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzeoj implements zzeup {
    private final zzgpd zza;
    private final VersionInfoParcel zzb;

    public zzeoj(VersionInfoParcel versionInfoParcel, zzgpd zzgpdVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 54;
    }

    public final /* synthetic */ zzeok zzc() {
        return zzeok.zzc(this.zzb);
    }
}
