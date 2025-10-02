package au.com.woolworths.shop.lists;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ShoppingListsFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ShoppingListsFeature implements Feature {
    public static final ShoppingListsFeature d;
    public static final ShoppingListsFeature e;
    public static final ShoppingListsFeature f;
    public static final ShoppingListsFeature g;
    public static final ShoppingListsFeature h;
    public static final ShoppingListsFeature i;
    public static final ShoppingListsFeature j;
    public static final ShoppingListsFeature k;
    public static final ShoppingListsFeature l;
    public static final /* synthetic */ ShoppingListsFeature[] m;
    public static final /* synthetic */ EnumEntries n;

    static {
        ShoppingListsFeature shoppingListsFeature = new ShoppingListsFeature() { // from class: au.com.woolworths.shop.lists.ShoppingListsFeature.LISTS_DETAILS_LIST_ID
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_lists_details_list_id";
            }

            @Override // au.com.woolworths.shop.lists.ShoppingListsFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = shoppingListsFeature;
        ShoppingListsFeature shoppingListsFeature2 = new ShoppingListsFeature() { // from class: au.com.woolworths.shop.lists.ShoppingListsFeature.LISTS_DETAILS_MAGIC_MATCH
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_lists_details_magic_match";
            }
        };
        e = shoppingListsFeature2;
        ShoppingListsFeature shoppingListsFeature3 = new ShoppingListsFeature() { // from class: au.com.woolworths.shop.lists.ShoppingListsFeature.LISTS_DETAILS_PRODUCT_COMPOSE_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_lists_details_product_compose_uplift";
            }
        };
        f = shoppingListsFeature3;
        ShoppingListsFeature shoppingListsFeature4 = new ShoppingListsFeature() { // from class: au.com.woolworths.shop.lists.ShoppingListsFeature.LISTS_HIDE_SUGGESTED_LIST
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_lists_hide_suggested_list";
            }

            @Override // au.com.woolworths.shop.lists.ShoppingListsFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        g = shoppingListsFeature4;
        ShoppingListsFeature shoppingListsFeature5 = new ShoppingListsFeature() { // from class: au.com.woolworths.shop.lists.ShoppingListsFeature.LISTS_HUB_COMPOSE_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_lists_hub_compose_uplift";
            }
        };
        h = shoppingListsFeature5;
        ShoppingListsFeature shoppingListsFeature6 = new ShoppingListsFeature() { // from class: au.com.woolworths.shop.lists.ShoppingListsFeature.LISTS_SPECIALS_BANNER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_lists_specials_banner";
            }

            @Override // au.com.woolworths.shop.lists.ShoppingListsFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        i = shoppingListsFeature6;
        ShoppingListsFeature shoppingListsFeature7 = new ShoppingListsFeature() { // from class: au.com.woolworths.shop.lists.ShoppingListsFeature.SNAP_A_LIST
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_snap_a_list";
            }

            @Override // au.com.woolworths.shop.lists.ShoppingListsFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        j = shoppingListsFeature7;
        ShoppingListsFeature shoppingListsFeature8 = new ShoppingListsFeature() { // from class: au.com.woolworths.shop.lists.ShoppingListsFeature.SNAP_A_LIST_DETAILS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_snap_a_list_details";
            }

            @Override // au.com.woolworths.shop.lists.ShoppingListsFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        k = shoppingListsFeature8;
        ShoppingListsFeature shoppingListsFeature9 = new ShoppingListsFeature() { // from class: au.com.woolworths.shop.lists.ShoppingListsFeature.SNAP_A_LIST_NEW_LIST
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_snap_a_list_new_list";
            }
        };
        l = shoppingListsFeature9;
        ShoppingListsFeature[] shoppingListsFeatureArr = {shoppingListsFeature, shoppingListsFeature2, shoppingListsFeature3, shoppingListsFeature4, shoppingListsFeature5, shoppingListsFeature6, shoppingListsFeature7, shoppingListsFeature8, shoppingListsFeature9};
        m = shoppingListsFeatureArr;
        n = EnumEntriesKt.a(shoppingListsFeatureArr);
    }

    public static ShoppingListsFeature valueOf(String str) {
        return (ShoppingListsFeature) Enum.valueOf(ShoppingListsFeature.class, str);
    }

    public static ShoppingListsFeature[] values() {
        return (ShoppingListsFeature[]) m.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public boolean getDefaultValue() {
        return false;
    }
}
