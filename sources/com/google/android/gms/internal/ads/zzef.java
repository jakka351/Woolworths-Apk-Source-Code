package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class zzef {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgke zzc = zzgke.zzl(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean zzd = new AtomicBoolean();
    private byte[] zze;
    private int zzf;
    private int zzg;

    public zzef(byte[] bArr, int i) {
        this.zze = bArr;
        this.zzg = i;
    }

    private final char zzS(ByteOrder byteOrder, int i) {
        zzW(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zze;
            int i2 = this.zzf + i;
            return zzgnb.zza(bArr[i2], bArr[i2 + 1]);
        }
        byte[] bArr2 = this.zze;
        int i3 = this.zzf + i;
        return zzgnb.zza(bArr2[i3 + 1], bArr2[i3]);
    }

    private final char zzT(Charset charset, char[] cArr) {
        int iZzU;
        if (zzd() >= zzV(charset) && (iZzU = zzU(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j = i;
                char c = (char) j;
                zzghc.zze(((long) c) == j, "Out of range: %s", j);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.zzf = zzgne.zza(iZzU & 255) + this.zzf;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    private final int zzU(Charset charset) {
        int codePoint;
        int i;
        int unsignedInt;
        zzghc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() < zzV(charset)) {
            int i2 = this.zzf;
            int i3 = this.zzg;
            throw new IndexOutOfBoundsException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i2, i3, "position=", ", limit=", new StringBuilder(String.valueOf(i2).length() + 17 + String.valueOf(i3).length())));
        }
        int i4 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.zze[this.zzf];
            if ((b & 128) == 0) {
                codePoint = Byte.toUnsignedInt(b);
                return (codePoint << 8) | i4;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.zze[this.zzf];
            if ((b2 & 128) == 0) {
                i = 1;
            } else if ((b2 & 224) == 192 && zzd() >= 2 && zzX(this.zze[this.zzf + 1])) {
                i = 2;
            } else {
                if ((this.zze[this.zzf] & 240) == 224 && zzd() >= 3) {
                    byte[] bArr = this.zze;
                    int i5 = this.zzf;
                    if (zzX(bArr[i5 + 1]) && zzX(bArr[i5 + 2])) {
                        i = 3;
                    }
                }
                if ((this.zze[this.zzf] & 248) == 240 && zzd() >= 4) {
                    byte[] bArr2 = this.zze;
                    int i6 = this.zzf;
                    if (zzX(bArr2[i6 + 1]) && zzX(bArr2[i6 + 2]) && zzX(bArr2[i6 + 3])) {
                        i = 4;
                    }
                }
                i = 0;
            }
            if (i == 1) {
                unsignedInt = Byte.toUnsignedInt(this.zze[this.zzf]);
            } else if (i == 2) {
                byte[] bArr3 = this.zze;
                int i7 = this.zzf;
                unsignedInt = zzY(0, 0, bArr3[i7], bArr3[i7 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr4 = this.zze;
                        int i8 = this.zzf;
                        unsignedInt = zzY(bArr4[i8], bArr4[i8 + 1], bArr4[i8 + 2], bArr4[i8 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zze;
                int i9 = this.zzf;
                unsignedInt = zzY(0, bArr5[i9] & 15, bArr5[i9 + 1], bArr5[i9 + 2]);
            }
            i4 = i;
            codePoint = unsignedInt;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cZzS = zzS(byteOrder, 0);
            if (!Character.isHighSurrogate(cZzS) || zzd() < 4) {
                codePoint = cZzS;
                i4 = 2;
            } else {
                codePoint = Character.toCodePoint(cZzS, zzS(byteOrder, 2));
                i4 = 4;
            }
        }
        return (codePoint << 8) | i4;
    }

    private static int zzV(Charset charset) {
        zzghc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void zzW(int i) {
        if (!zzd.get() || zzd() >= i) {
            return;
        }
        int iZzd = zzd();
        throw new IndexOutOfBoundsException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i, iZzd, "bytesNeeded= ", ", bytesLeft=", new StringBuilder(String.valueOf(i).length() + 25 + String.valueOf(iZzd).length())));
    }

    private static boolean zzX(byte b) {
        return (b & 192) == 128;
    }

    private static int zzY(int i, int i2, int i3, int i4) {
        return zzgne.zze((byte) 0, zzgni.zza(((i & 7) << 2) | ((i2 & 48) >> 4)), zzgni.zza(((i3 & 60) >> 2) | ((i2 & 15) << 4)), zzgni.zza((i4 & 63) | ((i3 & 3) << 6)));
    }

    public final long zzA() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.zzf = i3;
        long j2 = bArr[i2];
        this.zzf = i + 3;
        long j3 = bArr[i3];
        this.zzf = i + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final int zzB() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.zzf = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.zzf = i6;
        int i7 = bArr[i4] & 255;
        this.zzf = i + 4;
        return (bArr[i6] & 255) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int zzC() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.zzf = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.zzf = i6;
        int i7 = bArr[i4] & 255;
        this.zzf = i + 4;
        return ((bArr[i6] & 255) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final long zzD() {
        zzW(8);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.zzf = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.zzf = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.zzf = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.zzf = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.zzf = i7;
        long j6 = bArr[i6];
        this.zzf = i + 7;
        long j7 = bArr[i7];
        this.zzf = i + 8;
        return ((j7 & 255) << 8) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long zzE() {
        zzW(8);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.zzf = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.zzf = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.zzf = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.zzf = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.zzf = i7;
        long j6 = bArr[i6];
        this.zzf = i + 7;
        long j7 = bArr[i7];
        this.zzf = i + 8;
        return ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int zzF() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        int i3 = bArr[i] & 255;
        this.zzf = i + 2;
        int i4 = bArr[i2] & 255;
        this.zzf = i + 4;
        return (i3 << 8) | i4;
    }

    public final int zzG() {
        return (zzs() << 21) | (zzs() << 14) | (zzs() << 7) | zzs();
    }

    public final int zzH() {
        int iZzB = zzB();
        if (iZzB >= 0) {
            return iZzB;
        }
        throw new IllegalStateException(YU.a.n(new StringBuilder(String.valueOf(iZzB).length() + 18), "Top bit not zero: ", iZzB));
    }

    public final int zzI() {
        int iZzC = zzC();
        if (iZzC >= 0) {
            return iZzC;
        }
        throw new IllegalStateException(YU.a.n(new StringBuilder(String.valueOf(iZzC).length() + 18), "Top bit not zero: ", iZzC));
    }

    public final long zzJ() {
        long jZzD = zzD();
        if (jZzD >= 0) {
            return jZzD;
        }
        throw new IllegalStateException(au.com.woolworths.shop.checkout.ui.confirmation.c.m(jZzD, "Top bit not zero: ", new StringBuilder(String.valueOf(jZzD).length() + 18)));
    }

    public final String zzK(int i, Charset charset) {
        zzW(i);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        String str = new String(bArr, i2, i, charset);
        this.zzf = i2 + i;
        return str;
    }

    public final String zzL(int i) {
        zzW(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.zzf;
        int i3 = (i2 + i) - 1;
        String strZzj = zzeo.zzj(this.zze, i2, (i3 >= this.zzg || this.zze[i3] != 0) ? i : i - 1);
        this.zzf += i;
        return strZzj;
    }

    @Nullable
    public final String zzM(char c) {
        if (zzd() == 0) {
            return null;
        }
        int i = this.zzf;
        while (i < this.zzg && this.zze[i] != 0) {
            i++;
        }
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        String strZzj = zzeo.zzj(bArr, i2, i - i2);
        this.zzf = i;
        if (i < this.zzg) {
            this.zzf = i + 1;
        }
        return strZzj;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzN(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzgke r0 = com.google.android.gms.internal.ads.zzef.zzc
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = "Unsupported charset: %s"
            com.google.android.gms.internal.ads.zzghc.zzf(r0, r1, r5)
            int r0 = r4.zzd()
            if (r0 != 0) goto L13
            r5 = 0
            return r5
        L13:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L1e
            r4.zzR()
        L1e:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            r2 = 1
            if (r1 != 0) goto L58
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2e
            goto L58
        L2e:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            r2 = 2
            if (r0 != 0) goto L58
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L58
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L48
            goto L58
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Unsupported charset: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L58:
            int r0 = r4.zzf
        L5a:
            int r1 = r4.zzg
            int r3 = r2 + (-1)
            int r3 = r1 - r3
            if (r0 >= r3) goto Lb7
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L72
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L7c
        L72:
            byte[] r1 = r4.zze
            r1 = r1[r0]
            boolean r1 = com.google.android.gms.internal.ads.zzeo.zzk(r1)
            if (r1 != 0) goto Lb8
        L7c:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L8c
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L9c
        L8c:
            byte[] r1 = r4.zze
            r3 = r1[r0]
            if (r3 != 0) goto L9c
            int r3 = r0 + 1
            r1 = r1[r3]
            boolean r1 = com.google.android.gms.internal.ads.zzeo.zzk(r1)
            if (r1 != 0) goto Lb8
        L9c:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto Lb5
            int r1 = r0 + 1
            byte[] r3 = r4.zze
            r1 = r3[r1]
            if (r1 != 0) goto Lb5
            r1 = r3[r0]
            boolean r1 = com.google.android.gms.internal.ads.zzeo.zzk(r1)
            if (r1 == 0) goto Lb5
            goto Lb8
        Lb5:
            int r0 = r0 + r2
            goto L5a
        Lb7:
            r0 = r1
        Lb8:
            int r1 = r4.zzf
            int r0 = r0 - r1
            java.lang.String r0 = r4.zzK(r0, r5)
            int r1 = r4.zzf
            int r2 = r4.zzg
            if (r1 == r2) goto Ld4
            char[] r1 = com.google.android.gms.internal.ads.zzef.zza
            char r1 = r4.zzT(r5, r1)
            r2 = 13
            if (r1 != r2) goto Ld4
            char[] r1 = com.google.android.gms.internal.ads.zzef.zzb
            r4.zzT(r5, r1)
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzef.zzN(java.nio.charset.Charset):java.lang.String");
    }

    public final long zzO() {
        int i;
        zzW(1);
        long j = this.zze[this.zzf];
        int i2 = 7;
        while (true) {
            i = 0;
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r7 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException(au.com.woolworths.shop.checkout.ui.confirmation.c.m(j, "Invalid UTF-8 sequence first byte: ", new StringBuilder(String.valueOf(j).length() + 35)));
        }
        zzW(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.zze[this.zzf + i3] & 192) != 128) {
                throw new NumberFormatException(au.com.woolworths.shop.checkout.ui.confirmation.c.m(j, "Invalid UTF-8 sequence continuation byte: ", new StringBuilder(String.valueOf(j).length() + 42)));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.zzf += i;
        return j;
    }

    public final long zzP() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.zzf == this.zzg) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzs = zzs();
            j |= (127 & jZzs) << (i * 7);
            if ((jZzs & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public final void zzQ() {
        while ((zzs() & 128) != 0) {
        }
    }

    @Nullable
    public final Charset zzR() {
        if (zzd() >= 3) {
            byte[] bArr = this.zze;
            int i = this.zzf;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.zzf = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zzd() < 2) {
            return null;
        }
        byte[] bArr2 = this.zze;
        int i2 = this.zzf;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.zzf = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.zzf = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void zza(int i) {
        byte[] bArr = this.zze;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzb(bArr, i);
    }

    public final void zzb(byte[] bArr, int i) {
        this.zze = bArr;
        this.zzg = i;
        this.zzf = 0;
    }

    public final void zzc(int i) {
        byte[] bArr = this.zze;
        if (i > bArr.length) {
            this.zze = Arrays.copyOf(bArr, i);
        }
    }

    public final int zzd() {
        return Math.max(this.zzg - this.zzf, 0);
    }

    public final int zze() {
        return this.zzg;
    }

    public final void zzf(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zze.length) {
            z = true;
        }
        zzghc.zza(z);
        this.zzg = i;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final void zzh(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzg) {
            z = true;
        }
        zzghc.zza(z);
        this.zzf = i;
    }

    public final byte[] zzi() {
        return this.zze;
    }

    public final int zzj() {
        return this.zze.length;
    }

    public final void zzk(int i) {
        zzh(this.zzf + i);
    }

    public final void zzl(zzee zzeeVar, int i) {
        zzm(zzeeVar.zza, 0, i);
        zzeeVar.zzf(0);
    }

    public final void zzm(byte[] bArr, int i, int i2) {
        zzW(i2);
        System.arraycopy(this.zze, this.zzf, bArr, i, i2);
        this.zzf += i2;
    }

    public final int zzn() {
        zzW(1);
        return this.zze[this.zzf] & 255;
    }

    public final char zzo() {
        return zzS(ByteOrder.BIG_ENDIAN, 0);
    }

    public final int zzp(Charset charset) {
        if (zzU(charset) != 0) {
            return zzgne.zza(r3 >>> 8);
        }
        return 1114112;
    }

    public final int zzq() {
        if (zzd() >= 3) {
            this.zzf -= 3;
            return zzx();
        }
        int i = this.zzf;
        int i2 = this.zzg;
        throw new IndexOutOfBoundsException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i, i2, "position=", ", limit=", new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i2).length())));
    }

    public final int zzr() {
        if (zzd() >= 4) {
            this.zzf -= 4;
            return zzB();
        }
        int i = this.zzf;
        int i2 = this.zzg;
        throw new IndexOutOfBoundsException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i, i2, "position=", ", limit=", new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i2).length())));
    }

    public final int zzs() {
        zzW(1);
        byte[] bArr = this.zze;
        int i = this.zzf;
        this.zzf = i + 1;
        return bArr[i] & 255;
    }

    public final int zzt() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        int i3 = bArr[i] & 255;
        this.zzf = i + 2;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final int zzu() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        int i3 = bArr[i] & 255;
        this.zzf = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final short zzv() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        int i3 = bArr[i] & 255;
        this.zzf = i + 2;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    public final short zzw() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        int i3 = bArr[i] & 255;
        this.zzf = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final int zzx() {
        zzW(3);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.zzf = i4;
        int i5 = bArr[i2] & 255;
        this.zzf = i + 3;
        return (bArr[i4] & 255) | (i3 << 16) | (i5 << 8);
    }

    public final int zzy() {
        zzW(3);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.zzf = i4;
        int i5 = bArr[i2] & 255;
        this.zzf = i + 3;
        return (bArr[i4] & 255) | ((i3 << 24) >> 8) | (i5 << 8);
    }

    public final long zzz() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        this.zzf = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.zzf = i3;
        long j2 = bArr[i2];
        this.zzf = i + 3;
        long j3 = bArr[i3];
        this.zzf = i + 4;
        return (bArr[r3] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public zzef() {
        this.zze = zzeo.zzb;
    }

    public zzef(int i) {
        this.zze = new byte[i];
        this.zzg = i;
    }

    public zzef(byte[] bArr) {
        this.zze = bArr;
        this.zzg = bArr.length;
    }
}
