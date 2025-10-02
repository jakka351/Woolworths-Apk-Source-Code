package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class K6 {
    private K6() {
    }

    public static ExitButtonWrapper a(H6 factory, Ge positioner) {
        Intrinsics.h(factory, "factory");
        Intrinsics.h(positioner, "positioner");
        return new V6(factory, positioner);
    }
}
