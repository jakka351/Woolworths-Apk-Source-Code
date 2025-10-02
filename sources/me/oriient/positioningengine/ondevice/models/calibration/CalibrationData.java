package me.oriient.positioningengine.ondevice.models.calibration;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.models.EngineNumericArray;
import me.oriient.positioningengine.common.v;
import me.oriient.positioningengine.common.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b<\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0001^B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u0010*J\u0010\u00100\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b0\u0010*J\u0010\u00101\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u0010-J\u0010\u00103\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b3\u0010-J\u0010\u00104\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b4\u0010-J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010'J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010'J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010'J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010'J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010'J\u0010\u0010;\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b?\u0010>Jâ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bB\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010C\u001a\u0004\bE\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010F\u001a\u0004\bG\u0010*R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bH\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bJ\u0010-R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bK\u0010*R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\bL\u0010*R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bM\u0010*R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bN\u0010-R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bO\u0010-R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bP\u0010-R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bQ\u0010-R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bR\u0010'R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bS\u0010'R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bT\u0010'R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bU\u0010'R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bV\u0010'R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010C\u001a\u0004\bW\u0010'R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\bY\u0010<R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010Z\u001a\u0004\b[\u0010>R\u0017\u0010\u001b\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\b\\\u0010>¨\u0006_"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/calibration/CalibrationData;", "Ljava/io/Serializable;", "", "radius", "calibStd", "Lme/oriient/positioningengine/common/models/EngineNumericArray;", "softIronScaleMatrix", "softIronScaleMatrixInvTNrmlzd", "", "hardIronOffset", "covMat", "covDiag", "innerState", "mgntCov", "hardIronCov", "scaleMtxDiagCov", "scaleMtxOffDiagCov", "gesturesInnovation", "softIronLsErr", "hardIronLsErr", "ttlErr", "progress", "maxProgress", "Lme/oriient/positioningengine/ondevice/models/calibration/FullState;", "fullState", "", "type", "lastSuccessfulTime", "<init>", "(DDLme/oriient/positioningengine/common/models/EngineNumericArray;Lme/oriient/positioningengine/common/models/EngineNumericArray;[DLme/oriient/positioningengine/common/models/EngineNumericArray;Lme/oriient/positioningengine/common/models/EngineNumericArray;Lme/oriient/positioningengine/common/models/EngineNumericArray;[D[D[D[DDDDDDDLme/oriient/positioningengine/ondevice/models/calibration/FullState;Ljava/lang/String;Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()D", "component2", "component3", "()Lme/oriient/positioningengine/common/models/EngineNumericArray;", "component4", "component5", "()[D", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Lme/oriient/positioningengine/ondevice/models/calibration/FullState;", "component20", "()Ljava/lang/String;", "component21", "copy", "(DDLme/oriient/positioningengine/common/models/EngineNumericArray;Lme/oriient/positioningengine/common/models/EngineNumericArray;[DLme/oriient/positioningengine/common/models/EngineNumericArray;Lme/oriient/positioningengine/common/models/EngineNumericArray;Lme/oriient/positioningengine/common/models/EngineNumericArray;[D[D[D[DDDDDDDLme/oriient/positioningengine/ondevice/models/calibration/FullState;Ljava/lang/String;Ljava/lang/String;)Lme/oriient/positioningengine/ondevice/models/calibration/CalibrationData;", "toString", "D", "getRadius", "getCalibStd", "Lme/oriient/positioningengine/common/models/EngineNumericArray;", "getSoftIronScaleMatrix", "getSoftIronScaleMatrixInvTNrmlzd", "[D", "getHardIronOffset", "getCovMat", "getCovDiag", "getInnerState", "getMgntCov", "getHardIronCov", "getScaleMtxDiagCov", "getScaleMtxOffDiagCov", "getGesturesInnovation", "getSoftIronLsErr", "getHardIronLsErr", "getTtlErr", "getProgress", "getMaxProgress", "Lme/oriient/positioningengine/ondevice/models/calibration/FullState;", "getFullState", "Ljava/lang/String;", "getType", "getLastSuccessfulTime", "Companion", "me/oriient/positioningengine/ondevice/models/calibration/a", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CalibrationData implements Serializable {

    @NotNull
    public static final a Companion = new a();
    private static final long serialVersionUID = 1;
    private final double calibStd;

    @NotNull
    private final EngineNumericArray covDiag;

    @NotNull
    private final EngineNumericArray covMat;

    @NotNull
    private final FullState fullState;
    private final double gesturesInnovation;

    @NotNull
    private final double[] hardIronCov;
    private final double hardIronLsErr;

    @NotNull
    private final double[] hardIronOffset;

    @NotNull
    private final EngineNumericArray innerState;

    @NotNull
    private final String lastSuccessfulTime;
    private final double maxProgress;

    @NotNull
    private final double[] mgntCov;
    private final double progress;
    private final double radius;

    @NotNull
    private final double[] scaleMtxDiagCov;

    @NotNull
    private final double[] scaleMtxOffDiagCov;
    private final double softIronLsErr;

    @NotNull
    private final EngineNumericArray softIronScaleMatrix;

    @NotNull
    private final EngineNumericArray softIronScaleMatrixInvTNrmlzd;
    private final double ttlErr;

    @NotNull
    private final String type;

    public CalibrationData(double d, double d2, @NotNull EngineNumericArray softIronScaleMatrix, @NotNull EngineNumericArray softIronScaleMatrixInvTNrmlzd, @NotNull double[] hardIronOffset, @NotNull EngineNumericArray covMat, @NotNull EngineNumericArray covDiag, @NotNull EngineNumericArray innerState, @NotNull double[] mgntCov, @NotNull double[] hardIronCov, @NotNull double[] scaleMtxDiagCov, @NotNull double[] scaleMtxOffDiagCov, double d3, double d4, double d5, double d6, double d7, double d8, @NotNull FullState fullState, @NotNull String type, @NotNull String lastSuccessfulTime) {
        Intrinsics.h(softIronScaleMatrix, "softIronScaleMatrix");
        Intrinsics.h(softIronScaleMatrixInvTNrmlzd, "softIronScaleMatrixInvTNrmlzd");
        Intrinsics.h(hardIronOffset, "hardIronOffset");
        Intrinsics.h(covMat, "covMat");
        Intrinsics.h(covDiag, "covDiag");
        Intrinsics.h(innerState, "innerState");
        Intrinsics.h(mgntCov, "mgntCov");
        Intrinsics.h(hardIronCov, "hardIronCov");
        Intrinsics.h(scaleMtxDiagCov, "scaleMtxDiagCov");
        Intrinsics.h(scaleMtxOffDiagCov, "scaleMtxOffDiagCov");
        Intrinsics.h(fullState, "fullState");
        Intrinsics.h(type, "type");
        Intrinsics.h(lastSuccessfulTime, "lastSuccessfulTime");
        this.radius = d;
        this.calibStd = d2;
        this.softIronScaleMatrix = softIronScaleMatrix;
        this.softIronScaleMatrixInvTNrmlzd = softIronScaleMatrixInvTNrmlzd;
        this.hardIronOffset = hardIronOffset;
        this.covMat = covMat;
        this.covDiag = covDiag;
        this.innerState = innerState;
        this.mgntCov = mgntCov;
        this.hardIronCov = hardIronCov;
        this.scaleMtxDiagCov = scaleMtxDiagCov;
        this.scaleMtxOffDiagCov = scaleMtxOffDiagCov;
        this.gesturesInnovation = d3;
        this.softIronLsErr = d4;
        this.hardIronLsErr = d5;
        this.ttlErr = d6;
        this.progress = d7;
        this.maxProgress = d8;
        this.fullState = fullState;
        this.type = type;
        this.lastSuccessfulTime = lastSuccessfulTime;
    }

    public static /* synthetic */ CalibrationData copy$default(CalibrationData calibrationData, double d, double d2, EngineNumericArray engineNumericArray, EngineNumericArray engineNumericArray2, double[] dArr, EngineNumericArray engineNumericArray3, EngineNumericArray engineNumericArray4, EngineNumericArray engineNumericArray5, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, double d3, double d4, double d5, double d6, double d7, double d8, FullState fullState, String str, String str2, int i, Object obj) {
        double d9 = (i & 1) != 0 ? calibrationData.radius : d;
        return calibrationData.copy(d9, (i & 2) != 0 ? calibrationData.calibStd : d2, (i & 4) != 0 ? calibrationData.softIronScaleMatrix : engineNumericArray, (i & 8) != 0 ? calibrationData.softIronScaleMatrixInvTNrmlzd : engineNumericArray2, (i & 16) != 0 ? calibrationData.hardIronOffset : dArr, (i & 32) != 0 ? calibrationData.covMat : engineNumericArray3, (i & 64) != 0 ? calibrationData.covDiag : engineNumericArray4, (i & 128) != 0 ? calibrationData.innerState : engineNumericArray5, (i & 256) != 0 ? calibrationData.mgntCov : dArr2, (i & 512) != 0 ? calibrationData.hardIronCov : dArr3, (i & 1024) != 0 ? calibrationData.scaleMtxDiagCov : dArr4, (i & 2048) != 0 ? calibrationData.scaleMtxOffDiagCov : dArr5, (i & 4096) != 0 ? calibrationData.gesturesInnovation : d3, (i & 8192) != 0 ? calibrationData.softIronLsErr : d4, (i & 16384) != 0 ? calibrationData.hardIronLsErr : d5, (i & 32768) != 0 ? calibrationData.ttlErr : d6, (i & 65536) != 0 ? calibrationData.progress : d7, (i & 131072) != 0 ? calibrationData.maxProgress : d8, (i & 262144) != 0 ? calibrationData.fullState : fullState, (i & 524288) != 0 ? calibrationData.type : str, (i & 1048576) != 0 ? calibrationData.lastSuccessfulTime : str2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getRadius() {
        return this.radius;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final double[] getHardIronCov() {
        return this.hardIronCov;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final double[] getScaleMtxDiagCov() {
        return this.scaleMtxDiagCov;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final double[] getScaleMtxOffDiagCov() {
        return this.scaleMtxOffDiagCov;
    }

    /* renamed from: component13, reason: from getter */
    public final double getGesturesInnovation() {
        return this.gesturesInnovation;
    }

    /* renamed from: component14, reason: from getter */
    public final double getSoftIronLsErr() {
        return this.softIronLsErr;
    }

    /* renamed from: component15, reason: from getter */
    public final double getHardIronLsErr() {
        return this.hardIronLsErr;
    }

    /* renamed from: component16, reason: from getter */
    public final double getTtlErr() {
        return this.ttlErr;
    }

    /* renamed from: component17, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    /* renamed from: component18, reason: from getter */
    public final double getMaxProgress() {
        return this.maxProgress;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final FullState getFullState() {
        return this.fullState;
    }

    /* renamed from: component2, reason: from getter */
    public final double getCalibStd() {
        return this.calibStd;
    }

    @NotNull
    /* renamed from: component20, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final String getLastSuccessfulTime() {
        return this.lastSuccessfulTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final EngineNumericArray getSoftIronScaleMatrix() {
        return this.softIronScaleMatrix;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final EngineNumericArray getSoftIronScaleMatrixInvTNrmlzd() {
        return this.softIronScaleMatrixInvTNrmlzd;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final double[] getHardIronOffset() {
        return this.hardIronOffset;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final EngineNumericArray getCovMat() {
        return this.covMat;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final EngineNumericArray getCovDiag() {
        return this.covDiag;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final EngineNumericArray getInnerState() {
        return this.innerState;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final double[] getMgntCov() {
        return this.mgntCov;
    }

    @NotNull
    public final CalibrationData copy(double radius, double calibStd, @NotNull EngineNumericArray softIronScaleMatrix, @NotNull EngineNumericArray softIronScaleMatrixInvTNrmlzd, @NotNull double[] hardIronOffset, @NotNull EngineNumericArray covMat, @NotNull EngineNumericArray covDiag, @NotNull EngineNumericArray innerState, @NotNull double[] mgntCov, @NotNull double[] hardIronCov, @NotNull double[] scaleMtxDiagCov, @NotNull double[] scaleMtxOffDiagCov, double gesturesInnovation, double softIronLsErr, double hardIronLsErr, double ttlErr, double progress, double maxProgress, @NotNull FullState fullState, @NotNull String type, @NotNull String lastSuccessfulTime) {
        Intrinsics.h(softIronScaleMatrix, "softIronScaleMatrix");
        Intrinsics.h(softIronScaleMatrixInvTNrmlzd, "softIronScaleMatrixInvTNrmlzd");
        Intrinsics.h(hardIronOffset, "hardIronOffset");
        Intrinsics.h(covMat, "covMat");
        Intrinsics.h(covDiag, "covDiag");
        Intrinsics.h(innerState, "innerState");
        Intrinsics.h(mgntCov, "mgntCov");
        Intrinsics.h(hardIronCov, "hardIronCov");
        Intrinsics.h(scaleMtxDiagCov, "scaleMtxDiagCov");
        Intrinsics.h(scaleMtxOffDiagCov, "scaleMtxOffDiagCov");
        Intrinsics.h(fullState, "fullState");
        Intrinsics.h(type, "type");
        Intrinsics.h(lastSuccessfulTime, "lastSuccessfulTime");
        return new CalibrationData(radius, calibStd, softIronScaleMatrix, softIronScaleMatrixInvTNrmlzd, hardIronOffset, covMat, covDiag, innerState, mgntCov, hardIronCov, scaleMtxDiagCov, scaleMtxOffDiagCov, gesturesInnovation, softIronLsErr, hardIronLsErr, ttlErr, progress, maxProgress, fullState, type, lastSuccessfulTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!CalibrationData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type me.oriient.positioningengine.ondevice.models.calibration.CalibrationData");
        CalibrationData calibrationData = (CalibrationData) other;
        return this.radius == calibrationData.radius && this.calibStd == calibrationData.calibStd && Intrinsics.c(this.softIronScaleMatrix, calibrationData.softIronScaleMatrix) && Intrinsics.c(this.softIronScaleMatrixInvTNrmlzd, calibrationData.softIronScaleMatrixInvTNrmlzd) && Arrays.equals(this.hardIronOffset, calibrationData.hardIronOffset) && Intrinsics.c(this.covMat, calibrationData.covMat) && Intrinsics.c(this.covDiag, calibrationData.covDiag) && Intrinsics.c(this.innerState, calibrationData.innerState) && Arrays.equals(this.mgntCov, calibrationData.mgntCov) && Arrays.equals(this.hardIronCov, calibrationData.hardIronCov) && Arrays.equals(this.scaleMtxDiagCov, calibrationData.scaleMtxDiagCov) && Arrays.equals(this.scaleMtxOffDiagCov, calibrationData.scaleMtxOffDiagCov) && this.gesturesInnovation == calibrationData.gesturesInnovation && this.softIronLsErr == calibrationData.softIronLsErr && this.hardIronLsErr == calibrationData.hardIronLsErr && this.ttlErr == calibrationData.ttlErr && this.progress == calibrationData.progress && this.maxProgress == calibrationData.maxProgress && Intrinsics.c(this.fullState, calibrationData.fullState) && Intrinsics.c(this.type, calibrationData.type) && Intrinsics.c(this.lastSuccessfulTime, calibrationData.lastSuccessfulTime);
    }

    public final double getCalibStd() {
        return this.calibStd;
    }

    @NotNull
    public final EngineNumericArray getCovDiag() {
        return this.covDiag;
    }

    @NotNull
    public final EngineNumericArray getCovMat() {
        return this.covMat;
    }

    @NotNull
    public final FullState getFullState() {
        return this.fullState;
    }

    public final double getGesturesInnovation() {
        return this.gesturesInnovation;
    }

    @NotNull
    public final double[] getHardIronCov() {
        return this.hardIronCov;
    }

    public final double getHardIronLsErr() {
        return this.hardIronLsErr;
    }

    @NotNull
    public final double[] getHardIronOffset() {
        return this.hardIronOffset;
    }

    @NotNull
    public final EngineNumericArray getInnerState() {
        return this.innerState;
    }

    @NotNull
    public final String getLastSuccessfulTime() {
        return this.lastSuccessfulTime;
    }

    public final double getMaxProgress() {
        return this.maxProgress;
    }

    @NotNull
    public final double[] getMgntCov() {
        return this.mgntCov;
    }

    public final double getProgress() {
        return this.progress;
    }

    public final double getRadius() {
        return this.radius;
    }

    @NotNull
    public final double[] getScaleMtxDiagCov() {
        return this.scaleMtxDiagCov;
    }

    @NotNull
    public final double[] getScaleMtxOffDiagCov() {
        return this.scaleMtxOffDiagCov;
    }

    public final double getSoftIronLsErr() {
        return this.softIronLsErr;
    }

    @NotNull
    public final EngineNumericArray getSoftIronScaleMatrix() {
        return this.softIronScaleMatrix;
    }

    @NotNull
    public final EngineNumericArray getSoftIronScaleMatrixInvTNrmlzd() {
        return this.softIronScaleMatrixInvTNrmlzd;
    }

    public final double getTtlErr() {
        return this.ttlErr;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.lastSuccessfulTime.hashCode() + z.a(this.type, (this.fullState.hashCode() + v.a(this.maxProgress, v.a(this.progress, v.a(this.ttlErr, v.a(this.hardIronLsErr, v.a(this.softIronLsErr, v.a(this.gesturesInnovation, (Arrays.hashCode(this.scaleMtxOffDiagCov) + ((Arrays.hashCode(this.scaleMtxDiagCov) + ((Arrays.hashCode(this.hardIronCov) + ((Arrays.hashCode(this.mgntCov) + ((this.innerState.hashCode() + ((this.covDiag.hashCode() + ((this.covMat.hashCode() + ((Arrays.hashCode(this.hardIronOffset) + ((this.softIronScaleMatrixInvTNrmlzd.hashCode() + ((this.softIronScaleMatrix.hashCode() + v.a(this.calibStd, Double.hashCode(this.radius) * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CalibrationData(radius=");
        sb.append(this.radius);
        sb.append(", calibStd=");
        sb.append(this.calibStd);
        sb.append(", softIronScaleMatrix=");
        sb.append(this.softIronScaleMatrix);
        sb.append(", softIronScaleMatrixInvTNrmlzd=");
        sb.append(this.softIronScaleMatrixInvTNrmlzd);
        sb.append(", hardIronOffset=");
        sb.append(Arrays.toString(this.hardIronOffset));
        sb.append(", covMat=");
        sb.append(this.covMat);
        sb.append(", covDiag=");
        sb.append(this.covDiag);
        sb.append(", innerState=");
        sb.append(this.innerState);
        sb.append(", mgntCov=");
        sb.append(Arrays.toString(this.mgntCov));
        sb.append(", hardIronCov=");
        sb.append(Arrays.toString(this.hardIronCov));
        sb.append(", scaleMtxDiagCov=");
        sb.append(Arrays.toString(this.scaleMtxDiagCov));
        sb.append(", scaleMtxOffDiagCov=");
        sb.append(Arrays.toString(this.scaleMtxOffDiagCov));
        sb.append(", gesturesInnovation=");
        sb.append(this.gesturesInnovation);
        sb.append(", softIronLsErr=");
        sb.append(this.softIronLsErr);
        sb.append(", hardIronLsErr=");
        sb.append(this.hardIronLsErr);
        sb.append(", ttlErr=");
        sb.append(this.ttlErr);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", maxProgress=");
        sb.append(this.maxProgress);
        sb.append(", fullState=");
        sb.append(this.fullState);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", lastSuccessfulTime=");
        return androidx.camera.core.impl.b.r(sb, this.lastSuccessfulTime, ')');
    }
}
