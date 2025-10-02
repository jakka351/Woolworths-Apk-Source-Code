package com.google.android.gms.internal.maps;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbr extends zzbk {
    final /* synthetic */ zzbs zza;

    public zzbr(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzbs zzbsVar = this.zza;
        zzbc.zza(i, zzbsVar.zzc, "index");
        int i2 = i + i;
        Object obj = zzbsVar.zzb[i2];
        Objects.requireNonNull(obj);
        Object obj2 = zzbsVar.zzb[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
