package me.oriient.positioningengine.ondevice;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.positioningengine.common.DiKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0002\u0010\u0013J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\u008b\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001J\u0013\u0010@\u001a\u00020\t2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010$\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010!R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0015R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!¨\u0006E"}, d2 = {"Lme/oriient/positioningengine/ondevice/EngineSessionMetadata;", "", "dateTime", "", "startTime", "deviceType", "", "osType", "validationMode", "", "spaceId", "sessionId", "ipsClientId", "engineVersion", "engineSessionId", "engineSessionExpiration", "", "isSmartCartMode", "flipAxes", "(JJLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZZ)V", "getDateTime", "()J", "getDeviceType", "()Ljava/lang/String;", "getEngineSessionExpiration", "()D", "getEngineSessionId", "engineSessionIdInts", "", "getEngineSessionIdInts", "()[I", "getEngineVersion", "getFlipAxes", "()Z", "formattedDateTime", "getFormattedDateTime", "formattedStartTime", "getFormattedStartTime", "getIpsClientId", "getOsType", "getSessionId", "getSpaceId", "getStartTime", "timeProvider", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "Lkotlin/Lazy;", "getValidationMode", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class EngineSessionMetadata {
    private final long dateTime;

    @NotNull
    private final String deviceType;
    private final double engineSessionExpiration;

    @NotNull
    private final String engineSessionId;

    @NotNull
    private final int[] engineSessionIdInts;

    @NotNull
    private final String engineVersion;
    private final boolean flipAxes;

    @NotNull
    private final String formattedDateTime;

    @NotNull
    private final String formattedStartTime;

    @NotNull
    private final String ipsClientId;
    private final boolean isSmartCartMode;

    @NotNull
    private final String osType;

    @NotNull
    private final String sessionId;

    @NotNull
    private final String spaceId;
    private final long startTime;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;
    private final boolean validationMode;

    public EngineSessionMetadata(long j, long j2, @NotNull String deviceType, @NotNull String osType, boolean z, @NotNull String spaceId, @NotNull String sessionId, @NotNull String ipsClientId, @NotNull String engineVersion, @NotNull String engineSessionId, double d, boolean z2, boolean z3) {
        Intrinsics.h(deviceType, "deviceType");
        Intrinsics.h(osType, "osType");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(ipsClientId, "ipsClientId");
        Intrinsics.h(engineVersion, "engineVersion");
        Intrinsics.h(engineSessionId, "engineSessionId");
        this.dateTime = j;
        this.startTime = j2;
        this.deviceType = deviceType;
        this.osType = osType;
        this.validationMode = z;
        this.spaceId = spaceId;
        this.sessionId = sessionId;
        this.ipsClientId = ipsClientId;
        this.engineVersion = engineVersion;
        this.engineSessionId = engineSessionId;
        this.engineSessionExpiration = d;
        this.isSmartCartMode = z2;
        this.flipAxes = z3;
        this.timeProvider = DiKt.getDi().inject(Reflection.f24268a.b(TimeProvider.class));
        this.formattedDateTime = me.oriient.positioningengine.common.util.a.a(j, getTimeProvider().getTimeZoneGmt());
        this.formattedStartTime = me.oriient.positioningengine.common.util.a.a(j2, getTimeProvider().getTimeZoneGmt());
        ArrayList arrayList = new ArrayList(engineSessionId.length());
        for (int i = 0; i < engineSessionId.length(); i++) {
            arrayList.add(Integer.valueOf(engineSessionId.charAt(i)));
        }
        this.engineSessionIdInts = CollectionsKt.F0(arrayList);
    }

    private final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    /* renamed from: component1, reason: from getter */
    public final long getDateTime() {
        return this.dateTime;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getEngineSessionId() {
        return this.engineSessionId;
    }

    /* renamed from: component11, reason: from getter */
    public final double getEngineSessionExpiration() {
        return this.engineSessionExpiration;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsSmartCartMode() {
        return this.isSmartCartMode;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getFlipAxes() {
        return this.flipAxes;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getOsType() {
        return this.osType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getValidationMode() {
        return this.validationMode;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getIpsClientId() {
        return this.ipsClientId;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getEngineVersion() {
        return this.engineVersion;
    }

    @NotNull
    public final EngineSessionMetadata copy(long dateTime, long startTime, @NotNull String deviceType, @NotNull String osType, boolean validationMode, @NotNull String spaceId, @NotNull String sessionId, @NotNull String ipsClientId, @NotNull String engineVersion, @NotNull String engineSessionId, double engineSessionExpiration, boolean isSmartCartMode, boolean flipAxes) {
        Intrinsics.h(deviceType, "deviceType");
        Intrinsics.h(osType, "osType");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(ipsClientId, "ipsClientId");
        Intrinsics.h(engineVersion, "engineVersion");
        Intrinsics.h(engineSessionId, "engineSessionId");
        return new EngineSessionMetadata(dateTime, startTime, deviceType, osType, validationMode, spaceId, sessionId, ipsClientId, engineVersion, engineSessionId, engineSessionExpiration, isSmartCartMode, flipAxes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineSessionMetadata)) {
            return false;
        }
        EngineSessionMetadata engineSessionMetadata = (EngineSessionMetadata) other;
        return this.dateTime == engineSessionMetadata.dateTime && this.startTime == engineSessionMetadata.startTime && Intrinsics.c(this.deviceType, engineSessionMetadata.deviceType) && Intrinsics.c(this.osType, engineSessionMetadata.osType) && this.validationMode == engineSessionMetadata.validationMode && Intrinsics.c(this.spaceId, engineSessionMetadata.spaceId) && Intrinsics.c(this.sessionId, engineSessionMetadata.sessionId) && Intrinsics.c(this.ipsClientId, engineSessionMetadata.ipsClientId) && Intrinsics.c(this.engineVersion, engineSessionMetadata.engineVersion) && Intrinsics.c(this.engineSessionId, engineSessionMetadata.engineSessionId) && Double.compare(this.engineSessionExpiration, engineSessionMetadata.engineSessionExpiration) == 0 && this.isSmartCartMode == engineSessionMetadata.isSmartCartMode && this.flipAxes == engineSessionMetadata.flipAxes;
    }

    public final long getDateTime() {
        return this.dateTime;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    public final double getEngineSessionExpiration() {
        return this.engineSessionExpiration;
    }

    @NotNull
    public final String getEngineSessionId() {
        return this.engineSessionId;
    }

    @NotNull
    public final int[] getEngineSessionIdInts() {
        return this.engineSessionIdInts;
    }

    @NotNull
    public final String getEngineVersion() {
        return this.engineVersion;
    }

    public final boolean getFlipAxes() {
        return this.flipAxes;
    }

    @NotNull
    public final String getFormattedDateTime() {
        return this.formattedDateTime;
    }

    @NotNull
    public final String getFormattedStartTime() {
        return this.formattedStartTime;
    }

    @NotNull
    public final String getIpsClientId() {
        return this.ipsClientId;
    }

    @NotNull
    public final String getOsType() {
        return this.osType;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getValidationMode() {
        return this.validationMode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.flipAxes) + me.oriient.positioningengine.common.x.a(this.isSmartCartMode, me.oriient.positioningengine.common.v.a(this.engineSessionExpiration, me.oriient.positioningengine.common.z.a(this.engineSessionId, me.oriient.positioningengine.common.z.a(this.engineVersion, me.oriient.positioningengine.common.z.a(this.ipsClientId, me.oriient.positioningengine.common.z.a(this.sessionId, me.oriient.positioningengine.common.z.a(this.spaceId, me.oriient.positioningengine.common.x.a(this.validationMode, me.oriient.positioningengine.common.z.a(this.osType, me.oriient.positioningengine.common.z.a(this.deviceType, me.oriient.positioningengine.common.w.a(this.startTime, Long.hashCode(this.dateTime) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isSmartCartMode() {
        return this.isSmartCartMode;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EngineSessionMetadata(dateTime=");
        sb.append(this.dateTime);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", deviceType=");
        sb.append(this.deviceType);
        sb.append(", osType=");
        sb.append(this.osType);
        sb.append(", validationMode=");
        sb.append(this.validationMode);
        sb.append(", spaceId=");
        sb.append(this.spaceId);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", ipsClientId=");
        sb.append(this.ipsClientId);
        sb.append(", engineVersion=");
        sb.append(this.engineVersion);
        sb.append(", engineSessionId=");
        sb.append(this.engineSessionId);
        sb.append(", engineSessionExpiration=");
        sb.append(this.engineSessionExpiration);
        sb.append(", isSmartCartMode=");
        sb.append(this.isSmartCartMode);
        sb.append(", flipAxes=");
        return androidx.camera.core.impl.b.s(sb, this.flipAxes, ')');
    }
}
