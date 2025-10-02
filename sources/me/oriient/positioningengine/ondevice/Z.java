package me.oriient.positioningengine.ondevice;

import com.google.android.gms.stats.CodePackage;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class Z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Z[] $VALUES;
    private final int value;
    public static final Z GYRO = new Z("GYRO", 0, 0);
    public static final Z ACCELEROMETER = new Z("ACCELEROMETER", 1, 1);
    public static final Z GAME_ROTATION = new Z("GAME_ROTATION", 2, 4);
    public static final Z MAGNETIC_FIELD = new Z("MAGNETIC_FIELD", 3, 2);
    public static final Z LOCATION = new Z(CodePackage.LOCATION, 4, 5);
    public static final Z PRESSURE = new Z("PRESSURE", 5, 6);
    public static final Z MAGNETIC_FIELD_UNCALIBRATED = new Z("MAGNETIC_FIELD_UNCALIBRATED", 6, 3);
    public static final Z GYRO_UNCALIBRATED = new Z("GYRO_UNCALIBRATED", 7, 7);

    private static final /* synthetic */ Z[] $values() {
        return new Z[]{GYRO, ACCELEROMETER, GAME_ROTATION, MAGNETIC_FIELD, LOCATION, PRESSURE, MAGNETIC_FIELD_UNCALIBRATED, GYRO_UNCALIBRATED};
    }

    static {
        Z[] zArr$values = $values();
        $VALUES = zArr$values;
        $ENTRIES = EnumEntriesKt.a(zArr$values);
    }

    private Z(String str, int i, int i2) {
        this.value = i2;
    }

    @NotNull
    public static EnumEntries<Z> getEntries() {
        return $ENTRIES;
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
