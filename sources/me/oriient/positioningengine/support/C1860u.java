package me.oriient.positioningengine.support;

import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.positioningengine.common.PositioningEngine;

/* renamed from: me.oriient.positioningengine.support.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1860u implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl f26572a;
    public final /* synthetic */ PositioningEngine b;

    public C1860u(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, PositioningEngine positioningEngine) {
        this.f26572a = onDeviceSessionsUploadManagerImpl;
        this.b = positioningEngine;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(me.oriient.positioningengine.common.PositioningUpdate r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof me.oriient.positioningengine.support.C1859t
            if (r3 == 0) goto L19
            r3 = r2
            me.oriient.positioningengine.support.t r3 = (me.oriient.positioningengine.support.C1859t) r3
            int r4 = r3.g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.g = r4
            goto L1e
        L19:
            me.oriient.positioningengine.support.t r3 = new me.oriient.positioningengine.support.t
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r3.g
            r6 = 1
            if (r5 == 0) goto L3e
            if (r5 != r6) goto L36
            me.oriient.positioningengine.common.PositioningUpdate r1 = r3.d
            me.oriient.internal.services.uploadingManager.DataUploadManager r4 = r3.c
            me.oriient.positioningengine.common.PositioningUpdate r5 = r3.b
            me.oriient.positioningengine.support.u r3 = r3.f26571a
            kotlin.ResultKt.b(r2)
            goto Lb8
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            kotlin.ResultKt.b(r2)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r2 = r0.f26572a
            me.oriient.internal.services.uploadingManager.DataUploadManager r2 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getPositionsDataUploader$p(r2)
            if (r2 == 0) goto Lbf
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r5 = r0.f26572a
            me.oriient.positioningengine.support.X r5 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getSessionMetaDataGenerator(r5)
            r7 = r5
            me.oriient.positioningengine.common.PositioningEngine r5 = r0.b
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r8 = r0.f26572a
            me.oriient.internal.services.sensorsManager.sensors.SensorReading$LocationReading r8 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getLastKnownLocation$p(r8)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r9 = r0.f26572a
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getBuildingOrigin$p(r9)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r9 = r0.f26572a
            me.oriient.positioningengine.common.models.WorldCoordinate r9 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getBuildingGeofenceOrigin$p(r9)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r10 = r0.f26572a
            boolean r10 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getGpsFusionEnabled$p(r10)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r11 = r0.f26572a
            java.util.List r11 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getChargingStateUpdates$p(r11)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r12 = r0.f26572a
            boolean r12 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getDidStartInSilentMode$p(r12)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r13 = r0.f26572a
            boolean r13 = r13.getSensorsDataUploadingEnabled()
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r14 = r0.f26572a
            boolean r14 = r14.getValidationUploadingEnabled()
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r15 = r0.f26572a
            boolean r15 = r15.getPositionsUploadingEnabled()
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r6 = r0.f26572a
            boolean r6 = r6.getSystemEventsUploadingEnabled()
            r3.f26571a = r0
            r3.b = r1
            r3.c = r2
            r3.d = r1
            r0 = 1
            r3.g = r0
            r0 = r7
            r7 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r6
            r6 = r8
            r8 = 0
            me.oriient.positioningengine.support.j0 r0 = (me.oriient.positioningengine.support.j0) r0
            r16 = r4
            r4 = r0
            r0 = r16
            r16 = r3
            java.lang.Object r3 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r3 != r0) goto Lb3
            return r0
        Lb3:
            r5 = r1
            r4 = r2
            r2 = r3
            r3 = r17
        Lb8:
            java.util.Map r2 = (java.util.Map) r2
            r4.upload(r1, r2)
            r1 = r5
            goto Lc1
        Lbf:
            r3 = r17
        Lc1:
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r0 = r3.f26572a
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$setLastPositionUpdate$p(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.C1860u.emit(me.oriient.positioningengine.common.PositioningUpdate, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
