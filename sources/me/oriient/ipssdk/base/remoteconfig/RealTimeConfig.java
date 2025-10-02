package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataModel.geofence.GeofenceConfig;
import me.oriient.internal.services.dataModel.navigation.NavigationConfig;
import me.oriient.internal.services.dataModel.navigation.turnByTurn.TurnByTurnConfig;
import me.oriient.internal.services.dataModel.plai.PlaiConfig;
import me.oriient.internal.services.dataModel.positioning.PositioningConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010#¨\u0006H"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/RealTimeConfig;", "", "Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;", "navigationConfig", "Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;", "turnByTurnConfig", "Lme/oriient/ipssdk/base/remoteconfig/AutoCalibConfig;", "autoCalibration", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;", "positioning", "Lme/oriient/ipssdk/base/remoteconfig/MiscRealtimeConfig;", "misc", "Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;", "geofence", "Lme/oriient/ipssdk/base/remoteconfig/ProximityConfig;", "proximityConfig", "Lme/oriient/internal/services/dataModel/plai/PlaiConfig;", "plaiConfig", "<init>", "(Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;Lme/oriient/ipssdk/base/remoteconfig/AutoCalibConfig;Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;Lme/oriient/ipssdk/base/remoteconfig/MiscRealtimeConfig;Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;Lme/oriient/ipssdk/base/remoteconfig/ProximityConfig;Lme/oriient/internal/services/dataModel/plai/PlaiConfig;)V", "component1", "()Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;", "component2", "()Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;", "component3", "()Lme/oriient/ipssdk/base/remoteconfig/AutoCalibConfig;", "component4", "()Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;", "component5", "()Lme/oriient/ipssdk/base/remoteconfig/MiscRealtimeConfig;", "component6", "()Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;", "component7", "()Lme/oriient/ipssdk/base/remoteconfig/ProximityConfig;", "component8", "()Lme/oriient/internal/services/dataModel/plai/PlaiConfig;", "copy", "(Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;Lme/oriient/ipssdk/base/remoteconfig/AutoCalibConfig;Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;Lme/oriient/ipssdk/base/remoteconfig/MiscRealtimeConfig;Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;Lme/oriient/ipssdk/base/remoteconfig/ProximityConfig;Lme/oriient/internal/services/dataModel/plai/PlaiConfig;)Lme/oriient/ipssdk/base/remoteconfig/RealTimeConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;", "getNavigationConfig", "b", "Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;", "getTurnByTurnConfig", "c", "Lme/oriient/ipssdk/base/remoteconfig/AutoCalibConfig;", "getAutoCalibration", "d", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;", "getPositioning", "e", "Lme/oriient/ipssdk/base/remoteconfig/MiscRealtimeConfig;", "getMisc", "f", "Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;", "getGeofence", "g", "Lme/oriient/ipssdk/base/remoteconfig/ProximityConfig;", "getProximityConfig", "h", "Lme/oriient/internal/services/dataModel/plai/PlaiConfig;", "getPlaiConfig", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RealTimeConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NavigationConfig navigationConfig;

    /* renamed from: b, reason: from kotlin metadata */
    private final TurnByTurnConfig turnByTurnConfig;

    /* renamed from: c, reason: from kotlin metadata */
    private final AutoCalibConfig autoCalibration;

    /* renamed from: d, reason: from kotlin metadata */
    private final PositioningConfig positioning;

    /* renamed from: e, reason: from kotlin metadata */
    private final MiscRealtimeConfig misc;

    /* renamed from: f, reason: from kotlin metadata */
    private final GeofenceConfig geofence;

    /* renamed from: g, reason: from kotlin metadata */
    private final ProximityConfig proximityConfig;

    /* renamed from: h, reason: from kotlin metadata */
    private final PlaiConfig plaiConfig;

    public RealTimeConfig(@NotNull NavigationConfig navigationConfig, @NotNull TurnByTurnConfig turnByTurnConfig, @NotNull AutoCalibConfig autoCalibration, @NotNull PositioningConfig positioning, @NotNull MiscRealtimeConfig misc, @NotNull GeofenceConfig geofence, @NotNull ProximityConfig proximityConfig, @NotNull PlaiConfig plaiConfig) {
        Intrinsics.h(navigationConfig, "navigationConfig");
        Intrinsics.h(turnByTurnConfig, "turnByTurnConfig");
        Intrinsics.h(autoCalibration, "autoCalibration");
        Intrinsics.h(positioning, "positioning");
        Intrinsics.h(misc, "misc");
        Intrinsics.h(geofence, "geofence");
        Intrinsics.h(proximityConfig, "proximityConfig");
        Intrinsics.h(plaiConfig, "plaiConfig");
        this.navigationConfig = navigationConfig;
        this.turnByTurnConfig = turnByTurnConfig;
        this.autoCalibration = autoCalibration;
        this.positioning = positioning;
        this.misc = misc;
        this.geofence = geofence;
        this.proximityConfig = proximityConfig;
        this.plaiConfig = plaiConfig;
    }

    public static /* synthetic */ RealTimeConfig copy$default(RealTimeConfig realTimeConfig, NavigationConfig navigationConfig, TurnByTurnConfig turnByTurnConfig, AutoCalibConfig autoCalibConfig, PositioningConfig positioningConfig, MiscRealtimeConfig miscRealtimeConfig, GeofenceConfig geofenceConfig, ProximityConfig proximityConfig, PlaiConfig plaiConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            navigationConfig = realTimeConfig.navigationConfig;
        }
        if ((i & 2) != 0) {
            turnByTurnConfig = realTimeConfig.turnByTurnConfig;
        }
        if ((i & 4) != 0) {
            autoCalibConfig = realTimeConfig.autoCalibration;
        }
        if ((i & 8) != 0) {
            positioningConfig = realTimeConfig.positioning;
        }
        if ((i & 16) != 0) {
            miscRealtimeConfig = realTimeConfig.misc;
        }
        if ((i & 32) != 0) {
            geofenceConfig = realTimeConfig.geofence;
        }
        if ((i & 64) != 0) {
            proximityConfig = realTimeConfig.proximityConfig;
        }
        if ((i & 128) != 0) {
            plaiConfig = realTimeConfig.plaiConfig;
        }
        ProximityConfig proximityConfig2 = proximityConfig;
        PlaiConfig plaiConfig2 = plaiConfig;
        MiscRealtimeConfig miscRealtimeConfig2 = miscRealtimeConfig;
        GeofenceConfig geofenceConfig2 = geofenceConfig;
        return realTimeConfig.copy(navigationConfig, turnByTurnConfig, autoCalibConfig, positioningConfig, miscRealtimeConfig2, geofenceConfig2, proximityConfig2, plaiConfig2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NavigationConfig getNavigationConfig() {
        return this.navigationConfig;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TurnByTurnConfig getTurnByTurnConfig() {
        return this.turnByTurnConfig;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AutoCalibConfig getAutoCalibration() {
        return this.autoCalibration;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PositioningConfig getPositioning() {
        return this.positioning;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final MiscRealtimeConfig getMisc() {
        return this.misc;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final GeofenceConfig getGeofence() {
        return this.geofence;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final ProximityConfig getProximityConfig() {
        return this.proximityConfig;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final PlaiConfig getPlaiConfig() {
        return this.plaiConfig;
    }

    @NotNull
    public final RealTimeConfig copy(@NotNull NavigationConfig navigationConfig, @NotNull TurnByTurnConfig turnByTurnConfig, @NotNull AutoCalibConfig autoCalibration, @NotNull PositioningConfig positioning, @NotNull MiscRealtimeConfig misc, @NotNull GeofenceConfig geofence, @NotNull ProximityConfig proximityConfig, @NotNull PlaiConfig plaiConfig) {
        Intrinsics.h(navigationConfig, "navigationConfig");
        Intrinsics.h(turnByTurnConfig, "turnByTurnConfig");
        Intrinsics.h(autoCalibration, "autoCalibration");
        Intrinsics.h(positioning, "positioning");
        Intrinsics.h(misc, "misc");
        Intrinsics.h(geofence, "geofence");
        Intrinsics.h(proximityConfig, "proximityConfig");
        Intrinsics.h(plaiConfig, "plaiConfig");
        return new RealTimeConfig(navigationConfig, turnByTurnConfig, autoCalibration, positioning, misc, geofence, proximityConfig, plaiConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealTimeConfig)) {
            return false;
        }
        RealTimeConfig realTimeConfig = (RealTimeConfig) other;
        return Intrinsics.c(this.navigationConfig, realTimeConfig.navigationConfig) && Intrinsics.c(this.turnByTurnConfig, realTimeConfig.turnByTurnConfig) && Intrinsics.c(this.autoCalibration, realTimeConfig.autoCalibration) && Intrinsics.c(this.positioning, realTimeConfig.positioning) && Intrinsics.c(this.misc, realTimeConfig.misc) && Intrinsics.c(this.geofence, realTimeConfig.geofence) && Intrinsics.c(this.proximityConfig, realTimeConfig.proximityConfig) && Intrinsics.c(this.plaiConfig, realTimeConfig.plaiConfig);
    }

    @NotNull
    public final AutoCalibConfig getAutoCalibration() {
        return this.autoCalibration;
    }

    @NotNull
    public final GeofenceConfig getGeofence() {
        return this.geofence;
    }

    @NotNull
    public final MiscRealtimeConfig getMisc() {
        return this.misc;
    }

    @NotNull
    public final NavigationConfig getNavigationConfig() {
        return this.navigationConfig;
    }

    @NotNull
    public final PlaiConfig getPlaiConfig() {
        return this.plaiConfig;
    }

    @NotNull
    public final PositioningConfig getPositioning() {
        return this.positioning;
    }

    @NotNull
    public final ProximityConfig getProximityConfig() {
        return this.proximityConfig;
    }

    @NotNull
    public final TurnByTurnConfig getTurnByTurnConfig() {
        return this.turnByTurnConfig;
    }

    public int hashCode() {
        return this.plaiConfig.hashCode() + ((this.proximityConfig.hashCode() + ((this.geofence.hashCode() + ((this.misc.hashCode() + ((this.positioning.hashCode() + ((this.autoCalibration.hashCode() + ((this.turnByTurnConfig.hashCode() + (this.navigationConfig.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "RealTimeConfig(navigationConfig=" + this.navigationConfig + ", turnByTurnConfig=" + this.turnByTurnConfig + ", autoCalibration=" + this.autoCalibration + ", positioning=" + this.positioning + ", misc=" + this.misc + ", geofence=" + this.geofence + ", proximityConfig=" + this.proximityConfig + ", plaiConfig=" + this.plaiConfig + ')';
    }
}
