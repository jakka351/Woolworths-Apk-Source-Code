package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DispatchedContinuationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Symbol f24720a = new Symbol("UNDEFINED");
    public static final Symbol b = new Symbol("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.Object r9, kotlin.coroutines.Continuation r10) throws kotlinx.coroutines.DispatchException {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto Lae
            kotlinx.coroutines.internal.DispatchedContinuation r10 = (kotlinx.coroutines.internal.DispatchedContinuation) r10
            kotlinx.coroutines.CoroutineDispatcher r0 = r10.g
            kotlin.coroutines.jvm.internal.ContinuationImpl r1 = r10.h
            java.lang.Throwable r2 = kotlin.Result.a(r9)
            if (r2 != 0) goto L12
            r3 = r9
            goto L18
        L12:
            kotlinx.coroutines.CompletedExceptionally r3 = new kotlinx.coroutines.CompletedExceptionally
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            kotlin.coroutines.CoroutineContext r2 = r1.getF()
            boolean r2 = c(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r10.i = r3
            r10.f = r4
            kotlin.coroutines.CoroutineContext r9 = r1.getF()
            b(r0, r9, r10)
            return
        L2f:
            kotlinx.coroutines.EventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.a()
            long r5 = r0.f
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r10.i = r3
            r10.f = r4
            r0.U(r10)
            goto La8
        L46:
            r0.Y(r4)
            kotlin.coroutines.CoroutineContext r2 = r1.getF()     // Catch: java.lang.Throwable -> L69
            kotlinx.coroutines.Job$Key r3 = kotlinx.coroutines.Job.Key.d     // Catch: java.lang.Throwable -> L69
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L69
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.isActive()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r2.getCancellationException()     // Catch: java.lang.Throwable -> L69
            kotlin.Result$Failure r9 = kotlin.ResultKt.a(r9)     // Catch: java.lang.Throwable -> L69
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r9 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r10.j     // Catch: java.lang.Throwable -> L69
            kotlin.coroutines.CoroutineContext r3 = r1.getF()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = kotlinx.coroutines.internal.ThreadContextKt.c(r3, r2)     // Catch: java.lang.Throwable -> L69
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.f24732a     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            kotlinx.coroutines.UndispatchedCoroutine r5 = kotlinx.coroutines.CoroutineContextKt.c(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r9)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r9 = r5.r0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8d
        L8a:
            kotlinx.coroutines.internal.ThreadContextKt.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r9 = r0.d0()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8d
        L93:
            r0.T(r4)
            goto La8
        L97:
            r9 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.r0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            kotlinx.coroutines.internal.ThreadContextKt.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r9     // Catch: java.lang.Throwable -> L69
        La4:
            r10.f(r9)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.T(r4)
            throw r9
        Lae:
            r10.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuationKt.a(java.lang.Object, kotlin.coroutines.Continuation):void");
    }

    public static final void b(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext, Runnable runnable) throws DispatchException {
        try {
            coroutineDispatcher.k(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, coroutineDispatcher, coroutineContext);
        }
    }

    public static final boolean c(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext) throws DispatchException {
        try {
            return coroutineDispatcher.v(coroutineContext);
        } catch (Throwable th) {
            throw new DispatchException(th, coroutineDispatcher, coroutineContext);
        }
    }
}
