package me.oriient.positioningengine.support;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26561a;
    public final long b;
    public final k0 c;

    public l0(long j, long j2, k0 type) {
        Intrinsics.h(type, "type");
        this.f26561a = j;
        this.b = j2;
        this.c = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f26561a == l0Var.f26561a && this.b == l0Var.b && this.c == l0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + me.oriient.positioningengine.common.w.a(this.b, Long.hashCode(this.f26561a) * 31, 31);
    }

    public final String toString() {
        return "UploadingSession(startTimeMillis=" + this.f26561a + ", endTimeMillis=" + this.b + ", type=" + this.c + ')';
    }
}
