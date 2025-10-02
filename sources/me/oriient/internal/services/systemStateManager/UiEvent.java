package me.oriient.internal.services.systemStateManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/services/systemStateManager/UiEvent;", "", "isVisible", "", "(Z)V", "()Z", "CalibrationDialogVisibilityChanged", "MapVisibilityChanged", "NavigationPathVisibilityChanged", "UserPositionVisibilityChanged", "WalkToLockIndicatorVisibilityChanged", "Lme/oriient/internal/services/systemStateManager/UiEvent$CalibrationDialogVisibilityChanged;", "Lme/oriient/internal/services/systemStateManager/UiEvent$MapVisibilityChanged;", "Lme/oriient/internal/services/systemStateManager/UiEvent$NavigationPathVisibilityChanged;", "Lme/oriient/internal/services/systemStateManager/UiEvent$UserPositionVisibilityChanged;", "Lme/oriient/internal/services/systemStateManager/UiEvent$WalkToLockIndicatorVisibilityChanged;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class UiEvent {
    private final boolean isVisible;

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/systemStateManager/UiEvent$CalibrationDialogVisibilityChanged;", "Lme/oriient/internal/services/systemStateManager/UiEvent;", "isVisible", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CalibrationDialogVisibilityChanged extends UiEvent {
        private final boolean isVisible;

        public CalibrationDialogVisibilityChanged(boolean z) {
            super(z, null);
            this.isVisible = z;
        }

        public static /* synthetic */ CalibrationDialogVisibilityChanged copy$default(CalibrationDialogVisibilityChanged calibrationDialogVisibilityChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = calibrationDialogVisibilityChanged.isVisible;
            }
            return calibrationDialogVisibilityChanged.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public final CalibrationDialogVisibilityChanged copy(boolean isVisible) {
            return new CalibrationDialogVisibilityChanged(isVisible);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CalibrationDialogVisibilityChanged) && this.isVisible == ((CalibrationDialogVisibilityChanged) other).isVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVisible);
        }

        @Override // me.oriient.internal.services.systemStateManager.UiEvent
        /* renamed from: isVisible */
        public boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public String toString() {
            return androidx.camera.core.impl.b.s(new StringBuilder("CalibrationDialogVisibilityChanged(isVisible="), this.isVisible, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/systemStateManager/UiEvent$MapVisibilityChanged;", "Lme/oriient/internal/services/systemStateManager/UiEvent;", "isVisible", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MapVisibilityChanged extends UiEvent {
        private final boolean isVisible;

        public MapVisibilityChanged(boolean z) {
            super(z, null);
            this.isVisible = z;
        }

        public static /* synthetic */ MapVisibilityChanged copy$default(MapVisibilityChanged mapVisibilityChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = mapVisibilityChanged.isVisible;
            }
            return mapVisibilityChanged.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public final MapVisibilityChanged copy(boolean isVisible) {
            return new MapVisibilityChanged(isVisible);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MapVisibilityChanged) && this.isVisible == ((MapVisibilityChanged) other).isVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVisible);
        }

        @Override // me.oriient.internal.services.systemStateManager.UiEvent
        /* renamed from: isVisible */
        public boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public String toString() {
            return androidx.camera.core.impl.b.s(new StringBuilder("MapVisibilityChanged(isVisible="), this.isVisible, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/systemStateManager/UiEvent$NavigationPathVisibilityChanged;", "Lme/oriient/internal/services/systemStateManager/UiEvent;", "isVisible", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigationPathVisibilityChanged extends UiEvent {
        private final boolean isVisible;

        public NavigationPathVisibilityChanged(boolean z) {
            super(z, null);
            this.isVisible = z;
        }

        public static /* synthetic */ NavigationPathVisibilityChanged copy$default(NavigationPathVisibilityChanged navigationPathVisibilityChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = navigationPathVisibilityChanged.isVisible;
            }
            return navigationPathVisibilityChanged.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public final NavigationPathVisibilityChanged copy(boolean isVisible) {
            return new NavigationPathVisibilityChanged(isVisible);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigationPathVisibilityChanged) && this.isVisible == ((NavigationPathVisibilityChanged) other).isVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVisible);
        }

        @Override // me.oriient.internal.services.systemStateManager.UiEvent
        /* renamed from: isVisible */
        public boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public String toString() {
            return androidx.camera.core.impl.b.s(new StringBuilder("NavigationPathVisibilityChanged(isVisible="), this.isVisible, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/systemStateManager/UiEvent$UserPositionVisibilityChanged;", "Lme/oriient/internal/services/systemStateManager/UiEvent;", "isVisible", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserPositionVisibilityChanged extends UiEvent {
        private final boolean isVisible;

        public UserPositionVisibilityChanged(boolean z) {
            super(z, null);
            this.isVisible = z;
        }

        public static /* synthetic */ UserPositionVisibilityChanged copy$default(UserPositionVisibilityChanged userPositionVisibilityChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = userPositionVisibilityChanged.isVisible;
            }
            return userPositionVisibilityChanged.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public final UserPositionVisibilityChanged copy(boolean isVisible) {
            return new UserPositionVisibilityChanged(isVisible);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserPositionVisibilityChanged) && this.isVisible == ((UserPositionVisibilityChanged) other).isVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVisible);
        }

        @Override // me.oriient.internal.services.systemStateManager.UiEvent
        /* renamed from: isVisible */
        public boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public String toString() {
            return androidx.camera.core.impl.b.s(new StringBuilder("UserPositionVisibilityChanged(isVisible="), this.isVisible, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/systemStateManager/UiEvent$WalkToLockIndicatorVisibilityChanged;", "Lme/oriient/internal/services/systemStateManager/UiEvent;", "isVisible", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WalkToLockIndicatorVisibilityChanged extends UiEvent {
        private final boolean isVisible;

        public WalkToLockIndicatorVisibilityChanged(boolean z) {
            super(z, null);
            this.isVisible = z;
        }

        public static /* synthetic */ WalkToLockIndicatorVisibilityChanged copy$default(WalkToLockIndicatorVisibilityChanged walkToLockIndicatorVisibilityChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = walkToLockIndicatorVisibilityChanged.isVisible;
            }
            return walkToLockIndicatorVisibilityChanged.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public final WalkToLockIndicatorVisibilityChanged copy(boolean isVisible) {
            return new WalkToLockIndicatorVisibilityChanged(isVisible);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WalkToLockIndicatorVisibilityChanged) && this.isVisible == ((WalkToLockIndicatorVisibilityChanged) other).isVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVisible);
        }

        @Override // me.oriient.internal.services.systemStateManager.UiEvent
        /* renamed from: isVisible */
        public boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public String toString() {
            return androidx.camera.core.impl.b.s(new StringBuilder("WalkToLockIndicatorVisibilityChanged(isVisible="), this.isVisible, ')');
        }
    }

    public /* synthetic */ UiEvent(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* renamed from: isVisible, reason: from getter */
    public boolean getIsVisible() {
        return this.isVisible;
    }

    private UiEvent(boolean z) {
        this.isVisible = z;
    }
}
