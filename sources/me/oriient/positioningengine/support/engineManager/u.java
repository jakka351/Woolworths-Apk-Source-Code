package me.oriient.positioningengine.support.engineManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes8.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26545a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ SupportPositioningEngineManagerImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z, SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.c = z;
        this.d = supportPositioningEngineManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        u uVar = new u(this.c, this.d, continuation);
        uVar.b = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.f26545a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r7.b
            me.oriient.internal.infra.utils.core.Outcome r0 = (me.oriient.internal.infra.utils.core.Outcome) r0
            kotlin.ResultKt.b(r8)
            goto L71
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            java.lang.Object r1 = r7.b
            kotlinx.coroutines.Deferred r1 = (kotlinx.coroutines.Deferred) r1
            kotlin.ResultKt.b(r8)
            goto L62
        L24:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.b
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            me.oriient.positioningengine.support.engineManager.t r1 = new me.oriient.positioningengine.support.engineManager.t
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r4 = r7.d
            r5 = 0
            r1.<init>(r4, r5)
            r4 = 3
            kotlinx.coroutines.Deferred r1 = kotlinx.coroutines.BuildersKt.a(r8, r5, r1, r4)
            boolean r8 = r7.c
            if (r8 != r3) goto L44
            me.oriient.internal.infra.utils.core.Outcome$Success r8 = new me.oriient.internal.infra.utils.core.Outcome$Success
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r8.<init>(r3)
            goto L64
        L44:
            if (r8 != 0) goto L7e
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r8 = r7.d
            me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider r8 = me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.access$getCoroutineContextProvider(r8)
            kotlin.coroutines.CoroutineContext r8 = r8.getDefault()
            me.oriient.positioningengine.support.engineManager.s r4 = new me.oriient.positioningengine.support.engineManager.s
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r6 = r7.d
            r4.<init>(r6, r5)
            r7.b = r1
            r7.f26545a = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.f(r8, r4, r7)
            if (r8 != r0) goto L62
            goto L6e
        L62:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
        L64:
            r7.b = r8
            r7.f26545a = r2
            java.lang.Object r1 = r1.await(r7)
            if (r1 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r0 = r8
            r8 = r1
        L71:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.infra.utils.core.Outcome r8 = me.oriient.internal.infra.utils.core.OutcomeKt.combineOutcomes(r8, r0)
            me.oriient.positioningengine.support.engineManager.r r0 = me.oriient.positioningengine.support.engineManager.r.f26542a
            me.oriient.internal.infra.utils.core.Outcome r8 = r8.map(r0)
            return r8
        L7e:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
