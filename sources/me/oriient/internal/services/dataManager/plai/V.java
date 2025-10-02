package me.oriient.internal.services.dataManager.plai;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class V {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ V[] $VALUES;

    @NotNull
    private final String value;
    public static final V customerTagId = new V("customerTagId", 0, "customerTagId");
    public static final V x = new V("x", 1, "x");
    public static final V y = new V("y", 2, "y");
    public static final V confidence = new V("confidence", 3, "confidence (0-1)");
    public static final V lastUsedScanTime = new V("lastUsedScanTime", 4, "lastUsedScanTime");
    public static final V regions = new V("regions", 5, "regions");
    public static final V regionNames = new V("regionNames", 6, "regions names");

    private static final /* synthetic */ V[] $values() {
        return new V[]{customerTagId, x, y, confidence, lastUsedScanTime, regions, regionNames};
    }

    static {
        V[] vArr$values = $values();
        $VALUES = vArr$values;
        $ENTRIES = EnumEntriesKt.a(vArr$values);
    }

    private V(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<V> getEntries() {
        return $ENTRIES;
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
