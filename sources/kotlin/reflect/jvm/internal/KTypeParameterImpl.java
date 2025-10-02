package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class KTypeParameterImpl implements KTypeParameter, KClassifierImpl {
    public static final /* synthetic */ KProperty[] g = {Reflection.f24268a.h(new PropertyReference1Impl(KTypeParameterImpl.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0))};
    public final TypeParameterDescriptor d;
    public final ReflectProperties.LazySoftVal e = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KTypeParameterImpl$$Lambda$0
        public final KTypeParameterImpl d;

        {
            this.d = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List upperBounds = this.d.d.getUpperBounds();
            Intrinsics.g(upperBounds, "getUpperBounds(...)");
            List list = upperBounds;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new KTypeImpl((KotlinType) it.next(), null));
            }
            return arrayList;
        }
    });
    public final KTypeParameterOwnerImpl f;

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

    public KTypeParameterImpl(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, TypeParameterDescriptor typeParameterDescriptor) {
        Class cls;
        KClassImpl kClassImplB;
        Object objV;
        this.d = typeParameterDescriptor;
        if (kTypeParameterOwnerImpl == null) {
            DeclarationDescriptor declarationDescriptorE = typeParameterDescriptor.e();
            Intrinsics.g(declarationDescriptorE, "getContainingDeclaration(...)");
            if (declarationDescriptorE instanceof ClassDescriptor) {
                objV = b((ClassDescriptor) declarationDescriptorE);
            } else {
                if (!(declarationDescriptorE instanceof CallableMemberDescriptor)) {
                    throw new KotlinReflectionInternalError("Unknown type parameter container: " + declarationDescriptorE);
                }
                DeclarationDescriptor declarationDescriptorE2 = ((CallableMemberDescriptor) declarationDescriptorE).e();
                Intrinsics.g(declarationDescriptorE2, "getContainingDeclaration(...)");
                if (declarationDescriptorE2 instanceof ClassDescriptor) {
                    kClassImplB = b((ClassDescriptor) declarationDescriptorE2);
                } else {
                    DeserializedMemberDescriptor deserializedMemberDescriptor = declarationDescriptorE instanceof DeserializedMemberDescriptor ? (DeserializedMemberDescriptor) declarationDescriptorE : null;
                    if (deserializedMemberDescriptor == null) {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + declarationDescriptorE);
                    }
                    DeserializedContainerSource deserializedContainerSourceB0 = deserializedMemberDescriptor.b0();
                    JvmPackagePartSource jvmPackagePartSource = deserializedContainerSourceB0 instanceof JvmPackagePartSource ? (JvmPackagePartSource) deserializedContainerSourceB0 : null;
                    Object obj = jvmPackagePartSource != null ? jvmPackagePartSource.d : null;
                    ReflectKotlinClass reflectKotlinClass = obj instanceof ReflectKotlinClass ? (ReflectKotlinClass) obj : null;
                    if (reflectKotlinClass == null || (cls = reflectKotlinClass.f24366a) == null) {
                        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + deserializedMemberDescriptor);
                    }
                    kClassImplB = (KClassImpl) JvmClassMappingKt.e(cls);
                }
                objV = declarationDescriptorE.V(new CreateKCallableVisitor(kClassImplB), Unit.f24250a);
            }
            kTypeParameterOwnerImpl = (KTypeParameterOwnerImpl) objV;
        }
        this.f = kTypeParameterOwnerImpl;
    }

    public static KClassImpl b(ClassDescriptor classDescriptor) {
        Class clsK = UtilKt.k(classDescriptor);
        KClassImpl kClassImpl = (KClassImpl) (clsK != null ? JvmClassMappingKt.e(clsK) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + classDescriptor.e());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KTypeParameterImpl)) {
            return false;
        }
        KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) obj;
        return Intrinsics.c(this.f, kTypeParameterImpl.f) && getName().equals(kTypeParameterImpl.getName());
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    public final ClassifierDescriptor getDescriptor() {
        return this.d;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final String getName() {
        String strB = this.d.getName().b();
        Intrinsics.g(strB, "asString(...)");
        return strB;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final List getUpperBounds() {
        KProperty kProperty = g[0];
        Object objInvoke = this.e.invoke();
        Intrinsics.g(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.f.hashCode() * 31);
    }

    @Override // kotlin.reflect.KTypeParameter
    public final KVariance j() {
        int iOrdinal = this.d.j().ordinal();
        if (iOrdinal == 0) {
            return KVariance.d;
        }
        if (iOrdinal == 1) {
            return KVariance.e;
        }
        if (iOrdinal == 2) {
            return KVariance.f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return TypeParameterReference.Companion.a(this);
    }
}
