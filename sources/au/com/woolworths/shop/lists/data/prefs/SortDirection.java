package au.com.woolworths.shop.lists.data.prefs;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/prefs/SortDirection;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SortDirection {
    public static final SortDirection d;
    public static final SortDirection e;
    public static final /* synthetic */ SortDirection[] f;
    public static final /* synthetic */ EnumEntries g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SortDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SortDirection sortDirection = SortDirection.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        SortDirection sortDirection = new SortDirection("ASCENDING", 0);
        d = sortDirection;
        SortDirection sortDirection2 = new SortDirection("DESCENDING", 1);
        e = sortDirection2;
        SortDirection[] sortDirectionArr = {sortDirection, sortDirection2};
        f = sortDirectionArr;
        g = EnumEntriesKt.a(sortDirectionArr);
    }

    public static SortDirection valueOf(String str) {
        return (SortDirection) Enum.valueOf(SortDirection.class, str);
    }

    public static SortDirection[] values() {
        return (SortDirection[]) f.clone();
    }
}
