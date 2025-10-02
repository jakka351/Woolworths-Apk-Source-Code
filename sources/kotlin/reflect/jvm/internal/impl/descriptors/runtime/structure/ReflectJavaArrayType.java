package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;

/* loaded from: classes7.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f24380a;
    public final ReflectJavaType b;
    public final EmptyList c;

    public ReflectJavaArrayType(Type reflectType) {
        ReflectJavaType reflectJavaTypeA;
        Intrinsics.h(reflectType, "reflectType");
        this.f24380a = reflectType;
        if (!(reflectType instanceof GenericArrayType)) {
            if (reflectType instanceof Class) {
                Class cls = (Class) reflectType;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    Intrinsics.g(componentType, "getComponentType(...)");
                    reflectJavaTypeA = ReflectJavaType.Factory.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + reflectType.getClass() + "): " + reflectType);
        }
        Type genericComponentType = ((GenericArrayType) reflectType).getGenericComponentType();
        Intrinsics.g(genericComponentType, "getGenericComponentType(...)");
        reflectJavaTypeA = ReflectJavaType.Factory.a(genericComponentType);
        this.b = reflectJavaTypeA;
        this.c = EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    public final ReflectJavaType A() {
        return this.b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public final Type I() {
        return this.f24380a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        return this.c;
    }
}
