package me.oriient.positioningengine.common.mainOrientation;

import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.positioningengine.ondevice.models.Heading;
import me.oriient.positioningengine.ondevice.models.MainOrientation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lme/oriient/positioningengine/common/mainOrientation/MainOrientationCalculator;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "mainOrientation", "Lme/oriient/positioningengine/ondevice/models/MainOrientation;", "traveledDistance", "", "lockProgress", "heading", "Lme/oriient/positioningengine/ondevice/models/Heading;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface MainOrientationCalculator extends DiProvidable {
    @NotNull
    MainOrientation mainOrientation(double traveledDistance, double lockProgress, @NotNull Heading heading);
}
