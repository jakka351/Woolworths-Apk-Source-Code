package au.com.woolworths.feature.product.list.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/SortOptionsDisplayMode;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SortOptionsDisplayMode {
    public static final SortOptionsDisplayMode d;
    public static final SortOptionsDisplayMode e;
    public static final /* synthetic */ SortOptionsDisplayMode[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        SortOptionsDisplayMode sortOptionsDisplayMode = new SortOptionsDisplayMode("EXPANDED", 0);
        d = sortOptionsDisplayMode;
        SortOptionsDisplayMode sortOptionsDisplayMode2 = new SortOptionsDisplayMode("COLLAPSED", 1);
        e = sortOptionsDisplayMode2;
        SortOptionsDisplayMode[] sortOptionsDisplayModeArr = {sortOptionsDisplayMode, sortOptionsDisplayMode2};
        f = sortOptionsDisplayModeArr;
        g = EnumEntriesKt.a(sortOptionsDisplayModeArr);
    }

    public static SortOptionsDisplayMode valueOf(String str) {
        return (SortOptionsDisplayMode) Enum.valueOf(SortOptionsDisplayMode.class, str);
    }

    public static SortOptionsDisplayMode[] values() {
        return (SortOptionsDisplayMode[]) f.clone();
    }
}
