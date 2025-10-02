package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.constraintlayout.core.state.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectJavaTypeParameter extends ReflectJavaElement implements ReflectJavaAnnotationOwner, JavaTypeParameter {

    /* renamed from: a, reason: collision with root package name */
    public final TypeVariable f24389a;

    public ReflectJavaTypeParameter(TypeVariable typeVariable) {
        Intrinsics.h(typeVariable, "typeVariable");
        this.f24389a = typeVariable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final JavaAnnotation H(FqName fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.h(fqName, "fqName");
        TypeVariable typeVariable = this.f24389a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.a(declaredAnnotations, fqName);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectJavaTypeParameter) {
            return Intrinsics.c(this.f24389a, ((ReflectJavaTypeParameter) obj).f24389a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f24389a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? EmptyList.d : ReflectJavaAnnotationOwnerKt.b(declaredAnnotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public final Name getName() {
        return Name.e(this.f24389a.getName());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter
    public final Collection getUpperBounds() {
        Type[] bounds = this.f24389a.getBounds();
        Intrinsics.g(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new ReflectJavaClassifierType(type));
        }
        ReflectJavaClassifierType reflectJavaClassifierType = (ReflectJavaClassifierType) CollectionsKt.p0(arrayList);
        RandomAccess randomAccess = arrayList;
        if (Intrinsics.c(reflectJavaClassifierType != null ? reflectJavaClassifierType.f24382a : null, Object.class)) {
            randomAccess = EmptyList.d;
        }
        return (Collection) randomAccess;
    }

    public final int hashCode() {
        return this.f24389a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a.x(ReflectJavaTypeParameter.class, sb, ": ");
        sb.append(this.f24389a);
        return sb.toString();
    }
}
