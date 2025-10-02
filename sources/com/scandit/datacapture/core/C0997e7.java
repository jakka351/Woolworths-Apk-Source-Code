package com.scandit.datacapture.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.scandit.datacapture.core.e7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0997e7 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref.LongRef f18491a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0997e7(Ref.LongRef longRef, long j) {
        super(1);
        this.f18491a = longRef;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        A2 use = (A2) obj;
        Intrinsics.h(use, "$this$use");
        this.f18491a.d = use.a(this.b);
        return Unit.f24250a;
    }
}
