package au.com.woolworths.product.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/ui/ListButtonType;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListButtonType {
    public static final ListButtonType d;
    public static final ListButtonType e;
    public static final /* synthetic */ ListButtonType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ListButtonType listButtonType = new ListButtonType("INSTORE", 0);
        d = listButtonType;
        ListButtonType listButtonType2 = new ListButtonType("ONLINE", 1);
        e = listButtonType2;
        ListButtonType[] listButtonTypeArr = {listButtonType, listButtonType2, new ListButtonType("INSTORE_FIND_INFO", 2), new ListButtonType("ONLINE_FIND_INFO", 3)};
        f = listButtonTypeArr;
        g = EnumEntriesKt.a(listButtonTypeArr);
    }

    public static ListButtonType valueOf(String str) {
        return (ListButtonType) Enum.valueOf(ListButtonType.class, str);
    }

    public static ListButtonType[] values() {
        return (ListButtonType[]) f.clone();
    }
}
