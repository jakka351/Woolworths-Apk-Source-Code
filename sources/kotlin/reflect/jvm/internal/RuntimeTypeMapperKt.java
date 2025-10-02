package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RuntimeTypeMapperKt {
    public static final String a(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.g(parameterTypes, "getParameterTypes(...)");
        sb.append(ArraysKt.U(parameterTypes, "", "(", ")", RuntimeTypeMapperKt$$Lambda$0.d, 24));
        Class<?> returnType = method.getReturnType();
        Intrinsics.g(returnType, "getReturnType(...)");
        sb.append(ReflectClassUtilKt.b(returnType));
        return sb.toString();
    }
}
