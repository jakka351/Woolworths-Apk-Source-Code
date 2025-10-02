package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes5.dex */
abstract class zzgmb implements Iterator {
    final Iterator zzb;

    public zzgmb(Iterator it) {
        it.getClass();
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    public abstract Object zza(Object obj);
}
