package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.camera.core.impl.b;
import java.io.IOException;

/* loaded from: classes5.dex */
class zzakg extends zzakd {
    protected final byte[] zzb;

    public zzakg(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzajv) || zzb() != ((zzajv) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzakg)) {
            return obj.equals(this);
        }
        zzakg zzakgVar = (zzakg) obj;
        int iZza = zza();
        int iZza2 = zzakgVar.zza();
        if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
            return zza(zzakgVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final zzakh zzc() {
        return zzakh.zza(this.zzb, zze(), zzb(), true);
    }

    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final zzajv zza(int i, int i2) {
        int iZza = zzajv.zza(0, i2, zzb());
        return iZza == 0 ? zzajv.zza : new zzajz(this.zzb, zze(), iZza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final int zzb(int i, int i2, int i3) {
        return zzalh.zza(i, this.zzb, zze(), i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final void zza(zzajw zzajwVar) throws IOException {
        zzajwVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakd
    public final boolean zza(zzajv zzajvVar, int i, int i2) {
        if (i2 <= zzajvVar.zzb()) {
            if (i2 <= zzajvVar.zzb()) {
                if (zzajvVar instanceof zzakg) {
                    zzakg zzakgVar = (zzakg) zzajvVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzakgVar.zzb;
                    int iZze = zze() + i2;
                    int iZze2 = zze();
                    int iZze3 = zzakgVar.zze();
                    while (iZze2 < iZze) {
                        if (bArr[iZze2] != bArr2[iZze3]) {
                            return false;
                        }
                        iZze2++;
                        iZze3++;
                    }
                    return true;
                }
                return zzajvVar.zza(0, i2).equals(zza(0, i2));
            }
            throw new IllegalArgumentException(b.i(i2, zzajvVar.zzb(), "Ran off end of other: 0, ", ", "));
        }
        throw new IllegalArgumentException("Length too large: " + i2 + zzb());
    }
}
