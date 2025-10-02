package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;

/* loaded from: classes6.dex */
final class AI01392xDecoder extends AI01decoder {
    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public final String b() throws NotFoundException {
        if (this.f16190a.e < 48) {
            throw NotFoundException.f;
        }
        StringBuilder sb = new StringBuilder();
        c(8, sb);
        GeneralAppIdDecoder generalAppIdDecoder = this.b;
        int iC = GeneralAppIdDecoder.c(48, 2, generalAppIdDecoder.f16195a);
        sb.append("(392");
        sb.append(iC);
        sb.append(')');
        sb.append(generalAppIdDecoder.b(50, null).b);
        return sb.toString();
    }
}
