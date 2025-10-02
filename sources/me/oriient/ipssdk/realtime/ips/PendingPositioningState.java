package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.EngineStopReason;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/PendingPositioningState;", "", "", "getShouldBePositioning", "()Z", "shouldBePositioning", "Idle", "Positioning", "Lme/oriient/ipssdk/realtime/ips/PendingPositioningState$Idle;", "Lme/oriient/ipssdk/realtime/ips/PendingPositioningState$Positioning;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class PendingPositioningState {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/PendingPositioningState$Idle;", "Lme/oriient/ipssdk/realtime/ips/PendingPositioningState;", "Lme/oriient/positioningengine/common/EngineStopReason;", "reason", "<init>", "(Lme/oriient/positioningengine/common/EngineStopReason;)V", "a", "Lme/oriient/positioningengine/common/EngineStopReason;", "getReason", "()Lme/oriient/positioningengine/common/EngineStopReason;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Idle extends PendingPositioningState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final EngineStopReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Idle(@NotNull EngineStopReason reason) {
            super(null);
            Intrinsics.h(reason, "reason");
            this.reason = reason;
        }

        @NotNull
        public final EngineStopReason getReason() {
            return this.reason;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/PendingPositioningState$Positioning;", "Lme/oriient/ipssdk/realtime/ips/PendingPositioningState;", "", "allowOutside", "initiatedByUser", "<init>", "(ZZ)V", "a", "Z", "getAllowOutside", "()Z", "b", "getInitiatedByUser", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Positioning extends PendingPositioningState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean allowOutside;

        /* renamed from: b, reason: from kotlin metadata */
        private final boolean initiatedByUser;

        public Positioning(boolean z, boolean z2) {
            super(null);
            this.allowOutside = z;
            this.initiatedByUser = z2;
        }

        public final boolean getAllowOutside() {
            return this.allowOutside;
        }

        public final boolean getInitiatedByUser() {
            return this.initiatedByUser;
        }
    }

    public PendingPositioningState(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public final boolean getShouldBePositioning() {
        if (this instanceof Idle) {
            return false;
        }
        if (this instanceof Positioning) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
