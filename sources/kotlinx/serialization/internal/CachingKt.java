package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CachingKt {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f24783a;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        f24783a = z;
    }

    public static final SerializerCache a(Function1 function1) {
        return f24783a ? new ClassValueCache(function1) : new ConcurrentHashMapCache(function1);
    }

    public static final ParametrizedSerializerCache b(Function2 function2) {
        return f24783a ? new ClassValueParametrizedCache(function2) : new ConcurrentHashMapParametrizedCache(function2);
    }
}
