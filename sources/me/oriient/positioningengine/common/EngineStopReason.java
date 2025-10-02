package me.oriient.positioningengine.common;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0012\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toUploadingStopReason", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "toUploadingStopReason$service_positioning_engine_publishRelease", "AutomaticPositioningTimeout", "CalibrationStopped", "ChargingAutoStop", "ContextSwitchedDuringPositioning", "Custom", "EngineStateChanged", "Error", "ExitRegion", "InBackgroundTimeout", "Logout", "NoMovementTimeout", "NotInitialized", "OutOfExternalRegion", "OutOfGeofenceAutoStop", "SensorFailure", "SwitchUser", "UnexpectedRecovery", "UserInitiated", "Lme/oriient/positioningengine/common/EngineStopReason$AutomaticPositioningTimeout;", "Lme/oriient/positioningengine/common/EngineStopReason$CalibrationStopped;", "Lme/oriient/positioningengine/common/EngineStopReason$ChargingAutoStop;", "Lme/oriient/positioningengine/common/EngineStopReason$ContextSwitchedDuringPositioning;", "Lme/oriient/positioningengine/common/EngineStopReason$Custom;", "Lme/oriient/positioningengine/common/EngineStopReason$EngineStateChanged;", "Lme/oriient/positioningengine/common/EngineStopReason$Error;", "Lme/oriient/positioningengine/common/EngineStopReason$ExitRegion;", "Lme/oriient/positioningengine/common/EngineStopReason$InBackgroundTimeout;", "Lme/oriient/positioningengine/common/EngineStopReason$Logout;", "Lme/oriient/positioningengine/common/EngineStopReason$NoMovementTimeout;", "Lme/oriient/positioningengine/common/EngineStopReason$NotInitialized;", "Lme/oriient/positioningengine/common/EngineStopReason$OutOfExternalRegion;", "Lme/oriient/positioningengine/common/EngineStopReason$OutOfGeofenceAutoStop;", "Lme/oriient/positioningengine/common/EngineStopReason$SensorFailure;", "Lme/oriient/positioningengine/common/EngineStopReason$SwitchUser;", "Lme/oriient/positioningengine/common/EngineStopReason$UnexpectedRecovery;", "Lme/oriient/positioningengine/common/EngineStopReason$UserInitiated;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class EngineStopReason {

    @NotNull
    private final String value;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$AutomaticPositioningTimeout;", "Lme/oriient/positioningengine/common/EngineStopReason;", "timeoutMillis", "", "(J)V", "getTimeoutMillis", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AutomaticPositioningTimeout extends EngineStopReason {
        private final long timeoutMillis;

        public AutomaticPositioningTimeout(long j) {
            super("Automatic Positioning Timeout", null);
            this.timeoutMillis = j;
        }

        public static /* synthetic */ AutomaticPositioningTimeout copy$default(AutomaticPositioningTimeout automaticPositioningTimeout, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = automaticPositioningTimeout.timeoutMillis;
            }
            return automaticPositioningTimeout.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimeoutMillis() {
            return this.timeoutMillis;
        }

        @NotNull
        public final AutomaticPositioningTimeout copy(long timeoutMillis) {
            return new AutomaticPositioningTimeout(timeoutMillis);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutomaticPositioningTimeout) && this.timeoutMillis == ((AutomaticPositioningTimeout) other).timeoutMillis;
        }

        public final long getTimeoutMillis() {
            return this.timeoutMillis;
        }

        public int hashCode() {
            return Long.hashCode(this.timeoutMillis);
        }

        @NotNull
        public String toString() {
            return androidx.camera.core.impl.b.q(new StringBuilder("AutomaticPositioningTimeout(timeoutMillis="), this.timeoutMillis, ')');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$CalibrationStopped;", "Lme/oriient/positioningengine/common/EngineStopReason;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CalibrationStopped extends EngineStopReason {

        @NotNull
        public static final CalibrationStopped INSTANCE = new CalibrationStopped();

        private CalibrationStopped() {
            super("Calibration stopped", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$ChargingAutoStop;", "Lme/oriient/positioningengine/common/EngineStopReason;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ChargingAutoStop extends EngineStopReason {
        public ChargingAutoStop() {
            super("Charging Auto Stop", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$ContextSwitchedDuringPositioning;", "Lme/oriient/positioningengine/common/EngineStopReason;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContextSwitchedDuringPositioning extends EngineStopReason {

        @NotNull
        public static final ContextSwitchedDuringPositioning INSTANCE = new ContextSwitchedDuringPositioning();

        private ContextSwitchedDuringPositioning() {
            super("Context switched during positioning", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$Custom;", "Lme/oriient/positioningengine/common/EngineStopReason;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Custom extends EngineStopReason {

        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(@NotNull String reason) {
            super(reason, null);
            Intrinsics.h(reason, "reason");
            this.reason = reason;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$EngineStateChanged;", "Lme/oriient/positioningengine/common/EngineStopReason;", "reason", "", "(Ljava/lang/String;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EngineStateChanged extends EngineStopReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EngineStateChanged(@NotNull String reason) {
            super("Engine state changed - ".concat(reason), null);
            Intrinsics.h(reason, "reason");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$Error;", "Lme/oriient/positioningengine/common/EngineStopReason;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error extends EngineStopReason {

        @NotNull
        private final Exception error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Exception error) {
            super(YU.a.f(error, new StringBuilder("Error - ")), null);
            Intrinsics.h(error, "error");
            this.error = error;
        }

        @NotNull
        public final Exception getError() {
            return this.error;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$ExitRegion;", "Lme/oriient/positioningengine/common/EngineStopReason;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExitRegion extends EngineStopReason {
        public ExitRegion() {
            super("Exit region", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$InBackgroundTimeout;", "Lme/oriient/positioningengine/common/EngineStopReason;", "durationMillis", "", "(J)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InBackgroundTimeout extends EngineStopReason {
        public InBackgroundTimeout(long j) {
            super("Background for " + TimeUnit.MILLISECONDS.toMinutes(j) + 'm', null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$Logout;", "Lme/oriient/positioningengine/common/EngineStopReason;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Logout extends EngineStopReason {

        @NotNull
        public static final Logout INSTANCE = new Logout();

        private Logout() {
            super("User logged out", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$NoMovementTimeout;", "Lme/oriient/positioningengine/common/EngineStopReason;", "durationMillis", "", "(J)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoMovementTimeout extends EngineStopReason {
        public NoMovementTimeout(long j) {
            super("No movement for " + TimeUnit.MILLISECONDS.toMinutes(j) + 'm', null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$NotInitialized;", "Lme/oriient/positioningengine/common/EngineStopReason;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotInitialized extends EngineStopReason {

        @NotNull
        public static final NotInitialized INSTANCE = new NotInitialized();

        private NotInitialized() {
            super("Engine not initialized", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$OutOfExternalRegion;", "Lme/oriient/positioningengine/common/EngineStopReason;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OutOfExternalRegion extends EngineStopReason {
        public OutOfExternalRegion() {
            super("Out of External Region Auto Stop", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$OutOfGeofenceAutoStop;", "Lme/oriient/positioningengine/common/EngineStopReason;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OutOfGeofenceAutoStop extends EngineStopReason {
        public OutOfGeofenceAutoStop() {
            super("Out of Geofence Auto Stop", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$SensorFailure;", "Lme/oriient/positioningengine/common/EngineStopReason;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SensorFailure extends EngineStopReason {

        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SensorFailure(@NotNull String reason) {
            super("Sensor failure - ".concat(reason), null);
            Intrinsics.h(reason, "reason");
            this.reason = reason;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$SwitchUser;", "Lme/oriient/positioningengine/common/EngineStopReason;", "()V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SwitchUser extends EngineStopReason {

        @NotNull
        public static final SwitchUser INSTANCE = new SwitchUser();

        private SwitchUser() {
            super("User was switched", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$UnexpectedRecovery;", "Lme/oriient/positioningengine/common/EngineStopReason;", "currentState", "", "(Ljava/lang/String;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnexpectedRecovery extends EngineStopReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnexpectedRecovery(@NotNull String currentState) {
            super("Engine recovered unexpectedly while in ".concat(currentState), null);
            Intrinsics.h(currentState, "currentState");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/EngineStopReason$UserInitiated;", "Lme/oriient/positioningengine/common/EngineStopReason;", "reason", "", "(Ljava/lang/String;)V", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UserInitiated extends EngineStopReason {
        public UserInitiated(@Nullable String str) {
            super(YU.a.A("Client initiated. ", str), null);
        }
    }

    public /* synthetic */ EngineStopReason(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final DataUploaderSession.EndReason toUploadingStopReason$service_positioning_engine_publishRelease() {
        if (equals(CalibrationStopped.INSTANCE)) {
            return new DataUploaderSession.EndReason.Custom("Calibration stopped");
        }
        if (this instanceof Custom) {
            return new DataUploaderSession.EndReason.Custom(((Custom) this).getReason());
        }
        if (this instanceof EngineStateChanged) {
            return new DataUploaderSession.EndReason.Custom("Engine state changed");
        }
        if (this instanceof Error) {
            return new DataUploaderSession.EndReason.Error(((Error) this).getError());
        }
        if (this instanceof InBackgroundTimeout) {
            return new DataUploaderSession.EndReason.Custom("Timed out in background");
        }
        if (equals(Logout.INSTANCE)) {
            return new DataUploaderSession.EndReason.Custom("Logout");
        }
        if (this instanceof NoMovementTimeout) {
            return new DataUploaderSession.EndReason.Custom("No movement");
        }
        if (equals(NotInitialized.INSTANCE)) {
            return new DataUploaderSession.EndReason.Custom("Not initialized");
        }
        if (equals(SwitchUser.INSTANCE)) {
            return new DataUploaderSession.EndReason.NewCredentials();
        }
        if (this instanceof UnexpectedRecovery) {
            return new DataUploaderSession.EndReason.Custom("Unexpected Recovery");
        }
        if (this instanceof UserInitiated) {
            return new DataUploaderSession.EndReason.StoppedByUser();
        }
        if (this instanceof SensorFailure) {
            return new DataUploaderSession.EndReason.SensorFailure(((SensorFailure) this).getReason());
        }
        if (equals(ContextSwitchedDuringPositioning.INSTANCE)) {
            return new DataUploaderSession.EndReason.Custom(this.value);
        }
        if (this instanceof AutomaticPositioningTimeout) {
            return new DataUploaderSession.EndReason.AutomaticPositioningTimeout(((AutomaticPositioningTimeout) this).getTimeoutMillis());
        }
        if (this instanceof OutOfGeofenceAutoStop) {
            return new DataUploaderSession.EndReason.OutOfGeofenceAutoStop();
        }
        if (this instanceof OutOfExternalRegion) {
            return new DataUploaderSession.EndReason.OutOfExternalRegion();
        }
        if (this instanceof ExitRegion) {
            return new DataUploaderSession.EndReason.ExitRegion();
        }
        if (this instanceof ChargingAutoStop) {
            return new DataUploaderSession.EndReason.ChargingAutoStop();
        }
        throw new NoWhenBranchMatchedException();
    }

    private EngineStopReason(String str) {
        this.value = str;
    }
}
