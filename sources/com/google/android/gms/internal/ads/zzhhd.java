package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzhhd extends zzhhg {
    private final Iterable zza;
    private final Iterator zzg;
    private ByteBuffer zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;

    public /* synthetic */ zzhhd(Iterable iterable, int i, boolean z, byte[] bArr) {
        super(null);
        this.zzk = Integer.MAX_VALUE;
        this.zzi = i;
        this.zza = iterable;
        this.zzg = iterable.iterator();
        this.zzm = 0;
        if (i != 0) {
            zzO();
            return;
        }
        this.zzh = zzhiu.zzc;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = 0L;
    }

    private final void zzN() throws zzhiw {
        if (!this.zzg.hasNext()) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        zzO();
    }

    private final void zzO() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzg.next();
        this.zzh = byteBuffer;
        this.zzm += (int) (this.zzn - this.zzo);
        long jPosition = byteBuffer.position();
        this.zzn = jPosition;
        this.zzo = jPosition;
        this.zzp = this.zzh.limit();
        long jZzs = zzhlc.zzs(this.zzh);
        this.zzn += jZzs;
        this.zzo += jZzs;
        this.zzp += jZzs;
    }

    private final void zzP() {
        int i = this.zzi + this.zzj;
        this.zzi = i;
        int i2 = this.zzk;
        if (i <= i2) {
            this.zzj = 0;
            return;
        }
        int i3 = i - i2;
        this.zzj = i3;
        this.zzi = i - i3;
    }

    private final void zzQ(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > zzR()) {
            if (i2 > 0) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.zzp - this.zzn == 0) {
                zzN();
            }
            int iMin = Math.min(i3, (int) (this.zzp - this.zzn));
            long j = iMin;
            zzhlc.zzq(this.zzn, bArr, i2 - i3, j);
            i3 -= iMin;
            this.zzn += j;
        }
    }

    private final int zzR() {
        return (int) (((this.zzi - this.zzm) - this.zzn) + this.zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzA(int i) {
        this.zzk = i;
        zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzB() throws IOException {
        return (((long) this.zzm) + this.zzn) - this.zzo == ((long) this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzC() {
        return (int) ((this.zzm + this.zzn) - this.zzo);
    }

    public final byte zzD() throws IOException {
        if (this.zzp - this.zzn == 0) {
            zzN();
        }
        long j = this.zzn;
        this.zzn = 1 + j;
        return zzhlc.zzr(j);
    }

    public final void zzE(int i) throws IOException {
        if (i >= 0) {
            if (i <= ((this.zzi - this.zzm) - this.zzn) + this.zzo) {
                while (i > 0) {
                    if (this.zzp - this.zzn == 0) {
                        zzN();
                    }
                    int iMin = Math.min(i, (int) (this.zzp - this.zzn));
                    i -= iMin;
                    this.zzn += iMin;
                }
                return;
            }
        }
        if (i >= 0) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzl = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzl = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzhiw("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzb(int i) throws zzhiw {
        if (this.zzl != i) {
            throw new zzhiw("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzc(int i) throws IOException {
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (zzD() >= 0) {
                    return true;
                }
            }
            throw new zzhiw("CodedInputStream encountered a malformed varint.");
        }
        if (i2 == 1) {
            zzE(8);
            return true;
        }
        if (i2 == 2) {
            zzE(zzu());
            return true;
        }
        if (i2 == 3) {
            zzJ();
            zzb(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            zzI();
            return false;
        }
        if (i2 != 5) {
            throw new zzhiv("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzk() throws IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            long j = this.zzp;
            long j2 = this.zzn;
            long j3 = iZzu;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iZzu];
                zzhlc.zzq(j2, bArr, 0L, j3);
                String str = new String(bArr, zzhiu.zza);
                this.zzn += j3;
                return str;
            }
        }
        if (iZzu > 0 && iZzu <= zzR()) {
            byte[] bArr2 = new byte[iZzu];
            zzQ(bArr2, 0, iZzu);
            return new String(bArr2, zzhiu.zza);
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzm() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            long j = this.zzp;
            long j2 = this.zzn;
            long j3 = iZzu;
            if (j3 <= j - j2) {
                String strZze = zzhlh.zze(this.zzh, (int) (j2 - this.zzo), iZzu);
                this.zzn += j3;
                return strZze;
            }
        }
        if (iZzu >= 0 && iZzu <= zzR()) {
            byte[] bArr = new byte[iZzu];
            zzQ(bArr, 0, iZzu);
            return zzhlh.zzf(bArr, 0, iZzu);
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu <= 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final zzhhb zzn() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            long j = this.zzp;
            long j2 = this.zzn;
            long j3 = iZzu;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iZzu];
                zzhlc.zzq(j2, bArr, 0L, j3);
                this.zzn += j3;
                zzhhb zzhhbVar = zzhhb.zzb;
                return new zzhgz(bArr);
            }
        }
        if (iZzu > 0 && iZzu <= zzR()) {
            byte[] bArr2 = new byte[iZzu];
            zzQ(bArr2, 0, iZzu);
            zzhhb zzhhbVar2 = zzhhb.zzb;
            return new zzhgz(bArr2);
        }
        if (iZzu == 0) {
            return zzhhb.zzb;
        }
        if (iZzu < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzs() throws IOException {
        return zzhhg.zzK(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzt() throws IOException {
        return zzhhg.zzL(zzv());
    }

    public final int zzu() throws IOException {
        int i;
        long j = this.zzn;
        if (this.zzp != j) {
            long j2 = j + 1;
            byte bZzr = zzhlc.zzr(j);
            if (bZzr >= 0) {
                this.zzn++;
                return bZzr;
            }
            if (this.zzp - this.zzn >= 10) {
                long j3 = 2 + j;
                int iZzr = (zzhlc.zzr(j2) << 7) ^ bZzr;
                if (iZzr < 0) {
                    i = iZzr ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iZzr2 = (zzhlc.zzr(j3) << 14) ^ iZzr;
                    if (iZzr2 >= 0) {
                        i = iZzr2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iZzr3 = iZzr2 ^ (zzhlc.zzr(j4) << 21);
                        if (iZzr3 < 0) {
                            i = (-2080896) ^ iZzr3;
                        } else {
                            j4 = 5 + j;
                            byte bZzr2 = zzhlc.zzr(j5);
                            int i2 = (iZzr3 ^ (bZzr2 << 28)) ^ 266354560;
                            if (bZzr2 < 0) {
                                j5 = 6 + j;
                                if (zzhlc.zzr(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzhlc.zzr(j5) < 0) {
                                        j5 = 8 + j;
                                        if (zzhlc.zzr(j4) < 0) {
                                            j4 = 9 + j;
                                            if (zzhlc.zzr(j5) < 0) {
                                                long j6 = j + 10;
                                                if (zzhlc.zzr(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.zzn = j3;
                return i;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j;
        long j2;
        long j3 = this.zzn;
        if (this.zzp != j3) {
            long j4 = j3 + 1;
            byte bZzr = zzhlc.zzr(j3);
            if (bZzr >= 0) {
                this.zzn++;
                return bZzr;
            }
            if (this.zzp - this.zzn >= 10) {
                long j5 = 2 + j3;
                int iZzr = (zzhlc.zzr(j4) << 7) ^ bZzr;
                if (iZzr < 0) {
                    j = iZzr ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int iZzr2 = (zzhlc.zzr(j5) << 14) ^ iZzr;
                    if (iZzr2 >= 0) {
                        j = iZzr2 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int iZzr3 = iZzr2 ^ (zzhlc.zzr(j6) << 21);
                        if (iZzr3 < 0) {
                            j = (-2080896) ^ iZzr3;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long jZzr = (zzhlc.zzr(j7) << 28) ^ iZzr3;
                            if (jZzr >= 0) {
                                j = 266354560 ^ jZzr;
                            } else {
                                long j8 = 6 + j3;
                                long jZzr2 = jZzr ^ (zzhlc.zzr(j6) << 35);
                                if (jZzr2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long jZzr3 = jZzr2 ^ (zzhlc.zzr(j8) << 42);
                                    if (jZzr3 >= 0) {
                                        j = 4363953127296L ^ jZzr3;
                                    } else {
                                        j8 = 8 + j3;
                                        jZzr2 = jZzr3 ^ (zzhlc.zzr(j9) << 49);
                                        if (jZzr2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long jZzr4 = (jZzr2 ^ (zzhlc.zzr(j8) << 56)) ^ 71499008037633920L;
                                            if (jZzr4 < 0) {
                                                long j10 = j3 + 10;
                                                if (zzhlc.zzr(j9) >= 0) {
                                                    j5 = j10;
                                                    j = jZzr4;
                                                }
                                            } else {
                                                j = jZzr4;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ jZzr2;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.zzn = j5;
                return j;
            }
        }
        return zzw();
    }

    public final long zzw() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((zzD() & 128) == 0) {
                return j;
            }
        }
        throw new zzhiw("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() throws IOException {
        long j = this.zzp;
        long j2 = this.zzn;
        if (j - j2 < 4) {
            int iZzD = zzD() & 255;
            int iZzD2 = (zzD() & 255) << 8;
            return iZzD | iZzD2 | ((zzD() & 255) << 16) | ((zzD() & 255) << 24);
        }
        this.zzn = 4 + j2;
        int iZzr = zzhlc.zzr(j2) & 255;
        int iZzr2 = (zzhlc.zzr(1 + j2) & 255) << 8;
        return iZzr | iZzr2 | ((zzhlc.zzr(2 + j2) & 255) << 16) | ((zzhlc.zzr(j2 + 3) & 255) << 24);
    }

    public final long zzy() throws IOException {
        long j = this.zzp;
        long j2 = this.zzn;
        if (j - j2 < 8) {
            return ((zzD() & 255) << 56) | (zzD() & 255) | ((zzD() & 255) << 8) | ((zzD() & 255) << 16) | ((zzD() & 255) << 24) | ((zzD() & 255) << 32) | ((zzD() & 255) << 40) | ((zzD() & 255) << 48);
        }
        this.zzn = 8 + j2;
        long jZzr = zzhlc.zzr(j2) & 255;
        long jZzr2 = (zzhlc.zzr(1 + j2) & 255) << 8;
        return jZzr | jZzr2 | ((zzhlc.zzr(j2 + 2) & 255) << 16) | ((zzhlc.zzr(3 + j2) & 255) << 24) | ((zzhlc.zzr(j2 + 4) & 255) << 32) | ((zzhlc.zzr(j2 + 5) & 255) << 40) | ((zzhlc.zzr(j2 + 6) & 255) << 48) | ((zzhlc.zzr(j2 + 7) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzz(int i) throws zzhiw {
        if (i < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzC = i + zzC();
        int i2 = this.zzk;
        if (iZzC > i2) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = iZzC;
        zzP();
        return i2;
    }
}
