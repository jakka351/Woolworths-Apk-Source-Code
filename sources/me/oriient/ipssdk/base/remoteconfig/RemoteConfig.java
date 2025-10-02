package me.oriient.ipssdk.base.remoteconfig;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.dataModel.auth.AuthConfig;
import me.oriient.internal.services.dataModel.engine.ExtraEngineConfig;
import me.oriient.internal.services.dataModel.geofence.GeofenceConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0016¨\u0006/"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/RemoteConfig;", "", "Ljava/util/UUID;", "id", "Lme/oriient/ipssdk/base/remoteconfig/CommonConfig;", "common", "Lme/oriient/ipssdk/base/remoteconfig/RealTimeConfig;", "realTime", "Lme/oriient/internal/services/dataModel/engine/ExtraEngineConfig;", "extraEngineConfigs", "<init>", "(Ljava/util/UUID;Lme/oriient/ipssdk/base/remoteconfig/CommonConfig;Lme/oriient/ipssdk/base/remoteconfig/RealTimeConfig;Lme/oriient/internal/services/dataModel/engine/ExtraEngineConfig;)V", "Lme/oriient/internal/services/config/InternalConfig;", "toInternalConfig", "()Lme/oriient/internal/services/config/InternalConfig;", "component1", "()Ljava/util/UUID;", "component2", "()Lme/oriient/ipssdk/base/remoteconfig/CommonConfig;", "component3", "()Lme/oriient/ipssdk/base/remoteconfig/RealTimeConfig;", "component4", "()Lme/oriient/internal/services/dataModel/engine/ExtraEngineConfig;", "copy", "(Ljava/util/UUID;Lme/oriient/ipssdk/base/remoteconfig/CommonConfig;Lme/oriient/ipssdk/base/remoteconfig/RealTimeConfig;Lme/oriient/internal/services/dataModel/engine/ExtraEngineConfig;)Lme/oriient/ipssdk/base/remoteconfig/RemoteConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getId", "b", "Lme/oriient/ipssdk/base/remoteconfig/CommonConfig;", "getCommon", "c", "Lme/oriient/ipssdk/base/remoteconfig/RealTimeConfig;", "getRealTime", "d", "Lme/oriient/internal/services/dataModel/engine/ExtraEngineConfig;", "getExtraEngineConfigs", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RemoteConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UUID id;

    /* renamed from: b, reason: from kotlin metadata */
    private final CommonConfig common;

    /* renamed from: c, reason: from kotlin metadata */
    private final RealTimeConfig realTime;

    /* renamed from: d, reason: from kotlin metadata */
    private final ExtraEngineConfig extraEngineConfigs;

    public RemoteConfig(@NotNull UUID id, @NotNull CommonConfig common, @NotNull RealTimeConfig realTime, @NotNull ExtraEngineConfig extraEngineConfigs) {
        Intrinsics.h(id, "id");
        Intrinsics.h(common, "common");
        Intrinsics.h(realTime, "realTime");
        Intrinsics.h(extraEngineConfigs, "extraEngineConfigs");
        this.id = id;
        this.common = common;
        this.realTime = realTime;
        this.extraEngineConfigs = extraEngineConfigs;
    }

    public static /* synthetic */ RemoteConfig copy$default(RemoteConfig remoteConfig, UUID uuid, CommonConfig commonConfig, RealTimeConfig realTimeConfig, ExtraEngineConfig extraEngineConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = remoteConfig.id;
        }
        if ((i & 2) != 0) {
            commonConfig = remoteConfig.common;
        }
        if ((i & 4) != 0) {
            realTimeConfig = remoteConfig.realTime;
        }
        if ((i & 8) != 0) {
            extraEngineConfig = remoteConfig.extraEngineConfigs;
        }
        return remoteConfig.copy(uuid, commonConfig, realTimeConfig, extraEngineConfig);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CommonConfig getCommon() {
        return this.common;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RealTimeConfig getRealTime() {
        return this.realTime;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ExtraEngineConfig getExtraEngineConfigs() {
        return this.extraEngineConfigs;
    }

    @NotNull
    public final RemoteConfig copy(@NotNull UUID id, @NotNull CommonConfig common, @NotNull RealTimeConfig realTime, @NotNull ExtraEngineConfig extraEngineConfigs) {
        Intrinsics.h(id, "id");
        Intrinsics.h(common, "common");
        Intrinsics.h(realTime, "realTime");
        Intrinsics.h(extraEngineConfigs, "extraEngineConfigs");
        return new RemoteConfig(id, common, realTime, extraEngineConfigs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteConfig)) {
            return false;
        }
        RemoteConfig remoteConfig = (RemoteConfig) other;
        return Intrinsics.c(this.id, remoteConfig.id) && Intrinsics.c(this.common, remoteConfig.common) && Intrinsics.c(this.realTime, remoteConfig.realTime) && Intrinsics.c(this.extraEngineConfigs, remoteConfig.extraEngineConfigs);
    }

    @NotNull
    public final CommonConfig getCommon() {
        return this.common;
    }

    @NotNull
    public final ExtraEngineConfig getExtraEngineConfigs() {
        return this.extraEngineConfigs;
    }

    @NotNull
    public final UUID getId() {
        return this.id;
    }

    @NotNull
    public final RealTimeConfig getRealTime() {
        return this.realTime;
    }

    public int hashCode() {
        return this.extraEngineConfigs.hashCode() + ((this.realTime.hashCode() + ((this.common.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final InternalConfig toInternalConfig() {
        AuthConfig authConfig = this.common.getAuthConfig();
        GeofenceConfig geofence = this.realTime.getGeofence();
        double mapDataExpirationTimeMinutes = this.realTime.getMisc().getMapDataExpirationTimeMinutes();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        return new InternalConfig(authConfig, this.common.getCommonDataRepositoryConfig(), (long) (mapDataExpirationTimeMinutes * timeUnit.toMillis(1L)), this.realTime.getMisc().isMapImagesPreloadingEnabled(), geofence, (long) (this.extraEngineConfigs.getMapGridUrlExpirationTimeMinutes() * timeUnit.toMillis(1L)), this.extraEngineConfigs.getMapGridFetchingStrategy(), this.extraEngineConfigs.getMapGridType(), this.realTime.getPositioning().getAutoStop().getDownloadExitRegionsRetryCount(), this.realTime.getPositioning().getAutoStop().getDownloadExitRegionsRetryIntervalMillis(), this.realTime.getPlaiConfig(), this.common.getMisc().getAppSessionMaxInactivityMillis(), this.common.getMisc().isSilentModeEnabled(), this.common.getMisc().getUseFusedLocationProvider());
    }

    @NotNull
    public String toString() {
        return "RemoteConfig(id=" + this.id + ", common=" + this.common + ", realTime=" + this.realTime + ", extraEngineConfigs=" + this.extraEngineConfigs + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RemoteConfig(UUID uuid, CommonConfig commonConfig, RealTimeConfig realTimeConfig, ExtraEngineConfig extraEngineConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.g(uuid, "randomUUID(...)");
        }
        this(uuid, commonConfig, realTimeConfig, extraEngineConfig);
    }
}
