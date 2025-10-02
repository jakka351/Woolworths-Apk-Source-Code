package me.oriient.positioningengine.ondevice.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.models.CalibrationNeeded;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/EngineCalibrationNeeded;", "", "reason", "", "info", "(Ljava/lang/String;Ljava/lang/String;)V", "getInfo", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toCalibrationNeeded", "Lme/oriient/positioningengine/common/models/CalibrationNeeded;", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EngineCalibrationNeeded {

    @Nullable
    private final String info;

    @Nullable
    private final String reason;

    public EngineCalibrationNeeded(@Nullable String str, @Nullable String str2) {
        this.reason = str;
        this.info = str2;
    }

    public static /* synthetic */ EngineCalibrationNeeded copy$default(EngineCalibrationNeeded engineCalibrationNeeded, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = engineCalibrationNeeded.reason;
        }
        if ((i & 2) != 0) {
            str2 = engineCalibrationNeeded.info;
        }
        return engineCalibrationNeeded.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final EngineCalibrationNeeded copy(@Nullable String reason, @Nullable String info) {
        return new EngineCalibrationNeeded(reason, info);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineCalibrationNeeded)) {
            return false;
        }
        EngineCalibrationNeeded engineCalibrationNeeded = (EngineCalibrationNeeded) other;
        return Intrinsics.c(this.reason, engineCalibrationNeeded.reason) && Intrinsics.c(this.info, engineCalibrationNeeded.info);
    }

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        String str = this.reason;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.info;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final CalibrationNeeded toCalibrationNeeded() {
        me.oriient.positioningengine.common.models.b bVar = CalibrationNeeded.Reason.Companion;
        String str = this.reason;
        bVar.getClass();
        CalibrationNeeded.Reason reason = CalibrationNeeded.Reason.TIMEOUT;
        if (!Intrinsics.c(str, reason.getValue())) {
            CalibrationNeeded.Reason reason2 = CalibrationNeeded.Reason.MAGNETIC;
            if (Intrinsics.c(str, reason2.getValue())) {
                reason = reason2;
            }
        }
        return new CalibrationNeeded(reason, this.info);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EngineCalibrationNeeded(reason=");
        sb.append(this.reason);
        sb.append(", info=");
        return androidx.camera.core.impl.b.r(sb, this.info, ')');
    }
}
