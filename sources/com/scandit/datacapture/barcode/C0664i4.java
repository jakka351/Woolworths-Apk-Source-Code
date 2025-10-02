package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0664i4 {
    private C0664i4() {
    }

    public static InterfaceC0680j4 a(BarcodePick mode, Function1 runOnMain, Function1 onDrawerDataUpdatedWithStatusIconsShown, InterfaceC0617f5 elementsRequestor, BarcodePickDrawer highlightDrawer) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(runOnMain, "runOnMain");
        Intrinsics.h(onDrawerDataUpdatedWithStatusIconsShown, "onDrawerDataUpdatedWithStatusIconsShown");
        Intrinsics.h(elementsRequestor, "elementsRequestor");
        Intrinsics.h(highlightDrawer, "highlightDrawer");
        return new C0760o4(mode, runOnMain, onDrawerDataUpdatedWithStatusIconsShown, elementsRequestor, highlightDrawer);
    }
}
