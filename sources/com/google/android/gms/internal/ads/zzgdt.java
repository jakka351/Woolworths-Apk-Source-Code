package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzgdt implements zzhpx {
    private final zzhqg zza;

    private zzgdt(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzgdt zza(zzhqg zzhqgVar) {
        return new zzgdt(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgds((Context) this.zza.zzb());
    }
}
