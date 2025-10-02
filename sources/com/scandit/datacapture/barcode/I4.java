package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class I4 {
    public static final Ge a(Fe fe, BarcodePickViewSettings viewSettings) {
        Intrinsics.h(fe, "<this>");
        Intrinsics.h(viewSettings, "viewSettings");
        return new H4(viewSettings.getUiButtonsOffset());
    }
}
