package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes.dex */
public final class zzgcs implements zzhpx {
    private final zzhqg zza;

    private zzgcs(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzgcs zza(zzhqg zzhqgVar) {
        return new zzgcs(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "dgd"), "pcam.jar");
    }
}
