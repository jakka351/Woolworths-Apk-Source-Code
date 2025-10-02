package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.x6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0915x6 {
    public static final L4 a(Context context, Function1 quadrilateralMapper, InterfaceC0601e5 elementsProvider, BarcodePickViewHighlightStyle.DotWithIcons highlightStyle) {
        Intrinsics.h(K4.f17214a, "<this>");
        Intrinsics.h(context, "context");
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.h(elementsProvider, "elementsProvider");
        Intrinsics.h(highlightStyle, "highlightStyle");
        return new C0900w6(context, quadrilateralMapper, elementsProvider, highlightStyle);
    }
}
