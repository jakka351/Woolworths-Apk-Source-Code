package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public class zzgoo extends zzgop {
    private final ListenableFuture zza;

    public zzgoo(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgop, com.google.android.gms.internal.ads.zzgon
    public final /* synthetic */ Future zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgon, com.google.android.gms.internal.ads.zzgjr
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgop
    public final ListenableFuture zzc() {
        return this.zza;
    }
}
