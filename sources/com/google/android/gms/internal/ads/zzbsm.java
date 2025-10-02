package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes5.dex */
public final class zzbsm extends zzbhm {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbsm(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final void zze(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final void zzf() {
        this.zza.onUnconfirmedClickCancelled();
    }
}
