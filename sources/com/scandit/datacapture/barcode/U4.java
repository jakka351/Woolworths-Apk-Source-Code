package com.scandit.datacapture.barcode;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class U4 {
    private U4() {
    }

    public static X4 a(FrameLayout container, J4 initialDrawData, Function2 layoutRefresher) {
        Intrinsics.h(container, "container");
        Intrinsics.h(initialDrawData, "initialDrawData");
        Intrinsics.h(layoutRefresher, "layoutRefresher");
        return new Z4(container, initialDrawData, layoutRefresher);
    }
}
