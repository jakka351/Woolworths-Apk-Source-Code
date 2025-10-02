package curtains;

import curtains.internal.RootViewsSpy;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcurtains/Curtains;", "", "curtains_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class Curtains {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f23760a = LazyKt.a(LazyThreadSafetyMode.e, Curtains$rootViewsSpy$2.h);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final CopyOnWriteArrayList a() {
        return ((RootViewsSpy) f23760a.getD()).f23764a;
    }
}
