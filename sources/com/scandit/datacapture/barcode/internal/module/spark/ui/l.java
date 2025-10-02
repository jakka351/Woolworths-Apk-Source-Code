package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanViewPresenter f17793a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SparkScanViewPresenter sparkScanViewPresenter) {
        super(0);
        this.f17793a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17793a.h.d();
        return Unit.f24250a;
    }
}
