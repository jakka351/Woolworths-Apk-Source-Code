package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class zzegd implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzegd(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzegd zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzegd(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegc zzb() {
        return new zzegc((Context) this.zza.zzb(), (zzdgh) this.zzb.zzb());
    }
}
