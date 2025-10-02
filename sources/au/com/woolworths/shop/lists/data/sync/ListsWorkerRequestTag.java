package au.com.woolworths.shop.lists.data.sync;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/ListsWorkerRequestTag;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListsWorkerRequestTag {
    public static final /* synthetic */ ListsWorkerRequestTag[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ListsWorkerRequestTag[] listsWorkerRequestTagArr = {new ListsWorkerRequestTag("SYNC_LISTS_WORKER", 0), new ListsWorkerRequestTag("SYNC_LIST_ITEMS_WORKER", 1), new ListsWorkerRequestTag("SYNC_PRODUCTS_WORKER", 2)};
        d = listsWorkerRequestTagArr;
        e = EnumEntriesKt.a(listsWorkerRequestTagArr);
    }

    public static ListsWorkerRequestTag valueOf(String str) {
        return (ListsWorkerRequestTag) Enum.valueOf(ListsWorkerRequestTag.class, str);
    }

    public static ListsWorkerRequestTag[] values() {
        return (ListsWorkerRequestTag[]) d.clone();
    }
}
