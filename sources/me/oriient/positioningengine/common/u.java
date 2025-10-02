package me.oriient.positioningengine.common;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u ON_DEVICE = new u("ON_DEVICE", 0, "OnDevice");

    @NotNull
    private final String value;

    private static final /* synthetic */ u[] $values() {
        return new u[]{ON_DEVICE};
    }

    static {
        u[] uVarArr$values = $values();
        $VALUES = uVarArr$values;
        $ENTRIES = EnumEntriesKt.a(uVarArr$values);
    }

    private u(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<u> getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue$service_positioning_engine_publishRelease() {
        return this.value;
    }
}
