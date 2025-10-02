package me.oriient.internal.services.sensorsManager.sensors;

/* loaded from: classes7.dex */
public final class b {
    public static SystemSensor a(int i) {
        SystemSensor systemSensor = SystemSensor.ACCELEROMETER;
        if (i == systemSensor.getOsSensorType()) {
            return systemSensor;
        }
        SystemSensor systemSensor2 = SystemSensor.GYROSCOPE;
        if (i == systemSensor2.getOsSensorType()) {
            return systemSensor2;
        }
        SystemSensor systemSensor3 = SystemSensor.MAGNETIC_FIELD_UNCALIBRATED;
        if (i == systemSensor3.getOsSensorType()) {
            return systemSensor3;
        }
        SystemSensor systemSensor4 = SystemSensor.MAGNETIC_FIELD;
        if (i == systemSensor4.getOsSensorType()) {
            return systemSensor4;
        }
        SystemSensor systemSensor5 = SystemSensor.GAME_ROTATION_VECTOR;
        if (i == systemSensor5.getOsSensorType()) {
            return systemSensor5;
        }
        SystemSensor systemSensor6 = SystemSensor.PRESSURE;
        if (i == systemSensor6.getOsSensorType()) {
            return systemSensor6;
        }
        SystemSensor systemSensor7 = SystemSensor.GYROSCOPE_UNCALIBRATED;
        if (i == systemSensor7.getOsSensorType()) {
            return systemSensor7;
        }
        return null;
    }
}
