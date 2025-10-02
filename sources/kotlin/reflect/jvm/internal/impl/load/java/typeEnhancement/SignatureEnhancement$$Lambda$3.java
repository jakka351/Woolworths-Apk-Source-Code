package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes7.dex */
class SignatureEnhancement$$Lambda$3 implements Function1 {
    public static final SignatureEnhancement$$Lambda$3 d = new SignatureEnhancement$$Lambda$3();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnwrappedType it = (UnwrappedType) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(it instanceof RawType);
    }
}
