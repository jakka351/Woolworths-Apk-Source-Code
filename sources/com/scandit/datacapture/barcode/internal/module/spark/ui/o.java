package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.C0890vb;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanViewPresenter f17797a;
    final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SparkScanViewPresenter sparkScanViewPresenter, Function0 function0) {
        super(1);
        this.f17797a = sparkScanViewPresenter;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        this.f17797a.f.a(this.f17797a.c.r(), C0890vb.f18240a);
        this.b.invoke();
        return Unit.f24250a;
    }
}
