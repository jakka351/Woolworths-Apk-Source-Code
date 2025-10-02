package androidx.media3.common.util;

import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CheckReturnValue;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

@CheckReturnValue
@UnstableApi
/* loaded from: classes2.dex */
public final class ParsableByteArray {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final ImmutableSet f = ImmutableSet.o(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2922a;
    public int b;
    public int c;

    public ParsableByteArray() {
        this.f2922a = Util.c;
    }

    public final int A() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final long B() {
        int i;
        int i2;
        long j = this.f2922a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException(androidx.camera.core.impl.b.k(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            if ((this.f2922a[this.b + i] & 192) != 128) {
                throw new NumberFormatException(androidx.camera.core.impl.b.k(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i2;
        return j;
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.f2922a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f2922a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void D(int i) {
        byte[] bArr = this.f2922a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        E(i, bArr);
    }

    public final void E(int i, byte[] bArr) {
        this.f2922a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void F(int i) {
        Assertions.b(i >= 0 && i <= this.f2922a.length);
        this.c = i;
    }

    public final void G(int i) {
        Assertions.b(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void H(int i) {
        G(this.b + i);
    }

    public final int a() {
        return this.c - this.b;
    }

    public final void b(int i) {
        byte[] bArr = this.f2922a;
        if (i > bArr.length) {
            this.f2922a = Arrays.copyOf(bArr, i);
        }
    }

    public final char c(Charset charset) {
        Assertions.a("Unsupported charset: " + charset, f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b;
        byte b2;
        byte b3 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            b = this.f2922a[this.b];
            b2 = 0;
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f2922a;
                int i = this.b;
                b2 = bArr[i];
                b = bArr[i + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f2922a;
                int i2 = this.b;
                b2 = bArr2[i2 + 1];
                b = bArr2[i2];
            }
            b3 = 2;
        }
        return Ints.d(b2, b, (byte) 0, b3);
    }

    public final void e(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f2922a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD != 0) {
            char c = (char) (iD >> 16);
            for (char c2 : cArr) {
                if (c2 == c) {
                    this.b += iD & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
                    return c;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(java.nio.charset.Charset r7) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.ParsableByteArray.h(java.nio.charset.Charset):java.lang.String");
    }

    public final int i() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final long j() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public final short k() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final long l() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public final int m() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(YU.a.d(i, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long o() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.b = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.b = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.f2922a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f2922a;
        int i2 = this.b;
        int i3 = Util.f2928a;
        String str = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public final String q(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.f2922a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f2922a;
        int i5 = Util.f2928a;
        String str = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.b += i;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final String s(int i, Charset charset) {
        String str = new String(this.f2922a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int v() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.b = i + 4;
        return i4;
    }

    public final long w() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    public final int x() {
        byte[] bArr = this.f2922a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public final int y() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(YU.a.d(iG, "Top bit not zero: "));
    }

    public final long z() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        throw new IllegalStateException(androidx.camera.core.impl.b.k(jO, "Top bit not zero: "));
    }

    public ParsableByteArray(int i) {
        this.f2922a = new byte[i];
        this.c = i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.f2922a = bArr;
        this.c = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.f2922a = bArr;
        this.c = i;
    }
}
