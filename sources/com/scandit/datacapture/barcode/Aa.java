package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Aa extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanInternal f17095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Aa(SparkScanInternal sparkScanInternal) {
        super(0);
        this.f17095a = sparkScanInternal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17095a;
    }
}
