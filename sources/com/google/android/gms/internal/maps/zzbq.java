package com.google.android.gms.internal.maps;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbq extends zzbk {
    static final zzbk zza = new zzbq(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzbq(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbc.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzbk, com.google.android.gms.internal.maps.zzbh
    public final int zza(Object[] objArr, int i) {
        Object[] objArr2 = this.zzb;
        int i2 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final Object[] zze() {
        return this.zzb;
    }
}
