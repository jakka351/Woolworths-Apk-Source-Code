package me.oriient.positioningengine.ondevice;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.positioningengine.common.PositioningContext;

/* loaded from: classes8.dex */
public final class E extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public long f26397a;
    public Outcome b;
    public int c;
    public final /* synthetic */ I d;
    public final /* synthetic */ PositioningContext e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(I i, PositioningContext positioningContext, Continuation continuation) {
        super(2, continuation);
        this.d = i;
        this.e = positioningContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E(this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E(this.d, this.e, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r12.a(r6, r11) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if (me.oriient.positioningengine.ondevice.I.a(r12, r5, r3, r11) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r11.c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.ResultKt.b(r12)
            goto Lb0
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            long r3 = r11.f26397a
            me.oriient.internal.infra.utils.core.Outcome r1 = r11.b
            kotlin.ResultKt.b(r12)
            goto L96
        L25:
            long r4 = r11.f26397a
            kotlin.ResultKt.b(r12)
            goto L58
        L2b:
            kotlin.ResultKt.b(r12)
            me.oriient.positioningengine.ondevice.I r12 = r11.d
            kotlin.Lazy r12 = r12.r
            java.lang.Object r12 = r12.getD()
            me.oriient.internal.infra.utils.core.time.TimeProvider r12 = (me.oriient.internal.infra.utils.core.time.TimeProvider) r12
            long r5 = r12.getCurrentTimeMillis()
            me.oriient.positioningengine.ondevice.I r12 = r11.d
            kotlin.Lazy r12 = r12.w
            java.lang.Object r12 = r12.getD()
            me.oriient.positioningengine.ondevice.mappingData.MappingDataProvider r12 = (me.oriient.positioningengine.ondevice.mappingData.MappingDataProvider) r12
            me.oriient.positioningengine.common.PositioningContext r1 = r11.e
            java.lang.String r1 = r1.getBuildingId()
            r11.f26397a = r5
            r11.c = r4
            java.lang.Object r12 = r12.getBuildingData(r1, r11)
            if (r12 != r0) goto L57
            goto Laf
        L57:
            r4 = r5
        L58:
            r1 = r12
            me.oriient.internal.infra.utils.core.Outcome r1 = (me.oriient.internal.infra.utils.core.Outcome) r1
            me.oriient.positioningengine.ondevice.I r12 = r11.d
            boolean r6 = r1 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r6 == 0) goto L95
            r6 = r1
            me.oriient.internal.infra.utils.core.Outcome$Failure r6 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r6
            java.lang.Exception r6 = r6.getValue()
            me.oriient.positioningengine.common.util.PositioningEngineError r6 = (me.oriient.positioningengine.common.util.PositioningEngineError) r6
            kotlin.Lazy r7 = r12.s
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.elog.ELog r7 = (me.oriient.internal.services.elog.ELog) r7
            java.lang.String r8 = r6.getMessage()
            kotlin.Pair r9 = new kotlin.Pair
            java.lang.String r10 = "errorMessage"
            r9.<init>(r10, r8)
            java.util.Map r8 = kotlin.collections.MapsKt.i(r9)
            java.lang.String r9 = "OnDeviceEngine"
            java.lang.String r10 = "Failed to fetch building"
            r7.e(r9, r10, r8)
            r11.b = r1
            r11.f26397a = r4
            r11.c = r3
            java.lang.Object r12 = r12.a(r6, r11)
            if (r12 != r0) goto L95
            goto Laf
        L95:
            r3 = r4
        L96:
            me.oriient.positioningengine.ondevice.I r12 = r11.d
            boolean r5 = r1 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r5 == 0) goto Lb0
            r5 = r1
            me.oriient.internal.infra.utils.core.Outcome$Success r5 = (me.oriient.internal.infra.utils.core.Outcome.Success) r5
            java.lang.Object r5 = r5.getValue()
            me.oriient.positioningengine.ondevice.mappingData.MappingData$Building r5 = (me.oriient.positioningengine.ondevice.mappingData.MappingData.Building) r5
            r11.b = r1
            r11.c = r2
            java.lang.Object r12 = me.oriient.positioningengine.ondevice.I.a(r12, r5, r3, r11)
            if (r12 != r0) goto Lb0
        Laf:
            return r0
        Lb0:
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
