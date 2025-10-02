package au.com.woolworths.feature.shop.modeselector.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeVariant;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShoppingModeVariant {
    public static final ShoppingModeVariant d;
    public static final ShoppingModeVariant e;
    public static final ShoppingModeVariant f;
    public static final ShoppingModeVariant g;
    public static final ShoppingModeVariant h;
    public static final ShoppingModeVariant i;
    public static final /* synthetic */ ShoppingModeVariant[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        ShoppingModeVariant shoppingModeVariant = new ShoppingModeVariant("UNKNOWN", 0);
        d = shoppingModeVariant;
        ShoppingModeVariant shoppingModeVariant2 = new ShoppingModeVariant("DELIVERY", 1);
        e = shoppingModeVariant2;
        ShoppingModeVariant shoppingModeVariant3 = new ShoppingModeVariant("PICKUP", 2);
        f = shoppingModeVariant3;
        ShoppingModeVariant shoppingModeVariant4 = new ShoppingModeVariant("DELIVERY_NOW", 3);
        g = shoppingModeVariant4;
        ShoppingModeVariant shoppingModeVariant5 = new ShoppingModeVariant("INSTORE", 4);
        h = shoppingModeVariant5;
        ShoppingModeVariant shoppingModeVariant6 = new ShoppingModeVariant("PICKUP_DIRECT_TO_BOOT", 5);
        i = shoppingModeVariant6;
        ShoppingModeVariant[] shoppingModeVariantArr = {shoppingModeVariant, shoppingModeVariant2, shoppingModeVariant3, shoppingModeVariant4, shoppingModeVariant5, shoppingModeVariant6};
        j = shoppingModeVariantArr;
        k = EnumEntriesKt.a(shoppingModeVariantArr);
    }

    public static ShoppingModeVariant valueOf(String str) {
        return (ShoppingModeVariant) Enum.valueOf(ShoppingModeVariant.class, str);
    }

    public static ShoppingModeVariant[] values() {
        return (ShoppingModeVariant[]) j.clone();
    }
}
