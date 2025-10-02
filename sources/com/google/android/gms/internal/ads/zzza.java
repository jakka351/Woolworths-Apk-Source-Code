package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
final /* synthetic */ class zzza implements zzdf {
    static final /* synthetic */ zzza zza = new zzza();

    private /* synthetic */ zzza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    public final /* synthetic */ void zza(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
