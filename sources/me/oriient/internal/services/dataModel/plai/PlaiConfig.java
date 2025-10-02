package me.oriient.internal.services.dataModel.plai;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.infra.scheduler.a;
import me.oriient.internal.services.dataManager.building.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006)"}, d2 = {"Lme/oriient/internal/services/dataModel/plai/PlaiConfig;", "", "shouldPreloadPLAI", "", "minimumAcceptableConfidence", "", "plaiInfoExpirationTimeMillis", "", "allowOutdatedPLAIInfo", "plaiInfoCacheExpirationDays", "", "downloadLinkExpirationTimeMillis", "allowSnappingToLayout", "snappingMaxDistance", "(ZDJZIJZD)V", "getAllowOutdatedPLAIInfo", "()Z", "getAllowSnappingToLayout", "getDownloadLinkExpirationTimeMillis", "()J", "getMinimumAcceptableConfidence", "()D", "getPlaiInfoCacheExpirationDays", "()I", "getPlaiInfoExpirationTimeMillis", "getShouldPreloadPLAI", "getSnappingMaxDistance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlaiConfig {
    private final boolean allowOutdatedPLAIInfo;
    private final boolean allowSnappingToLayout;
    private final long downloadLinkExpirationTimeMillis;
    private final double minimumAcceptableConfidence;
    private final int plaiInfoCacheExpirationDays;
    private final long plaiInfoExpirationTimeMillis;
    private final boolean shouldPreloadPLAI;
    private final double snappingMaxDistance;

    public PlaiConfig(boolean z, double d, long j, boolean z2, int i, long j2, boolean z3, double d2) {
        this.shouldPreloadPLAI = z;
        this.minimumAcceptableConfidence = d;
        this.plaiInfoExpirationTimeMillis = j;
        this.allowOutdatedPLAIInfo = z2;
        this.plaiInfoCacheExpirationDays = i;
        this.downloadLinkExpirationTimeMillis = j2;
        this.allowSnappingToLayout = z3;
        this.snappingMaxDistance = d2;
    }

    public static /* synthetic */ PlaiConfig copy$default(PlaiConfig plaiConfig, boolean z, double d, long j, boolean z2, int i, long j2, boolean z3, double d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = plaiConfig.shouldPreloadPLAI;
        }
        if ((i2 & 2) != 0) {
            d = plaiConfig.minimumAcceptableConfidence;
        }
        if ((i2 & 4) != 0) {
            j = plaiConfig.plaiInfoExpirationTimeMillis;
        }
        if ((i2 & 8) != 0) {
            z2 = plaiConfig.allowOutdatedPLAIInfo;
        }
        if ((i2 & 16) != 0) {
            i = plaiConfig.plaiInfoCacheExpirationDays;
        }
        if ((i2 & 32) != 0) {
            j2 = plaiConfig.downloadLinkExpirationTimeMillis;
        }
        if ((i2 & 64) != 0) {
            z3 = plaiConfig.allowSnappingToLayout;
        }
        if ((i2 & 128) != 0) {
            d2 = plaiConfig.snappingMaxDistance;
        }
        boolean z4 = z3;
        long j3 = j2;
        boolean z5 = z2;
        long j4 = j;
        return plaiConfig.copy(z, d, j4, z5, i, j3, z4, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShouldPreloadPLAI() {
        return this.shouldPreloadPLAI;
    }

    /* renamed from: component2, reason: from getter */
    public final double getMinimumAcceptableConfidence() {
        return this.minimumAcceptableConfidence;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPlaiInfoExpirationTimeMillis() {
        return this.plaiInfoExpirationTimeMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAllowOutdatedPLAIInfo() {
        return this.allowOutdatedPLAIInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPlaiInfoCacheExpirationDays() {
        return this.plaiInfoCacheExpirationDays;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDownloadLinkExpirationTimeMillis() {
        return this.downloadLinkExpirationTimeMillis;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAllowSnappingToLayout() {
        return this.allowSnappingToLayout;
    }

    /* renamed from: component8, reason: from getter */
    public final double getSnappingMaxDistance() {
        return this.snappingMaxDistance;
    }

    @NotNull
    public final PlaiConfig copy(boolean shouldPreloadPLAI, double minimumAcceptableConfidence, long plaiInfoExpirationTimeMillis, boolean allowOutdatedPLAIInfo, int plaiInfoCacheExpirationDays, long downloadLinkExpirationTimeMillis, boolean allowSnappingToLayout, double snappingMaxDistance) {
        return new PlaiConfig(shouldPreloadPLAI, minimumAcceptableConfidence, plaiInfoExpirationTimeMillis, allowOutdatedPLAIInfo, plaiInfoCacheExpirationDays, downloadLinkExpirationTimeMillis, allowSnappingToLayout, snappingMaxDistance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaiConfig)) {
            return false;
        }
        PlaiConfig plaiConfig = (PlaiConfig) other;
        return this.shouldPreloadPLAI == plaiConfig.shouldPreloadPLAI && Double.compare(this.minimumAcceptableConfidence, plaiConfig.minimumAcceptableConfidence) == 0 && this.plaiInfoExpirationTimeMillis == plaiConfig.plaiInfoExpirationTimeMillis && this.allowOutdatedPLAIInfo == plaiConfig.allowOutdatedPLAIInfo && this.plaiInfoCacheExpirationDays == plaiConfig.plaiInfoCacheExpirationDays && this.downloadLinkExpirationTimeMillis == plaiConfig.downloadLinkExpirationTimeMillis && this.allowSnappingToLayout == plaiConfig.allowSnappingToLayout && Double.compare(this.snappingMaxDistance, plaiConfig.snappingMaxDistance) == 0;
    }

    public final boolean getAllowOutdatedPLAIInfo() {
        return this.allowOutdatedPLAIInfo;
    }

    public final boolean getAllowSnappingToLayout() {
        return this.allowSnappingToLayout;
    }

    public final long getDownloadLinkExpirationTimeMillis() {
        return this.downloadLinkExpirationTimeMillis;
    }

    public final double getMinimumAcceptableConfidence() {
        return this.minimumAcceptableConfidence;
    }

    public final int getPlaiInfoCacheExpirationDays() {
        return this.plaiInfoCacheExpirationDays;
    }

    public final long getPlaiInfoExpirationTimeMillis() {
        return this.plaiInfoExpirationTimeMillis;
    }

    public final boolean getShouldPreloadPLAI() {
        return this.shouldPreloadPLAI;
    }

    public final double getSnappingMaxDistance() {
        return this.snappingMaxDistance;
    }

    public int hashCode() {
        return Double.hashCode(this.snappingMaxDistance) + a.a(this.allowSnappingToLayout, K.a(this.downloadLinkExpirationTimeMillis, me.oriient.internal.services.config.a.a(this.plaiInfoCacheExpirationDays, a.a(this.allowOutdatedPLAIInfo, K.a(this.plaiInfoExpirationTimeMillis, J.a(this.minimumAcceptableConfidence, Boolean.hashCode(this.shouldPreloadPLAI) * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlaiConfig(shouldPreloadPLAI=");
        sb.append(this.shouldPreloadPLAI);
        sb.append(", minimumAcceptableConfidence=");
        sb.append(this.minimumAcceptableConfidence);
        sb.append(", plaiInfoExpirationTimeMillis=");
        sb.append(this.plaiInfoExpirationTimeMillis);
        sb.append(", allowOutdatedPLAIInfo=");
        sb.append(this.allowOutdatedPLAIInfo);
        sb.append(", plaiInfoCacheExpirationDays=");
        sb.append(this.plaiInfoCacheExpirationDays);
        sb.append(", downloadLinkExpirationTimeMillis=");
        sb.append(this.downloadLinkExpirationTimeMillis);
        sb.append(", allowSnappingToLayout=");
        sb.append(this.allowSnappingToLayout);
        sb.append(", snappingMaxDistance=");
        return E.a(sb, this.snappingMaxDistance, ')');
    }
}
