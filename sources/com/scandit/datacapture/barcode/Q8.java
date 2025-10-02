package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Q8 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePick f17280a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q8(BarcodePick barcodePick) {
        super(1);
        this.f17280a = barcodePick;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedObject it = (TrackedObject) obj;
        Intrinsics.h(it, "it");
        BarcodePick._onTrackedObjectTap$scandit_barcode_capture$default(this.f17280a, it, null, 2, null);
        return Unit.f24250a;
    }
}
