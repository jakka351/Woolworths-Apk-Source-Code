package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class JavaNullabilityAnnotationsStatus {
    public static final JavaNullabilityAnnotationsStatus d = new JavaNullabilityAnnotationsStatus(ReportLevel.g, 6);

    /* renamed from: a, reason: collision with root package name */
    public final ReportLevel f24403a;
    public final KotlinVersion b;
    public final ReportLevel c;

    public static final class Companion {
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2) {
        this.f24403a = reportLevel;
        this.b = kotlinVersion;
        this.c = reportLevel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.f24403a == javaNullabilityAnnotationsStatus.f24403a && Intrinsics.c(this.b, javaNullabilityAnnotationsStatus.b) && this.c == javaNullabilityAnnotationsStatus.c;
    }

    public final int hashCode() {
        int iHashCode = this.f24403a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.b;
        return this.c.hashCode() + ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.g)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f24403a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, int i) {
        this(reportLevel, (i & 2) != 0 ? new KotlinVersion(1, 0, 0) : null, reportLevel);
    }
}
