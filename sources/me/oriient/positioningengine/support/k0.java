package me.oriient.positioningengine.support;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class k0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 CALIBRATION = new k0("CALIBRATION", 0);
    public static final k0 POSITIONING = new k0("POSITIONING", 1);

    private static final /* synthetic */ k0[] $values() {
        return new k0[]{CALIBRATION, POSITIONING};
    }

    static {
        k0[] k0VarArr$values = $values();
        $VALUES = k0VarArr$values;
        $ENTRIES = EnumEntriesKt.a(k0VarArr$values);
    }

    private k0(String str, int i) {
    }

    @NotNull
    public static EnumEntries<k0> getEntries() {
        return $ENTRIES;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
