package me.oriient.positioningengine.support.engineManager;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;
import me.oriient.positioningengine.support.device_data.model.BlacklistedFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0001/J\u000e\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H¦@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H&J*\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H¦@¢\u0006\u0002\u0010(J,\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020#0\"2\u0006\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010'H¦@¢\u0006\u0002\u0010-J,\u0010.\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020#0\"2\u0006\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010'H¦@¢\u0006\u0002\u0010-R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u00060"}, d2 = {"Lme/oriient/positioningengine/support/engineManager/SupportPositioningEngineManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "blacklistedFeatures", "", "Lme/oriient/positioningengine/support/device_data/model/BlacklistedFeature;", "getBlacklistedFeatures", "()Ljava/util/List;", "engine", "Lkotlinx/coroutines/flow/StateFlow;", "Lme/oriient/positioningengine/common/PositioningEngine;", "getEngine", "()Lkotlinx/coroutines/flow/StateFlow;", "cleanEngine", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanInMemoryData", "clearAllCaches", "exceptLastDays", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearBuildingCache", "buildingId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearExpiredData", "configure", "deviceDataFetchTimeoutSeconds", "enableLocationReporting", "", "(DLjava/lang/Boolean;)V", "onNewSample", "sample", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "prepareEngine", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "credentials", "Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;", "newConfig", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "(Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;Lme/oriient/internal/services/dataModel/engine/EngineConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provideRelevantEngine", "Lme/oriient/positioningengine/support/engineManager/SupportPositioningEngineManager$ResolveEngineData;", "currentEngine", "latestConfig", "(Lme/oriient/positioningengine/common/PositioningEngine;Lme/oriient/internal/services/dataModel/engine/EngineConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provideRelevantEngineInCalibration", "ResolveEngineData", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface SupportPositioningEngineManager extends DiProvidable {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lme/oriient/positioningengine/support/engineManager/SupportPositioningEngineManager$ResolveEngineData;", "", "engine", "Lme/oriient/positioningengine/common/PositioningEngine;", "session", "Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSession;", "(Lme/oriient/positioningengine/common/PositioningEngine;Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSession;)V", "getEngine", "()Lme/oriient/positioningengine/common/PositioningEngine;", "getSession", "()Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSession;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResolveEngineData {

        @NotNull
        private final PositioningEngine engine;

        @NotNull
        private final OnDeviceEngineSession session;

        public ResolveEngineData(@NotNull PositioningEngine engine, @NotNull OnDeviceEngineSession session) {
            Intrinsics.h(engine, "engine");
            Intrinsics.h(session, "session");
            this.engine = engine;
            this.session = session;
        }

        public static /* synthetic */ ResolveEngineData copy$default(ResolveEngineData resolveEngineData, PositioningEngine positioningEngine, OnDeviceEngineSession onDeviceEngineSession, int i, Object obj) {
            if ((i & 1) != 0) {
                positioningEngine = resolveEngineData.engine;
            }
            if ((i & 2) != 0) {
                onDeviceEngineSession = resolveEngineData.session;
            }
            return resolveEngineData.copy(positioningEngine, onDeviceEngineSession);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PositioningEngine getEngine() {
            return this.engine;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final OnDeviceEngineSession getSession() {
            return this.session;
        }

        @NotNull
        public final ResolveEngineData copy(@NotNull PositioningEngine engine, @NotNull OnDeviceEngineSession session) {
            Intrinsics.h(engine, "engine");
            Intrinsics.h(session, "session");
            return new ResolveEngineData(engine, session);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResolveEngineData)) {
                return false;
            }
            ResolveEngineData resolveEngineData = (ResolveEngineData) other;
            return Intrinsics.c(this.engine, resolveEngineData.engine) && Intrinsics.c(this.session, resolveEngineData.session);
        }

        @NotNull
        public final PositioningEngine getEngine() {
            return this.engine;
        }

        @NotNull
        public final OnDeviceEngineSession getSession() {
            return this.session;
        }

        public int hashCode() {
            return this.session.hashCode() + (this.engine.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ResolveEngineData(engine=" + this.engine + ", session=" + this.session + ')';
        }
    }

    @Nullable
    Object cleanEngine(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object cleanInMemoryData(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object clearAllCaches(double d, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object clearBuildingCache(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object clearExpiredData(double d, @NotNull Continuation<? super Unit> continuation);

    void configure(double deviceDataFetchTimeoutSeconds, @Nullable Boolean enableLocationReporting);

    @NotNull
    List<BlacklistedFeature> getBlacklistedFeatures();

    @NotNull
    StateFlow<PositioningEngine> getEngine();

    void onNewSample(@NotNull SensorsDataSample sample);

    @Nullable
    Object prepareEngine(@NotNull PositioningEngineCredentials positioningEngineCredentials, @NotNull EngineConfig engineConfig, @NotNull Continuation<? super Outcome<PositioningEngine, PositioningEngineError>> continuation);

    @Nullable
    Object provideRelevantEngine(@NotNull PositioningEngine positioningEngine, @Nullable EngineConfig engineConfig, @NotNull Continuation<? super Outcome<ResolveEngineData, PositioningEngineError>> continuation);

    @Nullable
    Object provideRelevantEngineInCalibration(@NotNull PositioningEngine positioningEngine, @Nullable EngineConfig engineConfig, @NotNull Continuation<? super Outcome<ResolveEngineData, PositioningEngineError>> continuation);
}
