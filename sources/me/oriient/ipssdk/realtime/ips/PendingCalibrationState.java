package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/PendingCalibrationState;", "", "", "getShouldBeCalibrating", "()Z", "shouldBeCalibrating", "Calibrating", "Idle", "Lme/oriient/ipssdk/realtime/ips/PendingCalibrationState$Calibrating;", "Lme/oriient/ipssdk/realtime/ips/PendingCalibrationState$Idle;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class PendingCalibrationState {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/PendingCalibrationState$Calibrating;", "Lme/oriient/ipssdk/realtime/ips/PendingCalibrationState;", "", "initiatedByUser", "<init>", "(Z)V", "a", "Z", "getInitiatedByUser", "()Z", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Calibrating extends PendingCalibrationState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean initiatedByUser;

        public Calibrating(boolean z) {
            super(null);
            this.initiatedByUser = z;
        }

        public final boolean getInitiatedByUser() {
            return this.initiatedByUser;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/PendingCalibrationState$Idle;", "Lme/oriient/ipssdk/realtime/ips/PendingCalibrationState;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Idle extends PendingCalibrationState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    public PendingCalibrationState(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public final boolean getShouldBeCalibrating() {
        if (this instanceof Idle) {
            return false;
        }
        if (this instanceof Calibrating) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
