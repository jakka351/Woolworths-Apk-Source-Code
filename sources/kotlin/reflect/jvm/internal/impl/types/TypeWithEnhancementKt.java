package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypeWithEnhancementKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final KotlinType a(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        if (kotlinType instanceof TypeWithEnhancement) {
            return ((TypeWithEnhancement) kotlinType).n0();
        }
        return null;
    }

    public static final UnwrappedType b(UnwrappedType unwrappedType, KotlinType origin) {
        Intrinsics.h(unwrappedType, "<this>");
        Intrinsics.h(origin, "origin");
        return d(unwrappedType, a(origin));
    }

    public static final UnwrappedType c(UnwrappedType unwrappedType, UnwrappedType origin, Function1 function1) {
        Intrinsics.h(origin, "origin");
        KotlinType kotlinTypeA = a(origin);
        return d(unwrappedType, kotlinTypeA != null ? (KotlinType) function1.invoke(kotlinTypeA) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UnwrappedType d(UnwrappedType unwrappedType, KotlinType kotlinType) {
        Intrinsics.h(unwrappedType, "<this>");
        if (unwrappedType instanceof TypeWithEnhancement) {
            return d(((TypeWithEnhancement) unwrappedType).getOrigin(), kotlinType);
        }
        if (kotlinType == null || kotlinType.equals(unwrappedType)) {
            return unwrappedType;
        }
        if (unwrappedType instanceof SimpleType) {
            return new SimpleTypeWithEnhancement((SimpleType) unwrappedType, kotlinType);
        }
        if (unwrappedType instanceof FlexibleType) {
            return new FlexibleTypeWithEnhancement((FlexibleType) unwrappedType, kotlinType);
        }
        throw new NoWhenBranchMatchedException();
    }
}
