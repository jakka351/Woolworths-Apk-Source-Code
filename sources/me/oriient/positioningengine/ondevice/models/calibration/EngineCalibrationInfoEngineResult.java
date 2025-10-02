package me.oriient.positioningengine.ondevice.models.calibration;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0013"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfoEngineResult;", "", "engineCalibrationInfo", "Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfo;", "isSuccessful", "", "(Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfo;Z)V", "getEngineCalibrationInfo", "()Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfo;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EngineCalibrationInfoEngineResult {

    @NotNull
    private final EngineCalibrationInfo engineCalibrationInfo;
    private final boolean isSuccessful;

    public EngineCalibrationInfoEngineResult(@NotNull EngineCalibrationInfo engineCalibrationInfo, boolean z) {
        Intrinsics.h(engineCalibrationInfo, "engineCalibrationInfo");
        this.engineCalibrationInfo = engineCalibrationInfo;
        this.isSuccessful = z;
    }

    public static /* synthetic */ EngineCalibrationInfoEngineResult copy$default(EngineCalibrationInfoEngineResult engineCalibrationInfoEngineResult, EngineCalibrationInfo engineCalibrationInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            engineCalibrationInfo = engineCalibrationInfoEngineResult.engineCalibrationInfo;
        }
        if ((i & 2) != 0) {
            z = engineCalibrationInfoEngineResult.isSuccessful;
        }
        return engineCalibrationInfoEngineResult.copy(engineCalibrationInfo, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final EngineCalibrationInfo getEngineCalibrationInfo() {
        return this.engineCalibrationInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    @NotNull
    public final EngineCalibrationInfoEngineResult copy(@NotNull EngineCalibrationInfo engineCalibrationInfo, boolean isSuccessful) {
        Intrinsics.h(engineCalibrationInfo, "engineCalibrationInfo");
        return new EngineCalibrationInfoEngineResult(engineCalibrationInfo, isSuccessful);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineCalibrationInfoEngineResult)) {
            return false;
        }
        EngineCalibrationInfoEngineResult engineCalibrationInfoEngineResult = (EngineCalibrationInfoEngineResult) other;
        return Intrinsics.c(this.engineCalibrationInfo, engineCalibrationInfoEngineResult.engineCalibrationInfo) && this.isSuccessful == engineCalibrationInfoEngineResult.isSuccessful;
    }

    @NotNull
    public final EngineCalibrationInfo getEngineCalibrationInfo() {
        return this.engineCalibrationInfo;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSuccessful) + (this.engineCalibrationInfo.hashCode() * 31);
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EngineCalibrationInfoEngineResult(engineCalibrationInfo=");
        sb.append(this.engineCalibrationInfo);
        sb.append(", isSuccessful=");
        return androidx.camera.core.impl.b.s(sb, this.isSuccessful, ')');
    }
}
