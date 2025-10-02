package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.sensorsManager.SensorManagerError;

/* loaded from: classes8.dex */
public final class P0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25989a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SensorManagerError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(SensorManagerError sensorManagerError, Continuation continuation) {
        super(2, continuation);
        this.c = sensorManagerError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        P0 p0 = new P0(this.c, continuation);
        p0.b = obj;
        return p0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        P0 p0 = new P0(this.c, (Continuation) obj2);
        p0.b = (CoroutineScope) obj;
        return p0.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.f25989a
            kotlin.Unit r2 = kotlin.Unit.f24250a
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L13
            java.lang.Object r0 = r7.b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            kotlin.ResultKt.b(r8)
            goto L4f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.b
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            me.oriient.ipssdk.realtime.ips.CoreLogic r1 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager r1 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getEngineManager(r1)
            kotlinx.coroutines.flow.StateFlow r1 = r1.getEngine()
            java.lang.Object r1 = r1.getValue()
            me.oriient.positioningengine.common.PositioningEngine r1 = (me.oriient.positioningengine.common.PositioningEngine) r1
            if (r1 == 0) goto L51
            me.oriient.positioningengine.common.EngineStopReason$Error r4 = new me.oriient.positioningengine.common.EngineStopReason$Error
            java.lang.Exception r5 = new java.lang.Exception
            me.oriient.internal.services.sensorsManager.SensorManagerError r6 = r7.c
            java.lang.String r6 = r6.getMessage()
            r5.<init>(r6)
            r4.<init>(r5)
            r7.b = r8
            r7.f25989a = r3
            java.lang.Object r8 = r1.stop(r4, r7)
            if (r8 != r0) goto L4f
            return r0
        L4f:
            r8 = r2
            goto L52
        L51:
            r8 = 0
        L52:
            if (r8 != 0) goto L68
            me.oriient.ipssdk.realtime.ips.CoreLogic r8 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.internal.infra.utils.core.Logger r8 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getLogger(r8)
            java.lang.String r0 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getTAG$p()
            java.lang.String r1 = "access$getTAG$p(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            java.lang.String r1 = "onError: no session"
            r8.e(r0, r1)
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.P0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
