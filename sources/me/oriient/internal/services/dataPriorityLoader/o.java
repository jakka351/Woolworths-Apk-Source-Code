package me.oriient.internal.services.dataPriorityLoader;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o WAITING = new o("WAITING", 0);
    public static final o ACTIVE = new o("ACTIVE", 1);
    public static final o FINISHED = new o("FINISHED", 2);

    private static final /* synthetic */ o[] $values() {
        return new o[]{WAITING, ACTIVE, FINISHED};
    }

    static {
        o[] oVarArr$values = $values();
        $VALUES = oVarArr$values;
        $ENTRIES = EnumEntriesKt.a(oVarArr$values);
    }

    private o(String str, int i) {
    }

    @NotNull
    public static EnumEntries<o> getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
