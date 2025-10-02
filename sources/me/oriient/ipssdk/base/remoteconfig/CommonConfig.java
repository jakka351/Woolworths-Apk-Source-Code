package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.config.CommonDataRepositoryConfig;
import me.oriient.internal.services.dataModel.auth.AuthConfig;
import me.oriient.internal.services.dataModel.sensors.SensorManagerConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001f¨\u0006A"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/CommonConfig;", "", "Lme/oriient/internal/services/dataModel/auth/AuthConfig;", "authConfig", "Lme/oriient/ipssdk/base/remoteconfig/ELogConfig;", "eLog", "Lme/oriient/ipssdk/base/remoteconfig/RestConfig;", "rest", "Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "sensorManager", "Lme/oriient/internal/services/config/CommonDataRepositoryConfig;", "commonDataRepositoryConfig", "Lme/oriient/ipssdk/base/remoteconfig/MiscCommonConfig;", "misc", "Lme/oriient/ipssdk/base/remoteconfig/SnappingConfig;", "snapping", "<init>", "(Lme/oriient/internal/services/dataModel/auth/AuthConfig;Lme/oriient/ipssdk/base/remoteconfig/ELogConfig;Lme/oriient/ipssdk/base/remoteconfig/RestConfig;Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;Lme/oriient/internal/services/config/CommonDataRepositoryConfig;Lme/oriient/ipssdk/base/remoteconfig/MiscCommonConfig;Lme/oriient/ipssdk/base/remoteconfig/SnappingConfig;)V", "component1", "()Lme/oriient/internal/services/dataModel/auth/AuthConfig;", "component2", "()Lme/oriient/ipssdk/base/remoteconfig/ELogConfig;", "component3", "()Lme/oriient/ipssdk/base/remoteconfig/RestConfig;", "component4", "()Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "component5", "()Lme/oriient/internal/services/config/CommonDataRepositoryConfig;", "component6", "()Lme/oriient/ipssdk/base/remoteconfig/MiscCommonConfig;", "component7", "()Lme/oriient/ipssdk/base/remoteconfig/SnappingConfig;", "copy", "(Lme/oriient/internal/services/dataModel/auth/AuthConfig;Lme/oriient/ipssdk/base/remoteconfig/ELogConfig;Lme/oriient/ipssdk/base/remoteconfig/RestConfig;Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;Lme/oriient/internal/services/config/CommonDataRepositoryConfig;Lme/oriient/ipssdk/base/remoteconfig/MiscCommonConfig;Lme/oriient/ipssdk/base/remoteconfig/SnappingConfig;)Lme/oriient/ipssdk/base/remoteconfig/CommonConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lme/oriient/internal/services/dataModel/auth/AuthConfig;", "getAuthConfig", "b", "Lme/oriient/ipssdk/base/remoteconfig/ELogConfig;", "getELog", "c", "Lme/oriient/ipssdk/base/remoteconfig/RestConfig;", "getRest", "d", "Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "getSensorManager", "e", "Lme/oriient/internal/services/config/CommonDataRepositoryConfig;", "getCommonDataRepositoryConfig", "f", "Lme/oriient/ipssdk/base/remoteconfig/MiscCommonConfig;", "getMisc", "g", "Lme/oriient/ipssdk/base/remoteconfig/SnappingConfig;", "getSnapping", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommonConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AuthConfig authConfig;

    /* renamed from: b, reason: from kotlin metadata */
    private final ELogConfig eLog;

    /* renamed from: c, reason: from kotlin metadata */
    private final RestConfig rest;

    /* renamed from: d, reason: from kotlin metadata */
    private final SensorManagerConfig sensorManager;

    /* renamed from: e, reason: from kotlin metadata */
    private final CommonDataRepositoryConfig commonDataRepositoryConfig;

    /* renamed from: f, reason: from kotlin metadata */
    private final MiscCommonConfig misc;

    /* renamed from: g, reason: from kotlin metadata */
    private final SnappingConfig snapping;

    public CommonConfig(@NotNull AuthConfig authConfig, @NotNull ELogConfig eLog, @NotNull RestConfig rest, @NotNull SensorManagerConfig sensorManager, @NotNull CommonDataRepositoryConfig commonDataRepositoryConfig, @NotNull MiscCommonConfig misc, @NotNull SnappingConfig snapping) {
        Intrinsics.h(authConfig, "authConfig");
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(rest, "rest");
        Intrinsics.h(sensorManager, "sensorManager");
        Intrinsics.h(commonDataRepositoryConfig, "commonDataRepositoryConfig");
        Intrinsics.h(misc, "misc");
        Intrinsics.h(snapping, "snapping");
        this.authConfig = authConfig;
        this.eLog = eLog;
        this.rest = rest;
        this.sensorManager = sensorManager;
        this.commonDataRepositoryConfig = commonDataRepositoryConfig;
        this.misc = misc;
        this.snapping = snapping;
    }

    public static /* synthetic */ CommonConfig copy$default(CommonConfig commonConfig, AuthConfig authConfig, ELogConfig eLogConfig, RestConfig restConfig, SensorManagerConfig sensorManagerConfig, CommonDataRepositoryConfig commonDataRepositoryConfig, MiscCommonConfig miscCommonConfig, SnappingConfig snappingConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            authConfig = commonConfig.authConfig;
        }
        if ((i & 2) != 0) {
            eLogConfig = commonConfig.eLog;
        }
        if ((i & 4) != 0) {
            restConfig = commonConfig.rest;
        }
        if ((i & 8) != 0) {
            sensorManagerConfig = commonConfig.sensorManager;
        }
        if ((i & 16) != 0) {
            commonDataRepositoryConfig = commonConfig.commonDataRepositoryConfig;
        }
        if ((i & 32) != 0) {
            miscCommonConfig = commonConfig.misc;
        }
        if ((i & 64) != 0) {
            snappingConfig = commonConfig.snapping;
        }
        MiscCommonConfig miscCommonConfig2 = miscCommonConfig;
        SnappingConfig snappingConfig2 = snappingConfig;
        CommonDataRepositoryConfig commonDataRepositoryConfig2 = commonDataRepositoryConfig;
        RestConfig restConfig2 = restConfig;
        return commonConfig.copy(authConfig, eLogConfig, restConfig2, sensorManagerConfig, commonDataRepositoryConfig2, miscCommonConfig2, snappingConfig2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ELogConfig getELog() {
        return this.eLog;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RestConfig getRest() {
        return this.rest;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final SensorManagerConfig getSensorManager() {
        return this.sensorManager;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CommonDataRepositoryConfig getCommonDataRepositoryConfig() {
        return this.commonDataRepositoryConfig;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final MiscCommonConfig getMisc() {
        return this.misc;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final SnappingConfig getSnapping() {
        return this.snapping;
    }

    @NotNull
    public final CommonConfig copy(@NotNull AuthConfig authConfig, @NotNull ELogConfig eLog, @NotNull RestConfig rest, @NotNull SensorManagerConfig sensorManager, @NotNull CommonDataRepositoryConfig commonDataRepositoryConfig, @NotNull MiscCommonConfig misc, @NotNull SnappingConfig snapping) {
        Intrinsics.h(authConfig, "authConfig");
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(rest, "rest");
        Intrinsics.h(sensorManager, "sensorManager");
        Intrinsics.h(commonDataRepositoryConfig, "commonDataRepositoryConfig");
        Intrinsics.h(misc, "misc");
        Intrinsics.h(snapping, "snapping");
        return new CommonConfig(authConfig, eLog, rest, sensorManager, commonDataRepositoryConfig, misc, snapping);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonConfig)) {
            return false;
        }
        CommonConfig commonConfig = (CommonConfig) other;
        return Intrinsics.c(this.authConfig, commonConfig.authConfig) && Intrinsics.c(this.eLog, commonConfig.eLog) && Intrinsics.c(this.rest, commonConfig.rest) && Intrinsics.c(this.sensorManager, commonConfig.sensorManager) && Intrinsics.c(this.commonDataRepositoryConfig, commonConfig.commonDataRepositoryConfig) && Intrinsics.c(this.misc, commonConfig.misc) && Intrinsics.c(this.snapping, commonConfig.snapping);
    }

    @NotNull
    public final AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    @NotNull
    public final CommonDataRepositoryConfig getCommonDataRepositoryConfig() {
        return this.commonDataRepositoryConfig;
    }

    @NotNull
    public final ELogConfig getELog() {
        return this.eLog;
    }

    @NotNull
    public final MiscCommonConfig getMisc() {
        return this.misc;
    }

    @NotNull
    public final RestConfig getRest() {
        return this.rest;
    }

    @NotNull
    public final SensorManagerConfig getSensorManager() {
        return this.sensorManager;
    }

    @NotNull
    public final SnappingConfig getSnapping() {
        return this.snapping;
    }

    public int hashCode() {
        return this.snapping.hashCode() + ((this.misc.hashCode() + ((this.commonDataRepositoryConfig.hashCode() + ((this.sensorManager.hashCode() + ((this.rest.hashCode() + ((this.eLog.hashCode() + (this.authConfig.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CommonConfig(authConfig=" + this.authConfig + ", eLog=" + this.eLog + ", rest=" + this.rest + ", sensorManager=" + this.sensorManager + ", commonDataRepositoryConfig=" + this.commonDataRepositoryConfig + ", misc=" + this.misc + ", snapping=" + this.snapping + ')';
    }
}
