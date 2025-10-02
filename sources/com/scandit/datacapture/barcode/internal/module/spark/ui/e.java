package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.capture.SparkScanViewUiListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanViewPresenter f17785a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SparkScanViewPresenter sparkScanViewPresenter) {
        super(0);
        this.f17785a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewUiListener sparkScanViewUiListener = this.f17785a.r;
        if (sparkScanViewUiListener != null) {
            sparkScanViewUiListener.onFastFindButtonTap(this.f17785a.b);
        }
        SparkScanViewUiListener sparkScanViewUiListener2 = this.f17785a.r;
        if (sparkScanViewUiListener2 != null) {
            sparkScanViewUiListener2.onBarcodeFindButtonTap(this.f17785a.b);
        }
        return Unit.f24250a;
    }
}
