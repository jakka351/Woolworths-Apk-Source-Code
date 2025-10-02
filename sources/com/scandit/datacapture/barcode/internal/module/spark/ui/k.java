package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanViewPresenter f17792a;
    final /* synthetic */ NativeSparkScanViewState b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SparkScanViewPresenter sparkScanViewPresenter, NativeSparkScanViewState nativeSparkScanViewState) {
        super(0);
        this.f17792a = sparkScanViewPresenter;
        this.b = nativeSparkScanViewState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewPresenter.c(this.f17792a, this.b);
        SparkScanViewPresenter.b(this.f17792a, this.b);
        SparkScanViewPresenter.a(this.f17792a, this.b);
        this.f17792a.d(this.b);
        return Unit.f24250a;
    }
}
