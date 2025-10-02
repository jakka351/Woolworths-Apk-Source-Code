package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", l = {307, 309, 310}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$fixedPeriodTicker$1 extends SuspendLambda implements Function2<ProducerScope<? super Unit>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$1(long j, Continuation continuation) {
        super(2, continuation);
        this.r = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$fixedPeriodTicker$1 flowKt__DelayKt$fixedPeriodTicker$1 = new FlowKt__DelayKt$fixedPeriodTicker$1(this.r, continuation);
        flowKt__DelayKt$fixedPeriodTicker$1.q = obj;
        return flowKt__DelayKt$fixedPeriodTicker$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((FlowKt__DelayKt$fixedPeriodTicker$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[PHI: r1
  0x004e: PHI (r1v4 kotlinx.coroutines.channels.ProducerScope) = (r1v3 kotlinx.coroutines.channels.ProducerScope), (r1v8 kotlinx.coroutines.channels.ProducerScope) binds: [B:16:0x004b, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:15:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.p
            long r2 = r7.r
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2a
            if (r1 == r6) goto L22
            if (r1 == r5) goto L1a
            if (r1 != r4) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.q
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            kotlin.ResultKt.b(r8)
            goto L4e
        L22:
            java.lang.Object r1 = r7.q
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            kotlin.ResultKt.b(r8)
            goto L3d
        L2a:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.q
            r1 = r8
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            r7.q = r1
            r7.p = r6
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r2, r7)
            if (r8 != r0) goto L3d
            goto L58
        L3d:
            kotlinx.coroutines.channels.SendChannel r8 = r1.b()
            r7.q = r1
            r7.p = r5
            kotlin.Unit r6 = kotlin.Unit.f24250a
            java.lang.Object r8 = r8.z(r6, r7)
            if (r8 != r0) goto L4e
            goto L58
        L4e:
            r7.q = r1
            r7.p = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r2, r7)
            if (r8 != r0) goto L3d
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
