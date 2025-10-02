package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class H9 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f17183a;
    final /* synthetic */ J9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H9(Function1 function1, J9 j9) {
        super(0);
        this.f17183a = function1;
        this.b = j9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17183a.invoke(this.b);
        return Unit.f24250a;
    }
}
