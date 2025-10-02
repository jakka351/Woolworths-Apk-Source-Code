package au.com.woolworths.shop.lists.ui.lists.menu;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/menu/ListAction;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListAction {
    public static final ListAction d;
    public static final ListAction e;
    public static final ListAction f;
    public static final ListAction g;
    public static final ListAction h;
    public static final /* synthetic */ ListAction[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        ListAction listAction = new ListAction("EDIT", 0);
        d = listAction;
        ListAction listAction2 = new ListAction("DUPLICATE", 1);
        e = listAction2;
        ListAction listAction3 = new ListAction("DELETE", 2);
        f = listAction3;
        ListAction listAction4 = new ListAction("ADD_TO_CART", 3);
        g = listAction4;
        ListAction listAction5 = new ListAction("REMOVE_ALL", 4);
        h = listAction5;
        ListAction[] listActionArr = {listAction, listAction2, listAction3, listAction4, listAction5};
        i = listActionArr;
        j = EnumEntriesKt.a(listActionArr);
    }

    public static ListAction valueOf(String str) {
        return (ListAction) Enum.valueOf(ListAction.class, str);
    }

    public static ListAction[] values() {
        return (ListAction[]) i.clone();
    }
}
