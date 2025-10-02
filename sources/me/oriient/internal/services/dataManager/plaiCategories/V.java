package me.oriient.internal.services.dataManager.plaiCategories;

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
    public static final V categoryName = new V("categoryName", 0, "Category Name");
    public static final V categoryId = new V("categoryId", 1, "Category Id");
    public static final V bottomLeft = new V("bottomLeft", 2, "lower left(x,y)");
    public static final V topRight = new V("topRight", 3, "upper right(x,y)");
    public static final V categoryArea = new V("categoryArea", 4, "category area");
    public static final V isAppropriateSize = new V("isAppropriateSize", 5, "is appropriate size");
    public static final V numberOfProductsWithinArea = new V("numberOfProductsWithinArea", 6, "num of products within area");
    public static final V lastUsedScanTime = new V("lastUsedScanTime", 7, "lastUsedScanTime");

    private static final /* synthetic */ V[] $values() {
        return new V[]{categoryName, categoryId, bottomLeft, topRight, categoryArea, isAppropriateSize, numberOfProductsWithinArea, lastUsedScanTime};
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
