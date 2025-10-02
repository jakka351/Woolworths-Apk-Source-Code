package me.oriient.positioningengine.ondevice.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010-\u001a\u00020.H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/EngineProcessingResult;", "", "()V", "activeFloorChanged", "Lme/oriient/positioningengine/ondevice/models/OnActiveFloorChanged;", "getActiveFloorChanged", "()Lme/oriient/positioningengine/ondevice/models/OnActiveFloorChanged;", "setActiveFloorChanged", "(Lme/oriient/positioningengine/ondevice/models/OnActiveFloorChanged;)V", "calibrationNeeded", "Lme/oriient/positioningengine/ondevice/models/EngineCalibrationNeeded;", "getCalibrationNeeded", "()Lme/oriient/positioningengine/ondevice/models/EngineCalibrationNeeded;", "setCalibrationNeeded", "(Lme/oriient/positioningengine/ondevice/models/EngineCalibrationNeeded;)V", "calibrationProgress", "Lme/oriient/positioningengine/ondevice/models/Calibration;", "getCalibrationProgress", "()Lme/oriient/positioningengine/ondevice/models/Calibration;", "setCalibrationProgress", "(Lme/oriient/positioningengine/ondevice/models/Calibration;)V", "newFloorNeeded", "Lme/oriient/positioningengine/ondevice/models/NewFloorNeeded;", "getNewFloorNeeded", "()Lme/oriient/positioningengine/ondevice/models/NewFloorNeeded;", "setNewFloorNeeded", "(Lme/oriient/positioningengine/ondevice/models/NewFloorNeeded;)V", "newMapNeeded", "Lme/oriient/positioningengine/ondevice/models/NewMapNeeded;", "getNewMapNeeded", "()Lme/oriient/positioningengine/ondevice/models/NewMapNeeded;", "setNewMapNeeded", "(Lme/oriient/positioningengine/ondevice/models/NewMapNeeded;)V", "positionUpdate", "Lme/oriient/positioningengine/ondevice/models/Position;", "getPositionUpdate", "()Lme/oriient/positioningengine/ondevice/models/Position;", "setPositionUpdate", "(Lme/oriient/positioningengine/ondevice/models/Position;)V", "validationUpdate", "Lme/oriient/positioningengine/ondevice/models/EngineValidationUpdate;", "getValidationUpdate", "()Lme/oriient/positioningengine/ondevice/models/EngineValidationUpdate;", "setValidationUpdate", "(Lme/oriient/positioningengine/ondevice/models/EngineValidationUpdate;)V", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EngineProcessingResult {

    @Nullable
    private OnActiveFloorChanged activeFloorChanged;

    @Nullable
    private EngineCalibrationNeeded calibrationNeeded;

    @Nullable
    private Calibration calibrationProgress;

    @Nullable
    private NewFloorNeeded newFloorNeeded;

    @Nullable
    private NewMapNeeded newMapNeeded;

    @Nullable
    private Position positionUpdate;

    @Nullable
    private EngineValidationUpdate validationUpdate;

    @Nullable
    public final OnActiveFloorChanged getActiveFloorChanged() {
        return this.activeFloorChanged;
    }

    @Nullable
    public final EngineCalibrationNeeded getCalibrationNeeded() {
        return this.calibrationNeeded;
    }

    @Nullable
    public final Calibration getCalibrationProgress() {
        return this.calibrationProgress;
    }

    @Nullable
    public final NewFloorNeeded getNewFloorNeeded() {
        return this.newFloorNeeded;
    }

    @Nullable
    public final NewMapNeeded getNewMapNeeded() {
        return this.newMapNeeded;
    }

    @Nullable
    public final Position getPositionUpdate() {
        return this.positionUpdate;
    }

    @Nullable
    public final EngineValidationUpdate getValidationUpdate() {
        return this.validationUpdate;
    }

    public final void setActiveFloorChanged(@Nullable OnActiveFloorChanged onActiveFloorChanged) {
        this.activeFloorChanged = onActiveFloorChanged;
    }

    public final void setCalibrationNeeded(@Nullable EngineCalibrationNeeded engineCalibrationNeeded) {
        this.calibrationNeeded = engineCalibrationNeeded;
    }

    public final void setCalibrationProgress(@Nullable Calibration calibration) {
        this.calibrationProgress = calibration;
    }

    public final void setNewFloorNeeded(@Nullable NewFloorNeeded newFloorNeeded) {
        this.newFloorNeeded = newFloorNeeded;
    }

    public final void setNewMapNeeded(@Nullable NewMapNeeded newMapNeeded) {
        this.newMapNeeded = newMapNeeded;
    }

    public final void setPositionUpdate(@Nullable Position position) {
        this.positionUpdate = position;
    }

    public final void setValidationUpdate(@Nullable EngineValidationUpdate engineValidationUpdate) {
        this.validationUpdate = engineValidationUpdate;
    }

    @NotNull
    public String toString() {
        return "EngineProcessingResult(newMapNeeded = " + this.newMapNeeded + ", newFloorNeeded=" + this.newFloorNeeded + ", activeFloorChanged=" + this.activeFloorChanged + ", calibrationProgress=" + this.calibrationProgress + ", positionUpdate=" + this.positionUpdate + ", calibrationNeeded=" + this.calibrationNeeded + ", validationUpdate=" + this.validationUpdate + ')';
    }
}
