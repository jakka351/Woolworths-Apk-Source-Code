package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.ya, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0934ya extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanInternal f18274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934ya(SparkScanInternal sparkScanInternal) {
        super(0);
        this.f18274a = sparkScanInternal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f18274a.b();
    }
}
