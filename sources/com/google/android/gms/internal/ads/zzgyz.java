package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzgyz {
    private static final zzhgg zza = zzhgg.zza(new byte[0]);
    private final Map zzb;

    public final Iterable zza(byte[] bArr) {
        Map map = this.zzb;
        List list = (List) map.get(zza);
        List list2 = bArr.length >= 5 ? (List) map.get(zzhgg.zzb(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new zzgyw(this, list2, list);
    }
}
