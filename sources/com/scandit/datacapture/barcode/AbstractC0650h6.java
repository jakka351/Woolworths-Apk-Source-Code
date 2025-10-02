package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.h6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0650h6 {
    public static final BarcodePickDrawer a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar, BarcodePickDrawer... drawers) {
        Intrinsics.h(aVar, "<this>");
        Intrinsics.h(drawers, "drawers");
        return new C0634g6(ArraysKt.l0(drawers));
    }
}
