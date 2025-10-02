package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ Function0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.q = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.q, continuation);
        interruptibleKt$runInterruptible$2.p = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InterruptibleKt$runInterruptible$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw r5;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            kotlin.ResultKt.b(r5)
            java.lang.Object r5 = r4.p
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            kotlin.coroutines.CoroutineContext r5 = r5.getE()
            kotlin.jvm.functions.Function0 r0 = r4.q
            kotlinx.coroutines.ThreadState r1 = new kotlinx.coroutines.ThreadState     // Catch: java.lang.InterruptedException -> L41
            r1.<init>()     // Catch: java.lang.InterruptedException -> L41
            kotlinx.coroutines.Job r5 = kotlinx.coroutines.JobKt.f(r5)     // Catch: java.lang.InterruptedException -> L41
            kotlinx.coroutines.DisposableHandle r5 = kotlinx.coroutines.JobKt.g(r5, r1)     // Catch: java.lang.InterruptedException -> L41
            r1.i = r5     // Catch: java.lang.InterruptedException -> L41
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = kotlinx.coroutines.ThreadState.j     // Catch: java.lang.InterruptedException -> L41
        L20:
            int r2 = r5.get(r1)     // Catch: java.lang.InterruptedException -> L41
            if (r2 == 0) goto L32
            r5 = 2
            if (r2 == r5) goto L39
            r5 = 3
            if (r2 != r5) goto L2d
            goto L39
        L2d:
            kotlinx.coroutines.ThreadState.n(r2)     // Catch: java.lang.InterruptedException -> L41
            r5 = 0
            throw r5     // Catch: java.lang.InterruptedException -> L41
        L32:
            r3 = 0
            boolean r2 = r5.compareAndSet(r1, r2, r3)     // Catch: java.lang.InterruptedException -> L41
            if (r2 == 0) goto L20
        L39:
            java.lang.Object r5 = r0.invoke()     // Catch: java.lang.Throwable -> L43
            r1.m()     // Catch: java.lang.InterruptedException -> L41
            return r5
        L41:
            r5 = move-exception
            goto L48
        L43:
            r5 = move-exception
            r1.m()     // Catch: java.lang.InterruptedException -> L41
            throw r5     // Catch: java.lang.InterruptedException -> L41
        L48:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            r0.<init>(r1)
            java.lang.Throwable r5 = r0.initCause(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.InterruptibleKt$runInterruptible$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
