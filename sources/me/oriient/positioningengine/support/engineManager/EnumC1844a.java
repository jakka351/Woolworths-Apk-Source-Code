package me.oriient.positioningengine.support.engineManager;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: me.oriient.positioningengine.support.engineManager.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC1844a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC1844a[] $VALUES;
    public static final EnumC1844a VALID = new EnumC1844a("VALID", 0);
    public static final EnumC1844a INVALID = new EnumC1844a("INVALID", 1);

    private static final /* synthetic */ EnumC1844a[] $values() {
        return new EnumC1844a[]{VALID, INVALID};
    }

    static {
        EnumC1844a[] enumC1844aArr$values = $values();
        $VALUES = enumC1844aArr$values;
        $ENTRIES = EnumEntriesKt.a(enumC1844aArr$values);
    }

    private EnumC1844a(String str, int i) {
    }

    @NotNull
    public static EnumEntries<EnumC1844a> getEntries() {
        return $ENTRIES;
    }

    public static EnumC1844a valueOf(String str) {
        return (EnumC1844a) Enum.valueOf(EnumC1844a.class, str);
    }

    public static EnumC1844a[] values() {
        return (EnumC1844a[]) $VALUES.clone();
    }
}
