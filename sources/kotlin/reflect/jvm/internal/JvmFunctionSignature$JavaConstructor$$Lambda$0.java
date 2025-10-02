package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes7.dex */
class JvmFunctionSignature$JavaConstructor$$Lambda$0 implements Function1 {
    public static final JvmFunctionSignature$JavaConstructor$$Lambda$0 d = new JvmFunctionSignature$JavaConstructor$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class cls = (Class) obj;
        Intrinsics.e(cls);
        return ReflectClassUtilKt.b(cls);
    }
}
