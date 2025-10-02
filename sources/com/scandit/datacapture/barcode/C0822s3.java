package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.s3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0822s3 {
    private C0822s3() {
    }

    public static BarcodePickDataCaptureViewWrapper a(Context context, InterfaceC0792q3 factory, BarcodePickViewSettings settings) {
        Intrinsics.h(context, "context");
        Intrinsics.h(factory, "factory");
        Intrinsics.h(settings, "settings");
        return new C0867u3(context, factory, settings);
    }
}
