package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;

/* loaded from: classes5.dex */
final class zzab extends com.google.android.gms.maps.internal.zzc {
    private final GoogleMap.CancelableCallback zza;

    public zzab(GoogleMap.CancelableCallback cancelableCallback) {
        this.zza = cancelableCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzb() {
        this.zza.onCancel();
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzc() {
        this.zza.onFinish();
    }
}
