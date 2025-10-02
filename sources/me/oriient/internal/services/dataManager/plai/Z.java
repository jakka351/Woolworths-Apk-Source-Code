package me.oriient.internal.services.dataManager.plai;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final String f25293a;
    public final long b;

    public Z(String buildingId, long j) {
        Intrinsics.h(buildingId, "buildingId");
        this.f25293a = buildingId;
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
        return Intrinsics.c(this.f25293a, z.f25293a) && this.b == z.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f25293a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaiStatistics(buildingId=");
        sb.append(this.f25293a);
        sb.append(", lastUpdatedTimestampMillis=");
        return androidx.camera.core.impl.b.q(sb, this.b, ')');
    }
}
