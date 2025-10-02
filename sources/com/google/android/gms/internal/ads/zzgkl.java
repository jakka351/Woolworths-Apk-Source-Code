package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzgkl extends zzgmc {
    final /* synthetic */ zzgkm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgkl(zzgkm zzgkmVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgkmVar);
        this.zza = zzgkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgmb
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
