package com.scandit.datacapture.barcode.spark.ui;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
final /* synthetic */ class a extends FunctionReferenceImpl implements Function0 {
    public a(SparkScanViewPresenter sparkScanViewPresenter) {
        super(0, sparkScanViewPresenter, SparkScanViewPresenter.class, "onCaptureButtonClicked", "onCaptureButtonClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((SparkScanViewPresenter) this.receiver).D();
        return Unit.f24250a;
    }
}
