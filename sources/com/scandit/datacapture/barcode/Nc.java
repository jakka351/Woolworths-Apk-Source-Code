package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Nc extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Pc f17251a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nc(Pc pc) {
        super(1);
        this.f17251a = pc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Zc zc;
        EnumC0654ha gesture = (EnumC0654ha) obj;
        Intrinsics.h(gesture, "gesture");
        if (gesture == EnumC0654ha.CLICK && (zc = this.f17251a.b) != null) {
            ((SparkScanViewPresenter) zc).D();
        }
        return Unit.f24250a;
    }
}
