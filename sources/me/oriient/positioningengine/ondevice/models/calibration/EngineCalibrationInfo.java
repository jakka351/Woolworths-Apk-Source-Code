package me.oriient.positioningengine.ondevice.models.calibration;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.models.EngineNumericArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001f"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfo;", "Ljava/io/Serializable;", "Lme/oriient/positioningengine/ondevice/models/calibration/CalibrationData;", "calibrationData", "Lme/oriient/positioningengine/ondevice/models/calibration/DataShift;", "dataShift", "<init>", "(Lme/oriient/positioningengine/ondevice/models/calibration/CalibrationData;Lme/oriient/positioningengine/ondevice/models/calibration/DataShift;)V", "component1", "()Lme/oriient/positioningengine/ondevice/models/calibration/CalibrationData;", "component2", "()Lme/oriient/positioningengine/ondevice/models/calibration/DataShift;", "copy", "(Lme/oriient/positioningengine/ondevice/models/calibration/CalibrationData;Lme/oriient/positioningengine/ondevice/models/calibration/DataShift;)Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lme/oriient/positioningengine/ondevice/models/calibration/CalibrationData;", "getCalibrationData", "Lme/oriient/positioningengine/ondevice/models/calibration/DataShift;", "getDataShift", "Companion", "me/oriient/positioningengine/ondevice/models/calibration/e", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EngineCalibrationInfo implements Serializable {

    @NotNull
    public static final e Companion = new e();

    @NotNull
    private static final EngineCalibrationInfo EMPTY = new EngineCalibrationInfo(new CalibrationData(0.0d, 0.0d, new EngineNumericArray(new double[0], new int[0]), new EngineNumericArray(new double[0], new int[0]), new double[0], new EngineNumericArray(new double[0], new int[0]), new EngineNumericArray(new double[0], new int[0]), new EngineNumericArray(new double[0], new int[0]), new double[0], new double[0], new double[0], new double[0], 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, new FullState("", new EngineNumericArray(new double[0], new int[0]), new EngineNumericArray(new double[0], new int[0])), "", "2022-03-31T14:24:15.171Z"), new DataShift(0.0d, 0.0d, new EngineNumericArray(new double[0], new int[0]), 0.0d, 0.0d, 0.0d, 0.0d, 0.0d));
    private static final long serialVersionUID = 1;

    @NotNull
    private final CalibrationData calibrationData;

    @NotNull
    private final DataShift dataShift;

    public EngineCalibrationInfo(@NotNull CalibrationData calibrationData, @NotNull DataShift dataShift) {
        Intrinsics.h(calibrationData, "calibrationData");
        Intrinsics.h(dataShift, "dataShift");
        this.calibrationData = calibrationData;
        this.dataShift = dataShift;
    }

    public static /* synthetic */ EngineCalibrationInfo copy$default(EngineCalibrationInfo engineCalibrationInfo, CalibrationData calibrationData, DataShift dataShift, int i, Object obj) {
        if ((i & 1) != 0) {
            calibrationData = engineCalibrationInfo.calibrationData;
        }
        if ((i & 2) != 0) {
            dataShift = engineCalibrationInfo.dataShift;
        }
        return engineCalibrationInfo.copy(calibrationData, dataShift);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CalibrationData getCalibrationData() {
        return this.calibrationData;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DataShift getDataShift() {
        return this.dataShift;
    }

    @NotNull
    public final EngineCalibrationInfo copy(@NotNull CalibrationData calibrationData, @NotNull DataShift dataShift) {
        Intrinsics.h(calibrationData, "calibrationData");
        Intrinsics.h(dataShift, "dataShift");
        return new EngineCalibrationInfo(calibrationData, dataShift);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineCalibrationInfo)) {
            return false;
        }
        EngineCalibrationInfo engineCalibrationInfo = (EngineCalibrationInfo) other;
        return Intrinsics.c(this.calibrationData, engineCalibrationInfo.calibrationData) && Intrinsics.c(this.dataShift, engineCalibrationInfo.dataShift);
    }

    @NotNull
    public final CalibrationData getCalibrationData() {
        return this.calibrationData;
    }

    @NotNull
    public final DataShift getDataShift() {
        return this.dataShift;
    }

    public int hashCode() {
        return this.dataShift.hashCode() + (this.calibrationData.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "EngineCalibrationInfo(calibrationData=" + this.calibrationData + ", dataShift=" + this.dataShift + ')';
    }
}
