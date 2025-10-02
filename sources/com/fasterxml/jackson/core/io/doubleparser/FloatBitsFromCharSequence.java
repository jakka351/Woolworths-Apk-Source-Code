package com.fasterxml.jackson.core.io.doubleparser;

/* loaded from: classes4.dex */
class FloatBitsFromCharSequence extends AbstractFloatingPointBitsFromCharSequence {
    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public final long b() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public final long c() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public final long e() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(java.lang.CharSequence r4, int r5, boolean r6, long r7, int r9, boolean r10, int r11) throws java.lang.NumberFormatException {
        /*
            r3 = this;
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            if (r6 == 0) goto Lb
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L3a
        Lb:
            r6 = 0
            goto L3a
        Ld:
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1 = 38
            r2 = -45
            if (r10 == 0) goto L32
            if (r2 > r11) goto L30
            if (r11 > r1) goto L30
            float r9 = com.fasterxml.jackson.core.io.doubleparser.FastFloatMath.a(r7, r11, r6)
            r1 = 1
            long r7 = r7 + r1
            float r6 = com.fasterxml.jackson.core.io.doubleparser.FastFloatMath.a(r7, r11, r6)
            boolean r7 = java.lang.Float.isNaN(r9)
            if (r7 != 0) goto L30
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L30
            r6 = r9
            goto L3a
        L30:
            r6 = r0
            goto L3a
        L32:
            if (r2 > r9) goto L30
            if (r9 > r1) goto L30
            float r6 = com.fasterxml.jackson.core.io.doubleparser.FastFloatMath.a(r7, r9, r6)
        L3a:
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 == 0) goto L4d
            r6 = 0
            java.lang.CharSequence r4 = r4.subSequence(r6, r5)
            java.lang.String r4 = r4.toString()
            float r6 = java.lang.Float.parseFloat(r4)
        L4d:
            int r4 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.doubleparser.FloatBitsFromCharSequence.g(java.lang.CharSequence, int, boolean, long, int, boolean, int):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(java.lang.CharSequence r4, int r5, boolean r6, long r7, int r9, boolean r10, int r11) throws java.lang.NumberFormatException {
        /*
            r3 = this;
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            if (r6 == 0) goto Lb
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L3b
        Lb:
            r6 = 0
            goto L3b
        Ld:
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1 = 127(0x7f, float:1.78E-43)
            r2 = -126(0xffffffffffffff82, float:NaN)
            if (r10 == 0) goto L33
            if (r2 > r11) goto L31
            if (r11 > r1) goto L31
            float r9 = com.fasterxml.jackson.core.io.doubleparser.FastFloatMath.b(r7, r11, r6)
            r1 = 1
            long r7 = r7 + r1
            float r6 = com.fasterxml.jackson.core.io.doubleparser.FastFloatMath.b(r7, r11, r6)
            double r7 = (double) r9
            boolean r7 = java.lang.Double.isNaN(r7)
            if (r7 != 0) goto L31
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L31
            r6 = r9
            goto L3b
        L31:
            r6 = r0
            goto L3b
        L33:
            if (r2 > r9) goto L31
            if (r9 > r1) goto L31
            float r6 = com.fasterxml.jackson.core.io.doubleparser.FastFloatMath.b(r7, r9, r6)
        L3b:
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 == 0) goto L4e
            r6 = 0
            java.lang.CharSequence r4 = r4.subSequence(r6, r5)
            java.lang.String r4 = r4.toString()
            float r6 = java.lang.Float.parseFloat(r4)
        L4e:
            int r4 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.doubleparser.FloatBitsFromCharSequence.h(java.lang.CharSequence, int, boolean, long, int, boolean, int):long");
    }
}
