package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.b;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
final class zzlk extends zzlm {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzlk(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(b.i(length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zza(int i, int i2) throws IOException {
        zzr((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzb(int i, int i2) throws IOException {
        zzr(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzc(int i, int i2) throws IOException {
        zzr(i << 3);
        zzr(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzd(int i, int i2) throws IOException {
        zzr((i << 3) | 5);
        zzs(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zze(int i, long j) throws IOException {
        zzr(i << 3);
        zzt(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzf(int i, long j) throws IOException {
        zzr((i << 3) | 1);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzg(int i, boolean z) throws IOException {
        zzr(i << 3);
        zzp(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzh(int i, String str) throws IOException {
        zzr((i << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzi(int i, zzlh zzlhVar) throws IOException {
        zzr((i << 3) | 2);
        zzj(zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzj(zzlh zzlhVar) throws IOException {
        zzr(zzlhVar.zzc());
        zzlhVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzk(byte[] bArr, int i, int i2) throws IOException {
        zzr(i2);
        zzv(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzl(int i, zznm zznmVar, zznx zznxVar) throws IOException {
        zzr((i << 3) | 2);
        zzr(((zzks) zznmVar).zzcd(zznxVar));
        zznxVar.zzf(zznmVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzm(int i, zznm zznmVar) throws IOException {
        zzr(11);
        zzc(2, i);
        zzr(26);
        zzo(zznmVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzn(int i, zzlh zzlhVar) throws IOException {
        zzr(11);
        zzc(2, i);
        zzi(3, zzlhVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzo(zznm zznmVar) throws IOException {
        zzr(zznmVar.zzcn());
        zznmVar.zzcB(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzp(byte b) throws IOException {
        int i;
        int i2 = this.zze;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.zzc[i2] = b;
            this.zze = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new zzll(i2, this.zzd, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzq(int i) throws IOException {
        if (i >= 0) {
            zzr(i);
        } else {
            zzt(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzr(int i) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.zze;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                throw new zzll(i3, this.zzd, 1, indexOutOfBoundsException);
            }
            try {
                this.zzc[i3] = (byte) (i | 128);
                i >>>= 7;
                i3 = i2;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                i3 = i2;
                throw new zzll(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zzc[i3] = (byte) i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzs(int i) throws IOException {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzt(long j) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2;
        boolean z = zzlm.zzd;
        int i3 = this.zze;
        if (!z || this.zzd - i3 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                }
                try {
                    this.zzc[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i3 = i2;
                    throw new zzll(i3, this.zzd, 1, indexOutOfBoundsException);
                }
            }
            i = i3 + 1;
            try {
                this.zzc[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i;
                throw new zzll(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzop.zzp(this.zzc, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            zzop.zzp(this.zzc, i3, (byte) j);
        }
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzu(long j) throws IOException {
        int i = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zze = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(i, this.zzd, 8, e);
        }
    }

    public final void zzv(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzw(byte[] bArr, int i, int i2) throws IOException {
        zzv(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzx(String str) throws IOException {
        int i = this.zze;
        try {
            int iZzz = zzlm.zzz(str.length() * 3);
            int iZzz2 = zzlm.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzr(zzos.zzb(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzos.zzc(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + iZzz2;
            this.zze = i3;
            int iZzc = zzos.zzc(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzr((iZzc - i) - iZzz2);
            this.zze = iZzc;
        } catch (zzor e) {
            this.zze = i;
            zzF(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final int zzy() {
        return this.zzd - this.zze;
    }
}
