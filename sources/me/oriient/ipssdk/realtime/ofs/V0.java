package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.positioningengine.common.CalibrationContext;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;

/* loaded from: classes8.dex */
public final class V0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public CalibrationContext f26019a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ OnDeviceEngineSession d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ PositioningEngine g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(boolean z, OnDeviceEngineSession onDeviceEngineSession, long j, String str, PositioningEngine positioningEngine, Continuation continuation) {
        super(2, continuation);
        this.c = z;
        this.d = onDeviceEngineSession;
        this.e = j;
        this.f = str;
        this.g = positioningEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new V0(this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((V0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r5.startCalibrationUploading(r6, r7, null, r10, r13) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r13.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r14)
            goto L8f
        L11:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L19:
            me.oriient.positioningengine.common.CalibrationContext r1 = r13.f26019a
            kotlin.ResultKt.b(r14)
            r6 = r1
            goto L61
        L20:
            kotlin.ResultKt.b(r14)
            me.oriient.ipssdk.realtime.ips.CoreLogic r14 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.internal.infra.utils.core.Logger r14 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getLogger(r14)
            java.lang.String r1 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getTAG$p()
            java.lang.String r4 = "access$getTAG$p(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r4)
            java.lang.String r4 = "onSessionStart: calling engine.startCalibration()"
            r14.d(r1, r4)
            boolean r14 = r13.c
            if (r14 != r3) goto L3f
            me.oriient.positioningengine.common.InitiatedBy r14 = me.oriient.positioningengine.common.InitiatedBy.CLIENT
        L3d:
            r6 = r14
            goto L44
        L3f:
            if (r14 != 0) goto L92
            me.oriient.positioningengine.common.InitiatedBy r14 = me.oriient.positioningengine.common.InitiatedBy.AUTO_START
            goto L3d
        L44:
            me.oriient.positioningengine.common.CalibrationContext r4 = new me.oriient.positioningengine.common.CalibrationContext
            me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession r5 = r13.d
            long r7 = r13.e
            java.lang.String r9 = r13.f
            r11 = 16
            r12 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r9, r10, r11, r12)
            me.oriient.positioningengine.common.PositioningEngine r14 = r13.g
            r13.f26019a = r4
            r13.b = r3
            java.lang.Object r14 = r14.startCalibration(r4, r13)
            if (r14 != r0) goto L60
            goto L8e
        L60:
            r6 = r4
        L61:
            me.oriient.ipssdk.realtime.ips.CoreLogic r14 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r5 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getSupportEngineUploadManager(r14)
            me.oriient.internal.services.sensorsManager.support.SupportSensorsManager r14 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getSensorsDataProvider(r14)
            long r7 = r14.getSessionStartTimeMilliUTC()
            me.oriient.ipssdk.base.auth.User r14 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getUser$p()
            if (r14 == 0) goto L7e
            java.lang.String r14 = r14.getUserName()
            if (r14 != 0) goto L7c
            goto L7e
        L7c:
            r10 = r14
            goto L81
        L7e:
            java.lang.String r14 = ""
            goto L7c
        L81:
            r14 = 0
            r13.f26019a = r14
            r13.b = r2
            r9 = 0
            r11 = r13
            java.lang.Object r14 = r5.startCalibrationUploading(r6, r7, r9, r10, r11)
            if (r14 != r0) goto L8f
        L8e:
            return r0
        L8f:
            kotlin.Unit r14 = kotlin.Unit.f24250a
            return r14
        L92:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.V0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
