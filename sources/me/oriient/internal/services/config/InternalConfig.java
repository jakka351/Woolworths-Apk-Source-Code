package me.oriient.internal.services.config;

import androidx.annotation.Keep;
import com.medallia.digital.mobilesdk.l3;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.services.dataModel.auth.AuthConfig;
import me.oriient.internal.services.dataModel.auth.AuthConfigResponse;
import me.oriient.internal.services.dataModel.engine.MapGridFetchingStrategy;
import me.oriient.internal.services.dataModel.engine.MapGridType;
import me.oriient.internal.services.dataModel.geofence.GeofenceConfig;
import me.oriient.internal.services.dataModel.geofence.GeofenceConfigResponse;
import me.oriient.internal.services.dataModel.plai.PlaiConfig;
import me.oriient.internal.services.dataModel.plai.PlaiConfigResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t¢\u0006\u0002\u0010\u0019J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0015HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0012HÆ\u0003J\u0095\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\tHÆ\u0001J\u0013\u0010>\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0012HÖ\u0001J\t\u0010A\u001a\u00020BHÖ\u0001R\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010%R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0018\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%¨\u0006C"}, d2 = {"Lme/oriient/internal/services/config/InternalConfig;", "", "authConfig", "Lme/oriient/internal/services/dataModel/auth/AuthConfig;", "commonDataRepositoryConfig", "Lme/oriient/internal/services/config/CommonDataRepositoryConfig;", "mapMetadataExpirationTimeMillis", "", "isMapImagesPreloadingEnabled", "", "geofenceConfig", "Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;", "mapGridUrlExpirationTimeMillis", "mapGridFetchingStrategy", "Lme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;", "mapGridType", "Lme/oriient/internal/services/dataModel/engine/MapGridType;", "downloadExitRegionsRetryCount", "", "downloadExitRegionsRetryIntervalMillis", "plaiConfig", "Lme/oriient/internal/services/dataModel/plai/PlaiConfig;", "appSessionMaxInactivityMillis", "isSilentModeEnabled", "useFusedLocationProvider", "(Lme/oriient/internal/services/dataModel/auth/AuthConfig;Lme/oriient/internal/services/config/CommonDataRepositoryConfig;JZLme/oriient/internal/services/dataModel/geofence/GeofenceConfig;JLme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;Lme/oriient/internal/services/dataModel/engine/MapGridType;IJLme/oriient/internal/services/dataModel/plai/PlaiConfig;JZZ)V", "getAppSessionMaxInactivityMillis", "()J", "getAuthConfig", "()Lme/oriient/internal/services/dataModel/auth/AuthConfig;", "getCommonDataRepositoryConfig", "()Lme/oriient/internal/services/config/CommonDataRepositoryConfig;", "getDownloadExitRegionsRetryCount", "()I", "getDownloadExitRegionsRetryIntervalMillis", "getGeofenceConfig", "()Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;", "()Z", "getMapGridFetchingStrategy", "()Lme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;", "getMapGridType", "()Lme/oriient/internal/services/dataModel/engine/MapGridType;", "getMapGridUrlExpirationTimeMillis", "getMapMetadataExpirationTimeMillis", "getPlaiConfig", "()Lme/oriient/internal/services/dataModel/plai/PlaiConfig;", "getUseFusedLocationProvider", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalConfig {
    private final long appSessionMaxInactivityMillis;

    @NotNull
    private final AuthConfig authConfig;

    @NotNull
    private final CommonDataRepositoryConfig commonDataRepositoryConfig;
    private final int downloadExitRegionsRetryCount;
    private final long downloadExitRegionsRetryIntervalMillis;

    @NotNull
    private final GeofenceConfig geofenceConfig;
    private final boolean isMapImagesPreloadingEnabled;
    private final boolean isSilentModeEnabled;

    @NotNull
    private final MapGridFetchingStrategy mapGridFetchingStrategy;

    @NotNull
    private final MapGridType mapGridType;
    private final long mapGridUrlExpirationTimeMillis;
    private final long mapMetadataExpirationTimeMillis;

    @NotNull
    private final PlaiConfig plaiConfig;
    private final boolean useFusedLocationProvider;

    public InternalConfig() {
        this(null, null, 0L, false, null, 0L, null, null, 0, 0L, null, 0L, false, false, 16383, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /* renamed from: component10, reason: from getter */
    public final long getDownloadExitRegionsRetryIntervalMillis() {
        return this.downloadExitRegionsRetryIntervalMillis;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final PlaiConfig getPlaiConfig() {
        return this.plaiConfig;
    }

    /* renamed from: component12, reason: from getter */
    public final long getAppSessionMaxInactivityMillis() {
        return this.appSessionMaxInactivityMillis;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsSilentModeEnabled() {
        return this.isSilentModeEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getUseFusedLocationProvider() {
        return this.useFusedLocationProvider;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CommonDataRepositoryConfig getCommonDataRepositoryConfig() {
        return this.commonDataRepositoryConfig;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMapMetadataExpirationTimeMillis() {
        return this.mapMetadataExpirationTimeMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsMapImagesPreloadingEnabled() {
        return this.isMapImagesPreloadingEnabled;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final GeofenceConfig getGeofenceConfig() {
        return this.geofenceConfig;
    }

    /* renamed from: component6, reason: from getter */
    public final long getMapGridUrlExpirationTimeMillis() {
        return this.mapGridUrlExpirationTimeMillis;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final MapGridFetchingStrategy getMapGridFetchingStrategy() {
        return this.mapGridFetchingStrategy;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final MapGridType getMapGridType() {
        return this.mapGridType;
    }

    /* renamed from: component9, reason: from getter */
    public final int getDownloadExitRegionsRetryCount() {
        return this.downloadExitRegionsRetryCount;
    }

    @NotNull
    public final InternalConfig copy(@NotNull AuthConfig authConfig, @NotNull CommonDataRepositoryConfig commonDataRepositoryConfig, long mapMetadataExpirationTimeMillis, boolean isMapImagesPreloadingEnabled, @NotNull GeofenceConfig geofenceConfig, long mapGridUrlExpirationTimeMillis, @NotNull MapGridFetchingStrategy mapGridFetchingStrategy, @NotNull MapGridType mapGridType, int downloadExitRegionsRetryCount, long downloadExitRegionsRetryIntervalMillis, @NotNull PlaiConfig plaiConfig, long appSessionMaxInactivityMillis, boolean isSilentModeEnabled, boolean useFusedLocationProvider) {
        Intrinsics.h(authConfig, "authConfig");
        Intrinsics.h(commonDataRepositoryConfig, "commonDataRepositoryConfig");
        Intrinsics.h(geofenceConfig, "geofenceConfig");
        Intrinsics.h(mapGridFetchingStrategy, "mapGridFetchingStrategy");
        Intrinsics.h(mapGridType, "mapGridType");
        Intrinsics.h(plaiConfig, "plaiConfig");
        return new InternalConfig(authConfig, commonDataRepositoryConfig, mapMetadataExpirationTimeMillis, isMapImagesPreloadingEnabled, geofenceConfig, mapGridUrlExpirationTimeMillis, mapGridFetchingStrategy, mapGridType, downloadExitRegionsRetryCount, downloadExitRegionsRetryIntervalMillis, plaiConfig, appSessionMaxInactivityMillis, isSilentModeEnabled, useFusedLocationProvider);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalConfig)) {
            return false;
        }
        InternalConfig internalConfig = (InternalConfig) other;
        return Intrinsics.c(this.authConfig, internalConfig.authConfig) && Intrinsics.c(this.commonDataRepositoryConfig, internalConfig.commonDataRepositoryConfig) && this.mapMetadataExpirationTimeMillis == internalConfig.mapMetadataExpirationTimeMillis && this.isMapImagesPreloadingEnabled == internalConfig.isMapImagesPreloadingEnabled && Intrinsics.c(this.geofenceConfig, internalConfig.geofenceConfig) && this.mapGridUrlExpirationTimeMillis == internalConfig.mapGridUrlExpirationTimeMillis && this.mapGridFetchingStrategy == internalConfig.mapGridFetchingStrategy && this.mapGridType == internalConfig.mapGridType && this.downloadExitRegionsRetryCount == internalConfig.downloadExitRegionsRetryCount && this.downloadExitRegionsRetryIntervalMillis == internalConfig.downloadExitRegionsRetryIntervalMillis && Intrinsics.c(this.plaiConfig, internalConfig.plaiConfig) && this.appSessionMaxInactivityMillis == internalConfig.appSessionMaxInactivityMillis && this.isSilentModeEnabled == internalConfig.isSilentModeEnabled && this.useFusedLocationProvider == internalConfig.useFusedLocationProvider;
    }

    public final long getAppSessionMaxInactivityMillis() {
        return this.appSessionMaxInactivityMillis;
    }

    @NotNull
    public final AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    @NotNull
    public final CommonDataRepositoryConfig getCommonDataRepositoryConfig() {
        return this.commonDataRepositoryConfig;
    }

    public final int getDownloadExitRegionsRetryCount() {
        return this.downloadExitRegionsRetryCount;
    }

    public final long getDownloadExitRegionsRetryIntervalMillis() {
        return this.downloadExitRegionsRetryIntervalMillis;
    }

    @NotNull
    public final GeofenceConfig getGeofenceConfig() {
        return this.geofenceConfig;
    }

    @NotNull
    public final MapGridFetchingStrategy getMapGridFetchingStrategy() {
        return this.mapGridFetchingStrategy;
    }

    @NotNull
    public final MapGridType getMapGridType() {
        return this.mapGridType;
    }

    public final long getMapGridUrlExpirationTimeMillis() {
        return this.mapGridUrlExpirationTimeMillis;
    }

    public final long getMapMetadataExpirationTimeMillis() {
        return this.mapMetadataExpirationTimeMillis;
    }

    @NotNull
    public final PlaiConfig getPlaiConfig() {
        return this.plaiConfig;
    }

    public final boolean getUseFusedLocationProvider() {
        return this.useFusedLocationProvider;
    }

    public int hashCode() {
        return Boolean.hashCode(this.useFusedLocationProvider) + me.oriient.internal.infra.scheduler.a.a(this.isSilentModeEnabled, K.a(this.appSessionMaxInactivityMillis, (this.plaiConfig.hashCode() + K.a(this.downloadExitRegionsRetryIntervalMillis, a.a(this.downloadExitRegionsRetryCount, (this.mapGridType.hashCode() + ((this.mapGridFetchingStrategy.hashCode() + K.a(this.mapGridUrlExpirationTimeMillis, (this.geofenceConfig.hashCode() + me.oriient.internal.infra.scheduler.a.a(this.isMapImagesPreloadingEnabled, K.a(this.mapMetadataExpirationTimeMillis, (this.commonDataRepositoryConfig.hashCode() + (this.authConfig.hashCode() * 31)) * 31, 31), 31)) * 31, 31)) * 31)) * 31, 31), 31)) * 31, 31), 31);
    }

    public final boolean isMapImagesPreloadingEnabled() {
        return this.isMapImagesPreloadingEnabled;
    }

    public final boolean isSilentModeEnabled() {
        return this.isSilentModeEnabled;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("InternalConfig(authConfig=");
        sb.append(this.authConfig);
        sb.append(", commonDataRepositoryConfig=");
        sb.append(this.commonDataRepositoryConfig);
        sb.append(", mapMetadataExpirationTimeMillis=");
        sb.append(this.mapMetadataExpirationTimeMillis);
        sb.append(", isMapImagesPreloadingEnabled=");
        sb.append(this.isMapImagesPreloadingEnabled);
        sb.append(", geofenceConfig=");
        sb.append(this.geofenceConfig);
        sb.append(", mapGridUrlExpirationTimeMillis=");
        sb.append(this.mapGridUrlExpirationTimeMillis);
        sb.append(", mapGridFetchingStrategy=");
        sb.append(this.mapGridFetchingStrategy);
        sb.append(", mapGridType=");
        sb.append(this.mapGridType);
        sb.append(", downloadExitRegionsRetryCount=");
        sb.append(this.downloadExitRegionsRetryCount);
        sb.append(", downloadExitRegionsRetryIntervalMillis=");
        sb.append(this.downloadExitRegionsRetryIntervalMillis);
        sb.append(", plaiConfig=");
        sb.append(this.plaiConfig);
        sb.append(", appSessionMaxInactivityMillis=");
        sb.append(this.appSessionMaxInactivityMillis);
        sb.append(", isSilentModeEnabled=");
        sb.append(this.isSilentModeEnabled);
        sb.append(", useFusedLocationProvider=");
        return androidx.camera.core.impl.b.s(sb, this.useFusedLocationProvider, ')');
    }

    public InternalConfig(@NotNull AuthConfig authConfig, @NotNull CommonDataRepositoryConfig commonDataRepositoryConfig, long j, boolean z, @NotNull GeofenceConfig geofenceConfig, long j2, @NotNull MapGridFetchingStrategy mapGridFetchingStrategy, @NotNull MapGridType mapGridType, int i, long j3, @NotNull PlaiConfig plaiConfig, long j4, boolean z2, boolean z3) {
        Intrinsics.h(authConfig, "authConfig");
        Intrinsics.h(commonDataRepositoryConfig, "commonDataRepositoryConfig");
        Intrinsics.h(geofenceConfig, "geofenceConfig");
        Intrinsics.h(mapGridFetchingStrategy, "mapGridFetchingStrategy");
        Intrinsics.h(mapGridType, "mapGridType");
        Intrinsics.h(plaiConfig, "plaiConfig");
        this.authConfig = authConfig;
        this.commonDataRepositoryConfig = commonDataRepositoryConfig;
        this.mapMetadataExpirationTimeMillis = j;
        this.isMapImagesPreloadingEnabled = z;
        this.geofenceConfig = geofenceConfig;
        this.mapGridUrlExpirationTimeMillis = j2;
        this.mapGridFetchingStrategy = mapGridFetchingStrategy;
        this.mapGridType = mapGridType;
        this.downloadExitRegionsRetryCount = i;
        this.downloadExitRegionsRetryIntervalMillis = j3;
        this.plaiConfig = plaiConfig;
        this.appSessionMaxInactivityMillis = j4;
        this.isSilentModeEnabled = z2;
        this.useFusedLocationProvider = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InternalConfig(AuthConfig authConfig, CommonDataRepositoryConfig commonDataRepositoryConfig, long j, boolean z, GeofenceConfig geofenceConfig, long j2, MapGridFetchingStrategy mapGridFetchingStrategy, MapGridType mapGridType, int i, long j3, PlaiConfig plaiConfig, long j4, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        AuthConfig authConfig2;
        boolean z4;
        long millis;
        AuthConfig authConfig3 = (i2 & 1) != 0 ? new AuthConfigResponse((Integer) null, (Double) null, (Double) null, (Integer) null, (Double) null, (Double) null, (Long) null, 127, (DefaultConstructorMarker) null).toAuthConfig() : authConfig;
        CommonDataRepositoryConfig commonDataRepositoryConfig2 = (i2 & 2) != 0 ? new CommonDataRepositoryConfig(0, 0, 0, 0, 15, null) : commonDataRepositoryConfig;
        long millis2 = (i2 & 4) != 0 ? TimeUnit.MINUTES.toMillis(45L) : j;
        boolean z5 = (i2 & 8) != 0 ? true : z;
        GeofenceConfig geofenceConfig2 = (i2 & 16) != 0 ? new GeofenceConfigResponse((Float) null, (Float) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Boolean) null, (Double) null, (Boolean) null, l3.b, (DefaultConstructorMarker) null).toGeofenceConfig() : geofenceConfig;
        long millis3 = (i2 & 32) != 0 ? TimeUnit.MINUTES.toMillis(5L) : j2;
        MapGridFetchingStrategy mapGridFetchingStrategy2 = (i2 & 64) != 0 ? MapGridFetchingStrategy.ENFORCE_MAJOR : mapGridFetchingStrategy;
        MapGridType mapGridType2 = (i2 & 128) != 0 ? MapGridType.PUBLIC : mapGridType;
        int i3 = (i2 & 256) != 0 ? 5 : i;
        long millis4 = (i2 & 512) != 0 ? TimeUnit.MINUTES.toMillis(5L) : j3;
        PlaiConfig plaiConfig2 = (i2 & 1024) != 0 ? new PlaiConfigResponse(false, 0, 0, false, 0.0d, 0L, false, 0.0d, 255, (DefaultConstructorMarker) null).toPlaiConfig() : plaiConfig;
        if ((i2 & 2048) != 0) {
            authConfig2 = authConfig3;
            z4 = z5;
            millis = TimeUnit.HOURS.toMillis(2L);
        } else {
            authConfig2 = authConfig3;
            z4 = z5;
            millis = j4;
        }
        this(authConfig2, commonDataRepositoryConfig2, millis2, z4, geofenceConfig2, millis3, mapGridFetchingStrategy2, mapGridType2, i3, millis4, plaiConfig2, millis, (i2 & 4096) != 0 ? true : z2, (i2 & 8192) != 0 ? false : z3);
    }
}
