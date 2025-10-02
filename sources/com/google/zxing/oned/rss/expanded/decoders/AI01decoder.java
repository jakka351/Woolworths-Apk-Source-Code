package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes6.dex */
abstract class AI01decoder extends AbstractExpandedDecoder {
    public final void c(int i, StringBuilder sb) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        d(sb, i, length);
    }

    public final void d(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int iC = GeneralAppIdDecoder.c((i3 * 10) + i, 10, this.b.f16195a);
            if (iC / 100 == 0) {
                sb.append('0');
            }
            if (iC / 10 == 0) {
                sb.append('0');
            }
            sb.append(iC);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 13; i5++) {
            int iCharAt = sb.charAt(i5 + i2) - '0';
            if ((i5 & 1) == 0) {
                iCharAt *= 3;
            }
            i4 += iCharAt;
        }
        int i6 = 10 - (i4 % 10);
        sb.append(i6 != 10 ? i6 : 0);
    }
}
