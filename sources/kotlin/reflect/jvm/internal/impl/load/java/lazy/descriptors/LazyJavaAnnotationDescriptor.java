package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class LazyJavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {
    public static final /* synthetic */ KProperty[] i;

    /* renamed from: a, reason: collision with root package name */
    public final LazyJavaResolverContext f24431a;
    public final JavaAnnotation b;
    public final NullableLazyValue c;
    public final NotNullLazyValue d;
    public final JavaSourceElement e;
    public final NotNullLazyValue f;
    public final boolean g;
    public final boolean h;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        i = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(LazyJavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, reflectionFactory), c.t(LazyJavaAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, reflectionFactory)};
    }

    public LazyJavaAnnotationDescriptor(LazyJavaResolverContext c, JavaAnnotation javaAnnotation, boolean z) {
        Intrinsics.h(c, "c");
        Intrinsics.h(javaAnnotation, "javaAnnotation");
        this.f24431a = c;
        this.b = javaAnnotation;
        JavaResolverComponents javaResolverComponents = c.f24425a;
        StorageManager storageManager = javaResolverComponents.f24422a;
        this.c = storageManager.e(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$0
            public final LazyJavaAnnotationDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.d.b.c().a();
            }
        });
        this.d = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$1
            public final LazyJavaAnnotationDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = LazyJavaAnnotationDescriptor.i;
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.d;
                FqName fqNameD = lazyJavaAnnotationDescriptor.d();
                JavaAnnotation javaAnnotation2 = lazyJavaAnnotationDescriptor.b;
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaAnnotationDescriptor.f24431a;
                if (fqNameD == null) {
                    return ErrorUtils.c(ErrorTypeKind.H, javaAnnotation2.toString());
                }
                JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContext.f24425a;
                ModuleDescriptor moduleDescriptor = javaResolverComponents2.o;
                ClassDescriptor classDescriptorB = JavaToKotlinClassMapper.b(fqNameD, moduleDescriptor.p());
                if (classDescriptorB == null) {
                    classDescriptorB = javaResolverComponents2.k.a(javaAnnotation2.j());
                    if (classDescriptorB == null) {
                        classDescriptorB = FindClassInModuleKt.c(moduleDescriptor, ClassId.Companion.b(fqNameD), javaResolverComponents2.d.c().l);
                    }
                }
                return classDescriptorB.t();
            }
        });
        this.e = javaResolverComponents.j.a(javaAnnotation);
        this.f = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$2
            public final LazyJavaAnnotationDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.d;
                ArrayList<JavaAnnotationArgument> arrayListB = lazyJavaAnnotationDescriptor.b.b();
                ArrayList arrayList = new ArrayList();
                for (JavaAnnotationArgument javaAnnotationArgument : arrayListB) {
                    Name name = javaAnnotationArgument.getName();
                    if (name == null) {
                        name = JvmAnnotationNames.b;
                    }
                    ConstantValue constantValueC = lazyJavaAnnotationDescriptor.c(javaAnnotationArgument);
                    Pair pair = constantValueC != null ? new Pair(name, constantValueC) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return MapsKt.p(arrayList);
            }
        });
        this.g = false;
        this.h = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public final boolean a() {
        return this.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final Map b() {
        return (Map) StorageKt.a(this.f, i[2]);
    }

    public final ConstantValue c(JavaAnnotationArgument javaAnnotationArgument) {
        KotlinType kotlinTypeH;
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.c(((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null);
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return new EnumValue(javaEnumValueAnnotationArgument.c(), javaEnumValueAnnotationArgument.d());
        }
        boolean z = javaAnnotationArgument instanceof JavaArrayAnnotationArgument;
        LazyJavaResolverContext lazyJavaResolverContext = this.f24431a;
        if (z) {
            JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
            Name name = javaArrayAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.b;
            }
            Intrinsics.e(name);
            ArrayList elements = javaArrayAnnotationArgument.getElements();
            if (!KotlinTypeKt.a((SimpleType) StorageKt.a(this.d, i[1]))) {
                ClassDescriptor classDescriptorD = DescriptorUtilsKt.d(this);
                Intrinsics.e(classDescriptorD);
                ValueParameterDescriptor valueParameterDescriptorB = DescriptorResolverUtils.b(name, classDescriptorD);
                if (valueParameterDescriptorB == null || (kotlinTypeH = valueParameterDescriptorB.getType()) == null) {
                    KotlinBuiltIns kotlinBuiltInsP = lazyJavaResolverContext.f24425a.o.p();
                    Variance variance = Variance.f;
                    kotlinTypeH = kotlinBuiltInsP.h(ErrorUtils.c(ErrorTypeKind.G, new String[0]));
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.s(elements, 10));
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    ConstantValue constantValueC = c((JavaAnnotationArgument) it.next());
                    if (constantValueC == null) {
                        constantValueC = new NullValue(null);
                    }
                    arrayList.add(constantValueC);
                }
                return new TypedArrayValue(arrayList, kotlinTypeH);
            }
        } else {
            if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
                return new AnnotationValue((Object) new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, ((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).a(), false));
            }
            if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
                KotlinType kotlinTypeD = lazyJavaResolverContext.d.d(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).b(), JavaTypeAttributesKt.a(TypeUsage.e, false, null, 7));
                if (!KotlinTypeKt.a(kotlinTypeD)) {
                    KotlinType type = kotlinTypeD;
                    int i2 = 0;
                    while (KotlinBuiltIns.z(type)) {
                        type = ((TypeProjection) CollectionsKt.n0(type.H0())).getType();
                        Intrinsics.g(type, "getType(...)");
                        i2++;
                    }
                    ClassifierDescriptor classifierDescriptorC = type.J0().c();
                    if (classifierDescriptorC instanceof ClassDescriptor) {
                        ClassId classIdF = DescriptorUtilsKt.f(classifierDescriptorC);
                        return classIdF == null ? new KClassValue(new KClassValue.Value.LocalClass(kotlinTypeD)) : new KClassValue(classIdF, i2);
                    }
                    if (classifierDescriptorC instanceof TypeParameterDescriptor) {
                        return new KClassValue(ClassId.Companion.b(StandardNames.FqNames.f24314a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final FqName d() {
        KProperty p = i[0];
        NullableLazyValue nullableLazyValue = this.c;
        Intrinsics.h(nullableLazyValue, "<this>");
        Intrinsics.h(p, "p");
        return (FqName) nullableLazyValue.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final SourceElement g() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final KotlinType getType() {
        return (SimpleType) StorageKt.a(this.d, i[1]);
    }

    public final String toString() {
        return DescriptorRenderer.f24521a.q(this, null);
    }
}
