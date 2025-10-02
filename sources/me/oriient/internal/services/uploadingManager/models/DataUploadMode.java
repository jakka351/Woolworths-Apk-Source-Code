package me.oriient.internal.services.uploadingManager.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;", "", "()V", "Immediate", "Scheduled", "Lme/oriient/internal/services/uploadingManager/models/DataUploadMode$Immediate;", "Lme/oriient/internal/services/uploadingManager/models/DataUploadMode$Scheduled;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DataUploadMode {

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploadMode$Immediate;", "Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Immediate extends DataUploadMode {
        public Immediate() {
            super(null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploadMode$Scheduled;", "Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;", "requireWiFi", "", "requireCharger", "(ZZ)V", "getRequireCharger", "()Z", "getRequireWiFi", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Scheduled extends DataUploadMode {
        private final boolean requireCharger;
        private final boolean requireWiFi;

        public Scheduled(boolean z, boolean z2) {
            super(null);
            this.requireWiFi = z;
            this.requireCharger = z2;
        }

        public static /* synthetic */ Scheduled copy$default(Scheduled scheduled, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = scheduled.requireWiFi;
            }
            if ((i & 2) != 0) {
                z2 = scheduled.requireCharger;
            }
            return scheduled.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getRequireWiFi() {
            return this.requireWiFi;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getRequireCharger() {
            return this.requireCharger;
        }

        @NotNull
        public final Scheduled copy(boolean requireWiFi, boolean requireCharger) {
            return new Scheduled(requireWiFi, requireCharger);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Scheduled)) {
                return false;
            }
            Scheduled scheduled = (Scheduled) other;
            return this.requireWiFi == scheduled.requireWiFi && this.requireCharger == scheduled.requireCharger;
        }

        public final boolean getRequireCharger() {
            return this.requireCharger;
        }

        public final boolean getRequireWiFi() {
            return this.requireWiFi;
        }

        public int hashCode() {
            return Boolean.hashCode(this.requireCharger) + (Boolean.hashCode(this.requireWiFi) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Scheduled(requireWiFi=");
            sb.append(this.requireWiFi);
            sb.append(", requireCharger=");
            return b.s(sb, this.requireCharger, ')');
        }
    }

    public /* synthetic */ DataUploadMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DataUploadMode() {
    }
}
