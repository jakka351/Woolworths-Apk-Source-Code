package com.scandit.datacapture.core;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.w7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1159w7 implements InterfaceC1186z7 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1041j6 f18985a;
    private final InterfaceC1141u7 b;

    public C1159w7(AbstractC1041j6 task, InterfaceC1141u7 interceptor) {
        Intrinsics.h(task, "task");
        Intrinsics.h(interceptor, "interceptor");
        this.f18985a = task;
        this.b = interceptor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159w7)) {
            return false;
        }
        C1159w7 c1159w7 = (C1159w7) obj;
        return Intrinsics.c(this.f18985a, c1159w7.f18985a) && Intrinsics.c(this.b, c1159w7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18985a.hashCode() * 31);
    }

    public final String toString() {
        return "PreInterceptorCheck(task=" + this.f18985a + ", interceptor=" + this.b + ')';
    }
}
