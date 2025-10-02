package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class B2 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f17102a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(Function1 function1) {
        super(1);
        this.f17102a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0758o2 drawData = (C0758o2) obj;
        Intrinsics.h(drawData, "drawData");
        this.f17102a.invoke(drawData.f());
        return Unit.f24250a;
    }
}
