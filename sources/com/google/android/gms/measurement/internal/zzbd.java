package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbd implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzbe zzb;

    public zzbd(zzbe zzbeVar) {
        Objects.requireNonNull(zzbeVar);
        this.zzb = zzbeVar;
        this.zza = zzbeVar.zzg().keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.zza.next();
    }
}
