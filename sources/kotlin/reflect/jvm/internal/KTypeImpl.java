package kotlin.reflect.jvm.internal;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/jvm/internal/KTypeBase;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class KTypeImpl implements KTypeBase {
    public static final /* synthetic */ KProperty[] h;
    public final KotlinType d;
    public final ReflectProperties.LazySoftVal e;
    public final ReflectProperties.LazySoftVal f;
    public final ReflectProperties.LazySoftVal g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Variance variance = Variance.f;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Variance variance2 = Variance.f;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(KTypeImpl.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        h = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(KTypeImpl.class, "arguments", "getArguments()Ljava/util/List;", 0, reflectionFactory)};
    }

    public KTypeImpl(KotlinType type, final Function0 function0) {
        Intrinsics.h(type, "type");
        this.d = type;
        ReflectProperties.LazySoftVal lazySoftVal = function0 instanceof ReflectProperties.LazySoftVal ? (ReflectProperties.LazySoftVal) function0 : null;
        this.e = lazySoftVal == null ? function0 != null ? ReflectProperties.a(null, function0) : null : lazySoftVal;
        this.f = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KTypeImpl$$Lambda$0
            public final KTypeImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KTypeImpl kTypeImpl = this.d;
                return kTypeImpl.h(kTypeImpl.d);
            }
        });
        this.g = ReflectProperties.a(null, new Function0(this, function0) { // from class: kotlin.reflect.jvm.internal.KTypeImpl$$Lambda$1
            public final KTypeImpl d;
            public final Function0 e;

            {
                this.d = this;
                this.e = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KTypeProjection kTypeProjectionA;
                final KTypeImpl kTypeImpl = this.d;
                List listH0 = kTypeImpl.d.H0();
                if (listH0.isEmpty()) {
                    return EmptyList.d;
                }
                final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.d, new Function0(kTypeImpl) { // from class: kotlin.reflect.jvm.internal.KTypeImpl$$Lambda$2
                    public final KTypeImpl d;

                    {
                        this.d = kTypeImpl;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        KProperty[] kPropertyArr = KTypeImpl.h;
                        Type typeD = this.d.d();
                        Intrinsics.e(typeD);
                        return ReflectClassUtilKt.c(typeD);
                    }
                });
                List list = listH0;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                final int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    TypeProjection typeProjection = (TypeProjection) obj;
                    if (typeProjection.a()) {
                        kTypeProjectionA = KTypeProjection.c;
                    } else {
                        KotlinType type2 = typeProjection.getType();
                        Intrinsics.g(type2, "getType(...)");
                        KTypeImpl kTypeImpl2 = new KTypeImpl(type2, this.e != null ? new Function0(kTypeImpl, i, lazyA) { // from class: kotlin.reflect.jvm.internal.KTypeImpl$$Lambda$3
                            public final KTypeImpl d;
                            public final int e;
                            public final Object f;

                            {
                                this.d = kTypeImpl;
                                this.e = i;
                                this.f = lazyA;
                            }

                            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                KProperty[] kPropertyArr = KTypeImpl.h;
                                KTypeImpl kTypeImpl3 = this.d;
                                Type typeD = kTypeImpl3.d();
                                if (typeD instanceof Class) {
                                    Class cls = (Class) typeD;
                                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                                    Intrinsics.e(componentType);
                                    return componentType;
                                }
                                boolean z = typeD instanceof GenericArrayType;
                                int i3 = this.e;
                                if (z) {
                                    if (i3 == 0) {
                                        Type genericComponentType = ((GenericArrayType) typeD).getGenericComponentType();
                                        Intrinsics.e(genericComponentType);
                                        return genericComponentType;
                                    }
                                    throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + kTypeImpl3);
                                }
                                if (!(typeD instanceof ParameterizedType)) {
                                    throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + kTypeImpl3);
                                }
                                Type type3 = (Type) ((List) this.f.getD()).get(i3);
                                if (!(type3 instanceof WildcardType)) {
                                    return type3;
                                }
                                WildcardType wildcardType = (WildcardType) type3;
                                Type[] lowerBounds = wildcardType.getLowerBounds();
                                Intrinsics.g(lowerBounds, "getLowerBounds(...)");
                                Type type4 = (Type) ArraysKt.H(lowerBounds);
                                if (type4 == null) {
                                    Type[] upperBounds = wildcardType.getUpperBounds();
                                    Intrinsics.g(upperBounds, "getUpperBounds(...)");
                                    type4 = (Type) ArraysKt.G(upperBounds);
                                }
                                Intrinsics.e(type4);
                                return type4;
                            }
                        } : null);
                        int iOrdinal = typeProjection.b().ordinal();
                        if (iOrdinal == 0) {
                            KTypeProjection kTypeProjection = KTypeProjection.c;
                            kTypeProjectionA = KTypeProjection.Companion.a(kTypeImpl2);
                        } else if (iOrdinal == 1) {
                            kTypeProjectionA = new KTypeProjection(KVariance.e, kTypeImpl2);
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            kTypeProjectionA = new KTypeProjection(KVariance.f, kTypeImpl2);
                        }
                    }
                    arrayList.add(kTypeProjectionA);
                    i = i2;
                }
                return arrayList;
            }
        });
    }

    @Override // kotlin.reflect.KType
    /* renamed from: b */
    public final List getE() {
        KProperty kProperty = h[1];
        Object objInvoke = this.g.invoke();
        Intrinsics.g(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.jvm.internal.KTypeBase
    public final Type d() {
        ReflectProperties.LazySoftVal lazySoftVal = this.e;
        if (lazySoftVal != null) {
            return (Type) lazySoftVal.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.KType
    /* renamed from: e */
    public final KClassifier getD() {
        KProperty kProperty = h[0];
        return (KClassifier) this.f.invoke();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KTypeImpl)) {
            return false;
        }
        KTypeImpl kTypeImpl = (KTypeImpl) obj;
        return Intrinsics.c(this.d, kTypeImpl.d) && Intrinsics.c(getD(), kTypeImpl.getD()) && getE().equals(kTypeImpl.getE());
    }

    public final KClassifier h(KotlinType kotlinType) {
        KotlinType type;
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        if (classifierDescriptorC instanceof ClassDescriptor) {
            Class clsK = UtilKt.k((ClassDescriptor) classifierDescriptorC);
            if (clsK != null) {
                if (!clsK.isArray()) {
                    if (TypeUtils.f(kotlinType)) {
                        return new KClassImpl(clsK);
                    }
                    Class cls = (Class) ReflectClassUtilKt.b.get(clsK);
                    if (cls != null) {
                        clsK = cls;
                    }
                    return new KClassImpl(clsK);
                }
                TypeProjection typeProjection = (TypeProjection) CollectionsKt.p0(kotlinType.H0());
                if (typeProjection == null || (type = typeProjection.getType()) == null) {
                    return new KClassImpl(clsK);
                }
                KClassifier kClassifierH = h(type);
                if (kClassifierH != null) {
                    return new KClassImpl(Array.newInstance((Class<?>) JvmClassMappingKt.b(KTypesJvm.a(kClassifierH)), 0).getClass());
                }
                throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
            }
        } else {
            if (classifierDescriptorC instanceof TypeParameterDescriptor) {
                return new KTypeParameterImpl(null, (TypeParameterDescriptor) classifierDescriptorC);
            }
            if (classifierDescriptorC instanceof TypeAliasDescriptor) {
                throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        KClassifier kClassifierE = getD();
        return getE().hashCode() + ((iHashCode + (kClassifierE != null ? kClassifierE.hashCode() : 0)) * 31);
    }

    /* renamed from: j, reason: from getter */
    public final KotlinType getD() {
        return this.d;
    }

    @Override // kotlin.reflect.KType
    public final boolean l() {
        return this.d.K0();
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f24292a;
        return ReflectionObjectRenderer.e(this.d);
    }
}
