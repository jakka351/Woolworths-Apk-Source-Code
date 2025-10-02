package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzap<E> extends zzah<E> {
    static final zzah<Object> zza = new zzap(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzap(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzu.zza(i, this.zzc);
        E e = (E) this.zzb[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzah, com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int zza() {
        return this.zzc;
    }
}
