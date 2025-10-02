package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class K3 {
    public static BarcodePickDrawer a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar, BarcodePickBasicOverlay container, Function1 quadrilateralMapper, L3 drawSettings) {
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.h(drawSettings, "drawSettings");
        I3 i3 = new I3(quadrilateralMapper, drawSettings);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.h(aVar, "<this>");
        Intrinsics.h(container, "container");
        return new J3(container, i3, linkedHashMap);
    }
}
