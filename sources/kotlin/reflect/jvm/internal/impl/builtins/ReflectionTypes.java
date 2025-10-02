package kotlin.reflect.jvm.internal.impl.builtins;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class ReflectionTypes {
    public static final Companion d;
    public static final /* synthetic */ KProperty[] e;

    /* renamed from: a, reason: collision with root package name */
    public final NotFoundClasses f24312a;
    public final Object b;
    public final ClassLookup c = new ClassLookup();

    public static final class ClassLookup {
    }

    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ReflectionTypes.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        e = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(ReflectionTypes.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, reflectionFactory), c.t(ReflectionTypes.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, reflectionFactory), c.t(ReflectionTypes.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, reflectionFactory), c.t(ReflectionTypes.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, reflectionFactory), c.t(ReflectionTypes.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, reflectionFactory), c.t(ReflectionTypes.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, reflectionFactory), c.t(ReflectionTypes.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, reflectionFactory)};
        d = new Companion();
    }

    public ReflectionTypes(final ModuleDescriptorImpl moduleDescriptorImpl, NotFoundClasses notFoundClasses) {
        this.f24312a = notFoundClasses;
        this.b = LazyKt.a(LazyThreadSafetyMode.d, new Function0(moduleDescriptorImpl) { // from class: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$$Lambda$0
            public final ModuleDescriptorImpl d;

            {
                this.d = moduleDescriptorImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReflectionTypes.Companion companion = ReflectionTypes.d;
                return this.d.L(StandardNames.i).s();
            }
        });
    }
}
