package com.google.android.gms.internal.vision;

import au.com.woolworths.shop.checkout.ui.confirmation.c;

/* loaded from: classes5.dex */
final class zzhw extends zzid {
    private final int zzc;
    private final int zzd;

    public zzhw(byte[] bArr, int i, int i2) {
        super(bArr);
        zzht.zzb(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.vision.zzid, com.google.android.gms.internal.vision.zzht
    public final byte zza(int i) {
        int iZza = zza();
        if (((iZza - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(c.k(22, i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(c.j(40, i, iZza, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.vision.zzid, com.google.android.gms.internal.vision.zzht
    public final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.vision.zzid
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.vision.zzid, com.google.android.gms.internal.vision.zzht
    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.vision.zzid, com.google.android.gms.internal.vision.zzht
    public final void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i3);
    }
}
