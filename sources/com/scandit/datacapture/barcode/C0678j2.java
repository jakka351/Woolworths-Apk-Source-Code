package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.j2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final /* synthetic */ class C0678j2 extends FunctionReferenceImpl implements Function1 {
    public C0678j2(Object obj) {
        super(1, obj, C0710l2.class, "onTouchConfirmed", "onTouchConfirmed(Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode p0 = (TrackedBarcode) obj;
        Intrinsics.h(p0, "p0");
        C0710l2.a((C0710l2) this.receiver, p0);
        return Unit.f24250a;
    }
}
