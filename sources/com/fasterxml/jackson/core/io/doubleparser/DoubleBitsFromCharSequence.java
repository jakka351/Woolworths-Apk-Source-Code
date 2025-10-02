package com.fasterxml.jackson.core.io.doubleparser;

/* loaded from: classes4.dex */
final class DoubleBitsFromCharSequence extends AbstractFloatingPointBitsFromCharSequence {
    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public final long b() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public final long c() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public final long e() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(java.lang.CharSequence r5, int r6, boolean r7, long r8, int r10, boolean r11, int r12) throws java.lang.NumberFormatException {
        /*
            r4 = this;
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto Le
            if (r7 == 0) goto Lb
            r7 = -9223372036854775808
            goto L3b
        Lb:
            r7 = 0
            goto L3b
        Le:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r2 = 308(0x134, float:4.32E-43)
            r3 = -325(0xfffffffffffffebb, float:NaN)
            if (r11 == 0) goto L33
            if (r3 > r12) goto L31
            if (r12 > r2) goto L31
            double r10 = com.fasterxml.jackson.core.io.doubleparser.FastDoubleMath.b(r8, r12, r7)
            r2 = 1
            long r8 = r8 + r2
            double r7 = com.fasterxml.jackson.core.io.doubleparser.FastDoubleMath.b(r8, r12, r7)
            boolean r9 = java.lang.Double.isNaN(r10)
            if (r9 != 0) goto L31
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L31
            r7 = r10
            goto L3b
        L31:
            r7 = r0
            goto L3b
        L33:
            if (r3 > r10) goto L31
            if (r10 > r2) goto L31
            double r7 = com.fasterxml.jackson.core.io.doubleparser.FastDoubleMath.b(r8, r10, r7)
        L3b:
            boolean r9 = java.lang.Double.isNaN(r7)
            if (r9 == 0) goto L4e
            r7 = 0
            java.lang.CharSequence r5 = r5.subSequence(r7, r6)
            java.lang.String r5 = r5.toString()
            double r7 = java.lang.Double.parseDouble(r5)
        L4e:
            long r5 = java.lang.Double.doubleToRawLongBits(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.doubleparser.DoubleBitsFromCharSequence.g(java.lang.CharSequence, int, boolean, long, int, boolean, int):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(java.lang.CharSequence r14, int r15, boolean r16, long r17, int r19, boolean r20, int r21) throws java.lang.NumberFormatException {
        /*
            r13 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            long r3 = (long) r3
            r5 = r21
            long r5 = (long) r5
            r7 = 0
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 != 0) goto L18
            if (r0 == 0) goto L15
            r0 = -9223372036854775808
            goto L4f
        L15:
            r0 = 0
            goto L4f
        L18:
            r7 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r9 = 1023(0x3ff, double:5.054E-321)
            r11 = -1022(0xfffffffffffffc02, double:NaN)
            if (r20 == 0) goto L42
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 > 0) goto L40
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 > 0) goto L40
            int r3 = (int) r5
            double r4 = com.fasterxml.jackson.core.io.doubleparser.FastDoubleMath.c(r1, r3, r0)
            r9 = 1
            long r1 = r1 + r9
            double r0 = com.fasterxml.jackson.core.io.doubleparser.FastDoubleMath.c(r1, r3, r0)
            boolean r2 = java.lang.Double.isNaN(r4)
            if (r2 != 0) goto L40
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L40
            r0 = r4
            goto L4f
        L40:
            r0 = r7
            goto L4f
        L42:
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 > 0) goto L40
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L40
            int r3 = (int) r3
            double r0 = com.fasterxml.jackson.core.io.doubleparser.FastDoubleMath.c(r1, r3, r0)
        L4f:
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 == 0) goto L62
            r0 = 0
            java.lang.CharSequence r14 = r14.subSequence(r0, r15)
            java.lang.String r14 = r14.toString()
            double r0 = java.lang.Double.parseDouble(r14)
        L62:
            long r14 = java.lang.Double.doubleToRawLongBits(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.doubleparser.DoubleBitsFromCharSequence.h(java.lang.CharSequence, int, boolean, long, int, boolean, int):long");
    }
}
