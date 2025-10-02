package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes5.dex */
final class zzgkz extends zzgld {
    final /* synthetic */ Comparator zza;

    public zzgkz(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgld
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
