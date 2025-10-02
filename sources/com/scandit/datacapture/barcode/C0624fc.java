package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.fc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0624fc extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Zc f17641a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624fc(Zc zc) {
        super(1);
        this.f17641a = zc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC0654ha gesture = (EnumC0654ha) obj;
        Intrinsics.h(gesture, "gesture");
        if (AbstractC0608ec.f17630a[gesture.ordinal()] == 1) {
            Zc zc = this.f17641a;
            if (zc != null) {
                ((SparkScanViewPresenter) zc).D();
            }
        } else {
            Zc zc2 = this.f17641a;
            if (zc2 != null) {
                ((SparkScanViewPresenter) zc2).b(gesture);
            }
        }
        return Unit.f24250a;
    }
}
