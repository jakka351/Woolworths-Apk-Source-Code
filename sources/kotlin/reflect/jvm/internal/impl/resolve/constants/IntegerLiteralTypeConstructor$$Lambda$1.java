package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
class IntegerLiteralTypeConstructor$$Lambda$1 implements Function1 {
    public static final IntegerLiteralTypeConstructor$$Lambda$1 d = new IntegerLiteralTypeConstructor$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType it = (KotlinType) obj;
        Intrinsics.h(it, "it");
        return it.toString();
    }
}
