package me.oriient.navigation.common;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.navigation.common.models.Route;

/* renamed from: me.oriient.navigation.common.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1763d extends AbstractC1765f {

    /* renamed from: a, reason: collision with root package name */
    public final Route f26236a;

    public C1763d(Route trimmed) {
        Intrinsics.h(trimmed, "trimmed");
        this.f26236a = trimmed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1763d) && Intrinsics.c(this.f26236a, ((C1763d) obj).f26236a);
    }

    public final int hashCode() {
        return this.f26236a.hashCode();
    }

    public final String toString() {
        return "Trimmed(trimmed=" + this.f26236a + ')';
    }
}
