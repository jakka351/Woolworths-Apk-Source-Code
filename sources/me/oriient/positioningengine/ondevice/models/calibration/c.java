package me.oriient.positioningengine.ondevice.models.calibration;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    private final int value;
    public static final c NORMAL = new c("NORMAL", 0, 0);
    public static final c MAPPING = new c("MAPPING", 1, 1);

    private static final /* synthetic */ c[] $values() {
        return new c[]{NORMAL, MAPPING};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = EnumEntriesKt.a(cVarArr$values);
    }

    private c(String str, int i, int i2) {
        this.value = i2;
    }

    @NotNull
    public static EnumEntries<c> getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
