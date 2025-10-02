package me.oriient.internal.services.dataManager.preloading;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f25378a;
    public Job b;
    public m c;

    public n(String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.f25378a = buildingId;
        this.c = m.NOT_STARTED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.c(this.f25378a, ((n) obj).f25378a);
    }

    public final int hashCode() {
        return this.f25378a.hashCode();
    }

    public final String toString() {
        return me.oriient.internal.infra.rest.e.a(new StringBuilder("PreloadingTask(buildingId="), this.f25378a, ')');
    }
}
