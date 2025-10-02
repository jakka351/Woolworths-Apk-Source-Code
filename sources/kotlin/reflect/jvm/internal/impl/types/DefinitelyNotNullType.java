package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerStateKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;

/* loaded from: classes7.dex */
public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeParameter, DefinitelyNotNullTypeMarker {
    public final SimpleType e;
    public final boolean f;

    public static final class Companion {
        public static DefinitelyNotNullType a(UnwrappedType type, boolean z) {
            boolean zF;
            Intrinsics.h(type, "type");
            if (type instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) type;
            }
            if (!(type.J0() instanceof NewTypeVariableConstructor) && !(type.J0().c() instanceof TypeParameterDescriptor) && !(type instanceof NewCapturedType) && !(type instanceof StubTypeForBuilderInference)) {
                zF = false;
            } else if (type instanceof StubTypeForBuilderInference) {
                zF = TypeUtils.f(type);
            } else {
                ClassifierDescriptor classifierDescriptorC = type.J0().c();
                TypeParameterDescriptorImpl typeParameterDescriptorImpl = classifierDescriptorC instanceof TypeParameterDescriptorImpl ? (TypeParameterDescriptorImpl) classifierDescriptorC : null;
                zF = (typeParameterDescriptorImpl == null || typeParameterDescriptorImpl.o) ? (z && (type.J0().c() instanceof TypeParameterDescriptor)) ? TypeUtils.f(type) : !AbstractNullabilityChecker.a(ClassicTypeCheckerStateKt.a(false, SimpleClassicTypeSystemContext.f24629a, null, 24), FlexibleTypesKt.c(type), TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f24612a) : true;
            }
            if (!zF) {
                return null;
            }
            if (type instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) type;
                Intrinsics.c(flexibleType.e.J0(), flexibleType.f.J0());
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.c(type).N0(false), z);
        }
    }

    public DefinitelyNotNullType(SimpleType simpleType, boolean z) {
        this.e = simpleType;
        this.f = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final boolean E0() {
        SimpleType simpleType = this.e;
        return (simpleType.J0() instanceof NewTypeVariableConstructor) || (simpleType.J0().c() instanceof TypeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean K0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: Q0 */
    public final SimpleType N0(boolean z) {
        return z ? this.e.N0(z) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: R0 */
    public final SimpleType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return new DefinitelyNotNullType(this.e.P0(newAttributes), this.f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType S0() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType U0(SimpleType simpleType) {
        return new DefinitelyNotNullType(simpleType, this.f);
    }

    public final SimpleType V0() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final UnwrappedType o0(KotlinType replacement) {
        Intrinsics.h(replacement, "replacement");
        return SpecialTypesKt.b(replacement.M0(), this.f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final String toString() {
        return this.e + " & Any";
    }
}
