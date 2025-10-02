package me.oriient.internal.services.dataModel.plai;

import androidx.annotation.Keep;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002)*BY\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0002\u0010\u0012J\u0006\u0010\u001f\u001a\u00020 J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u0006+"}, d2 = {"Lme/oriient/internal/services/dataModel/plai/PlaiConfigResponse;", "", "seen1", "", "shouldPreloadPLAI", "", "plaiInfoCacheExpirationDays", "plaiInfoExpirationTimeHours", "allowOutdatedPLAIDInfo", "minimumAcceptableConfidence", "", "downloadLinkExpirationTimeMinutes", "", "allowSnappingToLayout", "snappingMaxDistance", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZIIZDJZDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZIIZDJZD)V", "getAllowOutdatedPLAIDInfo", "()Z", "getAllowSnappingToLayout", "getDownloadLinkExpirationTimeMinutes", "()J", "getMinimumAcceptableConfidence", "()D", "getPlaiInfoCacheExpirationDays", "()I", "getPlaiInfoExpirationTimeHours", "getShouldPreloadPLAI", "getSnappingMaxDistance", "toPlaiConfig", "Lme/oriient/internal/services/dataModel/plai/PlaiConfig;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final class PlaiConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final boolean allowOutdatedPLAIDInfo;
    private final boolean allowSnappingToLayout;
    private final long downloadLinkExpirationTimeMinutes;
    private final double minimumAcceptableConfidence;
    private final int plaiInfoCacheExpirationDays;
    private final int plaiInfoExpirationTimeHours;
    private final boolean shouldPreloadPLAI;
    private final double snappingMaxDistance;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/plai/PlaiConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/plai/PlaiConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<PlaiConfigResponse> serializer() {
            return PlaiConfigResponse$$serializer.INSTANCE;
        }
    }

    public PlaiConfigResponse() {
        this(false, 0, 0, false, 0.0d, 0L, false, 0.0d, 255, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(PlaiConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.shouldPreloadPLAI) {
            output.o(serialDesc, 0, self.shouldPreloadPLAI);
        }
        if (output.q(serialDesc, 1) || self.plaiInfoCacheExpirationDays != 7) {
            output.C(1, self.plaiInfoCacheExpirationDays, serialDesc);
        }
        if (output.q(serialDesc, 2) || self.plaiInfoExpirationTimeHours != 48) {
            output.C(2, self.plaiInfoExpirationTimeHours, serialDesc);
        }
        if (output.q(serialDesc, 3) || !self.allowOutdatedPLAIDInfo) {
            output.o(serialDesc, 3, self.allowOutdatedPLAIDInfo);
        }
        if (output.q(serialDesc, 4) || Double.compare(self.minimumAcceptableConfidence, 0.0d) != 0) {
            output.G(serialDesc, 4, self.minimumAcceptableConfidence);
        }
        if (output.q(serialDesc, 5) || self.downloadLinkExpirationTimeMinutes != 45) {
            output.t(serialDesc, 5, self.downloadLinkExpirationTimeMinutes);
        }
        if (output.q(serialDesc, 6) || !self.allowSnappingToLayout) {
            output.o(serialDesc, 6, self.allowSnappingToLayout);
        }
        if (!output.q(serialDesc, 7) && Double.compare(self.snappingMaxDistance, 0.5d) == 0) {
            return;
        }
        output.G(serialDesc, 7, self.snappingMaxDistance);
    }

    public final boolean getAllowOutdatedPLAIDInfo() {
        return this.allowOutdatedPLAIDInfo;
    }

    public final boolean getAllowSnappingToLayout() {
        return this.allowSnappingToLayout;
    }

    public final long getDownloadLinkExpirationTimeMinutes() {
        return this.downloadLinkExpirationTimeMinutes;
    }

    public final double getMinimumAcceptableConfidence() {
        return this.minimumAcceptableConfidence;
    }

    public final int getPlaiInfoCacheExpirationDays() {
        return this.plaiInfoCacheExpirationDays;
    }

    public final int getPlaiInfoExpirationTimeHours() {
        return this.plaiInfoExpirationTimeHours;
    }

    public final boolean getShouldPreloadPLAI() {
        return this.shouldPreloadPLAI;
    }

    public final double getSnappingMaxDistance() {
        return this.snappingMaxDistance;
    }

    @NotNull
    public final PlaiConfig toPlaiConfig() {
        return new PlaiConfig(this.shouldPreloadPLAI, this.minimumAcceptableConfidence, TimeUnit.HOURS.toMillis(1L) * this.plaiInfoExpirationTimeHours, this.allowOutdatedPLAIDInfo, this.plaiInfoCacheExpirationDays, TimeUnit.MINUTES.toMillis(1L) * this.downloadLinkExpirationTimeMinutes, this.allowSnappingToLayout, this.snappingMaxDistance);
    }

    @Deprecated
    public /* synthetic */ PlaiConfigResponse(int i, boolean z, int i2, int i3, boolean z2, double d, long j, boolean z3, double d2, SerializationConstructorMarker serializationConstructorMarker) {
        this.shouldPreloadPLAI = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.plaiInfoCacheExpirationDays = 7;
        } else {
            this.plaiInfoCacheExpirationDays = i2;
        }
        if ((i & 4) == 0) {
            this.plaiInfoExpirationTimeHours = 48;
        } else {
            this.plaiInfoExpirationTimeHours = i3;
        }
        if ((i & 8) == 0) {
            this.allowOutdatedPLAIDInfo = true;
        } else {
            this.allowOutdatedPLAIDInfo = z2;
        }
        if ((i & 16) == 0) {
            this.minimumAcceptableConfidence = 0.0d;
        } else {
            this.minimumAcceptableConfidence = d;
        }
        if ((i & 32) == 0) {
            this.downloadLinkExpirationTimeMinutes = 45L;
        } else {
            this.downloadLinkExpirationTimeMinutes = j;
        }
        if ((i & 64) == 0) {
            this.allowSnappingToLayout = true;
        } else {
            this.allowSnappingToLayout = z3;
        }
        if ((i & 128) == 0) {
            this.snappingMaxDistance = 0.5d;
        } else {
            this.snappingMaxDistance = d2;
        }
    }

    public PlaiConfigResponse(boolean z, int i, int i2, boolean z2, double d, long j, boolean z3, double d2) {
        this.shouldPreloadPLAI = z;
        this.plaiInfoCacheExpirationDays = i;
        this.plaiInfoExpirationTimeHours = i2;
        this.allowOutdatedPLAIDInfo = z2;
        this.minimumAcceptableConfidence = d;
        this.downloadLinkExpirationTimeMinutes = j;
        this.allowSnappingToLayout = z3;
        this.snappingMaxDistance = d2;
    }

    public /* synthetic */ PlaiConfigResponse(boolean z, int i, int i2, boolean z2, double d, long j, boolean z3, double d2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 7 : i, (i3 & 4) != 0 ? 48 : i2, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? 0.0d : d, (i3 & 32) != 0 ? 45L : j, (i3 & 64) != 0 ? true : z3, (i3 & 128) != 0 ? 0.5d : d2);
    }
}
