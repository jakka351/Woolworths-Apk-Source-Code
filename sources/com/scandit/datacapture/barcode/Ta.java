package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Ta extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ua f17307a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ta(Ua ua) {
        super(1);
        this.f17307a = ua;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Ra raA;
        EnumC0654ha gesture = (EnumC0654ha) obj;
        Intrinsics.h(gesture, "gesture");
        int iOrdinal = gesture.ordinal();
        if (iOrdinal == 1) {
            Ra raA2 = this.f17307a.a();
            if (raA2 != null) {
                ((SparkScanViewPresenter) raA2).w();
            }
        } else if (iOrdinal == 2) {
            Ra raA3 = this.f17307a.a();
            if (raA3 != null) {
                ((SparkScanViewPresenter) raA3).e(true);
            }
        } else if (iOrdinal == 4 && (raA = this.f17307a.a()) != null) {
            ((SparkScanViewPresenter) raA).e(false);
        }
        return Unit.f24250a;
    }
}
