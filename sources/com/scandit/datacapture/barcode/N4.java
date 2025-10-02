package com.scandit.datacapture.barcode;

import android.view.View;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class N4 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R4 f17246a;
    final /* synthetic */ TrackedObject b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(R4 r4, TrackedObject trackedObject) {
        super(1);
        this.f17246a = r4;
        this.b = trackedObject;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View statusIconView = (View) obj;
        Intrinsics.h(statusIconView, "statusIconView");
        if (R4.a(this.f17246a, statusIconView)) {
            R4.a(this.f17246a, this.b);
        }
        return Unit.f24250a;
    }
}
