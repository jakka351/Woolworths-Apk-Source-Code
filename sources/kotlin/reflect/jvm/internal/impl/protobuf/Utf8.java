package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes7.dex */
final class Utf8 {
    public static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int b(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return a(b, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    public static boolean c(int i, int i2, byte[] bArr) {
        return d(i, i2, bArr) == 0;
    }

    public static int d(int i, int i2, byte[] bArr) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return b(i3, i2, bArr);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return b(i3, i2, bArr);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r8[r7] > (-65)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r8[r7] > (-65)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008f, code lost:
    
        if (r8[r6] > (-65)) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(int r6, int r7, byte[] r8, int r9) {
        /*
            if (r6 == 0) goto L92
            if (r7 < r9) goto L5
            return r6
        L5:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1c
            r6 = -62
            if (r0 < r6) goto L91
            int r6 = r7 + 1
            r7 = r8[r7]
            if (r7 <= r3) goto L19
            goto L91
        L19:
            r7 = r6
            goto L92
        L1c:
            r4 = -16
            if (r0 >= r4) goto L49
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L34
            int r6 = r7 + 1
            r7 = r8[r7]
            if (r6 < r9) goto L31
            int r6 = a(r0, r7)
            return r6
        L31:
            r5 = r7
            r7 = r6
            r6 = r5
        L34:
            if (r6 > r3) goto L91
            r4 = -96
            if (r0 != r1) goto L3c
            if (r6 < r4) goto L91
        L3c:
            r1 = -19
            if (r0 != r1) goto L42
            if (r6 >= r4) goto L91
        L42:
            int r6 = r7 + 1
            r7 = r8[r7]
            if (r7 <= r3) goto L19
            goto L91
        L49:
            int r1 = r6 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5c
            int r6 = r7 + 1
            r1 = r8[r7]
            if (r6 < r9) goto L5a
            int r6 = a(r0, r1)
            return r6
        L5a:
            r7 = 0
            goto L62
        L5c:
            int r6 = r6 >> 16
            byte r6 = (byte) r6
            r5 = r7
            r7 = r6
            r6 = r5
        L62:
            if (r7 != 0) goto L7e
            int r7 = r6 + 1
            r6 = r8[r6]
            if (r7 < r9) goto L7b
            r7 = -12
            if (r0 > r7) goto L7a
            if (r1 > r3) goto L7a
            if (r6 <= r3) goto L73
            goto L7a
        L73:
            int r7 = r1 << 8
            r7 = r7 ^ r0
            int r6 = r6 << 16
            r6 = r6 ^ r7
            return r6
        L7a:
            return r2
        L7b:
            r5 = r7
            r7 = r6
            r6 = r5
        L7e:
            if (r1 > r3) goto L91
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L91
            if (r7 > r3) goto L91
            int r7 = r6 + 1
            r6 = r8[r6]
            if (r6 <= r3) goto L92
        L91:
            return r2
        L92:
            int r6 = d(r7, r9, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.Utf8.e(int, int, byte[], int):int");
    }
}
