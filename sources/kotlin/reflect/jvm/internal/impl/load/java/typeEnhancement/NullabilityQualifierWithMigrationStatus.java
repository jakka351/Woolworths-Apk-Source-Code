package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import androidx.camera.core.impl.b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* renamed from: a, reason: collision with root package name */
    public final NullabilityQualifier f24447a;
    public final boolean b;

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier) {
        this.f24447a = nullabilityQualifier;
        this.b = false;
    }

    public static NullabilityQualifierWithMigrationStatus a(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier qualifier, boolean z, int i) {
        if ((i & 1) != 0) {
            qualifier = nullabilityQualifierWithMigrationStatus.f24447a;
        }
        if ((i & 2) != 0) {
            z = nullabilityQualifierWithMigrationStatus.b;
        }
        nullabilityQualifierWithMigrationStatus.getClass();
        Intrinsics.h(qualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(qualifier, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
        return this.f24447a == nullabilityQualifierWithMigrationStatus.f24447a && this.b == nullabilityQualifierWithMigrationStatus.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f24447a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.f24447a);
        sb.append(", isForWarningOnly=");
        return b.s(sb, this.b, ')');
    }

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z) {
        this.f24447a = nullabilityQualifier;
        this.b = z;
    }
}
