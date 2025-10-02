package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.constraintlayout.core.state.a;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes.dex */
public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {

    /* renamed from: a, reason: collision with root package name */
    public final FqName f24386a;

    public ReflectJavaPackage(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        this.f24386a = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public final void C(Function1 function1) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final JavaAnnotation H(FqName fqName) {
        Intrinsics.h(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public final FqName d() {
        return this.f24386a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectJavaPackage) {
            return Intrinsics.c(this.f24386a, ((ReflectJavaPackage) obj).f24386a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return EmptyList.d;
    }

    public final int hashCode() {
        return this.f24386a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a.x(ReflectJavaPackage.class, sb, ": ");
        sb.append(this.f24386a);
        return sb.toString();
    }
}
