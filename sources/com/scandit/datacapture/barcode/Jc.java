package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Jc extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Kc f17209a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jc(Kc kc) {
        super(1);
        this.f17209a = kc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC0654ha gesture = (EnumC0654ha) obj;
        Intrinsics.h(gesture, "gesture");
        Zc zc = this.f17209a.h;
        if (zc != null) {
            ((SparkScanViewPresenter) zc).a(gesture);
        }
        return Unit.f24250a;
    }
}
