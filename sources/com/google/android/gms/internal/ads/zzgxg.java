package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzgxg {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgxg() {
    }

    public final zzgxg zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final zzgxh zzb() {
        return new zzgxh(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzgxg(byte[] bArr) {
    }
}
