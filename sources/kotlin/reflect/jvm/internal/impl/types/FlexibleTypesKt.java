package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlexibleTypesKt {
    public static final FlexibleType a(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        return (FlexibleType) kotlinType.M0();
    }

    public static final boolean b(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        return kotlinType.M0() instanceof FlexibleType;
    }

    public static final SimpleType c(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        UnwrappedType unwrappedTypeM0 = kotlinType.M0();
        if (unwrappedTypeM0 instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeM0).e;
        }
        if (unwrappedTypeM0 instanceof SimpleType) {
            return (SimpleType) unwrappedTypeM0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SimpleType d(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        UnwrappedType unwrappedTypeM0 = kotlinType.M0();
        if (unwrappedTypeM0 instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeM0).f;
        }
        if (unwrappedTypeM0 instanceof SimpleType) {
            return (SimpleType) unwrappedTypeM0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
