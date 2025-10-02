package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

@SourceDebugExtension
/* loaded from: classes7.dex */
public class JavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {
    public static final /* synthetic */ KProperty[] f = {Reflection.f24268a.h(new PropertyReference1Impl(JavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final FqName f24415a;
    public final SourceElement b;
    public final NotNullLazyValue c;
    public final JavaAnnotationArgument d;
    public final boolean e;

    public JavaAnnotationDescriptor(final LazyJavaResolverContext c, JavaAnnotation javaAnnotation, FqName fqName) {
        Intrinsics.h(c, "c");
        JavaResolverComponents javaResolverComponents = c.f24425a;
        Intrinsics.h(fqName, "fqName");
        this.f24415a = fqName;
        this.b = javaAnnotation != null ? javaResolverComponents.j.a(javaAnnotation) : SourceElement.f24343a;
        this.c = javaResolverComponents.f24422a.d(new Function0(c, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$$Lambda$0
            public final LazyJavaResolverContext d;
            public final JavaAnnotationDescriptor e;

            {
                this.d = c;
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = JavaAnnotationDescriptor.f;
                SimpleType simpleTypeT = this.d.f24425a.o.p().j(this.e.f24415a).t();
                Intrinsics.g(simpleTypeT, "getDefaultType(...)");
                return simpleTypeT;
            }
        });
        this.d = javaAnnotation != null ? (JavaAnnotationArgument) CollectionsKt.E(javaAnnotation.b()) : null;
        this.e = false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public final boolean a() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map b() {
        return EmptyMap.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final FqName d() {
        return this.f24415a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final SourceElement g() {
        return this.b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final KotlinType getType() {
        return (SimpleType) StorageKt.a(this.c, f[0]);
    }
}
