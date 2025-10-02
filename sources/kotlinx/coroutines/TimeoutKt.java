package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimeoutKt {
    public static final Object a(TimeoutCoroutine timeoutCoroutine, Function2 function2) throws Throwable {
        Object completedExceptionally;
        Object objA0;
        JobKt.g(timeoutCoroutine, new DisposeOnCompletion(DelayKt.c(timeoutCoroutine.g.getF()).j(timeoutCoroutine.h, timeoutCoroutine, timeoutCoroutine.f)));
        try {
            if (function2 instanceof BaseContinuationImpl) {
                TypeIntrinsics.d(2, function2);
                completedExceptionally = function2.invoke(timeoutCoroutine, timeoutCoroutine);
            } else {
                completedExceptionally = IntrinsicsKt.c(timeoutCoroutine, function2, timeoutCoroutine);
            }
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (completedExceptionally == coroutineSingletons || (objA0 = timeoutCoroutine.a0(completedExceptionally)) == JobSupportKt.b) {
            return coroutineSingletons;
        }
        if (objA0 instanceof CompletedExceptionally) {
            Throwable th2 = ((CompletedExceptionally) objA0).f24689a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).d != timeoutCoroutine) {
                throw th2;
            }
            if (completedExceptionally instanceof CompletedExceptionally) {
                throw ((CompletedExceptionally) completedExceptionally).f24689a;
            }
        } else {
            completedExceptionally = JobSupportKt.a(objA0);
        }
        return completedExceptionally;
    }

    public static final Object b(long j, Function2 function2, Continuation continuation) throws Throwable {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object objA = a(new TimeoutCoroutine(j, continuation), function2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(long r6, kotlin.jvm.functions.Function2 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L29
            return r9
        L29:
            r7 = move-exception
            goto L57
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L5d
        L3d:
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            r0.p = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r0.r = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            kotlinx.coroutines.TimeoutCoroutine r2 = new kotlinx.coroutines.TimeoutCoroutine     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r2.<init>(r6, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r9.d = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            java.lang.Object r6 = a(r2, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            if (r6 != r1) goto L54
            return r1
        L54:
            return r6
        L55:
            r7 = move-exception
            r6 = r9
        L57:
            kotlinx.coroutines.Job r8 = r7.d
            java.lang.Object r6 = r6.d
            if (r8 != r6) goto L5f
        L5d:
            r6 = 0
            return r6
        L5f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.c(long, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
