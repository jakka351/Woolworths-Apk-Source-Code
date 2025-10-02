package me.oriient.internal.services.sensorsManager.sensors;

import androidx.annotation.Keep;
import com.google.android.gms.stats.CodePackage;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "", "", "osSensorType", "", lqlqqlq.mmm006Dm006Dm, "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "I", "getOsSensorType", "()I", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Companion", "me/oriient/internal/services/sensorsManager/sensors/b", "GYROSCOPE", "ACCELEROMETER", "MAGNETIC_FIELD", "MAGNETIC_FIELD_UNCALIBRATED", "GAME_ROTATION_VECTOR", "PRESSURE", "GYROSCOPE_UNCALIBRATED", CodePackage.LOCATION, "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SystemSensor {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SystemSensor[] $VALUES;

    @NotNull
    public static final b Companion;

    @NotNull
    private final String description;
    private final int osSensorType;
    public static final SystemSensor GYROSCOPE = new SystemSensor("GYROSCOPE", 0, 4, "Gyroscope");
    public static final SystemSensor ACCELEROMETER = new SystemSensor("ACCELEROMETER", 1, 1, "Accelerometer");
    public static final SystemSensor MAGNETIC_FIELD = new SystemSensor("MAGNETIC_FIELD", 2, 2, "Magnetic Field");
    public static final SystemSensor MAGNETIC_FIELD_UNCALIBRATED = new SystemSensor("MAGNETIC_FIELD_UNCALIBRATED", 3, 14, "Raw Magnetic Field");
    public static final SystemSensor GAME_ROTATION_VECTOR = new SystemSensor("GAME_ROTATION_VECTOR", 4, 15, "Rotation");
    public static final SystemSensor PRESSURE = new SystemSensor("PRESSURE", 5, 6, "Pressure");
    public static final SystemSensor GYROSCOPE_UNCALIBRATED = new SystemSensor("GYROSCOPE_UNCALIBRATED", 6, 16, "Gyroscope Uncalibrated");
    public static final SystemSensor LOCATION = new SystemSensor(CodePackage.LOCATION, 7, -1, "Location");

    private static final /* synthetic */ SystemSensor[] $values() {
        return new SystemSensor[]{GYROSCOPE, ACCELEROMETER, MAGNETIC_FIELD, MAGNETIC_FIELD_UNCALIBRATED, GAME_ROTATION_VECTOR, PRESSURE, GYROSCOPE_UNCALIBRATED, LOCATION};
    }

    static {
        SystemSensor[] systemSensorArr$values = $values();
        $VALUES = systemSensorArr$values;
        $ENTRIES = EnumEntriesKt.a(systemSensorArr$values);
        Companion = new b();
    }

    private SystemSensor(String str, int i, int i2, String str2) {
        this.osSensorType = i2;
        this.description = str2;
    }

    @JvmStatic
    @Nullable
    public static final SystemSensor from(int i) {
        Companion.getClass();
        return b.a(i);
    }

    @NotNull
    public static EnumEntries<SystemSensor> getEntries() {
        return $ENTRIES;
    }

    public static SystemSensor valueOf(String str) {
        return (SystemSensor) Enum.valueOf(SystemSensor.class, str);
    }

    public static SystemSensor[] values() {
        return (SystemSensor[]) $VALUES.clone();
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getOsSensorType() {
        return this.osSensorType;
    }
}
