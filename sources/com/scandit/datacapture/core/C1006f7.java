package com.scandit.datacapture.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.f7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1006f7 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f18499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006f7(boolean z) {
        super(1);
        this.f18499a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        A2 use = (A2) obj;
        Intrinsics.h(use, "$this$use");
        use.b(this.f18499a);
        return Unit.f24250a;
    }
}
