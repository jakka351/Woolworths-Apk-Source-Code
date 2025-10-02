package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.capture.SparkScanViewUiListener;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanViewPresenter f17791a;
    final /* synthetic */ SparkScanScanningMode b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SparkScanViewPresenter sparkScanViewPresenter, SparkScanScanningMode sparkScanScanningMode) {
        super(0);
        this.f17791a = sparkScanViewPresenter;
        this.b = sparkScanScanningMode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewUiListener sparkScanViewUiListener = this.f17791a.r;
        if (sparkScanViewUiListener != null) {
            sparkScanViewUiListener.onScanningModeChange(this.b);
        }
        return Unit.f24250a;
    }
}
