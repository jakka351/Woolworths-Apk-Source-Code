package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanViewPresenter f17786a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SparkScanViewPresenter sparkScanViewPresenter) {
        super(1);
        this.f17786a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        SparkScanViewPresenter sparkScanViewPresenter = this.f17786a;
        sparkScanViewPresenter.a(new e(sparkScanViewPresenter));
        return Unit.f24250a;
    }
}
