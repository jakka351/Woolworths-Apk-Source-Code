package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes7.dex */
public abstract class ReflectJavaType implements JavaType {

    public static final class Factory {
        public static ReflectJavaType a(Type type) {
            Intrinsics.h(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new ReflectJavaPrimitiveType(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new ReflectJavaArrayType(type) : type instanceof WildcardType ? new ReflectJavaWildcardType((WildcardType) type) : new ReflectJavaClassifierType(type);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation H(FqName fqName) {
        Object next;
        Intrinsics.h(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((JavaAnnotation) next).c().a(), fqName)) {
                break;
            }
        }
        return (JavaAnnotation) next;
    }

    public abstract Type I();

    public final boolean equals(Object obj) {
        return (obj instanceof ReflectJavaType) && Intrinsics.c(I(), ((ReflectJavaType) obj).I());
    }

    public final int hashCode() {
        return I().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + I();
    }
}
