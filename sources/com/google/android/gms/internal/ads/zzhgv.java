package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzhgv extends zzhgz {
    private final int zzc;
    private final int zzd;

    public zzhgv(byte[] bArr, int i, int i2) {
        super(bArr);
        zzhhb.zzA(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final byte zza(int i) {
        zzhhb.zzz(i, this.zzd);
        return ((zzhgz) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final byte zzb(int i) {
        return ((zzhgz) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzhgz) this).zza, this.zzc + i, bArr, i2, i3);
    }
}
