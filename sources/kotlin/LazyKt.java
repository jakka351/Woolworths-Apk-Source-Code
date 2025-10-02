package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"kotlin/LazyKt__LazyJVMKt", "kotlin/LazyKt__LazyKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class LazyKt extends LazyKt__LazyKt {
    public static Lazy a(LazyThreadSafetyMode lazyThreadSafetyMode, Function0 initializer) {
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f24249a;
        Intrinsics.h(initializer, "initializer");
        int iOrdinal = lazyThreadSafetyMode.ordinal();
        if (iOrdinal == 0) {
            return new SynchronizedLazyImpl(initializer);
        }
        if (iOrdinal == 1) {
            SafePublicationLazyImpl safePublicationLazyImpl = new SafePublicationLazyImpl();
            safePublicationLazyImpl.d = initializer;
            safePublicationLazyImpl._value = uninitialized_value;
            return safePublicationLazyImpl;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        UnsafeLazyImpl unsafeLazyImpl = new UnsafeLazyImpl();
        unsafeLazyImpl.d = initializer;
        unsafeLazyImpl.e = uninitialized_value;
        return unsafeLazyImpl;
    }

    public static Lazy b(Function0 initializer) {
        Intrinsics.h(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer);
    }
}
