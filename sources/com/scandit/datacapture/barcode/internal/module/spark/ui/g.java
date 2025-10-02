package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanViewPresenter f17788a;
    final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SparkScanViewPresenter sparkScanViewPresenter, Function0 function0) {
        super(0);
        this.f17788a = sparkScanViewPresenter;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewPresenter sparkScanViewPresenter = this.f17788a;
        NativeSparkScanViewState nativeSparkScanViewStateC = sparkScanViewPresenter.c();
        Function0 function0 = this.b;
        SparkScanViewPresenter.a(sparkScanViewPresenter, nativeSparkScanViewStateC, function0, function0);
        return Unit.f24250a;
    }
}
