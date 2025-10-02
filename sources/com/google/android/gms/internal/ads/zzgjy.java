package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzgjy extends zzgjz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzgjz zzc;

    public zzgjy(zzgjz zzgjzVar, int i, int i2) {
        Objects.requireNonNull(zzgjzVar);
        this.zzc = zzgjzVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzghc.zzm(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgjz, java.util.List
    /* renamed from: zzh */
    public final zzgjz subList(int i, int i2) {
        zzghc.zzo(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
