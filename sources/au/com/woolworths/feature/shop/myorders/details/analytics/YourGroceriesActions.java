package au.com.woolworths.feature.shop.myorders.details.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/analytics/YourGroceriesActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class YourGroceriesActions implements Action {
    public static final YourGroceriesActions e;
    public static final YourGroceriesActions f;
    public static final YourGroceriesActions g;
    public static final YourGroceriesActions h;
    public static final YourGroceriesActions i;
    public static final /* synthetic */ YourGroceriesActions[] j;
    public static final /* synthetic */ EnumEntries k;
    public final MyOrdersScreens d = MyOrdersScreens.i;

    static {
        YourGroceriesActions yourGroceriesActions = new YourGroceriesActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.YourGroceriesActions.YOUR_GROCERIES_LOADED
            public final Category l = Category.B;
            public final String m = "Your Groceries Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getF0() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getE0() {
                return this.l;
            }
        };
        e = yourGroceriesActions;
        YourGroceriesActions yourGroceriesActions2 = new YourGroceriesActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.YourGroceriesActions.YOUR_GROCERIES_FILTER_CLICK
            public final Category l = Category.m;
            public final String m = "Fulfilment Status Filter";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getF0() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getE0() {
                return this.l;
            }
        };
        f = yourGroceriesActions2;
        YourGroceriesActions yourGroceriesActions3 = new YourGroceriesActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.YourGroceriesActions.YOUR_GROCERIES_STATUS_INFO_CLICK
            public final Category l = Category.m;
            public final String m = "Fulfilment Status Help";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getF0() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getE0() {
                return this.l;
            }
        };
        g = yourGroceriesActions3;
        YourGroceriesActions yourGroceriesActions4 = new YourGroceriesActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.YourGroceriesActions.YOUR_GROCERIES_PRODUCT_CLICK
            public final Category l = Category.m;
            public final String m = "Product Tile";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getF0() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getE0() {
                return this.l;
            }
        };
        h = yourGroceriesActions4;
        YourGroceriesActions yourGroceriesActions5 = new YourGroceriesActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.YourGroceriesActions.YOUR_GROCERIES_SUBSTITUTED_PRODUCT_CLICK
            public final Category l = Category.m;
            public final String m = "Substituted Product Tile";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getF0() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getE0() {
                return this.l;
            }
        };
        i = yourGroceriesActions5;
        YourGroceriesActions[] yourGroceriesActionsArr = {yourGroceriesActions, yourGroceriesActions2, yourGroceriesActions3, yourGroceriesActions4, yourGroceriesActions5};
        j = yourGroceriesActionsArr;
        k = EnumEntriesKt.a(yourGroceriesActionsArr);
    }

    public YourGroceriesActions(String str, int i2) {
    }

    public static YourGroceriesActions valueOf(String str) {
        return (YourGroceriesActions) Enum.valueOf(YourGroceriesActions.class, str);
    }

    public static YourGroceriesActions[] values() {
        return (YourGroceriesActions[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
