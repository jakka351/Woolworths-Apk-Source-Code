package me.oriient.positioningengine.ondevice;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;

/* renamed from: me.oriient.positioningengine.ondevice.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1834v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26490a;
    public /* synthetic */ Object b;
    public final /* synthetic */ I c;
    public final /* synthetic */ SensorsDataSample d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1834v(I i, SensorsDataSample sensorsDataSample, Continuation continuation) {
        super(2, continuation);
        this.c = i;
        this.d = sensorsDataSample;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1834v c1834v = new C1834v(this.c, this.d, continuation);
        c1834v.b = obj;
        return c1834v;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1834v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.f26490a
            r2 = 2
            r3 = 1
            kotlin.Unit r4 = kotlin.Unit.f24250a
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.b(r7)
            goto Lbc
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.b(r7)
            goto L8e
        L20:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.b
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            me.oriient.positioningengine.ondevice.I r7 = r6.c
            kotlin.Lazy r7 = r7.v
            java.lang.Object r7 = r7.getD()
            me.oriient.positioningengine.ondevice.util.EngineErrorHandler r7 = (me.oriient.positioningengine.ondevice.util.EngineErrorHandler) r7
            boolean r7 = r7.isEngineOkay()
            java.lang.String r1 = "OnDeviceEngine"
            if (r7 != 0) goto L45
            me.oriient.positioningengine.ondevice.I r7 = r6.c
            me.oriient.internal.infra.utils.core.Logger r7 = me.oriient.positioningengine.ondevice.I.b(r7)
            java.lang.String r0 = "onNewSample: engine is not okay! Doing nothing."
            r7.e(r1, r0)
            return r4
        L45:
            me.oriient.positioningengine.ondevice.I r7 = r6.c
            me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager r7 = r7.h
            if (r7 == 0) goto L52
            boolean r7 = r7.getActive()
            if (r7 != r3) goto L52
            return r4
        L52:
            me.oriient.positioningengine.ondevice.I r7 = r6.c
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.i
            java.lang.Object r7 = r7.getValue()
            me.oriient.positioningengine.common.PositioningEngineState r7 = (me.oriient.positioningengine.common.PositioningEngineState) r7
            boolean r5 = r7 instanceof me.oriient.positioningengine.common.PositioningEngineState.Calibrating
            if (r5 == 0) goto L62
            r5 = r3
            goto L64
        L62:
            boolean r5 = r7 instanceof me.oriient.positioningengine.common.PositioningEngineState.Positioning
        L64:
            if (r5 == 0) goto Lad
            me.oriient.positioningengine.ondevice.I r7 = r6.c
            me.oriient.positioningengine.ondevice.X r5 = r7.y
            if (r5 != 0) goto L7a
            kotlin.Lazy r7 = r7.q
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.infra.utils.core.Logger r7 = (me.oriient.internal.infra.utils.core.Logger) r7
            java.lang.String r0 = "onNewSample: Got sample but no core binded"
            r7.d(r1, r0)
            return r4
        L7a:
            me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample r7 = r6.d
            r6.f26490a = r3
            java.util.ArrayList r1 = r5.j
            r1.add(r7)
            java.lang.Object r7 = r5.a(r6)
            if (r7 != r0) goto L8a
            goto L8b
        L8a:
            r7 = r4
        L8b:
            if (r7 != r0) goto L8e
            goto Lac
        L8e:
            me.oriient.positioningengine.ondevice.I r7 = r6.c
            me.oriient.positioningengine.ondevice.models.c r1 = r7.A
            me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor r7 = r7.g
            me.oriient.positioningengine.ondevice.models.EnginePerformanceReport r7 = r7.getPerformanceReport()
            r1.getClass()
            java.lang.String r3 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.h(r7, r3)
            r1.f = r7
            me.oriient.positioningengine.ondevice.I r7 = r6.c
            r6.f26490a = r2
            java.lang.Object r7 = me.oriient.positioningengine.ondevice.I.c(r7, r6)
            if (r7 != r0) goto Lbc
        Lac:
            return r0
        Lad:
            boolean r7 = r7 instanceof me.oriient.positioningengine.common.PositioningEngineState.Idle
            if (r7 == 0) goto Lbc
            me.oriient.positioningengine.ondevice.I r7 = r6.c
            me.oriient.internal.infra.utils.core.Logger r7 = me.oriient.positioningengine.ondevice.I.b(r7)
            java.lang.String r0 = "onNewSample: Got sample while being idle"
            r7.d(r1, r0)
        Lbc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.C1834v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
