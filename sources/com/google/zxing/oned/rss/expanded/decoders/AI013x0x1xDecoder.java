package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
final class AI013x0x1xDecoder extends AI01weightDecoder {
    public final String c;
    public final String d;

    public AI013x0x1xDecoder(BitArray bitArray, String str, String str2) {
        super(bitArray);
        this.c = str2;
        this.d = str;
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public final String b() throws NotFoundException {
        if (this.f16190a.e != 84) {
            throw NotFoundException.f;
        }
        StringBuilder sb = new StringBuilder();
        c(8, sb);
        g(sb, 48, 20);
        int iC = GeneralAppIdDecoder.c(68, 16, this.b.f16195a);
        if (iC != 38400) {
            sb.append('(');
            sb.append(this.c);
            sb.append(')');
            int i = iC % 32;
            int i2 = iC / 32;
            int i3 = (i2 % 12) + 1;
            int i4 = i2 / 12;
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i3 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i3);
            if (i / 10 == 0) {
                sb.append('0');
            }
            sb.append(i);
        }
        return sb.toString();
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public final void e(int i, StringBuilder sb) {
        sb.append('(');
        sb.append(this.d);
        sb.append(i / 100000);
        sb.append(')');
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public final int f(int i) {
        return i % 100000;
    }
}
