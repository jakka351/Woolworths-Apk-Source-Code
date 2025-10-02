package me.oriient.ipssdk.realtime.ips.proximity.local;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationDefinition;
import me.oriient.positioningengine.common.PositioningUpdate;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\r"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/AreaPolygonLocalProximityLocationResolver;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/BaseLocalProximityLocationResolver;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$AreaPolygon;", "floorOrder", "", "areaPolygon", "(ILme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$AreaPolygon;)V", "isPositionInsideImpl", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/ipssdk/base/utils/SdkError;", "position", "Lme/oriient/positioningengine/common/PositioningUpdate;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AreaPolygonLocalProximityLocationResolver extends BaseLocalProximityLocationResolver<LocalProximityLocationDefinition.AreaPolygon> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreaPolygonLocalProximityLocationResolver(int i, @NotNull LocalProximityLocationDefinition.AreaPolygon areaPolygon) {
        super(i, areaPolygon);
        Intrinsics.h(areaPolygon, "areaPolygon");
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.BaseLocalProximityLocationResolver
    @NotNull
    public Outcome<Boolean, SdkError> isPositionInsideImpl(@NotNull PositioningUpdate position) {
        Intrinsics.h(position, "position");
        return OutcomeKt.toOutcomeSuccess(Boolean.valueOf(IndoorCoordinate.isPointInsidePolygon$default(new IndoorCoordinate(position.getX(), position.getY(), 0.0d, 4, (DefaultConstructorMarker) null), getArea().getPoints(), false, 0.0d, 6, null)));
    }
}
