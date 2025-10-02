package me.oriient.internal.services.systemStateManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.android.appState.AppState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006("}, d2 = {"Lme/oriient/internal/services/systemStateManager/SystemState;", "", "appState", "Lme/oriient/internal/infra/utils/android/appState/AppState;", "mapState", "Lme/oriient/internal/services/systemStateManager/UiElementState;", "calibrationDialogState", "navigationPathState", "userPositionState", "walkToLockIndicatorState", "isCalibrationNeeded", "", "isPositionLocked", "isCalibrationActive", "(Lme/oriient/internal/infra/utils/android/appState/AppState;Lme/oriient/internal/services/systemStateManager/UiElementState;Lme/oriient/internal/services/systemStateManager/UiElementState;Lme/oriient/internal/services/systemStateManager/UiElementState;Lme/oriient/internal/services/systemStateManager/UiElementState;Lme/oriient/internal/services/systemStateManager/UiElementState;ZZZ)V", "getAppState", "()Lme/oriient/internal/infra/utils/android/appState/AppState;", "getCalibrationDialogState", "()Lme/oriient/internal/services/systemStateManager/UiElementState;", "()Z", "getMapState", "getNavigationPathState", "getUserPositionState", "getWalkToLockIndicatorState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SystemState {

    @NotNull
    private final AppState appState;

    @NotNull
    private final UiElementState calibrationDialogState;
    private final boolean isCalibrationActive;
    private final boolean isCalibrationNeeded;
    private final boolean isPositionLocked;

    @NotNull
    private final UiElementState mapState;

    @NotNull
    private final UiElementState navigationPathState;

    @NotNull
    private final UiElementState userPositionState;

    @NotNull
    private final UiElementState walkToLockIndicatorState;

    public SystemState() {
        this(null, null, null, null, null, null, false, false, false, 511, null);
    }

    public static /* synthetic */ SystemState copy$default(SystemState systemState, AppState appState, UiElementState uiElementState, UiElementState uiElementState2, UiElementState uiElementState3, UiElementState uiElementState4, UiElementState uiElementState5, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            appState = systemState.appState;
        }
        if ((i & 2) != 0) {
            uiElementState = systemState.mapState;
        }
        if ((i & 4) != 0) {
            uiElementState2 = systemState.calibrationDialogState;
        }
        if ((i & 8) != 0) {
            uiElementState3 = systemState.navigationPathState;
        }
        if ((i & 16) != 0) {
            uiElementState4 = systemState.userPositionState;
        }
        if ((i & 32) != 0) {
            uiElementState5 = systemState.walkToLockIndicatorState;
        }
        if ((i & 64) != 0) {
            z = systemState.isCalibrationNeeded;
        }
        if ((i & 128) != 0) {
            z2 = systemState.isPositionLocked;
        }
        if ((i & 256) != 0) {
            z3 = systemState.isCalibrationActive;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        UiElementState uiElementState6 = uiElementState5;
        boolean z6 = z;
        UiElementState uiElementState7 = uiElementState4;
        UiElementState uiElementState8 = uiElementState2;
        return systemState.copy(appState, uiElementState, uiElementState8, uiElementState3, uiElementState7, uiElementState6, z6, z4, z5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AppState getAppState() {
        return this.appState;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final UiElementState getMapState() {
        return this.mapState;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final UiElementState getCalibrationDialogState() {
        return this.calibrationDialogState;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final UiElementState getNavigationPathState() {
        return this.navigationPathState;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final UiElementState getUserPositionState() {
        return this.userPositionState;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final UiElementState getWalkToLockIndicatorState() {
        return this.walkToLockIndicatorState;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCalibrationNeeded() {
        return this.isCalibrationNeeded;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsPositionLocked() {
        return this.isPositionLocked;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsCalibrationActive() {
        return this.isCalibrationActive;
    }

    @NotNull
    public final SystemState copy(@NotNull AppState appState, @NotNull UiElementState mapState, @NotNull UiElementState calibrationDialogState, @NotNull UiElementState navigationPathState, @NotNull UiElementState userPositionState, @NotNull UiElementState walkToLockIndicatorState, boolean isCalibrationNeeded, boolean isPositionLocked, boolean isCalibrationActive) {
        Intrinsics.h(appState, "appState");
        Intrinsics.h(mapState, "mapState");
        Intrinsics.h(calibrationDialogState, "calibrationDialogState");
        Intrinsics.h(navigationPathState, "navigationPathState");
        Intrinsics.h(userPositionState, "userPositionState");
        Intrinsics.h(walkToLockIndicatorState, "walkToLockIndicatorState");
        return new SystemState(appState, mapState, calibrationDialogState, navigationPathState, userPositionState, walkToLockIndicatorState, isCalibrationNeeded, isPositionLocked, isCalibrationActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SystemState)) {
            return false;
        }
        SystemState systemState = (SystemState) other;
        return this.appState == systemState.appState && this.mapState == systemState.mapState && this.calibrationDialogState == systemState.calibrationDialogState && this.navigationPathState == systemState.navigationPathState && this.userPositionState == systemState.userPositionState && this.walkToLockIndicatorState == systemState.walkToLockIndicatorState && this.isCalibrationNeeded == systemState.isCalibrationNeeded && this.isPositionLocked == systemState.isPositionLocked && this.isCalibrationActive == systemState.isCalibrationActive;
    }

    @NotNull
    public final AppState getAppState() {
        return this.appState;
    }

    @NotNull
    public final UiElementState getCalibrationDialogState() {
        return this.calibrationDialogState;
    }

    @NotNull
    public final UiElementState getMapState() {
        return this.mapState;
    }

    @NotNull
    public final UiElementState getNavigationPathState() {
        return this.navigationPathState;
    }

    @NotNull
    public final UiElementState getUserPositionState() {
        return this.userPositionState;
    }

    @NotNull
    public final UiElementState getWalkToLockIndicatorState() {
        return this.walkToLockIndicatorState;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCalibrationActive) + me.oriient.internal.infra.scheduler.a.a(this.isPositionLocked, me.oriient.internal.infra.scheduler.a.a(this.isCalibrationNeeded, (this.walkToLockIndicatorState.hashCode() + ((this.userPositionState.hashCode() + ((this.navigationPathState.hashCode() + ((this.calibrationDialogState.hashCode() + ((this.mapState.hashCode() + (this.appState.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final boolean isCalibrationActive() {
        return this.isCalibrationActive;
    }

    public final boolean isCalibrationNeeded() {
        return this.isCalibrationNeeded;
    }

    public final boolean isPositionLocked() {
        return this.isPositionLocked;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SystemState(appState=");
        sb.append(this.appState);
        sb.append(", mapState=");
        sb.append(this.mapState);
        sb.append(", calibrationDialogState=");
        sb.append(this.calibrationDialogState);
        sb.append(", navigationPathState=");
        sb.append(this.navigationPathState);
        sb.append(", userPositionState=");
        sb.append(this.userPositionState);
        sb.append(", walkToLockIndicatorState=");
        sb.append(this.walkToLockIndicatorState);
        sb.append(", isCalibrationNeeded=");
        sb.append(this.isCalibrationNeeded);
        sb.append(", isPositionLocked=");
        sb.append(this.isPositionLocked);
        sb.append(", isCalibrationActive=");
        return androidx.camera.core.impl.b.s(sb, this.isCalibrationActive, ')');
    }

    public SystemState(@NotNull AppState appState, @NotNull UiElementState mapState, @NotNull UiElementState calibrationDialogState, @NotNull UiElementState navigationPathState, @NotNull UiElementState userPositionState, @NotNull UiElementState walkToLockIndicatorState, boolean z, boolean z2, boolean z3) {
        Intrinsics.h(appState, "appState");
        Intrinsics.h(mapState, "mapState");
        Intrinsics.h(calibrationDialogState, "calibrationDialogState");
        Intrinsics.h(navigationPathState, "navigationPathState");
        Intrinsics.h(userPositionState, "userPositionState");
        Intrinsics.h(walkToLockIndicatorState, "walkToLockIndicatorState");
        this.appState = appState;
        this.mapState = mapState;
        this.calibrationDialogState = calibrationDialogState;
        this.navigationPathState = navigationPathState;
        this.userPositionState = userPositionState;
        this.walkToLockIndicatorState = walkToLockIndicatorState;
        this.isCalibrationNeeded = z;
        this.isPositionLocked = z2;
        this.isCalibrationActive = z3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SystemState(me.oriient.internal.infra.utils.android.appState.AppState r2, me.oriient.internal.services.systemStateManager.UiElementState r3, me.oriient.internal.services.systemStateManager.UiElementState r4, me.oriient.internal.services.systemStateManager.UiElementState r5, me.oriient.internal.services.systemStateManager.UiElementState r6, me.oriient.internal.services.systemStateManager.UiElementState r7, boolean r8, boolean r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            me.oriient.internal.infra.utils.android.appState.AppState r2 = me.oriient.internal.infra.utils.android.appState.AppState.UNDEFINED
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            me.oriient.internal.services.systemStateManager.UiElementState r3 = me.oriient.internal.services.systemStateManager.UiElementState.UNKNOWN
        Lc:
            r12 = r11 & 4
            if (r12 == 0) goto L12
            me.oriient.internal.services.systemStateManager.UiElementState r4 = me.oriient.internal.services.systemStateManager.UiElementState.UNKNOWN
        L12:
            r12 = r11 & 8
            if (r12 == 0) goto L18
            me.oriient.internal.services.systemStateManager.UiElementState r5 = me.oriient.internal.services.systemStateManager.UiElementState.UNKNOWN
        L18:
            r12 = r11 & 16
            if (r12 == 0) goto L1e
            me.oriient.internal.services.systemStateManager.UiElementState r6 = me.oriient.internal.services.systemStateManager.UiElementState.UNKNOWN
        L1e:
            r12 = r11 & 32
            if (r12 == 0) goto L24
            me.oriient.internal.services.systemStateManager.UiElementState r7 = me.oriient.internal.services.systemStateManager.UiElementState.UNKNOWN
        L24:
            r12 = r11 & 64
            if (r12 == 0) goto L29
            r8 = 1
        L29:
            r12 = r11 & 128(0x80, float:1.794E-43)
            r0 = 0
            if (r12 == 0) goto L2f
            r9 = r0
        L2f:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L3e
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L48
        L3e:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L48:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.systemStateManager.SystemState.<init>(me.oriient.internal.infra.utils.android.appState.AppState, me.oriient.internal.services.systemStateManager.UiElementState, me.oriient.internal.services.systemStateManager.UiElementState, me.oriient.internal.services.systemStateManager.UiElementState, me.oriient.internal.services.systemStateManager.UiElementState, me.oriient.internal.services.systemStateManager.UiElementState, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
