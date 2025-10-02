package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
final /* synthetic */ class zzenz implements zzgob {
    static final /* synthetic */ zzenz zza = new zzenz();

    private /* synthetic */ zzenz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgot.zza(new zzeod(null, -1)) : zzgot.zza(new zzeod(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
