package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzghk implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzghq zzb;

    public zzghk(zzghq zzghqVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzghqVar);
        this.zzb = zzghqVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzggw.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
