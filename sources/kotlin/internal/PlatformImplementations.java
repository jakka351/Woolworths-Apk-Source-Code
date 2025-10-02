package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "ReflectThrowable", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class PlatformImplementations {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public static final class ReflectThrowable {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f24257a;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.e(methods);
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (Intrinsics.c(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.g(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.c(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i++;
            }
            f24257a = method;
            int length2 = methods.length;
            for (int i2 = 0; i2 < length2 && !Intrinsics.c(methods[i2].getName(), "getSuppressed"); i2++) {
            }
        }
    }

    public void a(Throwable cause, Throwable exception) {
        Intrinsics.h(cause, "cause");
        Intrinsics.h(exception, "exception");
        Method method = ReflectThrowable.f24257a;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
