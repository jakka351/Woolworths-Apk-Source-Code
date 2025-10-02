package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* loaded from: classes7.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* renamed from: a, reason: collision with root package name */
    public final LazyJavaResolverContext f24426a;
    public final DeclarationDescriptorNonRoot b;
    public final int c;
    public final LinkedHashMap d;
    public final MemoizedFunctionToNullable e;

    public LazyJavaTypeParameterResolver(LazyJavaResolverContext c, DeclarationDescriptorNonRoot declarationDescriptorNonRoot, JavaTypeParameterListOwner typeParameterOwner, int i) {
        Intrinsics.h(c, "c");
        Intrinsics.h(typeParameterOwner, "typeParameterOwner");
        this.f24426a = c;
        this.b = declarationDescriptorNonRoot;
        this.c = i;
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.d = linkedHashMap;
        this.e = this.f24426a.f24425a.f24422a.b(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver$$Lambda$0
            public final LazyJavaTypeParameterResolver d;

            {
                this.d = this;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                JavaTypeParameter typeParameter = (JavaTypeParameter) obj;
                Intrinsics.h(typeParameter, "typeParameter");
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = this.d;
                LinkedHashMap linkedHashMap2 = lazyJavaTypeParameterResolver.d;
                DeclarationDescriptorNonRoot declarationDescriptorNonRoot2 = lazyJavaTypeParameterResolver.b;
                Integer num = (Integer) linkedHashMap2.get(typeParameter);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaTypeParameterResolver.f24426a;
                Intrinsics.h(lazyJavaResolverContext, "<this>");
                return new LazyJavaTypeParameterDescriptor(ContextKt.b(new LazyJavaResolverContext(lazyJavaResolverContext.f24425a, lazyJavaTypeParameterResolver, lazyJavaResolverContext.c), declarationDescriptorNonRoot2.getAnnotations()), typeParameter, lazyJavaTypeParameterResolver.c + iIntValue, declarationDescriptorNonRoot2);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    public final TypeParameterDescriptor a(JavaTypeParameter javaTypeParameter) {
        Intrinsics.h(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = (LazyJavaTypeParameterDescriptor) this.e.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptor != null ? lazyJavaTypeParameterDescriptor : this.f24426a.b.a(javaTypeParameter);
    }
}
