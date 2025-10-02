package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class T2 implements S2 {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f17302a;
    private final Function1 b;

    public T2(Function1 brushGetter, Function1 selectedBrushGetter) {
        Intrinsics.h(brushGetter, "brushGetter");
        Intrinsics.h(selectedBrushGetter, "selectedBrushGetter");
        this.f17302a = brushGetter;
        this.b = selectedBrushGetter;
    }

    @Override // com.scandit.datacapture.barcode.S2
    public final BarcodePickBrush a(BarcodePickState state) {
        Intrinsics.h(state, "state");
        return C0742n2.a((Brush) this.b.invoke(state));
    }

    @Override // com.scandit.datacapture.barcode.S2
    public final BarcodePickBrush b(BarcodePickState state) {
        Intrinsics.h(state, "state");
        return C0742n2.a((Brush) this.f17302a.invoke(state));
    }
}
