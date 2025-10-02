package me.oriient.internal.services.dataManager.building;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class H extends J {

    /* renamed from: a, reason: collision with root package name */
    public final BuildingsSearchResult f25096a;

    public H(BuildingsSearchResult buildings) {
        Intrinsics.h(buildings, "buildings");
        this.f25096a = buildings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && Intrinsics.c(this.f25096a, ((H) obj).f25096a);
    }

    public final int hashCode() {
        return this.f25096a.hashCode();
    }

    public final String toString() {
        return "Inside(buildings=" + this.f25096a + ')';
    }
}
