package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbn;

/* loaded from: classes5.dex */
public final class zzdou implements zzhpx {
    private final zzhqg zza;

    private zzdou(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdou zza(zzhqg zzhqgVar) {
        return new zzdou(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbn.zza.EnumC0292zza enumC0292zza = ((zzcvj) this.zza).zza().zzp.zza == 3 ? zzbbn.zza.EnumC0292zza.REWARDED_INTERSTITIAL : zzbbn.zza.EnumC0292zza.REWARD_BASED_VIDEO_AD;
        zzhqf.zzb(enumC0292zza);
        return enumC0292zza;
    }
}
