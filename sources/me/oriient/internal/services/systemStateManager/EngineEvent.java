package me.oriient.internal.services.systemStateManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lme/oriient/internal/services/systemStateManager/EngineEvent;", "", "()V", "IsCalibrationActiveChanged", "IsCalibrationNeededChanged", "IsPositionLockedChanged", "Lme/oriient/internal/services/systemStateManager/EngineEvent$IsCalibrationActiveChanged;", "Lme/oriient/internal/services/systemStateManager/EngineEvent$IsCalibrationNeededChanged;", "Lme/oriient/internal/services/systemStateManager/EngineEvent$IsPositionLockedChanged;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class EngineEvent {

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/systemStateManager/EngineEvent$IsCalibrationActiveChanged;", "Lme/oriient/internal/services/systemStateManager/EngineEvent;", "isCalibrationActive", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IsCalibrationActiveChanged extends EngineEvent {
        private final boolean isCalibrationActive;

        public IsCalibrationActiveChanged(boolean z) {
            super(null);
            this.isCalibrationActive = z;
        }

        public static /* synthetic */ IsCalibrationActiveChanged copy$default(IsCalibrationActiveChanged isCalibrationActiveChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = isCalibrationActiveChanged.isCalibrationActive;
            }
            return isCalibrationActiveChanged.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCalibrationActive() {
            return this.isCalibrationActive;
        }

        @NotNull
        public final IsCalibrationActiveChanged copy(boolean isCalibrationActive) {
            return new IsCalibrationActiveChanged(isCalibrationActive);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IsCalibrationActiveChanged) && this.isCalibrationActive == ((IsCalibrationActiveChanged) other).isCalibrationActive;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCalibrationActive);
        }

        public final boolean isCalibrationActive() {
            return this.isCalibrationActive;
        }

        @NotNull
        public String toString() {
            return androidx.camera.core.impl.b.s(new StringBuilder("IsCalibrationActiveChanged(isCalibrationActive="), this.isCalibrationActive, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/systemStateManager/EngineEvent$IsCalibrationNeededChanged;", "Lme/oriient/internal/services/systemStateManager/EngineEvent;", "isCalibrationNeeded", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IsCalibrationNeededChanged extends EngineEvent {
        private final boolean isCalibrationNeeded;

        public IsCalibrationNeededChanged(boolean z) {
            super(null);
            this.isCalibrationNeeded = z;
        }

        public static /* synthetic */ IsCalibrationNeededChanged copy$default(IsCalibrationNeededChanged isCalibrationNeededChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = isCalibrationNeededChanged.isCalibrationNeeded;
            }
            return isCalibrationNeededChanged.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCalibrationNeeded() {
            return this.isCalibrationNeeded;
        }

        @NotNull
        public final IsCalibrationNeededChanged copy(boolean isCalibrationNeeded) {
            return new IsCalibrationNeededChanged(isCalibrationNeeded);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IsCalibrationNeededChanged) && this.isCalibrationNeeded == ((IsCalibrationNeededChanged) other).isCalibrationNeeded;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCalibrationNeeded);
        }

        public final boolean isCalibrationNeeded() {
            return this.isCalibrationNeeded;
        }

        @NotNull
        public String toString() {
            return androidx.camera.core.impl.b.s(new StringBuilder("IsCalibrationNeededChanged(isCalibrationNeeded="), this.isCalibrationNeeded, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/systemStateManager/EngineEvent$IsPositionLockedChanged;", "Lme/oriient/internal/services/systemStateManager/EngineEvent;", "isLocked", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IsPositionLockedChanged extends EngineEvent {
        private final boolean isLocked;

        public IsPositionLockedChanged(boolean z) {
            super(null);
            this.isLocked = z;
        }

        public static /* synthetic */ IsPositionLockedChanged copy$default(IsPositionLockedChanged isPositionLockedChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = isPositionLockedChanged.isLocked;
            }
            return isPositionLockedChanged.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLocked() {
            return this.isLocked;
        }

        @NotNull
        public final IsPositionLockedChanged copy(boolean isLocked) {
            return new IsPositionLockedChanged(isLocked);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IsPositionLockedChanged) && this.isLocked == ((IsPositionLockedChanged) other).isLocked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLocked);
        }

        public final boolean isLocked() {
            return this.isLocked;
        }

        @NotNull
        public String toString() {
            return androidx.camera.core.impl.b.s(new StringBuilder("IsPositionLockedChanged(isLocked="), this.isLocked, ')');
        }
    }

    public /* synthetic */ EngineEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EngineEvent() {
    }
}
