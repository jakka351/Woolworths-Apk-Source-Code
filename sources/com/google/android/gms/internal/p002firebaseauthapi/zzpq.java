package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzpq<P> implements Iterator<P> {
    private final Iterator<P> zza;
    private final Iterator<P> zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final P next() {
        return this.zza.hasNext() ? this.zza.next() : this.zzb.next();
    }

    private zzpq(Iterator<P> it, Iterator<P> it2) {
        this.zza = it;
        this.zzb = it2;
    }
}
