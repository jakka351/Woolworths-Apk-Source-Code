package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public final MonotonicFrameClock d;
    public final Latch e = new Latch();

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock) {
        this.d = monotonicFrameClock;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.jvm.functions.Function1 r7 = r0.q
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            androidx.compose.runtime.PausableMonotonicFrameClock r2 = r0.p
            kotlin.ResultKt.b(r8)
            goto L7f
        L3c:
            kotlin.ResultKt.b(r8)
            androidx.compose.runtime.Latch r8 = r6.e
            r0.p = r6
            r2 = r7
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r0.q = r2
            r0.t = r4
            java.lang.Object r2 = r8.f1643a
            monitor-enter(r2)
            boolean r5 = r8.d     // Catch: java.lang.Throwable -> L93
            monitor-exit(r2)
            if (r5 == 0) goto L55
            kotlin.Unit r8 = kotlin.Unit.f24250a
            goto L7b
        L55:
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r2.<init>(r4, r5)
            r2.o()
            java.lang.Object r4 = r8.f1643a
            monitor-enter(r4)
            java.util.ArrayList r5 = r8.b     // Catch: java.lang.Throwable -> L90
            r5.add(r2)     // Catch: java.lang.Throwable -> L90
            monitor-exit(r4)
            androidx.compose.runtime.Latch$await$2$2 r4 = new androidx.compose.runtime.Latch$await$2$2
            r4.<init>()
            r2.r(r4)
            java.lang.Object r8 = r2.n()
            if (r8 != r1) goto L79
            goto L7b
        L79:
            kotlin.Unit r8 = kotlin.Unit.f24250a
        L7b:
            if (r8 != r1) goto L7e
            goto L8e
        L7e:
            r2 = r6
        L7f:
            androidx.compose.runtime.MonotonicFrameClock r8 = r2.d
            r2 = 0
            r0.p = r2
            r0.q = r2
            r0.t = r3
            java.lang.Object r7 = r8.e(r7, r0)
            if (r7 != r1) goto L8f
        L8e:
            return r1
        L8f:
            return r7
        L90:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L93:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.e(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.a(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.c(this, coroutineContext);
    }
}
