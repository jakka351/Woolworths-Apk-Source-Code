package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Ba extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanInternal f17108a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ba(SparkScanInternal sparkScanInternal) {
        super(0);
        this.f17108a = sparkScanInternal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17108a.b();
    }
}
