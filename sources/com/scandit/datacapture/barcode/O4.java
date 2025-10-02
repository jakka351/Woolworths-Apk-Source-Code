package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final /* synthetic */ class O4 extends FunctionReferenceImpl implements Function2 {
    public O4(Object obj) {
        super(2, obj, R4.class, "setupViewHolderForTrackedObjectLocation", "setupViewHolderForTrackedObjectLocation(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightdrawer/statusicon/viewholder/BarcodePickStatusIconViewHolder;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightdrawer/statusicon/drawdata/BarcodePickStatusIconDrawData;)V", 0);
    }

    public final void a(X4 p0, J4 p1) {
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        ((R4) this.receiver).a(p0, p1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((X4) obj, (J4) obj2);
        return Unit.f24250a;
    }
}
