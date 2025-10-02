package me.oriient.ipssdk.realtime.ips;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.internal.services.dataModel.sensors.SensorManagerConfig;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;
import me.oriient.positioningengine.common.EngineStopReasonKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b implements SupportSensorsManager.SupportSensorsManagerDelegate {
    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SupportSensorsManagerDelegate
    public final boolean calcIsMultiFloorRequest() {
        List<Floor> floors;
        Building activeBuilding = CoreLogic.INSTANCE.getActiveBuilding();
        return (activeBuilding == null || (floors = activeBuilding.getFloors()) == null || floors.size() <= 1) ? false : true;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SupportSensorsManagerDelegate
    public final SensorManagerConfig getSensorManagerConfig() {
        return ((RemoteConfig) CoreLogic.access$getConfigManager(CoreLogic.INSTANCE).getConfig().getValue()).getCommon().getSensorManager();
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SupportSensorsManagerDelegate
    public final void onNewSample(SensorsDataSample sample) {
        Intrinsics.h(sample, "sample");
        CoreLogic.access$getEngineManager(CoreLogic.INSTANCE).onNewSample(sample);
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SupportSensorsManagerDelegate
    public final Object stopEngineOnError(final SensorManagerError sensorManagerError, Continuation continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(continuation));
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        CoreLogic.INSTANCE.stopPositioning(EngineStopReasonKt.toEngineStopReason(sensorManagerError), new IPSCompletionListener() { // from class: me.oriient.ipssdk.realtime.ips.CoreLogic$SdkSensorsDelegate$stopEngineOnError$2$1
            @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
            public void onCompleted() {
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (booleanRef2.d) {
                    return;
                }
                booleanRef2.d = true;
                CoreLogic.access$onSessionError(CoreLogic.INSTANCE, ExtensionsKt.toIpsError(sensorManagerError));
                safeContinuation.resumeWith(new Outcome.Success(Unit.f24250a));
            }

            @Override // me.oriient.ipssdk.api.listeners.IPSFailable
            public void onError(@NotNull IPSError error) {
                Intrinsics.h(error, "error");
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (booleanRef2.d) {
                    return;
                }
                booleanRef2.d = true;
                safeContinuation.resumeWith(new Outcome.Failure(new IllegalStateException(error.getMessage())));
            }
        });
        Object objA = safeContinuation.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }
}
