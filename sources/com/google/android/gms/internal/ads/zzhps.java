package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public class zzhps {
    final LinkedHashMap zza;

    public zzhps(int i) {
        this.zza = zzhpu.zzc(i);
    }

    public final zzhps zza(Object obj, zzhqg zzhqgVar) {
        zzhqf.zza(obj, "key");
        zzhqf.zza(zzhqgVar, "provider");
        this.zza.put(obj, zzhqgVar);
        return this;
    }
}
