package com.google.android.gms.internal.vision;

/* loaded from: classes5.dex */
final class zzeg extends zzee {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzee zzc;

    public zzeg(zzee zzeeVar, int i, int i2) {
        this.zzc = zzeeVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzde.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.vision.zzee, java.util.List
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzee subList(int i, int i2) {
        zzde.zza(i, i2, this.zzb);
        zzee zzeeVar = this.zzc;
        int i3 = this.zza;
        return (zzee) zzeeVar.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    public final boolean zzf() {
        return true;
    }
}
