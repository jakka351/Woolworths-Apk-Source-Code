package me.oriient.ipssdk.common.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class d0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25744a;
    public /* synthetic */ Object b;

    public d0(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d0 d0Var = new d0(continuation);
        d0Var.b = obj;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = new d0((Continuation) obj2);
        d0Var.b = (FlowCollector) obj;
        return d0Var.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[PHI: r1
  0x0039: PHI (r1v3 kotlinx.coroutines.flow.FlowCollector) = (r1v4 kotlinx.coroutines.flow.FlowCollector), (r1v6 kotlinx.coroutines.flow.FlowCollector) binds: [B:12:0x0036, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0043 -> B:11:0x002c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.f25744a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r6.b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r7)
            goto L2c
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r1 = r6.b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r7)
            goto L39
        L24:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.b
            r1 = r7
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
        L2c:
            r6.b = r1
            r6.f25744a = r3
            kotlin.Unit r7 = kotlin.Unit.f24250a
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L39
            goto L45
        L39:
            r6.b = r1
            r6.f25744a = r2
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r7 != r0) goto L2c
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.common.ofs.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
