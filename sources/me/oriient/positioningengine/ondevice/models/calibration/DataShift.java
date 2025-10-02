package me.oriient.positioningengine.ondevice.models.calibration;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.models.EngineNumericArray;
import me.oriient.positioningengine.common.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00010BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ`\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b+\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b,\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b-\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b.\u0010\u000f¨\u00061"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/calibration/DataShift;", "Ljava/io/Serializable;", "", "estShift", "changeTime", "Lme/oriient/positioningengine/common/models/EngineNumericArray;", "decsQual", "nrmlzdErr", "currMinShift", "nrmlzdErrToEst", "numValid", "outputLastVldTmShift", "<init>", "(DDLme/oriient/positioningengine/common/models/EngineNumericArray;DDDDD)V", "component1", "()D", "component2", "component3", "()Lme/oriient/positioningengine/common/models/EngineNumericArray;", "component4", "component5", "component6", "component7", "component8", "copy", "(DDLme/oriient/positioningengine/common/models/EngineNumericArray;DDDDD)Lme/oriient/positioningengine/ondevice/models/calibration/DataShift;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getEstShift", "getChangeTime", "Lme/oriient/positioningengine/common/models/EngineNumericArray;", "getDecsQual", "getNrmlzdErr", "getCurrMinShift", "getNrmlzdErrToEst", "getNumValid", "getOutputLastVldTmShift", "Companion", "me/oriient/positioningengine/ondevice/models/calibration/d", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DataShift implements Serializable {

    @NotNull
    public static final d Companion = new d();
    private static final long serialVersionUID = 1;
    private final double changeTime;
    private final double currMinShift;

    @NotNull
    private final EngineNumericArray decsQual;
    private final double estShift;
    private final double nrmlzdErr;
    private final double nrmlzdErrToEst;
    private final double numValid;
    private final double outputLastVldTmShift;

    public DataShift(double d, double d2, @NotNull EngineNumericArray decsQual, double d3, double d4, double d5, double d6, double d7) {
        Intrinsics.h(decsQual, "decsQual");
        this.estShift = d;
        this.changeTime = d2;
        this.decsQual = decsQual;
        this.nrmlzdErr = d3;
        this.currMinShift = d4;
        this.nrmlzdErrToEst = d5;
        this.numValid = d6;
        this.outputLastVldTmShift = d7;
    }

    public static /* synthetic */ DataShift copy$default(DataShift dataShift, double d, double d2, EngineNumericArray engineNumericArray, double d3, double d4, double d5, double d6, double d7, int i, Object obj) {
        double d8;
        double d9;
        double d10 = (i & 1) != 0 ? dataShift.estShift : d;
        double d11 = (i & 2) != 0 ? dataShift.changeTime : d2;
        EngineNumericArray engineNumericArray2 = (i & 4) != 0 ? dataShift.decsQual : engineNumericArray;
        double d12 = (i & 8) != 0 ? dataShift.nrmlzdErr : d3;
        double d13 = (i & 16) != 0 ? dataShift.currMinShift : d4;
        double d14 = (i & 32) != 0 ? dataShift.nrmlzdErrToEst : d5;
        double d15 = (i & 64) != 0 ? dataShift.numValid : d6;
        if ((i & 128) != 0) {
            d8 = dataShift.outputLastVldTmShift;
            d9 = d10;
        } else {
            d8 = d7;
            d9 = d10;
        }
        return dataShift.copy(d9, d11, engineNumericArray2, d12, d13, d14, d15, d8);
    }

    /* renamed from: component1, reason: from getter */
    public final double getEstShift() {
        return this.estShift;
    }

    /* renamed from: component2, reason: from getter */
    public final double getChangeTime() {
        return this.changeTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final EngineNumericArray getDecsQual() {
        return this.decsQual;
    }

    /* renamed from: component4, reason: from getter */
    public final double getNrmlzdErr() {
        return this.nrmlzdErr;
    }

    /* renamed from: component5, reason: from getter */
    public final double getCurrMinShift() {
        return this.currMinShift;
    }

    /* renamed from: component6, reason: from getter */
    public final double getNrmlzdErrToEst() {
        return this.nrmlzdErrToEst;
    }

    /* renamed from: component7, reason: from getter */
    public final double getNumValid() {
        return this.numValid;
    }

    /* renamed from: component8, reason: from getter */
    public final double getOutputLastVldTmShift() {
        return this.outputLastVldTmShift;
    }

    @NotNull
    public final DataShift copy(double estShift, double changeTime, @NotNull EngineNumericArray decsQual, double nrmlzdErr, double currMinShift, double nrmlzdErrToEst, double numValid, double outputLastVldTmShift) {
        Intrinsics.h(decsQual, "decsQual");
        return new DataShift(estShift, changeTime, decsQual, nrmlzdErr, currMinShift, nrmlzdErrToEst, numValid, outputLastVldTmShift);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataShift)) {
            return false;
        }
        DataShift dataShift = (DataShift) other;
        return Double.compare(this.estShift, dataShift.estShift) == 0 && Double.compare(this.changeTime, dataShift.changeTime) == 0 && Intrinsics.c(this.decsQual, dataShift.decsQual) && Double.compare(this.nrmlzdErr, dataShift.nrmlzdErr) == 0 && Double.compare(this.currMinShift, dataShift.currMinShift) == 0 && Double.compare(this.nrmlzdErrToEst, dataShift.nrmlzdErrToEst) == 0 && Double.compare(this.numValid, dataShift.numValid) == 0 && Double.compare(this.outputLastVldTmShift, dataShift.outputLastVldTmShift) == 0;
    }

    public final double getChangeTime() {
        return this.changeTime;
    }

    public final double getCurrMinShift() {
        return this.currMinShift;
    }

    @NotNull
    public final EngineNumericArray getDecsQual() {
        return this.decsQual;
    }

    public final double getEstShift() {
        return this.estShift;
    }

    public final double getNrmlzdErr() {
        return this.nrmlzdErr;
    }

    public final double getNrmlzdErrToEst() {
        return this.nrmlzdErrToEst;
    }

    public final double getNumValid() {
        return this.numValid;
    }

    public final double getOutputLastVldTmShift() {
        return this.outputLastVldTmShift;
    }

    public int hashCode() {
        return Double.hashCode(this.outputLastVldTmShift) + v.a(this.numValid, v.a(this.nrmlzdErrToEst, v.a(this.currMinShift, v.a(this.nrmlzdErr, (this.decsQual.hashCode() + v.a(this.changeTime, Double.hashCode(this.estShift) * 31, 31)) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DataShift(estShift=");
        sb.append(this.estShift);
        sb.append(", changeTime=");
        sb.append(this.changeTime);
        sb.append(", decsQual=");
        sb.append(this.decsQual);
        sb.append(", nrmlzdErr=");
        sb.append(this.nrmlzdErr);
        sb.append(", currMinShift=");
        sb.append(this.currMinShift);
        sb.append(", nrmlzdErrToEst=");
        sb.append(this.nrmlzdErrToEst);
        sb.append(", numValid=");
        sb.append(this.numValid);
        sb.append(", outputLastVldTmShift=");
        return me.oriient.positioningengine.common.a.a(sb, this.outputLastVldTmShift, ')');
    }
}
