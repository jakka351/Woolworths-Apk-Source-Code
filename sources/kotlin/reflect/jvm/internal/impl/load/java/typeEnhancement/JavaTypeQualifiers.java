package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import androidx.camera.core.impl.b;

/* loaded from: classes7.dex */
public final class JavaTypeQualifiers {
    public static final JavaTypeQualifiers e = new JavaTypeQualifiers(null, false);

    /* renamed from: a, reason: collision with root package name */
    public final NullabilityQualifier f24446a;
    public final MutabilityQualifier b;
    public final boolean c;
    public final boolean d;

    public static final class Companion {
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.f24446a = nullabilityQualifier;
        this.b = mutabilityQualifier;
        this.c = z;
        this.d = z2;
    }

    public final boolean a() {
        return this.c;
    }

    public final NullabilityQualifier b() {
        return this.f24446a;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaTypeQualifiers)) {
            return false;
        }
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) obj;
        return this.f24446a == javaTypeQualifiers.f24446a && this.b == javaTypeQualifiers.b && this.c == javaTypeQualifiers.c && this.d == javaTypeQualifiers.d;
    }

    public final int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f24446a;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.b;
        return Boolean.hashCode(this.d) + b.e((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.f24446a);
        sb.append(", mutability=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        sb.append(this.c);
        sb.append(", isNullabilityQualifierForWarning=");
        return b.s(sb, this.d, ')');
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, boolean z) {
        this(nullabilityQualifier, null, z, false);
    }
}
