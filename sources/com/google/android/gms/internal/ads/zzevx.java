package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
final /* synthetic */ class zzevx implements zzgob {
    static final /* synthetic */ zzevx zza = new zzevx();

    private /* synthetic */ zzevx() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgot.zza(new zzevz(null, -1)) : zzgot.zza(new zzevz(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
