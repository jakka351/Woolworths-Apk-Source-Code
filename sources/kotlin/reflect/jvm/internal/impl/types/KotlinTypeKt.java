package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* loaded from: classes7.dex */
public final class KotlinTypeKt {
    public static final boolean a(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        UnwrappedType unwrappedTypeM0 = kotlinType.M0();
        if (unwrappedTypeM0 instanceof ErrorType) {
            return true;
        }
        return (unwrappedTypeM0 instanceof FlexibleType) && (((FlexibleType) unwrappedTypeM0).Q0() instanceof ErrorType);
    }

    public static final boolean b(SimpleType simpleType) {
        return TypeUtils.f(simpleType);
    }
}
