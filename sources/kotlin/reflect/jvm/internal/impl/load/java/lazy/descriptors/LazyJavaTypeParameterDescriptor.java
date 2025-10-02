package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    public final LazyJavaResolverContext n;
    public final JavaTypeParameter o;

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyJavaTypeParameterDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaTypeParameter javaTypeParameter, int i, DeclarationDescriptorNonRoot declarationDescriptorNonRoot) {
        Intrinsics.h(javaTypeParameter, "javaTypeParameter");
        JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f24425a;
        super(javaResolverComponents.f24422a, declarationDescriptorNonRoot, new LazyJavaAnnotations(lazyJavaResolverContext, javaTypeParameter, false), javaTypeParameter.getName(), Variance.f, false, i, javaResolverComponents.m);
        this.n = lazyJavaResolverContext;
        this.o = javaTypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final List H0(List list) {
        LazyJavaResolverContext lazyJavaResolverContext = this.n;
        return lazyJavaResolverContext.f24425a.r.e(this, list, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final void I0(KotlinType type) {
        Intrinsics.h(type, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final List J0() {
        Collection upperBounds = this.o.getUpperBounds();
        boolean zIsEmpty = upperBounds.isEmpty();
        LazyJavaResolverContext lazyJavaResolverContext = this.n;
        if (zIsEmpty) {
            SimpleType simpleTypeE = lazyJavaResolverContext.f24425a.o.p().e();
            Intrinsics.g(simpleTypeE, "getAnyType(...)");
            return CollectionsKt.Q(KotlinTypeFactory.a(simpleTypeE, lazyJavaResolverContext.f24425a.o.p().p()));
        }
        Collection collection = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaResolverContext.d.d((JavaClassifierType) it.next(), JavaTypeAttributesKt.a(TypeUsage.e, false, this, 3)));
        }
        return arrayList;
    }
}
