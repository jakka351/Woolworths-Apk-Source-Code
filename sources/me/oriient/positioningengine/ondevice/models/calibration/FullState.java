package me.oriient.positioningengine.ondevice.models.calibration;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.models.EngineNumericArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f¨\u0006 "}, d2 = {"Lme/oriient/positioningengine/ondevice/models/calibration/FullState;", "Ljava/io/Serializable;", "", "method", "Lme/oriient/positioningengine/common/models/EngineNumericArray;", "estVec", "estCov", "<init>", "(Ljava/lang/String;Lme/oriient/positioningengine/common/models/EngineNumericArray;Lme/oriient/positioningengine/common/models/EngineNumericArray;)V", "component1", "()Ljava/lang/String;", "component2", "()Lme/oriient/positioningengine/common/models/EngineNumericArray;", "component3", "copy", "(Ljava/lang/String;Lme/oriient/positioningengine/common/models/EngineNumericArray;Lme/oriient/positioningengine/common/models/EngineNumericArray;)Lme/oriient/positioningengine/ondevice/models/calibration/FullState;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMethod", "Lme/oriient/positioningengine/common/models/EngineNumericArray;", "getEstVec", "getEstCov", "Companion", "me/oriient/positioningengine/ondevice/models/calibration/f", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FullState implements Serializable {

    @NotNull
    public static final f Companion = new f();
    private static final long serialVersionUID = 1;

    @NotNull
    private final EngineNumericArray estCov;

    @NotNull
    private final EngineNumericArray estVec;

    @NotNull
    private final String method;

    public FullState(@NotNull String method, @NotNull EngineNumericArray estVec, @NotNull EngineNumericArray estCov) {
        Intrinsics.h(method, "method");
        Intrinsics.h(estVec, "estVec");
        Intrinsics.h(estCov, "estCov");
        this.method = method;
        this.estVec = estVec;
        this.estCov = estCov;
    }

    public static /* synthetic */ FullState copy$default(FullState fullState, String str, EngineNumericArray engineNumericArray, EngineNumericArray engineNumericArray2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fullState.method;
        }
        if ((i & 2) != 0) {
            engineNumericArray = fullState.estVec;
        }
        if ((i & 4) != 0) {
            engineNumericArray2 = fullState.estCov;
        }
        return fullState.copy(str, engineNumericArray, engineNumericArray2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final EngineNumericArray getEstVec() {
        return this.estVec;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final EngineNumericArray getEstCov() {
        return this.estCov;
    }

    @NotNull
    public final FullState copy(@NotNull String method, @NotNull EngineNumericArray estVec, @NotNull EngineNumericArray estCov) {
        Intrinsics.h(method, "method");
        Intrinsics.h(estVec, "estVec");
        Intrinsics.h(estCov, "estCov");
        return new FullState(method, estVec, estCov);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullState)) {
            return false;
        }
        FullState fullState = (FullState) other;
        return Intrinsics.c(this.method, fullState.method) && Intrinsics.c(this.estVec, fullState.estVec) && Intrinsics.c(this.estCov, fullState.estCov);
    }

    @NotNull
    public final EngineNumericArray getEstCov() {
        return this.estCov;
    }

    @NotNull
    public final EngineNumericArray getEstVec() {
        return this.estVec;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    public int hashCode() {
        return this.estCov.hashCode() + ((this.estVec.hashCode() + (this.method.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FullState(method=" + this.method + ", estVec=" + this.estVec + ", estCov=" + this.estCov + ')';
    }
}
