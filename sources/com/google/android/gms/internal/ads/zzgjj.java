package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzgjj extends AbstractCollection {
    final /* synthetic */ zzgjk zza;

    public /* synthetic */ zzgjj(zzgjk zzgjkVar, byte[] bArr) {
        Objects.requireNonNull(zzgjkVar);
        this.zza = zzgjkVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzgjk zzgjkVar = this.zza;
        Map mapZzc = zzgjkVar.zzc();
        return mapZzc != null ? mapZzc.values().iterator() : new zzgje(zzgjkVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
