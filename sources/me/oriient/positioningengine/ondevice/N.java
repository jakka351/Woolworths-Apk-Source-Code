package me.oriient.positioningengine.ondevice;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class N {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ N[] $VALUES;
    public static final N IDLE = new N("IDLE", 0);
    public static final N PRE_CALIBRATION = new N("PRE_CALIBRATION", 1);
    public static final N CONTINUOUS_CALIBRATION = new N("CONTINUOUS_CALIBRATION", 2);
    public static final N POSITIONING = new N("POSITIONING", 3);

    private static final /* synthetic */ N[] $values() {
        return new N[]{IDLE, PRE_CALIBRATION, CONTINUOUS_CALIBRATION, POSITIONING};
    }

    static {
        N[] nArr$values = $values();
        $VALUES = nArr$values;
        $ENTRIES = EnumEntriesKt.a(nArr$values);
    }

    private N(String str, int i) {
    }

    @NotNull
    public static EnumEntries<N> getEntries() {
        return $ENTRIES;
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) $VALUES.clone();
    }
}
