package me.oriient.positioningengine.support;

import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.positioningengine.common.PositioningEngine;

/* renamed from: me.oriient.positioningengine.support.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1863x implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl f26575a;
    public final /* synthetic */ PositioningEngine b;

    public C1863x(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, PositioningEngine positioningEngine) {
        this.f26575a = onDeviceSessionsUploadManagerImpl;
        this.b = positioningEngine;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(me.oriient.positioningengine.common.ValidationUpdate r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof me.oriient.positioningengine.support.C1862w
            if (r2 == 0) goto L18
            r2 = r1
            me.oriient.positioningengine.support.w r2 = (me.oriient.positioningengine.support.C1862w) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.e = r3
        L16:
            r15 = r2
            goto L1e
        L18:
            me.oriient.positioningengine.support.w r2 = new me.oriient.positioningengine.support.w
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r15.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r15.e
            kotlin.Unit r16 = kotlin.Unit.f24250a
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            me.oriient.positioningengine.common.ValidationUpdate r2 = r15.b
            me.oriient.internal.services.uploadingManager.DataUploadManager r3 = r15.f26574a
            kotlin.ResultKt.b(r1)
            goto Lb6
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            kotlin.ResultKt.b(r1)
            java.lang.String r1 = r18.getRestrictedAreaId()
            if (r1 == 0) goto L4e
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r1 = r0.f26575a
            boolean r1 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getRestrictedAreasValidationUploadingEnabled$p(r1)
            if (r1 != 0) goto L4e
            return r16
        L4e:
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r1 = r0.f26575a
            me.oriient.internal.services.uploadingManager.DataUploadManager r1 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getValidationDataUploader$p(r1)
            if (r1 == 0) goto Lbb
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r3 = r0.f26575a
            me.oriient.positioningengine.support.X r3 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getSessionMetaDataGenerator(r3)
            me.oriient.positioningengine.common.PositioningEngine r5 = r0.b
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r6 = r0.f26575a
            me.oriient.internal.services.sensorsManager.sensors.SensorReading$LocationReading r6 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getLastKnownLocation$p(r6)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r7 = r0.f26575a
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getBuildingOrigin$p(r7)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r7 = r0.f26575a
            me.oriient.positioningengine.common.models.WorldCoordinate r7 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getBuildingGeofenceOrigin$p(r7)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r8 = r0.f26575a
            boolean r8 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getGpsFusionEnabled$p(r8)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r9 = r0.f26575a
            java.util.List r9 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getChargingStateUpdates$p(r9)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r10 = r0.f26575a
            boolean r10 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getDidStartInSilentMode$p(r10)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r11 = r0.f26575a
            boolean r11 = r11.getSensorsDataUploadingEnabled()
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r12 = r0.f26575a
            boolean r12 = r12.getValidationUploadingEnabled()
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r13 = r0.f26575a
            boolean r13 = r13.getPositionsUploadingEnabled()
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r14 = r0.f26575a
            boolean r14 = r14.getSystemEventsUploadingEnabled()
            r15.f26574a = r1
            r19 = r7
            r7 = r18
            r15.b = r7
            r15.e = r4
            r7 = 0
            me.oriient.positioningengine.support.j0 r3 = (me.oriient.positioningengine.support.j0) r3
            r4 = r5
            r5 = r6
            r6 = r19
            java.lang.Object r3 = r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r3 != r2) goto Lb1
            return r2
        Lb1:
            r2 = r3
            r3 = r1
            r1 = r2
            r2 = r18
        Lb6:
            java.util.Map r1 = (java.util.Map) r1
            r3.upload(r2, r1)
        Lbb:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.C1863x.emit(me.oriient.positioningengine.common.ValidationUpdate, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
