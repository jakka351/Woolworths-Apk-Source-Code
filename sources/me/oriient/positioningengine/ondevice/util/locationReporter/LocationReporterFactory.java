package me.oriient.positioningengine.ondevice.util.locationReporter;

import kotlin.Metadata;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporterFactory;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "create", "Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporter;", "oriientApiProvider", "Lme/oriient/internal/infra/rest/OriientApiProvider;", "engine", "Lme/oriient/positioningengine/common/PositioningEngine;", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporterConfig;", "credentials", "Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;", "engineConfig", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface LocationReporterFactory extends DiProvidable {
    @NotNull
    LocationReporter create(@NotNull OriientApiProvider oriientApiProvider, @NotNull PositioningEngine engine, @NotNull LocationReporterConfig config);

    @NotNull
    LocationReporter create(@NotNull OriientApiProvider oriientApiProvider, @NotNull PositioningEngine engine, @NotNull PositioningEngineCredentials credentials, @NotNull EngineConfig engineConfig);
}
