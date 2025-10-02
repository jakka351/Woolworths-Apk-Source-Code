package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final /* synthetic */ class ReflectJavaClass$methods$2 extends FunctionReferenceImpl implements Function1<Method, ReflectJavaMethod> {
    public static final ReflectJavaClass$methods$2 d = new ReflectJavaClass$methods$2(1, ReflectJavaMethod.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Method p0 = (Method) obj;
        Intrinsics.h(p0, "p0");
        return new ReflectJavaMethod(p0);
    }
}
