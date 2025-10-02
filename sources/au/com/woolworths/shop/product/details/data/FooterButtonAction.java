package au.com.woolworths.shop.product.details.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/FooterButtonAction;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FooterButtonAction {
    public static final FooterButtonAction e;
    public static final FooterButtonAction f;
    public static final FooterButtonAction g;
    public static final FooterButtonAction h;
    public static final FooterButtonAction i;
    public static final FooterButtonAction j;
    public static final FooterButtonAction k;
    public static final /* synthetic */ FooterButtonAction[] l;
    public static final /* synthetic */ EnumEntries m;
    public final String d;

    static {
        FooterButtonAction footerButtonAction = new FooterButtonAction("ADD_TO_LIST", 0, "addToList");
        e = footerButtonAction;
        FooterButtonAction footerButtonAction2 = new FooterButtonAction("ADD_TO_CART", 1, "addToCart");
        f = footerButtonAction2;
        FooterButtonAction footerButtonAction3 = new FooterButtonAction("UPDATE_CART", 2, "updateCart");
        g = footerButtonAction3;
        FooterButtonAction footerButtonAction4 = new FooterButtonAction("OPEN_SEE_IN_STORE_BOTTOM_SHEET", 3, "openSeeInStoreBottomSheet");
        h = footerButtonAction4;
        FooterButtonAction footerButtonAction5 = new FooterButtonAction("VIEW_SIMILAR", 4, "viewSimilar");
        i = footerButtonAction5;
        FooterButtonAction footerButtonAction6 = new FooterButtonAction("OPEN_CHECK_STOCK_SCREEN", 5, "openCheckStockScreen");
        j = footerButtonAction6;
        FooterButtonAction footerButtonAction7 = new FooterButtonAction("UNKNOWN", 6, null);
        k = footerButtonAction7;
        FooterButtonAction[] footerButtonActionArr = {footerButtonAction, footerButtonAction2, footerButtonAction3, footerButtonAction4, footerButtonAction5, footerButtonAction6, footerButtonAction7};
        l = footerButtonActionArr;
        m = EnumEntriesKt.a(footerButtonActionArr);
    }

    public FooterButtonAction(String str, int i2, String str2) {
        this.d = str2;
    }

    public static FooterButtonAction valueOf(String str) {
        return (FooterButtonAction) Enum.valueOf(FooterButtonAction.class, str);
    }

    public static FooterButtonAction[] values() {
        return (FooterButtonAction[]) l.clone();
    }
}
