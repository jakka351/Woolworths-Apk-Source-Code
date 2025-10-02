package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.l6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0714l6 {
    public static final L4 a(Function1 quadrilateralMapper, BarcodePickElementsCache cache) {
        Intrinsics.h(K4.f17214a, "<this>");
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.h(cache, "cache");
        return new C0698k6(cache, quadrilateralMapper);
    }
}
