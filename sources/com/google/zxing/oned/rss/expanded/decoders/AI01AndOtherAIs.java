package com.google.zxing.oned.rss.expanded.decoders;

import YU.a;

/* loaded from: classes6.dex */
final class AI01AndOtherAIs extends AI01decoder {
    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public final String b() {
        StringBuilder sbS = a.s("(01)");
        int length = sbS.length();
        GeneralAppIdDecoder generalAppIdDecoder = this.b;
        sbS.append(GeneralAppIdDecoder.c(4, 4, generalAppIdDecoder.f16195a));
        d(sbS, 8, length);
        return generalAppIdDecoder.a(48, sbS);
    }
}
