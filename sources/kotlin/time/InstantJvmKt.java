package kotlin.time;

import kotlin.Metadata;
import kotlin.internal.jdk8.JDK8PlatformImplementations;
import kotlin.internal.jdk8.JDK8PlatformImplementations$getSystemClock$1;
import kotlin.internal.jdk8.JDK8PlatformImplementations$getSystemClock$2;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstantJvmKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Clock f24682a;

    static {
        f24682a = JDK8PlatformImplementations.b(26) ? new JDK8PlatformImplementations$getSystemClock$1() : new JDK8PlatformImplementations$getSystemClock$2();
    }
}
