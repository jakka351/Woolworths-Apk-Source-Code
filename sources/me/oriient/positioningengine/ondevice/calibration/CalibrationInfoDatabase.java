package me.oriient.positioningengine.ondevice.calibration;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/positioningengine/ondevice/calibration/CalibrationInfoDatabase;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "Lme/oriient/positioningengine/ondevice/models/calibration/b;", "calibrationRecord", "", "upsertCalibrationRecord", "(Lme/oriient/positioningengine/ondevice/models/calibration/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/ondevice/models/calibration/c;", "type", "getCalibrationRecord", "(Lme/oriient/positioningengine/ondevice/models/calibration/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface CalibrationInfoDatabase extends DiProvidable {
    @Nullable
    Object getCalibrationRecord(@NotNull me.oriient.positioningengine.ondevice.models.calibration.c cVar, @NotNull Continuation<? super me.oriient.positioningengine.ondevice.models.calibration.b> continuation);

    @Nullable
    Object upsertCalibrationRecord(@NotNull me.oriient.positioningengine.ondevice.models.calibration.b bVar, @NotNull Continuation<? super Unit> continuation);
}
