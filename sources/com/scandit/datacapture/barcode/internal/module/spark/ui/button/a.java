package com.scandit.datacapture.barcode.internal.module.spark.ui.button;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanViewScanButtonView f17781a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SparkScanViewScanButtonView sparkScanViewScanButtonView) {
        super(1);
        this.f17781a = sparkScanViewScanButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        boolean zEquals5;
        boolean zEquals6;
        String it = (String) obj;
        Intrinsics.h(it, "it");
        this.f17781a.f;
        boolean zEquals7 = true;
        if (it.equals("targetModeButtonVisible")) {
            zEquals = true;
        } else {
            this.f17781a.f;
            zEquals = it.equals("handModeButtonVisible");
        }
        if (zEquals) {
            zEquals2 = true;
        } else {
            this.f17781a.f;
            zEquals2 = it.equals("scanningBehaviorButtonVisible");
        }
        if (zEquals2) {
            zEquals3 = true;
        } else {
            this.f17781a.f;
            zEquals3 = it.equals("hapticModeButtonVisible");
        }
        if (zEquals3) {
            zEquals4 = true;
        } else {
            this.f17781a.f;
            zEquals4 = it.equals("soundModeButtonVisible");
        }
        if (zEquals4) {
            zEquals5 = true;
        } else {
            this.f17781a.f;
            zEquals5 = it.equals("barcodeCountButtonVisible");
        }
        if (zEquals5) {
            zEquals6 = true;
        } else {
            this.f17781a.f;
            zEquals6 = it.equals("barcodeFindButtonVisible");
        }
        if (!zEquals6) {
            this.f17781a.f;
            zEquals7 = it.equals("torchButtonVisible");
        }
        if (zEquals7) {
            this.f17781a.e();
            this.f17781a.d();
        }
        return Unit.f24250a;
    }
}
