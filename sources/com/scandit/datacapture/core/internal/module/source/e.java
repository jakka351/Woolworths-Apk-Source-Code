package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.A2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f18580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z) {
        super(1);
        this.f18580a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        A2 use = (A2) obj;
        Intrinsics.h(use, "$this$use");
        use.b(this.f18580a);
        return Unit.f24250a;
    }
}
