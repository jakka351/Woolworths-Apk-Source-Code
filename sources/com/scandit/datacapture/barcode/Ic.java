package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Ic extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Kc f17197a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ic(SparkScanViewUISettings sparkScanViewUISettings, Kc kc) {
        super(1);
        this.f17197a = kc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        if (it.equals("targetModeButtonVisible")) {
            Kc.h(this.f17197a);
        } else if (it.equals("handModeButtonVisible")) {
            this.f17197a.d();
        } else if (it.equals("scanningBehaviorButtonVisible")) {
            Kc.f(this.f17197a);
        } else if (it.equals("hapticModeButtonVisible")) {
            Kc.e(this.f17197a);
        } else if (it.equals("soundModeButtonVisible")) {
            Kc.g(this.f17197a);
        } else if (it.equals("barcodeCountButtonVisible")) {
            Kc.b(this.f17197a);
        } else if (it.equals("barcodeFindButtonVisible")) {
            Kc.c(this.f17197a);
        }
        return Unit.f24250a;
    }
}
