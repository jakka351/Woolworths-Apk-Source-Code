package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes7.dex */
public final class StrictEqualityTypeChecker {
    public static boolean a(UnwrappedType a2, UnwrappedType b) {
        Intrinsics.h(a2, "a");
        Intrinsics.h(b, "b");
        return AbstractStrictEqualityTypeChecker.b(SimpleClassicTypeSystemContext.f24629a, a2, b);
    }
}
