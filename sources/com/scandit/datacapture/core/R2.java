package com.scandit.datacapture.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class R2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1011g3 f18367a;
    final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(C1011g3 c1011g3, Function0 function0) {
        super(0);
        this.f18367a = c1011g3;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18367a.setVisibility(4);
        this.b.invoke();
        return Unit.f24250a;
    }
}
