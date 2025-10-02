package com.google.zxing.oned.rss.expanded.decoders;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* loaded from: classes6.dex */
final class AI01320xDecoder extends AI013x0xDecoder {
    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public final void e(int i, StringBuilder sb) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public final int f(int i) {
        return i < 10000 ? i : i - ModuleDescriptor.MODULE_VERSION;
    }
}
