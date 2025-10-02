package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectJavaClassifierType extends ReflectJavaType implements JavaClassifierType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f24382a;
    public final ReflectJavaElement b;

    public ReflectJavaClassifierType(Type reflectType) {
        ReflectJavaElement reflectJavaClass;
        Intrinsics.h(reflectType, "reflectType");
        this.f24382a = reflectType;
        if (reflectType instanceof Class) {
            reflectJavaClass = new ReflectJavaClass((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            reflectJavaClass = new ReflectJavaTypeParameter((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            Intrinsics.f(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            reflectJavaClass = new ReflectJavaClass((Class) rawType);
        }
        this.b = reflectJavaClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final JavaAnnotation H(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public final Type I() {
        return this.f24382a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public final JavaClassifier e() {
        return this.b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public final ArrayList k() {
        List listC = ReflectClassUtilKt.c(this.f24382a);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(ReflectJavaType.Factory.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public final String q() {
        return this.f24382a.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public final String r() {
        throw new UnsupportedOperationException("Type not found: " + this.f24382a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public final boolean x() {
        Type type = this.f24382a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            Intrinsics.g(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }
}
