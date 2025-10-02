package me.oriient.ipssdk.realtime.ofs;

import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes8.dex */
public final class M0 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f25973a = new M0();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(me.oriient.positioningengine.common.util.PositioningEngineError r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof me.oriient.ipssdk.realtime.ofs.L0
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.ipssdk.realtime.ofs.L0 r0 = (me.oriient.ipssdk.realtime.ofs.L0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.ipssdk.realtime.ofs.L0 r0 = new me.oriient.ipssdk.realtime.ofs.L0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            me.oriient.positioningengine.common.util.PositioningEngineError r5 = r0.f25967a
            kotlin.ResultKt.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            me.oriient.ipssdk.realtime.ips.CoreLogic r6 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r6 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getSupportEngineUploadManager(r6)
            me.oriient.positioningengine.common.EngineStopReason$Error r2 = new me.oriient.positioningengine.common.EngineStopReason$Error
            r2.<init>(r5)
            r0.f25967a = r5
            r0.d = r3
            java.lang.Object r6 = r6.stopUploading(r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            me.oriient.ipssdk.realtime.ips.CoreLogic r6 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.ipssdk.api.models.IPSError r5 = me.oriient.ipssdk.realtime.utils.ExtensionsKt.toIpsError(r5)
            me.oriient.ipssdk.realtime.ips.CoreLogic.access$onSessionError(r6, r5)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.M0.emit(me.oriient.positioningengine.common.util.PositioningEngineError, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
