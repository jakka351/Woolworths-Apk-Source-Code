package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0007\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/MiscCommonConfig;", "", "", "geoAcceptedAccuracyMeters", "", "appSessionMaxInactivityMillis", "", "isSilentModeEnabled", "useFusedLocationProvider", "<init>", "(IJZZ)V", "component1", "()I", "component2", "()J", "component3", "()Z", "component4", "copy", "(IJZZ)Lme/oriient/ipssdk/base/remoteconfig/MiscCommonConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getGeoAcceptedAccuracyMeters", "b", "J", "getAppSessionMaxInactivityMillis", "c", "Z", "d", "getUseFusedLocationProvider", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MiscCommonConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int geoAcceptedAccuracyMeters;

    /* renamed from: b, reason: from kotlin metadata */
    private final long appSessionMaxInactivityMillis;

    /* renamed from: c, reason: from kotlin metadata */
    private final boolean isSilentModeEnabled;

    /* renamed from: d, reason: from kotlin metadata */
    private final boolean useFusedLocationProvider;

    public MiscCommonConfig(int i, long j, boolean z, boolean z2) {
        this.geoAcceptedAccuracyMeters = i;
        this.appSessionMaxInactivityMillis = j;
        this.isSilentModeEnabled = z;
        this.useFusedLocationProvider = z2;
    }

    public static /* synthetic */ MiscCommonConfig copy$default(MiscCommonConfig miscCommonConfig, int i, long j, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = miscCommonConfig.geoAcceptedAccuracyMeters;
        }
        if ((i2 & 2) != 0) {
            j = miscCommonConfig.appSessionMaxInactivityMillis;
        }
        if ((i2 & 4) != 0) {
            z = miscCommonConfig.isSilentModeEnabled;
        }
        if ((i2 & 8) != 0) {
            z2 = miscCommonConfig.useFusedLocationProvider;
        }
        return miscCommonConfig.copy(i, j, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getGeoAcceptedAccuracyMeters() {
        return this.geoAcceptedAccuracyMeters;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAppSessionMaxInactivityMillis() {
        return this.appSessionMaxInactivityMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSilentModeEnabled() {
        return this.isSilentModeEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUseFusedLocationProvider() {
        return this.useFusedLocationProvider;
    }

    @NotNull
    public final MiscCommonConfig copy(int geoAcceptedAccuracyMeters, long appSessionMaxInactivityMillis, boolean isSilentModeEnabled, boolean useFusedLocationProvider) {
        return new MiscCommonConfig(geoAcceptedAccuracyMeters, appSessionMaxInactivityMillis, isSilentModeEnabled, useFusedLocationProvider);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiscCommonConfig)) {
            return false;
        }
        MiscCommonConfig miscCommonConfig = (MiscCommonConfig) other;
        return this.geoAcceptedAccuracyMeters == miscCommonConfig.geoAcceptedAccuracyMeters && this.appSessionMaxInactivityMillis == miscCommonConfig.appSessionMaxInactivityMillis && this.isSilentModeEnabled == miscCommonConfig.isSilentModeEnabled && this.useFusedLocationProvider == miscCommonConfig.useFusedLocationProvider;
    }

    public final long getAppSessionMaxInactivityMillis() {
        return this.appSessionMaxInactivityMillis;
    }

    public final int getGeoAcceptedAccuracyMeters() {
        return this.geoAcceptedAccuracyMeters;
    }

    public final boolean getUseFusedLocationProvider() {
        return this.useFusedLocationProvider;
    }

    public int hashCode() {
        return Boolean.hashCode(this.useFusedLocationProvider) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.b(Integer.hashCode(this.geoAcceptedAccuracyMeters) * 31, 31, this.appSessionMaxInactivityMillis), 31, this.isSilentModeEnabled);
    }

    public final boolean isSilentModeEnabled() {
        return this.isSilentModeEnabled;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MiscCommonConfig(geoAcceptedAccuracyMeters=");
        sb.append(this.geoAcceptedAccuracyMeters);
        sb.append(", appSessionMaxInactivityMillis=");
        sb.append(this.appSessionMaxInactivityMillis);
        sb.append(", isSilentModeEnabled=");
        sb.append(this.isSilentModeEnabled);
        sb.append(", useFusedLocationProvider=");
        return androidx.camera.core.impl.b.s(sb, this.useFusedLocationProvider, ')');
    }
}
