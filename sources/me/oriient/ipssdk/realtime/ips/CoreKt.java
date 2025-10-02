package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CoreKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SystemSensor.values().length];
            try {
                iArr[SystemSensor.GYROSCOPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SystemSensor.ACCELEROMETER.ordinal()] = 2;
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
                iArr[SystemSensor.GAME_ROTATION_VECTOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SystemSensor.PRESSURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SystemSensor.GYROSCOPE_UNCALIBRATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SystemSensor.LOCATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Integer access$toIpsSensor(SystemSensor systemSensor) {
        switch (WhenMappings.$EnumSwitchMapping$0[systemSensor.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
