package me.oriient.positioningengine.support;

import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.sensorsManager.sensors.SensorReading;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataReading;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.internal.services.uploadingManager.DataUploadManager;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.models.WorldCoordinate;

/* loaded from: classes8.dex */
public final class K extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public DataUploadManager f26505a;
    public J b;
    public int c;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl d;
    public final /* synthetic */ SensorsDataSample e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, SensorsDataSample sensorsDataSample, Continuation continuation) {
        super(2, continuation);
        this.d = onDeviceSessionsUploadManagerImpl;
        this.e = sensorsDataSample;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new K(this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new K(this.d, this.e, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DataUploadManager dataUploadManager;
        Object objA;
        J j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.c;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            PositioningEngine positioningEngine = this.d.engine;
            if (positioningEngine == null) {
                return unit;
            }
            OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl = this.d;
            SensorsDataReading sensorsDataReading = (SensorsDataReading) CollectionsKt.P(this.e.getReadings());
            onDeviceSessionsUploadManagerImpl.lastKnownLocation = sensorsDataReading != null ? sensorsDataReading.getLocationReading() : null;
            if (!this.d.getSensorsDataUploadingEnabled()) {
                return unit;
            }
            dataUploadManager = this.d.sensorsDataUploader;
            J j2 = new J(this.e);
            X sessionMetaDataGenerator = this.d.getSessionMetaDataGenerator();
            SensorReading.LocationReading locationReading = this.d.lastKnownLocation;
            WorldCoordinate unused = this.d.buildingOrigin;
            WorldCoordinate worldCoordinate = this.d.buildingGeofenceOrigin;
            boolean z = this.d.gpsFusionEnabled;
            List list = this.d.chargingStateUpdates;
            boolean z2 = this.d.didStartInSilentMode;
            boolean sensorsDataUploadingEnabled = this.d.getSensorsDataUploadingEnabled();
            boolean validationUploadingEnabled = this.d.getValidationUploadingEnabled();
            boolean positionsUploadingEnabled = this.d.getPositionsUploadingEnabled();
            boolean systemEventsUploadingEnabled = this.d.getSystemEventsUploadingEnabled();
            this.f26505a = dataUploadManager;
            this.b = j2;
            this.c = 1;
            objA = ((j0) sessionMetaDataGenerator).a(positioningEngine, locationReading, worldCoordinate, null, z, list, z2, sensorsDataUploadingEnabled, validationUploadingEnabled, positionsUploadingEnabled, systemEventsUploadingEnabled, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = j2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J j3 = this.b;
            DataUploadManager dataUploadManager2 = this.f26505a;
            ResultKt.b(obj);
            dataUploadManager = dataUploadManager2;
            j = j3;
            objA = obj;
        }
        dataUploadManager.upload(j, (Map) objA);
        return unit;
    }
}
