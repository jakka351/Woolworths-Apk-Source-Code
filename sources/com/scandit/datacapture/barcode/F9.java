package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class F9 {
    private F9() {
    }

    public static ShutterButtonWrapper a(InterfaceC0933y9 factory, Ge positioner) {
        Intrinsics.h(factory, "factory");
        Intrinsics.h(positioner, "positioner");
        return new J9(factory, positioner);
    }
}
