package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.d4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0584d4 {
    private C0584d4() {
    }

    public static InterfaceC0600e4 a(BarcodePickHighlightStyleIconsHolder overrides, InterfaceC0600e4 defaults) {
        Intrinsics.h(overrides, "overrides");
        Intrinsics.h(defaults, "defaults");
        return new C0616f4(overrides, defaults);
    }
}
