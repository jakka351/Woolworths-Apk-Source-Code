package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", "count", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements Function3<FlowCollector<? super SharingCommand>, Integer, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public /* synthetic */ int r;
    public final /* synthetic */ StartedWhileSubscribed s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, Continuation continuation) {
        super(3, continuation);
        this.s = startedWhileSubscribed;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.s, (Continuation) obj3);
        startedWhileSubscribed$command$1.q = (FlowCollector) obj;
        startedWhileSubscribed$command$1.r = iIntValue;
        return startedWhileSubscribed$command$1.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r3.emit(r12, r11) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r3.emit(r12, r11) == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlinx.coroutines.flow.StartedWhileSubscribed r0 = r11.s
            long r0 = r0.f24712a
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r11.p
            r4 = 0
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r3 == 0) goto L3a
            if (r3 == r10) goto L36
            if (r3 == r9) goto L30
            if (r3 == r8) goto L2a
            if (r3 == r7) goto L24
            if (r3 != r6) goto L1c
            goto L36
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            kotlinx.coroutines.flow.FlowCollector r0 = r11.q
            kotlin.ResultKt.b(r12)
            goto L76
        L2a:
            kotlinx.coroutines.flow.FlowCollector r3 = r11.q
            kotlin.ResultKt.b(r12)
            goto L6a
        L30:
            kotlinx.coroutines.flow.FlowCollector r3 = r11.q
            kotlin.ResultKt.b(r12)
            goto L59
        L36:
            kotlin.ResultKt.b(r12)
            goto L85
        L3a:
            kotlin.ResultKt.b(r12)
            kotlinx.coroutines.flow.FlowCollector r3 = r11.q
            int r12 = r11.r
            if (r12 <= 0) goto L4e
            kotlinx.coroutines.flow.SharingCommand r12 = kotlinx.coroutines.flow.SharingCommand.d
            r11.p = r10
            java.lang.Object r12 = r3.emit(r12, r11)
            if (r12 != r2) goto L85
            goto L84
        L4e:
            r11.q = r3
            r11.p = r9
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r4, r11)
            if (r12 != r2) goto L59
            goto L84
        L59:
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 <= 0) goto L77
            kotlinx.coroutines.flow.SharingCommand r12 = kotlinx.coroutines.flow.SharingCommand.e
            r11.q = r3
            r11.p = r8
            java.lang.Object r12 = r3.emit(r12, r11)
            if (r12 != r2) goto L6a
            goto L84
        L6a:
            r11.q = r3
            r11.p = r7
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r0, r11)
            if (r12 != r2) goto L75
            goto L84
        L75:
            r0 = r3
        L76:
            r3 = r0
        L77:
            kotlinx.coroutines.flow.SharingCommand r12 = kotlinx.coroutines.flow.SharingCommand.f
            r0 = 0
            r11.q = r0
            r11.p = r6
            java.lang.Object r12 = r3.emit(r12, r11)
            if (r12 != r2) goto L85
        L84:
            return r2
        L85:
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
