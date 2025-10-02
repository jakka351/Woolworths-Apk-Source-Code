package com.google.android.gms.ads.preload;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzea;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zza extends zzcg {
    final /* synthetic */ PreloadCallbackV2 zza;

    public zza(zzb zzbVar, PreloadCallbackV2 preloadCallbackV2) {
        this.zza = preloadCallbackV2;
        Objects.requireNonNull(zzbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(String str, @Nullable zzea zzeaVar) {
        this.zza.onAdPreloaded(str, ResponseInfo.zzb(zzeaVar));
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzf(String str) {
        this.zza.onAdsExhausted(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzg(String str, zze zzeVar) {
        this.zza.onAdFailedToPreload(str, zzeVar.zzb());
    }
}
