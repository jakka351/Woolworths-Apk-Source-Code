package au.com.woolworths.android.onesite.utils.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2", f = "ControlledRunner.kt", l = {95, 97, 100}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ControlledRunner$cancelPreviousThenRun$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ControlledRunner r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlledRunner$cancelPreviousThenRun$2(ControlledRunner controlledRunner, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.r = controlledRunner;
        this.s = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ControlledRunner$cancelPreviousThenRun$2 controlledRunner$cancelPreviousThenRun$2 = new ControlledRunner$cancelPreviousThenRun$2(this.r, this.s, continuation);
        controlledRunner$cancelPreviousThenRun$2.q = obj;
        return controlledRunner$cancelPreviousThenRun$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ControlledRunner$cancelPreviousThenRun$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        r10 = (kotlinx.coroutines.Deferred) r1.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        r9.q = r0;
        r9.p = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (kotlinx.coroutines.JobKt.c(r10, r9) != r2) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:14:0x0051). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner r0 = r9.r
            java.util.concurrent.atomic.AtomicReference r1 = r0.f4601a
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r9.p
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L30
            if (r3 == r6) goto L28
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            kotlin.ResultKt.b(r10)
            return r10
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r0 = r9.q
            kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
            kotlin.ResultKt.b(r10)
            goto L51
        L28:
            java.lang.Object r0 = r9.q
            kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
            kotlin.ResultKt.b(r10)
            goto L7c
        L30:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.q
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.d
            au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2$newTask$1 r3 = new au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2$newTask$1
            kotlin.jvm.functions.Function1 r8 = r9.s
            r3.<init>(r8, r7)
            kotlinx.coroutines.Deferred r10 = kotlinx.coroutines.BuildersKt.a(r10, r7, r3, r6)
            au.com.woolworths.android.onesite.utils.coroutines.a r3 = new au.com.woolworths.android.onesite.utils.coroutines.a
            r8 = 0
            r3.<init>(r0, r10, r8)
            r0 = r10
            kotlinx.coroutines.JobSupport r0 = (kotlinx.coroutines.JobSupport) r0
            r0.invokeOnCompletion(r3)
            r0 = r10
        L51:
            boolean r10 = r1.compareAndSet(r7, r0)
            if (r10 == 0) goto L63
            r9.q = r7
            r9.p = r4
            java.lang.Object r10 = r0.await(r9)
            if (r10 != r2) goto L62
            goto L86
        L62:
            return r10
        L63:
            java.lang.Object r10 = r1.get()
            if (r10 == 0) goto L51
            java.lang.Object r10 = r1.get()
            kotlinx.coroutines.Deferred r10 = (kotlinx.coroutines.Deferred) r10
            if (r10 == 0) goto L7c
            r9.q = r0
            r9.p = r6
            java.lang.Object r10 = kotlinx.coroutines.JobKt.c(r10, r9)
            if (r10 != r2) goto L7c
            goto L86
        L7c:
            r9.q = r0
            r9.p = r5
            java.lang.Object r10 = kotlinx.coroutines.YieldKt.a(r9)
            if (r10 != r2) goto L51
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
