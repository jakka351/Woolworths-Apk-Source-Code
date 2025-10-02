package kotlin.internal.jdk7;

import kotlin.Metadata;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "ReflectSdkVersion", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class JDK7PlatformImplementations extends PlatformImplementations {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion;", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public static final class ReflectSdkVersion {

        /* renamed from: a, reason: collision with root package name */
        public static final Integer f24259a;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f24259a = num;
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    public final void a(Throwable cause, Throwable exception) {
        Intrinsics.h(cause, "cause");
        Intrinsics.h(exception, "exception");
        Integer num = ReflectSdkVersion.f24259a;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
