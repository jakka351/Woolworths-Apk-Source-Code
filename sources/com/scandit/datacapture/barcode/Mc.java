package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Mc extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Pc f17242a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mc(Pc pc) {
        super(1);
        this.f17242a = pc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Zc zc;
        EnumC0654ha gesture = (EnumC0654ha) obj;
        Intrinsics.h(gesture, "gesture");
        int iOrdinal = gesture.ordinal();
        if (iOrdinal == 0) {
            Zc zc2 = this.f17242a.b;
            if (zc2 != null) {
                ((SparkScanViewPresenter) zc2).D();
            }
        } else if (iOrdinal == 6) {
            Zc zc3 = this.f17242a.b;
            if (zc3 != null) {
                ((SparkScanViewPresenter) zc3).I();
            }
        } else if (iOrdinal == 7 && (zc = this.f17242a.b) != null) {
            ((SparkScanViewPresenter) zc).H();
        }
        return Unit.f24250a;
    }
}
