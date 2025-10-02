package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzau extends zzah {
    private final /* synthetic */ zzar zza;

    public zzau(zzar zzarVar) {
        Objects.requireNonNull(zzarVar);
        this.zza = zzarVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zzu.zza(i, this.zza.zzc);
        int i2 = i * 2;
        Object obj = this.zza.zzb[i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
