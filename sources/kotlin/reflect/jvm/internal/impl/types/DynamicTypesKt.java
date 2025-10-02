package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DynamicTypesKt {
    public static final boolean a(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        return kotlinType.M0() instanceof DynamicType;
    }
}
