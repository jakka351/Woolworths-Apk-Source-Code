package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class YieldKt {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            kotlin.coroutines.CoroutineContext r0 = r7.getE()
            kotlinx.coroutines.JobKt.e(r0)
            kotlin.coroutines.Continuation r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r7)
            boolean r1 = r7 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r1 == 0) goto L12
            kotlinx.coroutines.internal.DispatchedContinuation r7 = (kotlinx.coroutines.internal.DispatchedContinuation) r7
            goto L13
        L12:
            r7 = 0
        L13:
            kotlin.Unit r1 = kotlin.Unit.f24250a
            if (r7 != 0) goto L1a
        L17:
            r7 = r1
            goto L86
        L1a:
            kotlinx.coroutines.CoroutineDispatcher r2 = r7.g
            boolean r3 = kotlinx.coroutines.internal.DispatchedContinuationKt.c(r2, r0)
            r4 = 1
            if (r3 == 0) goto L2b
            r7.i = r1
            r7.f = r4
            r2.r(r0, r7)
            goto L84
        L2b:
            kotlinx.coroutines.YieldContext r3 = new kotlinx.coroutines.YieldContext
            r3.<init>()
            kotlin.coroutines.CoroutineContext r0 = r0.plus(r3)
            r7.i = r1
            r7.f = r4
            r2.r(r0, r7)
            boolean r0 = r3.e
            if (r0 == 0) goto L84
            kotlinx.coroutines.EventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.a()
            kotlin.collections.ArrayDeque r2 = r0.h
            if (r2 == 0) goto L4c
            boolean r2 = r2.isEmpty()
            goto L4d
        L4c:
            r2 = r4
        L4d:
            if (r2 == 0) goto L50
            goto L17
        L50:
            long r2 = r0.f
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L5d
            r2 = r4
            goto L5e
        L5d:
            r2 = 0
        L5e:
            if (r2 == 0) goto L6a
            r7.i = r1
            r7.f = r4
            r0.U(r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            goto L86
        L6a:
            r0.Y(r4)
            r7.run()     // Catch: java.lang.Throwable -> L7a
        L70:
            boolean r2 = r0.d0()     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L70
        L76:
            r0.T(r4)
            goto L17
        L7a:
            r2 = move-exception
            r7.f(r2)     // Catch: java.lang.Throwable -> L7f
            goto L76
        L7f:
            r7 = move-exception
            r0.T(r4)
            throw r7
        L84:
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
        L86:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r7 != r0) goto L8b
            return r7
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.YieldKt.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
