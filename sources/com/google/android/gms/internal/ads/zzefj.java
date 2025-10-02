package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class zzefj implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzefj(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzefj zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzefj(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzefi zzb() {
        return new zzefi((Context) this.zza.zzb(), (zzcpp) this.zzb.zzb());
    }
}
