package me.oriient.positioningengine.ondevice;

import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import me.oriient.positioningengine.support.device_data.model.PredefinedDataShift;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lme/oriient/positioningengine/ondevice/OnDeviceEngineFactory;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "createOnDeviceEngine", "Lme/oriient/positioningengine/common/PositioningEngine;", "spaceId", "", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/positioningengine/ondevice/OnDeviceEngineConfig;", "userSessionId", "predefinedDataShift", "Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;", "performanceMonitor", "Lme/oriient/positioningengine/ondevice/OnDeviceEnginePerformanceMonitor;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface OnDeviceEngineFactory extends DiProvidable {
    @NotNull
    PositioningEngine createOnDeviceEngine(@NotNull String spaceId, @NotNull OnDeviceEngineConfig config, @NotNull String userSessionId, @Nullable PredefinedDataShift predefinedDataShift, @NotNull OnDeviceEnginePerformanceMonitor performanceMonitor);
}
