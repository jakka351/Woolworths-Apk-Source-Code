package com.scandit.datacapture.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class A implements V0 {

    /* renamed from: a, reason: collision with root package name */
    private Function1 f18293a;
    final /* synthetic */ N b;

    public A(N n, Function1 completion) {
        Intrinsics.h(completion, "completion");
        this.b = n;
        this.f18293a = completion;
    }

    @Override // com.scandit.datacapture.core.V0
    public final void a(long j) {
        InterfaceC0979c7 interfaceC0979c7 = this.b.j;
        if (interfaceC0979c7 != null) {
            ((C1024h7) interfaceC0979c7).a(j);
        }
        this.f18293a.invoke(Boolean.TRUE);
        this.b.s = true;
    }

    @Override // com.scandit.datacapture.core.V0
    public final void a(C1035j0 captureResult) {
        Intrinsics.h(captureResult, "captureResult");
        N n = this.b;
        Integer numA = captureResult.a();
        n.o = numA != null ? numA.intValue() : 0;
        ((C0992e2) this.b.h).a(captureResult);
        if (this.b.s) {
            this.b.q.a(captureResult);
            if (this.b.q.c()) {
                N.n(this.b);
            }
        }
    }
}
