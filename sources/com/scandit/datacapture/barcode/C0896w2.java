package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import java.util.List;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.w2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0896w2 implements InterfaceC0773p2 {
    private static final List e = CollectionsKt.R(new A6(((Number) LazyKt.b(C0821s2.f17999a).getD()).floatValue(), ((Number) LazyKt.b(C0806r2.f17987a).getD()).floatValue(), ((Number) LazyKt.b(C0791q2.f17977a).getD()).intValue()), new A6(((Number) LazyKt.b(C0881v2.f18232a).getD()).floatValue(), ((Number) LazyKt.b(C0866u2.f18217a).getD()).floatValue(), ((Number) LazyKt.b(C0843t2.f18136a).getD()).intValue()));

    /* renamed from: a, reason: collision with root package name */
    private final Context f18246a;
    private final InterfaceC0601e5 b;
    private final Function1 c;
    private final D2 d;

    public C0896w2(Context context, InterfaceC0601e5 elementsProvider, Function1 quadrilateralMapper, D2 drawSettings) {
        Intrinsics.h(context, "context");
        Intrinsics.h(elementsProvider, "elementsProvider");
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.h(drawSettings, "drawSettings");
        this.f18246a = context;
        this.b = elementsProvider;
        this.c = quadrilateralMapper;
        this.d = drawSettings;
    }

    public final C0758o2 a(TrackedObject track, BarcodePickState pickState, BarcodePickViewHighlightStyle highlightStyle) {
        K8 k8A;
        AbstractC0945z6 t5;
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        Intrinsics.h(highlightStyle, "highlightStyle");
        C0533b5 c0533b5 = (C0533b5) this.b.a(track.b(), pickState, null);
        Drawable drawableA = c0533b5.c().a(this.f18246a);
        Quadrilateral quadrilateral = (Quadrilateral) this.c.invoke(track.d());
        Quadrilateral quadrilateralA = E2.a(quadrilateral, this.d.e());
        Quadrilateral quadrilateralBoundingBox = QuadrilateralUtilsKt.boundingBox(quadrilateral);
        Quadrilateral quadrilateralA2 = Od.a(quadrilateral, highlightStyle, this.d.f());
        BarcodePickBrush barcodePickBrushB = c0533b5.b();
        boolean z = highlightStyle instanceof BarcodePickViewHighlightStyle.Dot;
        if (z ? true : highlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            k8A = I2.a(barcodePickBrushB, e);
        } else {
            if (!(highlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : highlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons)) {
                if (highlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
                    throw new IllegalStateException("Cannot create brush data for CustomView style");
                }
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.h(barcodePickBrushB, "<this>");
            k8A = I2.a(barcodePickBrushB, EmptyList.d);
        }
        boolean z2 = false;
        boolean z3 = drawableA != null;
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : highlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            t5 = new C0669i9(quadrilateralA);
        } else {
            if (!(z ? true : highlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons)) {
                if (highlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
                    throw new IllegalStateException("Cannot create brush DrawData for CustomView style");
                }
                throw new NoWhenBranchMatchedException();
            }
            int i = AbstractC0665i5.c;
            if (!z3) {
                if (z || (highlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons)) {
                    if (pickState == BarcodePickState.IGNORE || pickState == BarcodePickState.UNKNOWN) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                t5 = new C0638ga(quadrilateralA);
            } else {
                if (z2) {
                    throw new NoWhenBranchMatchedException();
                }
                t5 = new T5(quadrilateralA);
            }
        }
        return new C0758o2(k8A, t5, new C0669i9(quadrilateralA2), new C0669i9(quadrilateralBoundingBox), track, drawableA);
    }
}
