package au.com.woolworths.feature.shop.modeselector.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSelectorOptionStateApiData;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShoppingModeSelectorOptionStateApiData {
    public static final ShoppingModeSelectorOptionStateApiData d;
    public static final ShoppingModeSelectorOptionStateApiData e;
    public static final ShoppingModeSelectorOptionStateApiData f;
    public static final ShoppingModeSelectorOptionStateApiData g;
    public static final /* synthetic */ ShoppingModeSelectorOptionStateApiData[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        ShoppingModeSelectorOptionStateApiData shoppingModeSelectorOptionStateApiData = new ShoppingModeSelectorOptionStateApiData("AVAILABLE", 0);
        d = shoppingModeSelectorOptionStateApiData;
        ShoppingModeSelectorOptionStateApiData shoppingModeSelectorOptionStateApiData2 = new ShoppingModeSelectorOptionStateApiData("DISABLED", 1);
        e = shoppingModeSelectorOptionStateApiData2;
        ShoppingModeSelectorOptionStateApiData shoppingModeSelectorOptionStateApiData3 = new ShoppingModeSelectorOptionStateApiData("SELECTED", 2);
        f = shoppingModeSelectorOptionStateApiData3;
        ShoppingModeSelectorOptionStateApiData shoppingModeSelectorOptionStateApiData4 = new ShoppingModeSelectorOptionStateApiData("UNKNOWN", 3);
        g = shoppingModeSelectorOptionStateApiData4;
        ShoppingModeSelectorOptionStateApiData[] shoppingModeSelectorOptionStateApiDataArr = {shoppingModeSelectorOptionStateApiData, shoppingModeSelectorOptionStateApiData2, shoppingModeSelectorOptionStateApiData3, shoppingModeSelectorOptionStateApiData4};
        h = shoppingModeSelectorOptionStateApiDataArr;
        i = EnumEntriesKt.a(shoppingModeSelectorOptionStateApiDataArr);
    }

    public static ShoppingModeSelectorOptionStateApiData valueOf(String str) {
        return (ShoppingModeSelectorOptionStateApiData) Enum.valueOf(ShoppingModeSelectorOptionStateApiData.class, str);
    }

    public static ShoppingModeSelectorOptionStateApiData[] values() {
        return (ShoppingModeSelectorOptionStateApiData[]) h.clone();
    }
}
