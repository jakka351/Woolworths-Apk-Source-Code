package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* loaded from: classes7.dex */
public final class JavaTypeAttributes extends ErasureTypeAttributes {
    public final TypeUsage d;
    public final JavaTypeFlexibility e;
    public final boolean f;
    public final boolean g;
    public final Set h;
    public final SimpleType i;

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, boolean z, boolean z2, Set set, int i) {
        this(typeUsage, JavaTypeFlexibility.d, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    public static JavaTypeAttributes e(JavaTypeAttributes javaTypeAttributes, JavaTypeFlexibility javaTypeFlexibility, boolean z, Set set, SimpleType simpleType, int i) {
        TypeUsage howThisTypeIsUsed = javaTypeAttributes.d;
        if ((i & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.e;
        }
        JavaTypeFlexibility flexibility = javaTypeFlexibility;
        if ((i & 4) != 0) {
            z = javaTypeAttributes.f;
        }
        boolean z2 = z;
        boolean z3 = javaTypeAttributes.g;
        if ((i & 16) != 0) {
            set = javaTypeAttributes.h;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            simpleType = javaTypeAttributes.i;
        }
        Intrinsics.h(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.h(flexibility, "flexibility");
        return new JavaTypeAttributes(howThisTypeIsUsed, flexibility, z2, z3, set2, simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final SimpleType a() {
        return this.i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final TypeUsage b() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final Set c() {
        return this.h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final ErasureTypeAttributes d(TypeParameterDescriptor typeParameterDescriptor) {
        Set set = this.h;
        return e(this, null, false, set != null ? SetsKt.h(set, typeParameterDescriptor) : SetsKt.i(typeParameterDescriptor), null, 47);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final boolean equals(Object obj) {
        if (!(obj instanceof JavaTypeAttributes)) {
            return false;
        }
        JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
        return Intrinsics.c(javaTypeAttributes.i, this.i) && javaTypeAttributes.d == this.d && javaTypeAttributes.e == this.e && javaTypeAttributes.f == this.f && javaTypeAttributes.g == this.g;
    }

    public final JavaTypeFlexibility f() {
        return this.e;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final int hashCode() {
        SimpleType simpleType = this.i;
        int iHashCode = simpleType != null ? simpleType.hashCode() : 0;
        int iHashCode2 = this.d.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.e.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.f ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.g ? 1 : 0) + i;
    }

    public final JavaTypeAttributes i(boolean z) {
        return e(this, null, z, null, null, 59);
    }

    public final JavaTypeAttributes j(JavaTypeFlexibility javaTypeFlexibility) {
        return e(this, javaTypeFlexibility, false, null, null, 61);
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.d + ", flexibility=" + this.e + ", isRaw=" + this.f + ", isForAnnotationParameter=" + this.g + ", visitedTypeParameters=" + this.h + ", defaultType=" + this.i + ')';
    }

    public JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, SimpleType simpleType) {
        super(typeUsage, set, simpleType);
        this.d = typeUsage;
        this.e = javaTypeFlexibility;
        this.f = z;
        this.g = z2;
        this.h = set;
        this.i = simpleType;
    }
}
