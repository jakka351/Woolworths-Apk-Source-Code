package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class V2 {
    private V2() {
    }

    public static W2 a(Size2 minSize, boolean z, Function1 quadrilateralMapper, BarcodePickViewSettings viewSettings) {
        Intrinsics.h(minSize, "minSize");
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.h(viewSettings, "viewSettings");
        return new X2(minSize, z, quadrilateralMapper, viewSettings);
    }
}
