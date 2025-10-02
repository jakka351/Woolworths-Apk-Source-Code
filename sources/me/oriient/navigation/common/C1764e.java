package me.oriient.navigation.common;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.navigation.common.models.Route;

/* renamed from: me.oriient.navigation.common.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1764e extends AbstractC1765f {

    /* renamed from: a, reason: collision with root package name */
    public final Route f26238a;

    public C1764e(Route trimmed) {
        Intrinsics.h(trimmed, "trimmed");
        this.f26238a = trimmed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1764e) && Intrinsics.c(this.f26238a, ((C1764e) obj).f26238a);
    }

    public final int hashCode() {
        return this.f26238a.hashCode();
    }

    public final String toString() {
        return "WrongDirection(trimmed=" + this.f26238a + ')';
    }
}
