package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleAsyncProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class E3 {
    private E3() {
    }

    public static BarcodePickElementsCache a(BarcodePickViewHighlightStyleAsyncProvider barcodePickViewHighlightStyleAsyncProvider, S2 brushProvider, InterfaceC0600e4 iconProvider, boolean z) {
        Intrinsics.h(brushProvider, "brushProvider");
        Intrinsics.h(iconProvider, "iconProvider");
        return new H2(barcodePickViewHighlightStyleAsyncProvider, brushProvider, iconProvider, z);
    }

    public static BarcodePickElementsCache a(BarcodePickViewHighlightStyleCustomViewProvider barcodePickViewHighlightStyleCustomViewProvider) {
        return new C0631g3(barcodePickViewHighlightStyleCustomViewProvider);
    }
}
