package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;

/* loaded from: classes6.dex */
abstract class AI013x0xDecoder extends AI01weightDecoder {
    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public final String b() throws NotFoundException {
        if (this.f16190a.e != 60) {
            throw NotFoundException.f;
        }
        StringBuilder sb = new StringBuilder();
        c(5, sb);
        g(sb, 45, 15);
        return sb.toString();
    }
}
