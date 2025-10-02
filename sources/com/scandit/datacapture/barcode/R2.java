package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class R2 {
    private R2() {
    }

    public static S2 a(BarcodePickViewHighlightStyle.Dot style) {
        Intrinsics.h(style, "style");
        return new T2(new J2(style), new K2(style));
    }

    public static S2 a(BarcodePickViewHighlightStyle.DotWithIcons style) {
        Intrinsics.h(style, "style");
        return new T2(new L2(style), new M2(style));
    }

    public static S2 a(BarcodePickViewHighlightStyle.Rectangular style) {
        Intrinsics.h(style, "style");
        return new T2(new N2(style), new O2(style));
    }

    public static S2 a(BarcodePickViewHighlightStyle.RectangularWithIcons style) {
        Intrinsics.h(style, "style");
        return new T2(new P2(style), new Q2(style));
    }
}
