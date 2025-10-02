package au.com.woolworths.feature.shop.modeselector.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeButtonType;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShoppingModeButtonType {
    public static final ShoppingModeButtonType d;
    public static final ShoppingModeButtonType e;
    public static final ShoppingModeButtonType f;
    public static final ShoppingModeButtonType g;
    public static final /* synthetic */ ShoppingModeButtonType[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        ShoppingModeButtonType shoppingModeButtonType = new ShoppingModeButtonType("UNKNOWN", 0);
        d = shoppingModeButtonType;
        ShoppingModeButtonType shoppingModeButtonType2 = new ShoppingModeButtonType("DELIVERY", 1);
        e = shoppingModeButtonType2;
        ShoppingModeButtonType shoppingModeButtonType3 = new ShoppingModeButtonType("PICKUP", 2);
        f = shoppingModeButtonType3;
        ShoppingModeButtonType shoppingModeButtonType4 = new ShoppingModeButtonType("INSTORE", 3);
        g = shoppingModeButtonType4;
        ShoppingModeButtonType[] shoppingModeButtonTypeArr = {shoppingModeButtonType, shoppingModeButtonType2, shoppingModeButtonType3, shoppingModeButtonType4};
        h = shoppingModeButtonTypeArr;
        i = EnumEntriesKt.a(shoppingModeButtonTypeArr);
    }

    public static ShoppingModeButtonType valueOf(String str) {
        return (ShoppingModeButtonType) Enum.valueOf(ShoppingModeButtonType.class, str);
    }

    public static ShoppingModeButtonType[] values() {
        return (ShoppingModeButtonType[]) h.clone();
    }
}
