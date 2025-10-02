package coil3.util;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LifecyclesKt {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.lifecycle.Lifecycle r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof coil3.util.LifecyclesKt$awaitStarted$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = (coil3.util.LifecyclesKt$awaitStarted$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = new coil3.util.LifecyclesKt$awaitStarted$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.q
            androidx.lifecycle.Lifecycle r0 = r0.p
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L71
        L2d:
            r7 = move-exception
            goto L80
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.ResultKt.b(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.getD()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.g
            int r7 = r7.compareTo(r2)
            if (r7 < 0) goto L47
            return r3
        L47:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.p = r6     // Catch: java.lang.Throwable -> L7b
            r0.q = r7     // Catch: java.lang.Throwable -> L7b
            r0.s = r4     // Catch: java.lang.Throwable -> L7b
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L7b
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7b
            r2.o()     // Catch: java.lang.Throwable -> L7b
            coil3.util.LifecyclesKt$awaitStarted$2$1 r0 = new coil3.util.LifecyclesKt$awaitStarted$2$1     // Catch: java.lang.Throwable -> L7b
            r0.<init>()     // Catch: java.lang.Throwable -> L7b
            r7.d = r0     // Catch: java.lang.Throwable -> L7b
            r6.a(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r2.n()     // Catch: java.lang.Throwable -> L7b
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r6
            r6 = r7
        L71:
            java.lang.Object r6 = r6.d
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L7a
            r0.c(r6)
        L7a:
            return r3
        L7b:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            java.lang.Object r6 = r6.d
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L89
            r0.c(r6)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.util.LifecyclesKt.a(androidx.lifecycle.Lifecycle, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
