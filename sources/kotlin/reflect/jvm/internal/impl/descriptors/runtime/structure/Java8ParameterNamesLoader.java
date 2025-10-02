package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
final class Java8ParameterNamesLoader {

    /* renamed from: a, reason: collision with root package name */
    public static final Java8ParameterNamesLoader f24375a = new Java8ParameterNamesLoader();
    public static Cache b;

    public static final class Cache {

        /* renamed from: a, reason: collision with root package name */
        public final Method f24376a;
        public final Method b;

        public Cache(Method method, Method method2) {
            this.f24376a = method;
            this.b = method2;
        }
    }
}
