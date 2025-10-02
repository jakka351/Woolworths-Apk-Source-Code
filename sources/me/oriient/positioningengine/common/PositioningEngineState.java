package me.oriient.positioningengine.common;

import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lme/oriient/positioningengine/common/PositioningEngineState;", "", "()V", "logDescription", "", "", "logDescription$service_positioning_engine_publishRelease", "Calibrating", "Idle", "Positioning", "Lme/oriient/positioningengine/common/PositioningEngineState$Calibrating;", "Lme/oriient/positioningengine/common/PositioningEngineState$Idle;", "Lme/oriient/positioningengine/common/PositioningEngineState$Positioning;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class PositioningEngineState {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lme/oriient/positioningengine/common/PositioningEngineState$Calibrating;", "Lme/oriient/positioningengine/common/PositioningEngineState;", "context", "Lme/oriient/positioningengine/common/CalibrationContext;", "(Lme/oriient/positioningengine/common/CalibrationContext;)V", "getContext", "()Lme/oriient/positioningengine/common/CalibrationContext;", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Calibrating extends PositioningEngineState {

        @NotNull
        private final CalibrationContext context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Calibrating(@NotNull CalibrationContext context) {
            super(null);
            Intrinsics.h(context, "context");
            this.context = context;
        }

        @NotNull
        public final CalibrationContext getContext() {
            return this.context;
        }

        @NotNull
        public String toString() {
            return "calibrating";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/PositioningEngineState$Idle;", "Lme/oriient/positioningengine/common/PositioningEngineState;", "()V", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Idle extends PositioningEngineState {
        public Idle() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "idle";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lme/oriient/positioningengine/common/PositioningEngineState$Positioning;", "Lme/oriient/positioningengine/common/PositioningEngineState;", "context", "Lme/oriient/positioningengine/common/PositioningContext;", "(Lme/oriient/positioningengine/common/PositioningContext;)V", "getContext", "()Lme/oriient/positioningengine/common/PositioningContext;", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Positioning extends PositioningEngineState {

        @NotNull
        private final PositioningContext context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Positioning(@NotNull PositioningContext context) {
            super(null);
            Intrinsics.h(context, "context");
            this.context = context;
        }

        @NotNull
        public final PositioningContext getContext() {
            return this.context;
        }

        @NotNull
        public String toString() {
            return "positioning";
        }
    }

    public /* synthetic */ PositioningEngineState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final Map<String, String> logDescription$service_positioning_engine_publishRelease() {
        if (this instanceof Idle) {
            return androidx.constraintlayout.core.state.a.s("state", toString());
        }
        if (this instanceof Calibrating) {
            return MapsKt.j(new Pair("state", toString()), new Pair("sessionId", ((Calibrating) this).getContext().getSessionId()));
        }
        if (!(this instanceof Positioning)) {
            throw new NoWhenBranchMatchedException();
        }
        Positioning positioning = (Positioning) this;
        return MapsKt.j(new Pair("state", toString()), new Pair("sessionId", positioning.getContext().getSessionId()), new Pair("buildingId", positioning.getContext().getBuildingId()));
    }

    private PositioningEngineState() {
    }
}
