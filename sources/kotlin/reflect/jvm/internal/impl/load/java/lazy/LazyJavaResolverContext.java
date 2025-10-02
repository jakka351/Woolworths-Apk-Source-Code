package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;

/* loaded from: classes.dex */
public final class LazyJavaResolverContext {

    /* renamed from: a, reason: collision with root package name */
    public final JavaResolverComponents f24425a;
    public final TypeParameterResolver b;
    public final Object c;
    public final JavaTypeResolver d;

    public LazyJavaResolverContext(JavaResolverComponents javaResolverComponents, TypeParameterResolver typeParameterResolver, Lazy lazy) {
        Intrinsics.h(typeParameterResolver, "typeParameterResolver");
        this.f24425a = javaResolverComponents;
        this.b = typeParameterResolver;
        this.c = lazy;
        this.d = new JavaTypeResolver(this, typeParameterResolver);
    }
}
