package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.v7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0886v7 implements InterfaceC0871u7 {
    @Override // com.scandit.datacapture.barcode.InterfaceC0871u7
    public final InterfaceC0826s7 a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.h(highlightStyle, "highlightStyle");
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular) {
            throw new IllegalStateException("Status icons are not supported in BarcodePickViewHighlightStyle.RectangularBarcodePickViewHighlightStyle.RectangularWithIcons should be used instead.");
        }
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            return new C0811r7(((BarcodePickViewHighlightStyle.RectangularWithIcons) highlightStyle).getStatusIconSettings());
        }
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
            return new C0811r7(((BarcodePickViewHighlightStyle.CustomView) highlightStyle).getStatusIconSettings());
        }
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.Dot) {
            throw new IllegalStateException("Status icons are not supported in BarcodePickViewHighlightStyle.Dot.BarcodePickViewHighlightStyle.DotWithIcons should be used instead.");
        }
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            return new C0699k7();
        }
        throw new NoWhenBranchMatchedException();
    }
}
