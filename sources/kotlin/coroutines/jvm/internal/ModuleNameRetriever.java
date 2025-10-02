package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "Cache", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ModuleNameRetriever {

    /* renamed from: a, reason: collision with root package name */
    public static final Cache f24255a = new Cache(null, null, null);
    public static Cache b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cache {

        /* renamed from: a, reason: collision with root package name */
        public final Method f24256a;
        public final Method b;
        public final Method c;

        public Cache(Method method, Method method2, Method method3) {
            this.f24256a = method;
            this.b = method2;
            this.c = method3;
        }
    }
}
