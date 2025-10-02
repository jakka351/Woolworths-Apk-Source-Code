package me.oriient.positioningengine.ondevice.calibration;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    private final String value;
    public static final h NEEDED = new h("NEEDED", 0, "Needed");
    public static final h NOT_NEEDED = new h("NOT_NEEDED", 1, "NotNeeded");
    public static final h FAILED = new h("FAILED", 2, "Failed");

    private static final /* synthetic */ h[] $values() {
        return new h[]{NEEDED, NOT_NEEDED, FAILED};
    }

    static {
        h[] hVarArr$values = $values();
        $VALUES = hVarArr$values;
        $ENTRIES = EnumEntriesKt.a(hVarArr$values);
    }

    private h(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<h> getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
