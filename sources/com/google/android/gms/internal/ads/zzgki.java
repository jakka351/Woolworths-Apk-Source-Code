package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class zzgki extends zzgmd {
    private final Object zza;
    private boolean zzb;

    public zzgki(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
