package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final /* synthetic */ class M2 extends FunctionReferenceImpl implements Function1 {
    public M2(Object obj) {
        super(1, obj, BarcodePickViewHighlightStyle.DotWithIcons.class, "getSelectedBrushForState", "getSelectedBrushForState(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)Lcom/scandit/datacapture/core/ui/style/Brush;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickState p0 = (BarcodePickState) obj;
        Intrinsics.h(p0, "p0");
        return ((BarcodePickViewHighlightStyle.DotWithIcons) this.receiver).getSelectedBrushForState(p0);
    }
}
