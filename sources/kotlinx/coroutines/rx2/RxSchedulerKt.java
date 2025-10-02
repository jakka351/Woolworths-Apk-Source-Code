package kotlinx.coroutines.rx2;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*8\b\u0002\u0010\u0004\"\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00002\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "Task", "kotlinx-coroutines-rx2"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RxSchedulerKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(io.reactivex.disposables.Disposable r5, kotlin.coroutines.CoroutineContext r6, java.lang.Runnable r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1 r0 = (kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1 r0 = new kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.coroutines.CoroutineContext r6 = r0.p
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L2b
            return r3
        L2b:
            r5 = move-exception
            goto L51
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r8)
            boolean r5 = r5.b()
            if (r5 == 0) goto L3f
            goto L50
        L3f:
            kotlinx.coroutines.rx2.d r5 = new kotlinx.coroutines.rx2.d     // Catch: java.lang.Throwable -> L2b
            r8 = 1
            r5.<init>(r7, r8)     // Catch: java.lang.Throwable -> L2b
            r0.p = r6     // Catch: java.lang.Throwable -> L2b
            r0.r = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = kotlinx.coroutines.InterruptibleKt.a(r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L50
            return r1
        L50:
            return r3
        L51:
            kotlinx.coroutines.rx2.RxCancellableKt.a(r5, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxSchedulerKt.a(io.reactivex.disposables.Disposable, kotlin.coroutines.CoroutineContext, java.lang.Runnable, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
