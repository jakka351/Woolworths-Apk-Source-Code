package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes5.dex */
public final class zzavd extends zzatm {
    public long zza;
    public long zzb;

    public zzavd() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final HashMap zza() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.zza));
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzavd(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap mapZzb = zzatm.zzb(str);
        if (mapZzb != null) {
            this.zza = ((Long) mapZzb.get(0)).longValue();
            this.zzb = ((Long) mapZzb.get(1)).longValue();
        }
    }
}
