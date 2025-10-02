package com.scandit.datacapture.core;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.y7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1177y7 implements InterfaceC1186z7 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1041j6 f18995a;
    private final N7 b;
    private final N7 c;

    public C1177y7(AbstractC1041j6 task, N7 currentStatus, N7 desiredStatus) {
        Intrinsics.h(task, "task");
        Intrinsics.h(currentStatus, "currentStatus");
        Intrinsics.h(desiredStatus, "desiredStatus");
        this.f18995a = task;
        this.b = currentStatus;
        this.c = desiredStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1177y7)) {
            return false;
        }
        C1177y7 c1177y7 = (C1177y7) obj;
        return Intrinsics.c(this.f18995a, c1177y7.f18995a) && Intrinsics.c(this.b, c1177y7.b) && Intrinsics.c(this.c, c1177y7.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f18995a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StatusChangeNotAllowed(task=" + this.f18995a + ", currentStatus=" + this.b + ", desiredStatus=" + this.c + ')';
    }
}
