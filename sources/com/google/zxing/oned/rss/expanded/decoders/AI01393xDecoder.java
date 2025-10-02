package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;

/* loaded from: classes6.dex */
final class AI01393xDecoder extends AI01decoder {
    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public final String b() throws NotFoundException {
        if (this.f16190a.e < 48) {
            throw NotFoundException.f;
        }
        StringBuilder sb = new StringBuilder();
        c(8, sb);
        GeneralAppIdDecoder generalAppIdDecoder = this.b;
        int iC = GeneralAppIdDecoder.c(48, 2, generalAppIdDecoder.f16195a);
        sb.append("(393");
        sb.append(iC);
        sb.append(')');
        int iC2 = GeneralAppIdDecoder.c(50, 10, generalAppIdDecoder.f16195a);
        if (iC2 / 100 == 0) {
            sb.append('0');
        }
        if (iC2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(iC2);
        sb.append(generalAppIdDecoder.b(60, null).b);
        return sb.toString();
    }
}
