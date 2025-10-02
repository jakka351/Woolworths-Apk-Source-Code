package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final String f25338a;
    public final long b;

    public Z(String buildingId, long j) {
        Intrinsics.h(buildingId, "buildingId");
        this.f25338a = buildingId;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z = (Z) obj;
        return Intrinsics.c(this.f25338a, z.f25338a) && this.b == z.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f25338a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaiCategoryStatistics(buildingId=");
        sb.append(this.f25338a);
        sb.append(", lastUpdatedTimestampMillis=");
        return androidx.camera.core.impl.b.q(sb, this.b, ')');
    }
}
