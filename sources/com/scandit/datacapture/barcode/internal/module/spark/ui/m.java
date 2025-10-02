package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanViewPresenter f17794a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SparkScanViewPresenter sparkScanViewPresenter) {
        super(0);
        this.f17794a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewPresenter sparkScanViewPresenter = this.f17794a;
        sparkScanViewPresenter.a(new l(sparkScanViewPresenter));
        return Unit.f24250a;
    }
}
