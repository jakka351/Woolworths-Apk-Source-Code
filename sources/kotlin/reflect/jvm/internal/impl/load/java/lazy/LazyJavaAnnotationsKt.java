package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;

/* loaded from: classes.dex */
public final class LazyJavaAnnotationsKt {
    public static final LazyJavaAnnotations a(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner annotationsOwner) {
        Intrinsics.h(lazyJavaResolverContext, "<this>");
        Intrinsics.h(annotationsOwner, "annotationsOwner");
        return new LazyJavaAnnotations(lazyJavaResolverContext, annotationsOwner, false);
    }
}
