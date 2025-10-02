package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzam extends zzah {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzah zzc;

    public zzam(zzah zzahVar, int i, int i2) {
        Objects.requireNonNull(zzahVar);
        this.zzc = zzahVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzu.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzah, java.util.List
    /* renamed from: zza */
    public final zzah subList(int i, int i2) {
        zzu.zza(i, i2, this.zzb);
        zzah zzahVar = this.zzc;
        int i3 = this.zza;
        return (zzah) zzahVar.subList(i + i3, i2 + i3);
    }
}
