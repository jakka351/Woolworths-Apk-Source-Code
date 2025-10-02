package me.oriient.ipssdk.realtime.utils.models;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.api.models.IPSTriggerEvent;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManager;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventOrigin;
import me.oriient.ipssdk.realtime.ofs.O4;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/TriggerEvent;", "Lme/oriient/ipssdk/api/models/IPSTriggerEvent;", "<init>", "()V", "Lme/oriient/ipssdk/realtime/utils/models/Region;", "region", "", "onExited", "(Lme/oriient/ipssdk/realtime/utils/models/Region;)V", "", "getDurationMilli", "()J", "onEventTriggered", "", "toString", "()Ljava/lang/String;", "Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "getContainingTrigger", "()Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "containingTrigger", "Companion", "me/oriient/ipssdk/realtime/ofs/O4", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class TriggerEvent implements IPSTriggerEvent {

    @NotNull
    private static final O4 Companion = new O4();

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f26205a;
    private final Lazy b;
    private boolean c;

    public TriggerEvent() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26205a = di.inject(reflectionFactory.b(Logger.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ProximityStatsManager.class));
    }

    @NotNull
    /* renamed from: getContainingTrigger */
    public abstract ProximityTrigger getD();

    @Override // me.oriient.ipssdk.api.models.IPSTriggerEvent
    /* renamed from: getDurationMilli */
    public long getD() {
        return 0L;
    }

    public final void onEventTriggered(@NotNull Region region) {
        Shape shape;
        ProximityStatsManager.EventShape eventShape;
        Intrinsics.h(region, "region");
        RegionPlacementInBuilding regionPlacementInBuilding = region.placements.get(0);
        if (regionPlacementInBuilding != null && (shape = regionPlacementInBuilding.getShape()) != null) {
            ProximityStatsManager proximityStatsManager = (ProximityStatsManager) this.b.getD();
            ProximityEventOrigin proximityEventOrigin = ProximityEventOrigin.DASHBOARD_REGION;
            boolean z = !this.c;
            if (shape instanceof CircularShape) {
                eventShape = ProximityStatsManager.EventShape.CIRCLE;
            } else if (shape instanceof PolygonalShape) {
                eventShape = ProximityStatsManager.EventShape.POLYGON;
            } else if (shape instanceof RectangularShape) {
                eventShape = ProximityStatsManager.EventShape.RECTANGLE;
            } else {
                ((Logger) this.f26205a.getD()).w("TriggerEvent", "onEntered: unknown shape - " + shape);
                eventShape = ProximityStatsManager.EventShape.CIRCLE;
            }
            proximityStatsManager.onEventTriggered(proximityEventOrigin, z, eventShape);
        }
        this.c = true;
    }

    public abstract void onExited(@NotNull Region region);

    @NotNull
    public String toString() {
        return "TriggerEvents{type=" + getClass().getSimpleName() + '}';
    }
}
