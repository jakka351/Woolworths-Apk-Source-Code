package me.oriient.navigation.common;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.navigation.common.models.Route;

/* loaded from: classes8.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26267a;
    public final Route b;

    public t0(boolean z, Route newRoute) {
        Intrinsics.h(newRoute, "newRoute");
        this.f26267a = z;
        this.b = newRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f26267a == t0Var.f26267a && Intrinsics.c(this.b, t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f26267a) * 31);
    }

    public final String toString() {
        return "TailTrimmerResult(shouldRecalculate=" + this.f26267a + ", newRoute=" + this.b + ')';
    }
}
