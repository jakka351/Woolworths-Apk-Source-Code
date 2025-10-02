package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes6.dex */
abstract class AI01weightDecoder extends AI01decoder {
    public abstract void e(int i, StringBuilder sb);

    public abstract int f(int i);

    public final void g(StringBuilder sb, int i, int i2) {
        int iC = GeneralAppIdDecoder.c(i, i2, this.b.f16195a);
        e(iC, sb);
        int iF = f(iC);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (iF / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(iF);
    }
}
