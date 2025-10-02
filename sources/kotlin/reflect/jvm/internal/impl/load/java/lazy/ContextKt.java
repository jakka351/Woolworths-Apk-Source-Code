package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;

/* loaded from: classes.dex */
public final class ContextKt {
    public static LazyJavaResolverContext a(final LazyJavaResolverContext lazyJavaResolverContext, final ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaClass javaClass, int i) {
        if ((i & 2) != 0) {
            javaClass = null;
        }
        Intrinsics.h(lazyJavaResolverContext, "<this>");
        return new LazyJavaResolverContext(lazyJavaResolverContext.f24425a, javaClass != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaClass, 0) : lazyJavaResolverContext.b, LazyKt.a(LazyThreadSafetyMode.e, new Function0(lazyJavaResolverContext, classOrPackageFragmentDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$$Lambda$0
            public final LazyJavaResolverContext d;
            public final ClassOrPackageFragmentDescriptor e;

            {
                this.d = lazyJavaResolverContext;
                this.e = classOrPackageFragmentDescriptor;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Annotations additionalAnnotations = this.e.getAnnotations();
                LazyJavaResolverContext lazyJavaResolverContext2 = this.d;
                Intrinsics.h(lazyJavaResolverContext2, "<this>");
                Intrinsics.h(additionalAnnotations, "additionalAnnotations");
                return lazyJavaResolverContext2.f24425a.q.b((JavaTypeQualifiersByElementType) lazyJavaResolverContext2.c.getD(), additionalAnnotations);
            }
        }));
    }

    public static final LazyJavaResolverContext b(final LazyJavaResolverContext lazyJavaResolverContext, final Annotations additionalAnnotations) {
        Intrinsics.h(lazyJavaResolverContext, "<this>");
        Intrinsics.h(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.f24425a, lazyJavaResolverContext.b, LazyKt.a(LazyThreadSafetyMode.e, new Function0(lazyJavaResolverContext, additionalAnnotations) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$$Lambda$1
            public final LazyJavaResolverContext d;
            public final Annotations e;

            {
                this.d = lazyJavaResolverContext;
                this.e = additionalAnnotations;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaResolverContext lazyJavaResolverContext2 = this.d;
                Intrinsics.h(lazyJavaResolverContext2, "<this>");
                Annotations additionalAnnotations2 = this.e;
                Intrinsics.h(additionalAnnotations2, "additionalAnnotations");
                return lazyJavaResolverContext2.f24425a.q.b((JavaTypeQualifiersByElementType) lazyJavaResolverContext2.c.getD(), additionalAnnotations2);
            }
        }));
    }
}
