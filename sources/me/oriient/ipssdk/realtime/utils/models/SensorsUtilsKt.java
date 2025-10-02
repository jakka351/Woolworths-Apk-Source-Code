package me.oriient.ipssdk.realtime.utils.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"sensorToString", "", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SensorsUtilsKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SystemSensor.values().length];
            try {
                iArr[SystemSensor.ACCELEROMETER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SystemSensor.GYROSCOPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SystemSensor.MAGNETIC_FIELD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SystemSensor.MAGNETIC_FIELD_UNCALIBRATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SystemSensor.PRESSURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SystemSensor.GAME_ROTATION_VECTOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SystemSensor.GYROSCOPE_UNCALIBRATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final String sensorToString(@NotNull SystemSensor systemSensor) {
        Intrinsics.h(systemSensor, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[systemSensor.ordinal()]) {
            case 1:
                return "ACCELEROMETER";
            case 2:
                return "GYROSCOPE";
            case 3:
                return "MAGNETIC_FIELD";
            case 4:
                return "MAGNETIC_FIELD_UNCALIBRATED";
            case 5:
                return "PRESSURE";
            case 6:
                return "GAME_ROTATION_VECTOR";
            case 7:
                return "GYROSCOPE_UNCALIBRATED";
            default:
                return null;
        }
    }
}
