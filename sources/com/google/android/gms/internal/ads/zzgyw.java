package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzgyw implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    public zzgyw(zzgyz zzgyzVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzgyzVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzgyy(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
