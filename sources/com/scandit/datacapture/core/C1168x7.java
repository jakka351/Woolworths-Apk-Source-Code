package com.scandit.datacapture.core;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.x7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1168x7 implements InterfaceC1186z7 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1041j6 f18989a;
    private final N7 b;

    public C1168x7(AbstractC1041j6 task, N7 status) {
        Intrinsics.h(task, "task");
        Intrinsics.h(status, "status");
        this.f18989a = task;
        this.b = status;
    }

    public final N7 a() {
        return this.b;
    }

    public final AbstractC1041j6 b() {
        return this.f18989a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1168x7)) {
            return false;
        }
        C1168x7 c1168x7 = (C1168x7) obj;
        return Intrinsics.c(this.f18989a, c1168x7.f18989a) && Intrinsics.c(this.b, c1168x7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18989a.hashCode() * 31);
    }

    public final String toString() {
        return "StatusChange(task=" + this.f18989a + ", status=" + this.b + ')';
    }
}
