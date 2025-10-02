package me.oriient.internal.services.dataModel.sensors;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201B_\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBY\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0006\u0010$\u001a\u00020%J\t\u0010&\u001a\u00020'HÖ\u0001J&\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.HÁ\u0001¢\u0006\u0002\b/R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u00062"}, d2 = {"Lme/oriient/internal/services/dataModel/sensors/SensorsConfigResponse;", "", "seen1", "", "gyroscope", "Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;", "gyroscopeUncalibrated", "accelerometer", "gameRotation", "magneticField", "magneticFieldUncalibrated", "pressure", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;)V", "getAccelerometer", "()Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;", "getGameRotation", "getGyroscope", "getGyroscopeUncalibrated", "getMagneticField", "getMagneticFieldUncalibrated", "getPressure", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toSensorsConfig", "Lme/oriient/internal/services/dataModel/sensors/SensorsConfig;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class SensorsConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final SensorConfigResponse accelerometer;

    @Nullable
    private final SensorConfigResponse gameRotation;

    @Nullable
    private final SensorConfigResponse gyroscope;

    @Nullable
    private final SensorConfigResponse gyroscopeUncalibrated;

    @Nullable
    private final SensorConfigResponse magneticField;

    @Nullable
    private final SensorConfigResponse magneticFieldUncalibrated;

    @Nullable
    private final SensorConfigResponse pressure;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/sensors/SensorsConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/sensors/SensorsConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SensorsConfigResponse> serializer() {
            return SensorsConfigResponse$$serializer.INSTANCE;
        }
    }

    public SensorsConfigResponse() {
        this((SensorConfigResponse) null, (SensorConfigResponse) null, (SensorConfigResponse) null, (SensorConfigResponse) null, (SensorConfigResponse) null, (SensorConfigResponse) null, (SensorConfigResponse) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SensorsConfigResponse copy$default(SensorsConfigResponse sensorsConfigResponse, SensorConfigResponse sensorConfigResponse, SensorConfigResponse sensorConfigResponse2, SensorConfigResponse sensorConfigResponse3, SensorConfigResponse sensorConfigResponse4, SensorConfigResponse sensorConfigResponse5, SensorConfigResponse sensorConfigResponse6, SensorConfigResponse sensorConfigResponse7, int i, Object obj) {
        if ((i & 1) != 0) {
            sensorConfigResponse = sensorsConfigResponse.gyroscope;
        }
        if ((i & 2) != 0) {
            sensorConfigResponse2 = sensorsConfigResponse.gyroscopeUncalibrated;
        }
        if ((i & 4) != 0) {
            sensorConfigResponse3 = sensorsConfigResponse.accelerometer;
        }
        if ((i & 8) != 0) {
            sensorConfigResponse4 = sensorsConfigResponse.gameRotation;
        }
        if ((i & 16) != 0) {
            sensorConfigResponse5 = sensorsConfigResponse.magneticField;
        }
        if ((i & 32) != 0) {
            sensorConfigResponse6 = sensorsConfigResponse.magneticFieldUncalibrated;
        }
        if ((i & 64) != 0) {
            sensorConfigResponse7 = sensorsConfigResponse.pressure;
        }
        SensorConfigResponse sensorConfigResponse8 = sensorConfigResponse6;
        SensorConfigResponse sensorConfigResponse9 = sensorConfigResponse7;
        SensorConfigResponse sensorConfigResponse10 = sensorConfigResponse5;
        SensorConfigResponse sensorConfigResponse11 = sensorConfigResponse3;
        return sensorsConfigResponse.copy(sensorConfigResponse, sensorConfigResponse2, sensorConfigResponse11, sensorConfigResponse4, sensorConfigResponse10, sensorConfigResponse8, sensorConfigResponse9);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(SensorsConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.gyroscope != null) {
            output.w(serialDesc, 0, SensorConfigResponse$$serializer.INSTANCE, self.gyroscope);
        }
        if (output.q(serialDesc, 1) || self.gyroscopeUncalibrated != null) {
            output.w(serialDesc, 1, SensorConfigResponse$$serializer.INSTANCE, self.gyroscopeUncalibrated);
        }
        if (output.q(serialDesc, 2) || self.accelerometer != null) {
            output.w(serialDesc, 2, SensorConfigResponse$$serializer.INSTANCE, self.accelerometer);
        }
        if (output.q(serialDesc, 3) || self.gameRotation != null) {
            output.w(serialDesc, 3, SensorConfigResponse$$serializer.INSTANCE, self.gameRotation);
        }
        if (output.q(serialDesc, 4) || self.magneticField != null) {
            output.w(serialDesc, 4, SensorConfigResponse$$serializer.INSTANCE, self.magneticField);
        }
        if (output.q(serialDesc, 5) || self.magneticFieldUncalibrated != null) {
            output.w(serialDesc, 5, SensorConfigResponse$$serializer.INSTANCE, self.magneticFieldUncalibrated);
        }
        if (!output.q(serialDesc, 6) && self.pressure == null) {
            return;
        }
        output.w(serialDesc, 6, SensorConfigResponse$$serializer.INSTANCE, self.pressure);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final SensorConfigResponse getGyroscope() {
        return this.gyroscope;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final SensorConfigResponse getGyroscopeUncalibrated() {
        return this.gyroscopeUncalibrated;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final SensorConfigResponse getAccelerometer() {
        return this.accelerometer;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final SensorConfigResponse getGameRotation() {
        return this.gameRotation;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final SensorConfigResponse getMagneticField() {
        return this.magneticField;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final SensorConfigResponse getMagneticFieldUncalibrated() {
        return this.magneticFieldUncalibrated;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final SensorConfigResponse getPressure() {
        return this.pressure;
    }

    @NotNull
    public final SensorsConfigResponse copy(@Nullable SensorConfigResponse gyroscope, @Nullable SensorConfigResponse gyroscopeUncalibrated, @Nullable SensorConfigResponse accelerometer, @Nullable SensorConfigResponse gameRotation, @Nullable SensorConfigResponse magneticField, @Nullable SensorConfigResponse magneticFieldUncalibrated, @Nullable SensorConfigResponse pressure) {
        return new SensorsConfigResponse(gyroscope, gyroscopeUncalibrated, accelerometer, gameRotation, magneticField, magneticFieldUncalibrated, pressure);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorsConfigResponse)) {
            return false;
        }
        SensorsConfigResponse sensorsConfigResponse = (SensorsConfigResponse) other;
        return Intrinsics.c(this.gyroscope, sensorsConfigResponse.gyroscope) && Intrinsics.c(this.gyroscopeUncalibrated, sensorsConfigResponse.gyroscopeUncalibrated) && Intrinsics.c(this.accelerometer, sensorsConfigResponse.accelerometer) && Intrinsics.c(this.gameRotation, sensorsConfigResponse.gameRotation) && Intrinsics.c(this.magneticField, sensorsConfigResponse.magneticField) && Intrinsics.c(this.magneticFieldUncalibrated, sensorsConfigResponse.magneticFieldUncalibrated) && Intrinsics.c(this.pressure, sensorsConfigResponse.pressure);
    }

    @Nullable
    public final SensorConfigResponse getAccelerometer() {
        return this.accelerometer;
    }

    @Nullable
    public final SensorConfigResponse getGameRotation() {
        return this.gameRotation;
    }

    @Nullable
    public final SensorConfigResponse getGyroscope() {
        return this.gyroscope;
    }

    @Nullable
    public final SensorConfigResponse getGyroscopeUncalibrated() {
        return this.gyroscopeUncalibrated;
    }

    @Nullable
    public final SensorConfigResponse getMagneticField() {
        return this.magneticField;
    }

    @Nullable
    public final SensorConfigResponse getMagneticFieldUncalibrated() {
        return this.magneticFieldUncalibrated;
    }

    @Nullable
    public final SensorConfigResponse getPressure() {
        return this.pressure;
    }

    public int hashCode() {
        SensorConfigResponse sensorConfigResponse = this.gyroscope;
        int iHashCode = (sensorConfigResponse == null ? 0 : sensorConfigResponse.hashCode()) * 31;
        SensorConfigResponse sensorConfigResponse2 = this.gyroscopeUncalibrated;
        int iHashCode2 = (iHashCode + (sensorConfigResponse2 == null ? 0 : sensorConfigResponse2.hashCode())) * 31;
        SensorConfigResponse sensorConfigResponse3 = this.accelerometer;
        int iHashCode3 = (iHashCode2 + (sensorConfigResponse3 == null ? 0 : sensorConfigResponse3.hashCode())) * 31;
        SensorConfigResponse sensorConfigResponse4 = this.gameRotation;
        int iHashCode4 = (iHashCode3 + (sensorConfigResponse4 == null ? 0 : sensorConfigResponse4.hashCode())) * 31;
        SensorConfigResponse sensorConfigResponse5 = this.magneticField;
        int iHashCode5 = (iHashCode4 + (sensorConfigResponse5 == null ? 0 : sensorConfigResponse5.hashCode())) * 31;
        SensorConfigResponse sensorConfigResponse6 = this.magneticFieldUncalibrated;
        int iHashCode6 = (iHashCode5 + (sensorConfigResponse6 == null ? 0 : sensorConfigResponse6.hashCode())) * 31;
        SensorConfigResponse sensorConfigResponse7 = this.pressure;
        return iHashCode6 + (sensorConfigResponse7 != null ? sensorConfigResponse7.hashCode() : 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 me.oriient.internal.services.dataModel.sensors.SensorsConfig, still in use, count: 2, list:
          (r1v0 me.oriient.internal.services.dataModel.sensors.SensorsConfig) from 0x01ae: MOVE (r19v0 me.oriient.internal.services.dataModel.sensors.SensorsConfig) = (r1v0 me.oriient.internal.services.dataModel.sensors.SensorsConfig)
          (r1v0 me.oriient.internal.services.dataModel.sensors.SensorsConfig) from 0x01a3: MOVE (r19v2 me.oriient.internal.services.dataModel.sensors.SensorsConfig) = (r1v0 me.oriient.internal.services.dataModel.sensors.SensorsConfig)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @org.jetbrains.annotations.NotNull
    public final me.oriient.internal.services.dataModel.sensors.SensorsConfig toSensorsConfig() {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataModel.sensors.SensorsConfigResponse.toSensorsConfig():me.oriient.internal.services.dataModel.sensors.SensorsConfig");
    }

    @NotNull
    public String toString() {
        return "SensorsConfigResponse(gyroscope=" + this.gyroscope + ", gyroscopeUncalibrated=" + this.gyroscopeUncalibrated + ", accelerometer=" + this.accelerometer + ", gameRotation=" + this.gameRotation + ", magneticField=" + this.magneticField + ", magneticFieldUncalibrated=" + this.magneticFieldUncalibrated + ", pressure=" + this.pressure + ')';
    }

    @Deprecated
    public /* synthetic */ SensorsConfigResponse(int i, SensorConfigResponse sensorConfigResponse, SensorConfigResponse sensorConfigResponse2, SensorConfigResponse sensorConfigResponse3, SensorConfigResponse sensorConfigResponse4, SensorConfigResponse sensorConfigResponse5, SensorConfigResponse sensorConfigResponse6, SensorConfigResponse sensorConfigResponse7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.gyroscope = null;
        } else {
            this.gyroscope = sensorConfigResponse;
        }
        if ((i & 2) == 0) {
            this.gyroscopeUncalibrated = null;
        } else {
            this.gyroscopeUncalibrated = sensorConfigResponse2;
        }
        if ((i & 4) == 0) {
            this.accelerometer = null;
        } else {
            this.accelerometer = sensorConfigResponse3;
        }
        if ((i & 8) == 0) {
            this.gameRotation = null;
        } else {
            this.gameRotation = sensorConfigResponse4;
        }
        if ((i & 16) == 0) {
            this.magneticField = null;
        } else {
            this.magneticField = sensorConfigResponse5;
        }
        if ((i & 32) == 0) {
            this.magneticFieldUncalibrated = null;
        } else {
            this.magneticFieldUncalibrated = sensorConfigResponse6;
        }
        if ((i & 64) == 0) {
            this.pressure = null;
        } else {
            this.pressure = sensorConfigResponse7;
        }
    }

    public SensorsConfigResponse(@Nullable SensorConfigResponse sensorConfigResponse, @Nullable SensorConfigResponse sensorConfigResponse2, @Nullable SensorConfigResponse sensorConfigResponse3, @Nullable SensorConfigResponse sensorConfigResponse4, @Nullable SensorConfigResponse sensorConfigResponse5, @Nullable SensorConfigResponse sensorConfigResponse6, @Nullable SensorConfigResponse sensorConfigResponse7) {
        this.gyroscope = sensorConfigResponse;
        this.gyroscopeUncalibrated = sensorConfigResponse2;
        this.accelerometer = sensorConfigResponse3;
        this.gameRotation = sensorConfigResponse4;
        this.magneticField = sensorConfigResponse5;
        this.magneticFieldUncalibrated = sensorConfigResponse6;
        this.pressure = sensorConfigResponse7;
    }

    public /* synthetic */ SensorsConfigResponse(SensorConfigResponse sensorConfigResponse, SensorConfigResponse sensorConfigResponse2, SensorConfigResponse sensorConfigResponse3, SensorConfigResponse sensorConfigResponse4, SensorConfigResponse sensorConfigResponse5, SensorConfigResponse sensorConfigResponse6, SensorConfigResponse sensorConfigResponse7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sensorConfigResponse, (i & 2) != 0 ? null : sensorConfigResponse2, (i & 4) != 0 ? null : sensorConfigResponse3, (i & 8) != 0 ? null : sensorConfigResponse4, (i & 16) != 0 ? null : sensorConfigResponse5, (i & 32) != 0 ? null : sensorConfigResponse6, (i & 64) != 0 ? null : sensorConfigResponse7);
    }
}
