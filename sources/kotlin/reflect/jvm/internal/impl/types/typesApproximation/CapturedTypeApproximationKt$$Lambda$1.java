package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes7.dex */
class CapturedTypeApproximationKt$$Lambda$1 implements Function1 {
    public static final CapturedTypeApproximationKt$$Lambda$1 d = new CapturedTypeApproximationKt$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnwrappedType unwrappedType = (UnwrappedType) obj;
        Intrinsics.e(unwrappedType);
        return Boolean.valueOf(unwrappedType.J0() instanceof CapturedTypeConstructor);
    }
}
