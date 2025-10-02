package me.oriient.internal.services.eventManager.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PUBLISH = new a("PUBLISH", 0, "v1/publish");
    public static final a SUBSCRIBE = new a("SUBSCRIBE", 1, "v1/subscribe");
    public static final a UNSUBSCRIBE = new a("UNSUBSCRIBE", 2, "v1/unsubscribe");

    @NotNull
    private final String path;

    private static final /* synthetic */ a[] $values() {
        return new a[]{PUBLISH, SUBSCRIBE, UNSUBSCRIBE};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = EnumEntriesKt.a(aVarArr$values);
    }

    private a(String str, int i, String str2) {
        this.path = str2;
    }

    @NotNull
    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }
}
