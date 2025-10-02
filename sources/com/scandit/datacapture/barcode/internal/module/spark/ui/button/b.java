package com.scandit.datacapture.barcode.internal.module.spark.ui.button;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanViewScanButtonView f17782a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SparkScanViewScanButtonView sparkScanViewScanButtonView) {
        super(0);
        this.f17782a = sparkScanViewScanButtonView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewScanButtonView sparkScanViewScanButtonView = this.f17782a;
        SparkScanViewScanButtonView.a(sparkScanViewScanButtonView, sparkScanViewScanButtonView.a(), this.f17782a.b.a());
        return Unit.f24250a;
    }
}
