package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.constraintlayout.core.state.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation f24378a;

    public ReflectJavaAnnotation(Annotation annotation) {
        Intrinsics.h(annotation, "annotation");
        this.f24378a = annotation;
    }

    public final Annotation I() {
        return this.f24378a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public final ArrayList b() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Annotation annotation = this.f24378a;
        Method[] declaredMethods = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation)).getDeclaredMethods();
        Intrinsics.g(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            Intrinsics.g(objInvoke, "invoke(...)");
            arrayList.add(ReflectJavaAnnotationArgument.Factory.a(objInvoke, Name.e(method.getName())));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public final ClassId c() {
        return ReflectClassUtilKt.a(JvmClassMappingKt.b(JvmClassMappingKt.a(this.f24378a)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectJavaAnnotation) {
            return this.f24378a == ((ReflectJavaAnnotation) obj).f24378a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f24378a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public final ReflectJavaClass j() {
        return new ReflectJavaClass(JvmClassMappingKt.b(JvmClassMappingKt.a(this.f24378a)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a.x(ReflectJavaAnnotation.class, sb, ": ");
        sb.append(this.f24378a);
        return sb.toString();
    }
}
