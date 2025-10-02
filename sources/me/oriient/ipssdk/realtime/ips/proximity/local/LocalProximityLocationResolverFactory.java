package me.oriient.ipssdk.realtime.ips.proximity.local;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.ips.IPSLocalProximityEvent;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationDefinition;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationResolverFactory;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "()V", "createResolver", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationResolver;", "event", "Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LocalProximityLocationResolverFactory implements DiProvidable {
    @NotNull
    public final LocalProximityLocationResolver createResolver(@NotNull IPSLocalProximityEvent event) {
        Intrinsics.h(event, "event");
        LocalProximityLocationDefinition locationDefinition = event.getLocationDefinition().getLocationDefinition();
        if (locationDefinition instanceof LocalProximityLocationDefinition.AreaCircle) {
            return new AreaCircleLocalProximityLocationResolver(event.getFloorOrder(), (LocalProximityLocationDefinition.AreaCircle) event.getLocationDefinition().getLocationDefinition());
        }
        if (locationDefinition instanceof LocalProximityLocationDefinition.AreaPolygon) {
            return new AreaPolygonLocalProximityLocationResolver(event.getFloorOrder(), (LocalProximityLocationDefinition.AreaPolygon) event.getLocationDefinition().getLocationDefinition());
        }
        if (locationDefinition instanceof LocalProximityLocationDefinition.AreaRectangle) {
            return new AreaRectangleLocalProximityLocationResolver(event.getFloorOrder(), (LocalProximityLocationDefinition.AreaRectangle) event.getLocationDefinition().getLocationDefinition());
        }
        if (locationDefinition instanceof LocalProximityLocationDefinition.WalkingDistance) {
            return new WalkingDistanceLocalProximityLocationResolver(event.getBuildingId(), event.getFloorOrder(), (LocalProximityLocationDefinition.WalkingDistance) event.getLocationDefinition().getLocationDefinition());
        }
        throw new NoWhenBranchMatchedException();
    }
}
