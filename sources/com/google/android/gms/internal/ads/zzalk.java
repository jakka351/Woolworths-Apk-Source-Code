package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzalk implements Comparable {
    public final int zza;
    public final zzalf zzb;

    public zzalk(int i, zzalf zzalfVar) {
        this.zza = i;
        this.zzb = zzalfVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzalk) obj).zza);
    }
}
