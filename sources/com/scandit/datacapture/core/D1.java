package com.scandit.datacapture.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class D1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function0 f18306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(Function0 function0) {
        super(0);
        this.f18306a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18306a.invoke();
        return Unit.f24250a;
    }
}
