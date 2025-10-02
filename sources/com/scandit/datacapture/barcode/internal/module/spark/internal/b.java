package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeSparkScan f17777a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NativeSparkScan nativeSparkScan) {
        super(0);
        this.f17777a = nativeSparkScan;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeSparkScanSession session = this.f17777a.getSession();
        Intrinsics.g(session, "impl.session");
        return session;
    }
}
