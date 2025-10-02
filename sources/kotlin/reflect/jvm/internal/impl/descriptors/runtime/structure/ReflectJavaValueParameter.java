package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.constraintlayout.core.state.a;
import java.lang.annotation.Annotation;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {

    /* renamed from: a, reason: collision with root package name */
    public final ReflectJavaType f24390a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public ReflectJavaValueParameter(ReflectJavaType reflectJavaType, Annotation[] reflectAnnotations, String str, boolean z) {
        Intrinsics.h(reflectAnnotations, "reflectAnnotations");
        this.f24390a = reflectJavaType;
        this.b = reflectAnnotations;
        this.c = str;
        this.d = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final JavaAnnotation H(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        return ReflectJavaAnnotationOwnerKt.a(this.b, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public final boolean g() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.b(this.b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public final Name getName() {
        String str = this.c;
        if (str != null) {
            return Name.d(str);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public final JavaType getType() {
        return this.f24390a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a.x(ReflectJavaValueParameter.class, sb, ": ");
        sb.append(this.d ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(this.f24390a);
        return sb.toString();
    }
}
