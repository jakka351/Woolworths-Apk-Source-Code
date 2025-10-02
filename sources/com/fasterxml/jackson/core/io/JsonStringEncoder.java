package com.fasterxml.jackson.core.io;

/* loaded from: classes4.dex */
public final class JsonStringEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f14198a = CharTypes.c(true);
    public static final byte[] b = CharTypes.b(true);
    public static final JsonStringEncoder c = new JsonStringEncoder();

    public static int a(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return (i2 - 56320) + ((i - 55296) << 10) + 65536;
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    public static void b(int i) {
        throw new IllegalArgumentException(UTF8Writer.c(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
    
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        return java.util.Arrays.copyOfRange(r2, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0114, code lost:
    
        r7.h = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011a, code lost:
    
        return r7.e();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] c(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.c(java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r7 = new char[]{'\\', 0, '0', '0', 0, 0};
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r11 = r8 + 1;
        r8 = r14.charAt(r8);
        r12 = r3[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r12 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        r7[1] = 'u';
        r12 = com.fasterxml.jackson.core.io.JsonStringEncoder.f14198a;
        r7[4] = r12[r8 >> 4];
        r7[5] = r12[r8 & 15];
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        r7[1] = (char) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        r8 = r9 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r8 <= r1.length) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r8 = r1.length - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r8 <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        java.lang.System.arraycopy(r7, 0, r1, r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r6 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        r6 = new com.fasterxml.jackson.core.util.TextBuffer(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        r1 = r6.k();
        r10 = r10 - r8;
        java.lang.System.arraycopy(r7, r8, r1, 0, r10);
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        java.lang.System.arraycopy(r7, 0, r1, r9, r10);
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r7 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static char[] d(java.lang.String r14) {
        /*
            int r0 = r14.length()
            int r1 = r0 >> 3
            r2 = 6
            int r1 = r1 + r2
            r3 = 1000(0x3e8, float:1.401E-42)
            int r1 = java.lang.Math.min(r1, r3)
            int r1 = r1 + r0
            r3 = 16
            int r1 = java.lang.Math.max(r3, r1)
            r3 = 32000(0x7d00, float:4.4842E-41)
            int r1 = java.lang.Math.min(r1, r3)
            char[] r1 = new char[r1]
            int[] r3 = com.fasterxml.jackson.core.io.CharTypes.j
            int r4 = r3.length
            r5 = 0
            r6 = 0
            r8 = r5
            r9 = r8
            r7 = r6
        L25:
            if (r8 >= r0) goto La3
        L27:
            char r10 = r14.charAt(r8)
            if (r10 >= r4) goto L88
            r11 = r3[r10]
            if (r11 == 0) goto L88
            r10 = 2
            if (r7 != 0) goto L41
            char[] r7 = new char[r2]
            r11 = 92
            r7[r5] = r11
            r11 = 48
            r7[r10] = r11
            r12 = 3
            r7[r12] = r11
        L41:
            int r11 = r8 + 1
            char r8 = r14.charAt(r8)
            r12 = r3[r8]
            r13 = 1
            if (r12 >= 0) goto L62
            r10 = 117(0x75, float:1.64E-43)
            r7[r13] = r10
            int r10 = r8 >> 4
            char[] r12 = com.fasterxml.jackson.core.io.JsonStringEncoder.f14198a
            char r10 = r12[r10]
            r13 = 4
            r7[r13] = r10
            r8 = r8 & 15
            char r8 = r12[r8]
            r10 = 5
            r7[r10] = r8
            r10 = r2
            goto L65
        L62:
            char r8 = (char) r12
            r7[r13] = r8
        L65:
            int r8 = r9 + r10
            int r12 = r1.length
            if (r8 <= r12) goto L82
            int r8 = r1.length
            int r8 = r8 - r9
            if (r8 <= 0) goto L71
            java.lang.System.arraycopy(r7, r5, r1, r9, r8)
        L71:
            if (r6 != 0) goto L78
            com.fasterxml.jackson.core.util.TextBuffer r6 = new com.fasterxml.jackson.core.util.TextBuffer
            r6.<init>(r1)
        L78:
            char[] r1 = r6.k()
            int r10 = r10 - r8
            java.lang.System.arraycopy(r7, r8, r1, r5, r10)
            r9 = r10
            goto L86
        L82:
            java.lang.System.arraycopy(r7, r5, r1, r9, r10)
            r9 = r8
        L86:
            r8 = r11
            goto L25
        L88:
            int r11 = r1.length
            if (r9 < r11) goto L97
            if (r6 != 0) goto L92
            com.fasterxml.jackson.core.util.TextBuffer r6 = new com.fasterxml.jackson.core.util.TextBuffer
            r6.<init>(r1)
        L92:
            char[] r1 = r6.k()
            r9 = r5
        L97:
            int r11 = r9 + 1
            r1[r9] = r10
            int r8 = r8 + 1
            if (r8 < r0) goto La1
            r9 = r11
            goto La3
        La1:
            r9 = r11
            goto L27
        La3:
            if (r6 != 0) goto Laa
            char[] r14 = java.util.Arrays.copyOfRange(r1, r5, r9)
            return r14
        Laa:
            r6.i = r9
            char[] r14 = r6.e()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.d(java.lang.String):char[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x015c, code lost:
    
        if (r6 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0162, code lost:
    
        return java.util.Arrays.copyOfRange(r1, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        r6.h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0169, code lost:
    
        return r6.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] e(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.e(java.lang.String):byte[]");
    }
}
