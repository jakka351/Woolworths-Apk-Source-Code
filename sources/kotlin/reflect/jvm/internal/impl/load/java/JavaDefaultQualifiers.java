package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.camera.core.impl.b;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;

/* loaded from: classes7.dex */
public final class JavaDefaultQualifiers {

    /* renamed from: a, reason: collision with root package name */
    public final NullabilityQualifierWithMigrationStatus f24399a;
    public final Collection b;
    public final boolean c;

    public JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection) {
        this(nullabilityQualifierWithMigrationStatus, collection, nullabilityQualifierWithMigrationStatus.f24447a == NullabilityQualifier.f);
    }

    public static JavaDefaultQualifiers a(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus) {
        Collection qualifierApplicabilityTypes = javaDefaultQualifiers.b;
        boolean z = javaDefaultQualifiers.c;
        Intrinsics.h(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new JavaDefaultQualifiers(nullabilityQualifierWithMigrationStatus, qualifierApplicabilityTypes, z);
    }

    public final NullabilityQualifierWithMigrationStatus b() {
        return this.f24399a;
    }

    public final Collection c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj;
        return Intrinsics.c(this.f24399a, javaDefaultQualifiers.f24399a) && Intrinsics.c(this.b, javaDefaultQualifiers.b) && this.c == javaDefaultQualifiers.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f24399a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.f24399a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        return b.s(sb, this.c, ')');
    }

    public JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection qualifierApplicabilityTypes, boolean z) {
        Intrinsics.h(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f24399a = nullabilityQualifierWithMigrationStatus;
        this.b = qualifierApplicabilityTypes;
        this.c = z;
    }
}
