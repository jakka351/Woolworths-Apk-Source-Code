package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;

/* loaded from: classes.dex */
public final class SingleModuleClassResolver implements ModuleClassResolver {

    /* renamed from: a, reason: collision with root package name */
    public JavaDescriptorResolver f24427a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver
    public final ClassDescriptor a(JavaClass javaClass) {
        JavaDescriptorResolver javaDescriptorResolver = this.f24427a;
        if (javaDescriptorResolver != null) {
            return javaDescriptorResolver.a(javaClass);
        }
        Intrinsics.p("resolver");
        throw null;
    }
}
