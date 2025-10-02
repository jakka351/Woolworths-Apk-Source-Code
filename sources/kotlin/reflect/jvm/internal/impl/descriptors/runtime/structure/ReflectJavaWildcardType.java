package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final WildcardType f24391a;

    public ReflectJavaWildcardType(WildcardType reflectType) {
        Intrinsics.h(reflectType, "reflectType");
        this.f24391a = reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public final boolean F() {
        Intrinsics.g(this.f24391a.getUpperBounds(), "getUpperBounds(...)");
        return !Intrinsics.c(ArraysKt.H(r0), Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public final Type I() {
        return this.f24391a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public final ReflectJavaType w() {
        WildcardType wildcardType = this.f24391a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objD0 = ArraysKt.d0(lowerBounds);
            Intrinsics.g(objD0, "single(...)");
            return ReflectJavaType.Factory.a((Type) objD0);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type = (Type) ArraysKt.d0(upperBounds);
        if (Intrinsics.c(type, Object.class)) {
            return null;
        }
        Intrinsics.e(type);
        return ReflectJavaType.Factory.a(type);
    }
}
