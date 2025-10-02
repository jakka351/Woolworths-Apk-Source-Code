package androidx.window.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WindowInfoTracker {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f3887a = Companion.f3888a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f3888a = new Companion();
        public static final WindowInfoTrackerDecorator b;

        static {
            Reflection.f24268a.b(WindowInfoTracker.class).B();
            b = EmptyDecorator.f3872a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.window.layout.WindowInfoTrackerImpl a(android.content.Context r6) {
        /*
            androidx.window.layout.WindowInfoTracker$Companion r0 = androidx.window.layout.WindowInfoTracker.f3887a
            r0.getClass()
            androidx.window.layout.WindowInfoTrackerImpl r0 = new androidx.window.layout.WindowInfoTrackerImpl
            r1 = 0
            androidx.window.extensions.layout.WindowLayoutComponent r2 = androidx.window.layout.SafeWindowLayoutComponentProvider.a()     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto Lf
            goto L15
        Lf:
            androidx.window.layout.ExtensionWindowLayoutInfoBackend r3 = new androidx.window.layout.ExtensionWindowLayoutInfoBackend     // Catch: java.lang.Throwable -> L15
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r3 = r1
        L16:
            if (r3 != 0) goto L77
            androidx.window.layout.SidecarWindowBackend r2 = androidx.window.layout.SidecarWindowBackend.c
            androidx.window.layout.SidecarWindowBackend r2 = androidx.window.layout.SidecarWindowBackend.c
            if (r2 != 0) goto L72
            java.util.concurrent.locks.ReentrantLock r2 = androidx.window.layout.SidecarWindowBackend.d
            r2.lock()
            androidx.window.layout.SidecarWindowBackend r3 = androidx.window.layout.SidecarWindowBackend.c     // Catch: java.lang.Throwable -> L68
            if (r3 != 0) goto L6a
            androidx.window.core.Version r3 = androidx.window.layout.SidecarCompat.Companion.c()     // Catch: java.lang.Throwable -> L60
            if (r3 != 0) goto L2e
            goto L60
        L2e:
            androidx.window.core.Version r4 = androidx.window.core.Version.i     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "other"
            kotlin.jvm.internal.Intrinsics.h(r4, r5)     // Catch: java.lang.Throwable -> L60
            kotlin.Lazy r3 = r3.h     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = r3.getD()     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "<get-bigInteger>(...)"
            kotlin.jvm.internal.Intrinsics.g(r3, r5)     // Catch: java.lang.Throwable -> L60
            java.math.BigInteger r3 = (java.math.BigInteger) r3     // Catch: java.lang.Throwable -> L60
            kotlin.Lazy r4 = r4.h     // Catch: java.lang.Throwable -> L60
            java.lang.Object r4 = r4.getD()     // Catch: java.lang.Throwable -> L60
            kotlin.jvm.internal.Intrinsics.g(r4, r5)     // Catch: java.lang.Throwable -> L60
            java.math.BigInteger r4 = (java.math.BigInteger) r4     // Catch: java.lang.Throwable -> L60
            int r3 = r3.compareTo(r4)     // Catch: java.lang.Throwable -> L60
            if (r3 < 0) goto L60
            androidx.window.layout.SidecarCompat r3 = new androidx.window.layout.SidecarCompat     // Catch: java.lang.Throwable -> L60
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L60
            boolean r6 = r3.f()     // Catch: java.lang.Throwable -> L60
            if (r6 != 0) goto L5f
            goto L60
        L5f:
            r1 = r3
        L60:
            androidx.window.layout.SidecarWindowBackend r6 = new androidx.window.layout.SidecarWindowBackend     // Catch: java.lang.Throwable -> L68
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L68
            androidx.window.layout.SidecarWindowBackend.c = r6     // Catch: java.lang.Throwable -> L68
            goto L6a
        L68:
            r6 = move-exception
            goto L6e
        L6a:
            r2.unlock()
            goto L72
        L6e:
            r2.unlock()
            throw r6
        L72:
            androidx.window.layout.SidecarWindowBackend r3 = androidx.window.layout.SidecarWindowBackend.c
            kotlin.jvm.internal.Intrinsics.e(r3)
        L77:
            r0.<init>(r3)
            androidx.window.layout.WindowInfoTrackerDecorator r6 = androidx.window.layout.WindowInfoTracker.Companion.b
            androidx.window.layout.EmptyDecorator r6 = (androidx.window.layout.EmptyDecorator) r6
            r6.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTracker.a(android.content.Context):androidx.window.layout.WindowInfoTrackerImpl");
    }
}
