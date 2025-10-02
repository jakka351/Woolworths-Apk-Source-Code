package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class U6 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f17314a;
    final /* synthetic */ V6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(Function1 function1, V6 v6) {
        super(0);
        this.f17314a = function1;
        this.b = v6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17314a.invoke(this.b);
        return Unit.f24250a;
    }
}
