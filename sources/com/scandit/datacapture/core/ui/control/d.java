package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function0 f18912a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function0 function0) {
        super(1);
        this.f18912a = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        this.f18912a.invoke();
        return Unit.f24250a;
    }
}
