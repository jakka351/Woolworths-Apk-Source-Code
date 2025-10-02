package com.scandit.datacapture.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.d7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0988d7 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f18485a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0988d7(long j) {
        super(1);
        this.f18485a = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        A2 use = (A2) obj;
        Intrinsics.h(use, "$this$use");
        use.b(this.f18485a);
        return Unit.f24250a;
    }
}
