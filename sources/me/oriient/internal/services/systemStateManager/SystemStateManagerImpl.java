package me.oriient.internal.services.systemStateManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.systemStateManager.EngineEvent;
import me.oriient.internal.services.systemStateManager.UiEvent;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+¨\u0006/"}, d2 = {"Lme/oriient/internal/services/systemStateManager/SystemStateManagerImpl;", "Lme/oriient/internal/services/systemStateManager/SystemStateManager;", "Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "appStateProvider", "Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "<init>", "(Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;Lme/oriient/internal/services/elog/ELog;Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;)V", "Lme/oriient/internal/services/systemStateManager/SystemState;", "newState", "Lme/oriient/internal/services/systemStateManager/SystemStateUpdateCause;", "cause", "", "updateSystemState", "(Lme/oriient/internal/services/systemStateManager/SystemState;Lme/oriient/internal/services/systemStateManager/SystemStateUpdateCause;)V", "state", "eLogNewState", "(Lme/oriient/internal/services/systemStateManager/SystemState;)V", "Lme/oriient/internal/services/systemStateManager/EngineEvent;", "engineEvent", "onEngineEvent", "(Lme/oriient/internal/services/systemStateManager/EngineEvent;)V", "Lme/oriient/internal/services/systemStateManager/UiEvent;", "uiEvent", "onUiEvent", "(Lme/oriient/internal/services/systemStateManager/UiEvent;)V", "Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "Lme/oriient/internal/services/elog/ELog;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "systemState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getSystemState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lme/oriient/internal/services/systemStateManager/SystemStateUpdate;", "systemStateUpdate", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getSystemStateUpdate", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lme/oriient/internal/services/systemStateManager/UiElementState;", "lastRegisteredUserPositionState", "Lme/oriient/internal/services/systemStateManager/UiElementState;", "lastRegisteredNavigationPathState", "Companion", "me/oriient/internal/services/systemStateManager/c", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SystemStateManagerImpl implements SystemStateManager {

    @NotNull
    private static final c Companion = new c();

    @NotNull
    private static final String TAG = "SystemStateManager";

    @NotNull
    private final AppStateProvider appStateProvider;

    @NotNull
    private final ELog eLog;

    @NotNull
    private UiElementState lastRegisteredNavigationPathState;

    @NotNull
    private UiElementState lastRegisteredUserPositionState;

    @NotNull
    private final MutableStateFlow<SystemState> systemState;

    @NotNull
    private final MutableSharedFlow<SystemStateUpdate> systemStateUpdate;

    public SystemStateManagerImpl(@NotNull AppStateProvider appStateProvider, @NotNull ELog eLog, @NotNull CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.h(appStateProvider, "appStateProvider");
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        this.appStateProvider = appStateProvider;
        this.eLog = eLog;
        this.systemState = StateFlowKt.a(new SystemState(null, null, null, null, null, null, false, false, false, 511, null));
        this.systemStateUpdate = UtilsKt.MutableSharedFlowConfigured();
        UiElementState uiElementState = UiElementState.UNKNOWN;
        this.lastRegisteredUserPositionState = uiElementState;
        this.lastRegisteredNavigationPathState = uiElementState;
        BuildersKt.c(CoroutineScopeKt.a(coroutineContextProvider.getDefault()), null, null, new b(this, null), 3);
    }

    private final void eLogNewState(SystemState state) {
        this.eLog.d(TAG, "Application event state updated", MapsKt.j(new Pair("applicationState", Integer.valueOf(state.getAppState().getCode())), new Pair("mapState", state.getMapState().getUploadableName()), new Pair("calibrationDialogState", state.getCalibrationDialogState().getUploadableName()), new Pair("navigationPathState", state.getNavigationPathState().getUploadableName()), new Pair("userPositionState", state.getUserPositionState().getUploadableName()), new Pair("walkToLockIndicatorState", state.getWalkToLockIndicatorState().getUploadableName()), new Pair("isCalibrationNeeded", Boolean.valueOf(state.isCalibrationNeeded())), new Pair("isPositionLocked", Boolean.valueOf(state.isPositionLocked())), new Pair("isCalibrationActive", Boolean.valueOf(state.isCalibrationActive()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSystemState(SystemState newState, SystemStateUpdateCause cause) {
        eLogNewState(newState);
        getSystemState().setValue(newState);
        getSystemStateUpdate().f(new SystemStateUpdate(newState, cause));
    }

    @Override // me.oriient.internal.services.systemStateManager.SystemStateManager
    public void onEngineEvent(@NotNull EngineEvent engineEvent) {
        Pair pair;
        Intrinsics.h(engineEvent, "engineEvent");
        SystemState systemState = (SystemState) getSystemState().getValue();
        if (engineEvent instanceof EngineEvent.IsCalibrationNeededChanged) {
            EngineEvent.IsCalibrationNeededChanged isCalibrationNeededChanged = (EngineEvent.IsCalibrationNeededChanged) engineEvent;
            if (isCalibrationNeededChanged.isCalibrationNeeded() == systemState.isCalibrationNeeded()) {
                return;
            } else {
                pair = new Pair(SystemState.copy$default(systemState, null, null, null, null, null, null, isCalibrationNeededChanged.isCalibrationNeeded(), false, false, 447, null), SystemStateUpdateCause.CALIBRATION_NEEDED);
            }
        } else if (engineEvent instanceof EngineEvent.IsPositionLockedChanged) {
            EngineEvent.IsPositionLockedChanged isPositionLockedChanged = (EngineEvent.IsPositionLockedChanged) engineEvent;
            if (isPositionLockedChanged.isLocked() == systemState.isPositionLocked()) {
                return;
            } else {
                pair = new Pair(SystemState.copy$default(systemState, null, null, null, null, null, null, false, isPositionLockedChanged.isLocked(), false, 383, null), SystemStateUpdateCause.POSITION_LOCKED);
            }
        } else {
            if (!(engineEvent instanceof EngineEvent.IsCalibrationActiveChanged)) {
                throw new NoWhenBranchMatchedException();
            }
            EngineEvent.IsCalibrationActiveChanged isCalibrationActiveChanged = (EngineEvent.IsCalibrationActiveChanged) engineEvent;
            if (isCalibrationActiveChanged.isCalibrationActive() == systemState.isCalibrationActive()) {
                return;
            } else {
                pair = new Pair(SystemState.copy$default(systemState, null, null, null, null, null, null, false, false, isCalibrationActiveChanged.isCalibrationActive(), 255, null), SystemStateUpdateCause.CALIBRATION_ACTIVE);
            }
        }
        updateSystemState((SystemState) pair.d, (SystemStateUpdateCause) pair.e);
    }

    @Override // me.oriient.internal.services.systemStateManager.SystemStateManager
    public void onUiEvent(@NotNull UiEvent uiEvent) {
        UiElementState uiElementState;
        Pair pair;
        SystemState systemStateCopy$default;
        Intrinsics.h(uiEvent, "uiEvent");
        e eVar = UiElementState.Companion;
        boolean isVisible = uiEvent.getIsVisible();
        eVar.getClass();
        if (isVisible) {
            uiElementState = UiElementState.PRESENTED;
        } else {
            if (isVisible) {
                throw new NoWhenBranchMatchedException();
            }
            uiElementState = UiElementState.HIDDEN;
        }
        UiElementState uiElementState2 = uiElementState;
        SystemState systemState = (SystemState) getSystemState().getValue();
        if (uiEvent instanceof UiEvent.CalibrationDialogVisibilityChanged) {
            if (uiElementState2 == systemState.getCalibrationDialogState()) {
                return;
            } else {
                pair = new Pair(SystemState.copy$default(systemState, null, null, uiElementState2, null, null, null, false, false, false, 507, null), SystemStateUpdateCause.CALIBRATION_DIALOG);
            }
        } else if (uiEvent instanceof UiEvent.MapVisibilityChanged) {
            if (uiElementState2 == systemState.getMapState()) {
                return;
            }
            int i = d.$EnumSwitchMapping$0[uiElementState2.ordinal()];
            if (i == 1) {
                systemStateCopy$default = SystemState.copy$default(systemState, null, uiElementState2, null, this.lastRegisteredNavigationPathState, this.lastRegisteredUserPositionState, null, false, false, false, 485, null);
            } else if (i == 2) {
                UiElementState uiElementState3 = UiElementState.HIDDEN;
                systemStateCopy$default = SystemState.copy$default(systemState, null, uiElementState2, null, uiElementState3, uiElementState3, null, false, false, false, 485, null);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                systemStateCopy$default = SystemState.copy$default(systemState, null, uiElementState2, null, null, null, null, false, false, false, 509, null);
            }
            pair = new Pair(systemStateCopy$default, SystemStateUpdateCause.MAP);
        } else if (uiEvent instanceof UiEvent.NavigationPathVisibilityChanged) {
            this.lastRegisteredNavigationPathState = uiElementState2;
            if (uiElementState2 == systemState.getNavigationPathState() || systemState.getMapState() == UiElementState.HIDDEN) {
                return;
            } else {
                pair = new Pair(SystemState.copy$default(systemState, null, null, null, uiElementState2, null, null, false, false, false, 503, null), SystemStateUpdateCause.NAVIGATION_PATH);
            }
        } else if (uiEvent instanceof UiEvent.UserPositionVisibilityChanged) {
            this.lastRegisteredUserPositionState = uiElementState2;
            if (uiElementState2 == systemState.getUserPositionState() || systemState.getMapState() == UiElementState.HIDDEN) {
                return;
            } else {
                pair = new Pair(SystemState.copy$default(systemState, null, null, null, null, uiElementState2, null, false, false, false, 495, null), SystemStateUpdateCause.USER_POSITION);
            }
        } else {
            if (!(uiEvent instanceof UiEvent.WalkToLockIndicatorVisibilityChanged)) {
                throw new NoWhenBranchMatchedException();
            }
            if (uiElementState2 == systemState.getWalkToLockIndicatorState()) {
                return;
            } else {
                pair = new Pair(SystemState.copy$default(systemState, null, null, null, null, null, uiElementState2, false, false, false, 479, null), SystemStateUpdateCause.WALK_TO_LOCK_INDICATOR);
            }
        }
        updateSystemState((SystemState) pair.d, (SystemStateUpdateCause) pair.e);
    }

    @Override // me.oriient.internal.services.systemStateManager.SystemStateProvider
    @NotNull
    public MutableStateFlow<SystemState> getSystemState() {
        return this.systemState;
    }

    @Override // me.oriient.internal.services.systemStateManager.SystemStateProvider
    @NotNull
    public MutableSharedFlow<SystemStateUpdate> getSystemStateUpdate() {
        return this.systemStateUpdate;
    }
}
