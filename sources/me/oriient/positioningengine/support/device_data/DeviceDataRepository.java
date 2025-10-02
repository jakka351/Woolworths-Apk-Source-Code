package me.oriient.positioningengine.support.device_data;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.support.device_data.model.DeviceData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lme/oriient/positioningengine/support/device_data/DeviceDataRepository;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "loadDeviceData", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/positioningengine/support/device_data/model/DeviceData;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "deviceModel", "", "userSessionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DeviceDataRepository extends DiProvidable {
    @Nullable
    Object loadDeviceData(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Outcome<DeviceData, PositioningEngineError>> continuation);
}
