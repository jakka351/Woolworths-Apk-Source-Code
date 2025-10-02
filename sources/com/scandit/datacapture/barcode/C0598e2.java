package com.scandit.datacapture.barcode;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.e2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0598e2 {
    public static FrameLayout a(Context context, NativeBarcodeCountBasicOverlayStyle style) {
        Intrinsics.h(context, "context");
        Intrinsics.h(style, "style");
        int i = AbstractC0546c2.f17397a[style.ordinal()];
        if (i == 1) {
            return new G(context, null, 0);
        }
        if (i == 2) {
            return new C0931y7(context, null, 0);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Ld a(Context context) {
        Intrinsics.h(context, "context");
        return new Ld(context, null, 0);
    }
}
