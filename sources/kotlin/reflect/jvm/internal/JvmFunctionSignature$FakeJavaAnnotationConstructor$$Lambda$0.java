package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes7.dex */
class JvmFunctionSignature$FakeJavaAnnotationConstructor$$Lambda$0 implements Function1 {
    public static final JvmFunctionSignature$FakeJavaAnnotationConstructor$$Lambda$0 d = new JvmFunctionSignature$FakeJavaAnnotationConstructor$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class<?> returnType = ((Method) obj).getReturnType();
        Intrinsics.g(returnType, "getReturnType(...)");
        return ReflectClassUtilKt.b(returnType);
    }
}
