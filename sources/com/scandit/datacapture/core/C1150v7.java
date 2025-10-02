package com.scandit.datacapture.core;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.v7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1150v7 implements InterfaceC1186z7 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1041j6 f18980a;
    private final InterfaceC1141u7 b;
    private final InterfaceC1132t7 c;

    public C1150v7(AbstractC1041j6 task, D4 interceptor, InterfaceC1132t7 result) {
        Intrinsics.h(task, "task");
        Intrinsics.h(interceptor, "interceptor");
        Intrinsics.h(result, "result");
        this.f18980a = task;
        this.b = interceptor;
        this.c = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1150v7)) {
            return false;
        }
        C1150v7 c1150v7 = (C1150v7) obj;
        return Intrinsics.c(this.f18980a, c1150v7.f18980a) && Intrinsics.c(this.b, c1150v7.b) && Intrinsics.c(this.c, c1150v7.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f18980a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PostInterceptorCheck(task=" + this.f18980a + ", interceptor=" + this.b + ", result=" + this.c + ')';
    }
}
