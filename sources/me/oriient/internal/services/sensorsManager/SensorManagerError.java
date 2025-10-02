package me.oriient.internal.services.sensorsManager;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "EmptySensorFrame", "InsufficientHardware", "NaNSensorFrame", "SensorsFailedToRestart", "SensorsFailedToStart", "SensorsStuck", "Lme/oriient/internal/services/sensorsManager/SensorManagerError$EmptySensorFrame;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError$InsufficientHardware;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError$NaNSensorFrame;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError$SensorsFailedToRestart;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError$SensorsFailedToStart;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError$SensorsStuck;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SensorManagerError extends Exception {

    @NotNull
    private final String message;

    @Keep
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorManagerError$EmptySensorFrame;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "criticalSensorTypes", "", "", "nonCriticalSensorTypes", "(Ljava/util/List;Ljava/util/List;)V", "getCriticalSensorTypes", "()Ljava/util/List;", "getNonCriticalSensorTypes", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EmptySensorFrame extends SensorManagerError {

        @NotNull
        private final List<Integer> criticalSensorTypes;

        @NotNull
        private final List<Integer> nonCriticalSensorTypes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptySensorFrame(@NotNull List<Integer> criticalSensorTypes, @NotNull List<Integer> nonCriticalSensorTypes) {
            super("Received an empty sensor frame for sensors - critical: " + criticalSensorTypes + ", non-critical: " + nonCriticalSensorTypes, null);
            Intrinsics.h(criticalSensorTypes, "criticalSensorTypes");
            Intrinsics.h(nonCriticalSensorTypes, "nonCriticalSensorTypes");
            this.criticalSensorTypes = criticalSensorTypes;
            this.nonCriticalSensorTypes = nonCriticalSensorTypes;
        }

        @NotNull
        public final List<Integer> getCriticalSensorTypes() {
            return this.criticalSensorTypes;
        }

        @NotNull
        public final List<Integer> getNonCriticalSensorTypes() {
            return this.nonCriticalSensorTypes;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorManagerError$InsufficientHardware;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "message", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InsufficientHardware extends SensorManagerError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InsufficientHardware(@NotNull String message) {
            super(message, null);
            Intrinsics.h(message, "message");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorManagerError$NaNSensorFrame;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "criticalSensorTypes", "", "", "nonCriticalSensorTypes", "(Ljava/util/List;Ljava/util/List;)V", "getCriticalSensorTypes", "()Ljava/util/List;", "getNonCriticalSensorTypes", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NaNSensorFrame extends SensorManagerError {

        @NotNull
        private final List<Integer> criticalSensorTypes;

        @NotNull
        private final List<Integer> nonCriticalSensorTypes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NaNSensorFrame(@NotNull List<Integer> criticalSensorTypes, @NotNull List<Integer> nonCriticalSensorTypes) {
            super("Received an NaN sensor frame for sensors - critical: " + criticalSensorTypes + ", non-critical: " + nonCriticalSensorTypes, null);
            Intrinsics.h(criticalSensorTypes, "criticalSensorTypes");
            Intrinsics.h(nonCriticalSensorTypes, "nonCriticalSensorTypes");
            this.criticalSensorTypes = criticalSensorTypes;
            this.nonCriticalSensorTypes = nonCriticalSensorTypes;
        }

        @NotNull
        public final List<Integer> getCriticalSensorTypes() {
            return this.criticalSensorTypes;
        }

        @NotNull
        public final List<Integer> getNonCriticalSensorTypes() {
            return this.nonCriticalSensorTypes;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorManagerError$SensorsFailedToRestart;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SensorsFailedToRestart extends SensorManagerError {
        public SensorsFailedToRestart() {
            super("Failed to restart sensors", null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorManagerError$SensorsFailedToStart;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "failedSensorTypes", "", "", "(Ljava/util/List;)V", "getFailedSensorTypes", "()Ljava/util/List;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SensorsFailedToStart extends SensorManagerError {

        @NotNull
        private final List<Integer> failedSensorTypes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SensorsFailedToStart(@NotNull List<Integer> failedSensorTypes) {
            super("Sensors failed to start - " + failedSensorTypes, null);
            Intrinsics.h(failedSensorTypes, "failedSensorTypes");
            this.failedSensorTypes = failedSensorTypes;
        }

        @NotNull
        public final List<Integer> getFailedSensorTypes() {
            return this.failedSensorTypes;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0017B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorManagerError$SensorsStuck;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "Landroid/os/Parcelable;", "", "", "criticalSensorTypes", "nonCriticalSensorTypes", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/util/List;", "getCriticalSensorTypes", "()Ljava/util/List;", "getNonCriticalSensorTypes", "CREATOR", "me/oriient/internal/services/sensorsManager/J", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SensorsStuck extends SensorManagerError implements Parcelable {

        @NotNull
        public static final J CREATOR = new J();

        @NotNull
        private final List<Integer> criticalSensorTypes;

        @NotNull
        private final List<Integer> nonCriticalSensorTypes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SensorsStuck(@NotNull List<Integer> criticalSensorTypes, @NotNull List<Integer> nonCriticalSensorTypes) {
            super("The following sensors are stuck - critical: " + criticalSensorTypes + ", non-critical: " + nonCriticalSensorTypes, null);
            Intrinsics.h(criticalSensorTypes, "criticalSensorTypes");
            Intrinsics.h(nonCriticalSensorTypes, "nonCriticalSensorTypes");
            this.criticalSensorTypes = criticalSensorTypes;
            this.nonCriticalSensorTypes = nonCriticalSensorTypes;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final List<Integer> getCriticalSensorTypes() {
            return this.criticalSensorTypes;
        }

        @NotNull
        public final List<Integer> getNonCriticalSensorTypes() {
            return this.nonCriticalSensorTypes;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.h(parcel, "parcel");
        }

        public SensorsStuck(@NotNull Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            throw new NotImplementedError("An operation is not implemented: criticalSensorTypes");
        }
    }

    public /* synthetic */ SensorManagerError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    private SensorManagerError(String str) {
        super(str);
        this.message = str;
    }
}
