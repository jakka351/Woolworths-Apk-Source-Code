package me.oriient.internal.services.dataModel.positioning;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataManager.building.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/dataModel/positioning/PositioningMetadataProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "getAutoStartData", "Lme/oriient/internal/services/dataModel/positioning/PositioningMetadataProvider$AutoStartData;", "getConfiguration", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;", "AutoStartData", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PositioningMetadataProvider extends DiProvidable {

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lme/oriient/internal/services/dataModel/positioning/PositioningMetadataProvider$AutoStartData;", "", "startPositioningApiCallTimeMillis", "", "lockProgressOnApiCallStart", "", "isCalibNeededOnApiCallStart", "", "distanceToManualStart", "(JDZD)V", "getDistanceToManualStart", "()D", "()Z", "getLockProgressOnApiCallStart", "getStartPositioningApiCallTimeMillis", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AutoStartData {
        private final double distanceToManualStart;
        private final boolean isCalibNeededOnApiCallStart;
        private final double lockProgressOnApiCallStart;
        private final long startPositioningApiCallTimeMillis;

        public AutoStartData(long j, double d, boolean z, double d2) {
            this.startPositioningApiCallTimeMillis = j;
            this.lockProgressOnApiCallStart = d;
            this.isCalibNeededOnApiCallStart = z;
            this.distanceToManualStart = d2;
        }

        public static /* synthetic */ AutoStartData copy$default(AutoStartData autoStartData, long j, double d, boolean z, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = autoStartData.startPositioningApiCallTimeMillis;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                d = autoStartData.lockProgressOnApiCallStart;
            }
            double d3 = d;
            if ((i & 4) != 0) {
                z = autoStartData.isCalibNeededOnApiCallStart;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                d2 = autoStartData.distanceToManualStart;
            }
            return autoStartData.copy(j2, d3, z2, d2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getStartPositioningApiCallTimeMillis() {
            return this.startPositioningApiCallTimeMillis;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLockProgressOnApiCallStart() {
            return this.lockProgressOnApiCallStart;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCalibNeededOnApiCallStart() {
            return this.isCalibNeededOnApiCallStart;
        }

        /* renamed from: component4, reason: from getter */
        public final double getDistanceToManualStart() {
            return this.distanceToManualStart;
        }

        @NotNull
        public final AutoStartData copy(long startPositioningApiCallTimeMillis, double lockProgressOnApiCallStart, boolean isCalibNeededOnApiCallStart, double distanceToManualStart) {
            return new AutoStartData(startPositioningApiCallTimeMillis, lockProgressOnApiCallStart, isCalibNeededOnApiCallStart, distanceToManualStart);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoStartData)) {
                return false;
            }
            AutoStartData autoStartData = (AutoStartData) other;
            return this.startPositioningApiCallTimeMillis == autoStartData.startPositioningApiCallTimeMillis && Double.compare(this.lockProgressOnApiCallStart, autoStartData.lockProgressOnApiCallStart) == 0 && this.isCalibNeededOnApiCallStart == autoStartData.isCalibNeededOnApiCallStart && Double.compare(this.distanceToManualStart, autoStartData.distanceToManualStart) == 0;
        }

        public final double getDistanceToManualStart() {
            return this.distanceToManualStart;
        }

        public final double getLockProgressOnApiCallStart() {
            return this.lockProgressOnApiCallStart;
        }

        public final long getStartPositioningApiCallTimeMillis() {
            return this.startPositioningApiCallTimeMillis;
        }

        public int hashCode() {
            return Double.hashCode(this.distanceToManualStart) + me.oriient.internal.infra.scheduler.a.a(this.isCalibNeededOnApiCallStart, J.a(this.lockProgressOnApiCallStart, Long.hashCode(this.startPositioningApiCallTimeMillis) * 31, 31), 31);
        }

        public final boolean isCalibNeededOnApiCallStart() {
            return this.isCalibNeededOnApiCallStart;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("AutoStartData(startPositioningApiCallTimeMillis=");
            sb.append(this.startPositioningApiCallTimeMillis);
            sb.append(", lockProgressOnApiCallStart=");
            sb.append(this.lockProgressOnApiCallStart);
            sb.append(", isCalibNeededOnApiCallStart=");
            sb.append(this.isCalibNeededOnApiCallStart);
            sb.append(", distanceToManualStart=");
            return E.a(sb, this.distanceToManualStart, ')');
        }
    }

    @Nullable
    AutoStartData getAutoStartData();

    @NotNull
    PositioningConfig getConfiguration();
}
