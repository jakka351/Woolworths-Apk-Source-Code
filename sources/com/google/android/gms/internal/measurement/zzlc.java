package com.google.android.gms.internal.measurement;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;

/* loaded from: classes5.dex */
final class zzlc extends zzlg {
    private final int zzc;

    public zzlc(byte[] bArr, int i, int i2) {
        super(bArr);
        zzlh.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzlg) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(a.n(new StringBuilder(String.valueOf(i).length() + 11), "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(c.l(i, i2, "Index > length: ", ", ", new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length())));
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zzb(int i) {
        return ((zzlg) this).zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final int zzd() {
        return 0;
    }
}
