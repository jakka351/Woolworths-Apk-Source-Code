package com.google.android.gms.internal.measurement;

import YU.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb;

    public zzad(zzae zzaeVar) {
        Objects.requireNonNull(zzaeVar);
        this.zza = zzaeVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzh();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzae zzaeVar = this.zza;
        if (this.zzb >= zzaeVar.zzh()) {
            int i = this.zzb;
            throw new NoSuchElementException(a.n(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
        }
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        return zzaeVar.zzl(i2);
    }
}
