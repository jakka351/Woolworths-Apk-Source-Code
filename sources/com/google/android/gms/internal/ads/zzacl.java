package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzacl implements zzacv {
    private final zzi zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        zzak.zzb("media3.extractor");
    }

    public zzacl(zzi zziVar, long j, long j2) {
        this.zzb = zziVar;
        this.zzd = j;
        this.zzc = j2;
    }

    private final void zzp(int i) {
        int i2 = this.zzf + i;
        int length = this.zze.length;
        if (i2 > length) {
            String str = zzeo.zza;
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    private final int zzq(int i) {
        int iMin = Math.min(this.zzg, i);
        zzs(iMin);
        return iMin;
    }

    private final int zzr(byte[] bArr, int i, int i2) {
        int i3 = this.zzg;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.zze, 0, bArr, i, iMin);
        zzs(iMin);
        return iMin;
    }

    private final void zzs(int i) {
        int i2 = this.zzg - i;
        this.zzg = i2;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.zze = bArr2;
    }

    private final int zzt(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZza = this.zzb.zza(bArr, i + i3, i2 - i3);
        if (iZza != -1) {
            return i3 + iZza;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private final void zzu(int i) {
        if (i != -1) {
            this.zzd += i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int iZzr = zzr(bArr, i, i2);
        if (iZzr == 0) {
            iZzr = zzt(bArr, i, i2, 0, true);
        }
        zzu(iZzr);
        return iZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzb(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iZzr = zzr(bArr, i, i2);
        while (iZzr < i2 && iZzr != -1) {
            iZzr = zzt(bArr, i, i2, iZzr, z);
        }
        zzu(iZzr);
        return iZzr != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzc(byte[] bArr, int i, int i2) throws IOException {
        zzb(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzd(int i) throws IOException {
        int iZzq = zzq(1);
        if (iZzq == 0) {
            iZzq = zzt(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzu(iZzq);
        return iZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zze(int i, boolean z) throws IOException {
        int iZzq = zzq(i);
        while (iZzq < i && iZzq != -1) {
            iZzq = zzt(this.zza, -iZzq, Math.min(i, iZzq + 4096), iZzq, z);
        }
        zzu(iZzq);
        return iZzq != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(int i) throws IOException {
        zze(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzg(byte[] bArr, int i, int i2) throws IOException {
        zzacl zzaclVar;
        int iMin;
        zzp(i2);
        int i3 = this.zzg;
        int i4 = this.zzf;
        int i5 = i3 - i4;
        if (i5 == 0) {
            zzaclVar = this;
            iMin = zzaclVar.zzt(this.zze, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            zzaclVar.zzg += iMin;
        } else {
            zzaclVar = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(zzaclVar.zze, zzaclVar.zzf, bArr, i, iMin);
        zzaclVar.zzf += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzh(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!zzj(i2, z)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i2, bArr, i, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzi(byte[] bArr, int i, int i2) throws IOException {
        zzh(bArr, i, i2, false);
    }

    public final boolean zzj(int i, boolean z) throws IOException {
        zzp(i);
        int iZzt = this.zzg - this.zzf;
        while (iZzt < i) {
            int i2 = i;
            boolean z2 = z;
            iZzt = zzt(this.zze, this.zzf, i2, iZzt, z2);
            if (iZzt == -1) {
                return false;
            }
            this.zzg = this.zzf + iZzt;
            i = i2;
            z = z2;
        }
        this.zzf += i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzk(int i) throws IOException {
        zzj(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzl() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zzm() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zzn() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zzo() {
        return this.zzc;
    }
}
