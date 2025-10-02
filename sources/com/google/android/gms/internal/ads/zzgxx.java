package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class zzgxx {
    private HashMap zza = new HashMap();

    public final zzgxy zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzgxy zzgxyVar = new zzgxy(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgxyVar;
    }
}
