package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/Sensor;", "", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Sensor {
    public static final Companion e;
    public static final Sensor f;
    public static final Sensor g;
    public static final Sensor h;
    public static final Sensor i;
    public static final Sensor j;
    public static final /* synthetic */ Sensor[] k;
    public static final /* synthetic */ EnumEntries l;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/Sensor$Companion;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        Sensor sensor = new Sensor("GYROSCOPE", 0, "gyroscope");
        f = sensor;
        Sensor sensor2 = new Sensor("ACCELEROMETER", 1, "accelerometer");
        g = sensor2;
        Sensor sensor3 = new Sensor("GAME_ROTATION_VECTOR", 2, "game rotation vector");
        h = sensor3;
        Sensor sensor4 = new Sensor("MAGNETIC_FIELD", 3, "magnetic field");
        i = sensor4;
        Sensor sensor5 = new Sensor("PRESSURE", 4, "pressure");
        j = sensor5;
        Sensor[] sensorArr = {sensor, sensor2, sensor3, sensor4, sensor5};
        k = sensorArr;
        l = EnumEntriesKt.a(sensorArr);
        e = new Companion();
    }

    public Sensor(String str, int i2, String str2) {
        this.d = str2;
    }

    public static Sensor valueOf(String str) {
        return (Sensor) Enum.valueOf(Sensor.class, str);
    }

    public static Sensor[] values() {
        return (Sensor[]) k.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
