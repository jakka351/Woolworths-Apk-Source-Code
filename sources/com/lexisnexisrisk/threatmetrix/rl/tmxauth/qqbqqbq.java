package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class qqbqqbq {
    public static int i00690069iii0069 = 2;
    public static int i0069iiii0069 = 0;
    public static int ii0069iii0069 = 1;
    public static int iiiiii0069 = 31;
    private static final int n006E006E006En006E006E = 2;
    private static final int n006E006En006E006E006E = 12;
    private static final int n006En006E006E006E006E = 49;
    private static final int n006Enn006E006E006E = 4;
    private static final int nn006E006E006E006E006E = 128;
    private static final int nn006En006E006E006E = 5;
    private static final int nnn006E006E006E006E = 48;
    private static final int nnnn006E006E006E = 3;
    public static final byte[] w007700770077www;
    public static final byte[] w0077w0077www;
    public static final byte[] w0077ww0077ww;
    public static final byte[] ww00770077www;
    public static final byte[] ww0077w0077ww;
    public static final byte[] www0077www;
    public static final byte[] wwww0077ww;
    public static final byte[] w0077wwwww = {6, 8, 42, -122, 72, -50, 61, 4, 3, 2};
    public static final byte[] ww0077wwww = {6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 11};
    public static final byte[] w00770077wwww = {6, 3, 85, 4, 3};

    static {
        if (((i0069ii0069i0069() + iiiiii0069) * iiiiii0069) % i00690069iii0069 != i0069iiii0069) {
            iiiiii0069 = 13;
            i0069iiii0069 = iii0069ii0069();
        }
        int i = iiiiii0069;
        if (((i0069ii0069i0069() + i) * i) % i00690069iii0069 != 0) {
            iiiiii0069 = iii0069ii0069();
            i0069iiii0069 = iii0069ii0069();
        }
        www0077www = new byte[]{6, 9, 42, -122, 72, -122, -9, 13, 1, 9, 4};
        w0077w0077www = new byte[]{6, 10, 42, -122, 72, -122, -9, 13, 1, 9, 25, 3};
        ww00770077www = new byte[]{6, 9, 42, -122, 72, -122, -9, 13, 1, 9, 3};
        w007700770077www = new byte[]{6, 9, 42, -122, 72, -122, -9, 13, 1, 9, 21};
        wwww0077ww = new byte[]{6, 9, 42, -122, 72, -122, -9, 13, 1, 7, 1};
        w0077ww0077ww = new byte[]{6, 9, 42, -122, 72, -122, -9, 13, 1, 7, 2};
        ww0077w0077ww = new byte[]{6, 9, 96, -122, 72, 1, 101, 3, 4, 2, 1};
    }

    private qqbqqbq() {
    }

    private static int b0062006200620062bb(String str, @Nullable byte[] bArr, int i) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i2 = iiiiii0069;
        if (((ii0069iii0069 + i2) * i2) % i00690069iii0069 != i0069iiii0069) {
            iiiiii0069 = iii0069ii0069();
            i0069iiii0069 = 2;
        }
        return bbbb0062bb(12, bytes, bArr, i);
    }

    @Nonnull
    public static byte[] b00620062b0062bb(@Nullable Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) ((byte[]) obj).clone();
        }
        int iBbb00620062bb = bbb00620062bb(obj, null, -1);
        int iIii0069ii0069 = iii0069ii0069();
        if (((ii0069iii0069 + iIii0069ii0069) * iIii0069ii0069) % i00690069i0069i0069() != 0) {
            iiiiii0069 = 82;
            i0069iiii0069 = iii0069ii0069();
        }
        byte[] bArr = new byte[iBbb00620062bb];
        bbb00620062bb(obj, bArr, 0);
        return bArr;
    }

    @Nullable
    public static byte[] b00620062bb0062b(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[bb0062bb0062b(length, null, -1) + 1 + length];
        bArr2[0] = 4;
        int iBb0062bb0062b = 1 + bb0062bb0062b(length, bArr2, 1);
        if (((i0069ii0069i0069() + iiiiii0069) * iiiiii0069) % i00690069iii0069 != i0069iiii0069) {
            iiiiii0069 = 57;
            i0069iiii0069 = 74;
        }
        System.arraycopy(bArr, 0, bArr2, iBb0062bb0062b, bArr.length);
        return bArr2;
    }

    private static int b0062b00620062bb(List list, @Nullable byte[] bArr, int i) {
        int i2;
        if (bArr != null) {
            bArr[i] = 48;
            i2 = i + 2;
        } else {
            i2 = i;
        }
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int iBbb00620062bb = bbb00620062bb(it.next(), bArr, i2);
            i3 += iBbb00620062bb;
            if (bArr != null) {
                i2 += iBbb00620062bb;
            }
        }
        int iBb0062bb0062b = bb0062bb0062b(i3, null, -1);
        int i4 = iBb0062bb0062b + 1 + i3;
        if (bArr != null) {
            if (iBb0062bb0062b > 1) {
                if ((iii0069ii0069() * (iii0069ii0069() + ii0069iii0069)) % i00690069iii0069 != i0069iiii0069) {
                    iiiiii0069 = iii0069ii0069();
                    i0069iiii0069 = iii0069ii0069();
                }
                System.arraycopy(bArr, i + 2, bArr, iBb0062bb0062b + i + 1, i3);
            }
            bb0062bb0062b(i3, bArr, i + 1);
        }
        return i4;
    }

    @Nonnull
    public static byte[] b0062bb0062bb(@Nullable Object obj, byte b, byte b2) {
        byte[] bArr = new byte[bbb00620062bb(obj, null, -1)];
        bbb00620062bb(obj, bArr, 0);
        int i = (b << 6) | 32;
        int i2 = iiiiii0069;
        if (((i0069ii0069i0069() + i2) * i2) % i00690069iii0069 != 0) {
            iiiiii0069 = iii0069ii0069();
            i0069iiii0069 = 99;
        }
        bArr[0] = (byte) (i | b2);
        return bArr;
    }

    private static int b0062bbb0062b(byte[] bArr, @Nullable byte[] bArr2, int i) {
        if (bArr2 != null) {
            System.arraycopy(bArr, 0, bArr2, i, bArr.length);
        }
        int i2 = iiiiii0069;
        if (((ii0069iii0069 + i2) * i2) % i00690069iii0069 != 0) {
            iiiiii0069 = 98;
            i0069iiii0069 = 36;
        }
        return bArr.length;
    }

    private static int bb006200620062bb(Set set, @Nullable byte[] bArr, int i) {
        if (((i0069ii0069i0069() + iiiiii0069) * iiiiii0069) % i00690069iii0069 != ii0069i0069i0069()) {
            iiiiii0069 = iii0069ii0069();
            i0069iiii0069 = iii0069ii0069();
        }
        int iBbb00620062bb = 0;
        if (bArr == null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                iBbb00620062bb += bbb00620062bb(it.next(), null, -1);
            }
            return bb0062bb0062b(iBbb00620062bb, null, -1) + 1 + iBbb00620062bb;
        }
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it2 = set.iterator();
        int length = 0;
        while (it2.hasNext()) {
            byte[] bArrB00620062b0062bb = b00620062b0062bb(it2.next());
            arrayList.add(bArrB00620062b0062bb);
            length += bArrB00620062b0062bb.length;
        }
        int iBb0062bb0062b = bb0062bb0062b(length, null, -1);
        int i2 = iBb0062bb0062b + 1 + length;
        if (bArr.length >= i2) {
            Collections.sort(arrayList, new Comparator<byte[]>() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbqqbq.1
                public static int i00690069ii00690069 = 2;
                public static int iiiii00690069 = 3;

                public static int i0069iii00690069() {
                    return 0;
                }

                public static int ii0069ii00690069() {
                    return 1;
                }

                public static int iii0069i00690069() {
                    return 6;
                }

                @Override // java.util.Comparator
                public int compare(byte[] bArr2, byte[] bArr3) {
                    int length2;
                    int i3;
                    int i4 = 0;
                    if (bArr2.length > bArr3.length) {
                        length2 = bArr3.length;
                        i3 = 1;
                    } else if (bArr2.length < bArr3.length) {
                        length2 = bArr2.length;
                        i3 = -1;
                    } else {
                        length2 = bArr2.length;
                        i3 = 0;
                    }
                    int i5 = 5;
                    while (i4 < length2) {
                        byte b = bArr2[i4];
                        byte b2 = bArr3[i4];
                        if (b < b2) {
                            return -1;
                        }
                        if (b > b2) {
                            return 1;
                        }
                        i4++;
                        try {
                            throw null;
                        } catch (Exception unused) {
                            while (true) {
                                try {
                                    i5 /= 0;
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                    return i3;
                }
            });
            int i3 = i + 1;
            bArr[i] = 49;
            bb0062bb0062b(length, bArr, i3);
            int length2 = i3 + iBb0062bb0062b;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                byte[] bArr2 = (byte[]) it3.next();
                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                length2 += bArr2.length;
            }
        }
        return i2;
    }

    private static int bb0062b0062bb(BigInteger bigInteger, @Nullable byte[] bArr, int i) {
        int iBbbb0062bb = bbbb0062bb(2, bigInteger.toByteArray(), bArr, i);
        int i2 = iiiiii0069;
        if (((ii0069iii0069 + i2) * i2) % i00690069iii0069 != i0069iiii0069) {
            iiiiii0069 = 68;
            i0069iiii0069 = iii0069ii0069();
        }
        return iBbbb0062bb;
    }

    private static int bb0062bb0062b(int i, @Nullable byte[] bArr, int i2) {
        if (i <= 128) {
            if (bArr != null && i2 > 0) {
                bArr[i2] = (byte) i;
            }
            return 1;
        }
        int i3 = 0;
        while ((i >> (i3 * 8)) != 0) {
            i3++;
        }
        if (bArr != null) {
            int i4 = i2 + 1;
            bArr[i2] = (byte) (i3 | 128);
            int i5 = i3 - 1;
            while (i5 >= 0) {
                int i6 = i4 + 1;
                bArr[i4] = (byte) ((i >> (i5 * 8)) & 255);
                i5--;
                int i7 = iiiiii0069;
                if (((ii0069iii0069 + i7) * i7) % i00690069iii0069 != i0069iiii0069) {
                    iiiiii0069 = iii0069ii0069();
                    i0069iiii0069 = iii0069ii0069();
                }
                i4 = i6;
            }
        }
        return i3 + 1;
    }

    private static int bbb00620062bb(@Nullable Object obj, @Nullable byte[] bArr, int i) {
        if (obj == null) {
            if (bArr == null) {
                return 2;
            }
            bArr[i] = 5;
            bArr[i + 1] = 0;
            return 2;
        }
        if (obj instanceof List) {
            return b0062b00620062bb((List) obj, bArr, i);
        }
        if (obj instanceof Set) {
            return bb006200620062bb((Set) obj, bArr, i);
        }
        if (obj instanceof String) {
            return b0062006200620062bb(String.valueOf(obj), bArr, i);
        }
        if (obj instanceof Integer) {
            return bb0062b0062bb(BigInteger.valueOf(((Integer) obj).intValue()), bArr, i);
        }
        if (!(obj instanceof BigInteger)) {
            if (obj instanceof byte[]) {
                return b0062bbb0062b((byte[]) obj, bArr, i);
            }
            return 0;
        }
        int i2 = iiiiii0069;
        if (((ii0069iii0069 + i2) * i2) % i00690069iii0069 != 0) {
            iiiiii0069 = 44;
            i0069iiii0069 = 52;
        }
        return bb0062b0062bb((BigInteger) obj, bArr, i);
    }

    private static int bbbb0062bb(int i, @Nullable byte[] bArr, byte[] bArr2, int i2) {
        if (bArr == null) {
            return 0;
        }
        int iBb0062bb0062b = bb0062bb0062b(bArr.length, null, -1) + 1 + bArr.length;
        if (bArr2 != null && bArr2.length >= iBb0062bb0062b) {
            int i3 = i2 + 1;
            int i4 = iiiiii0069;
            if (((ii0069iii0069 + i4) * i4) % i00690069iii0069 != i0069iiii0069) {
                iiiiii0069 = iii0069ii0069();
                i0069iiii0069 = iii0069ii0069();
            }
            bArr2[i2] = (byte) i;
            System.arraycopy(bArr, 0, bArr2, i3 + bb0062bb0062b(bArr.length, bArr2, i3), bArr.length);
        }
        return iBb0062bb0062b;
    }

    @Nullable
    public static byte[] bbbbb0062b(@Nullable byte[] bArr) {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                iiiiii0069 = 21;
                try {
                    throw null;
                } catch (Exception unused2) {
                    iiiiii0069 = iii0069ii0069();
                    try {
                        throw null;
                    } catch (Exception unused3) {
                        iiiiii0069 = 12;
                        if (bArr == null) {
                            return null;
                        }
                        int length = bArr.length + 1;
                        byte[] bArr2 = new byte[bb0062bb0062b(length, null, -1) + 1 + length];
                        bArr2[0] = 3;
                        int iBb0062bb0062b = bb0062bb0062b(length, bArr2, 1);
                        bArr2[1 + iBb0062bb0062b] = 0;
                        System.arraycopy(bArr, 0, bArr2, iBb0062bb0062b + 2, bArr.length);
                        return bArr2;
                    }
                }
            }
        }
    }

    public static int i00690069i0069i0069() {
        return 2;
    }

    public static int i0069ii0069i0069() {
        return 1;
    }

    public static int ii0069i0069i0069() {
        return 0;
    }

    public static int iii0069ii0069() {
        return 98;
    }
}
