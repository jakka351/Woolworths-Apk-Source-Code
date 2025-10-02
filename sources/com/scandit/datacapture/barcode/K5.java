package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class K5 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f17215a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K5(Function1 function1) {
        super(1);
        this.f17215a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f17215a.invoke(Float.valueOf(((Number) obj).floatValue()));
        return Unit.f24250a;
    }
}
