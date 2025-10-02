package au.com.woolworths.shop.product.navigation.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/product/navigation/analytics/MarketplaceSubCategoryActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MarketplaceSubCategoryActionData implements Action {
    public static final MarketplaceSubCategoryActionData e;
    public static final MarketplaceSubCategoryActionData f;
    public static final MarketplaceSubCategoryActionData g;
    public static final MarketplaceSubCategoryActionData h;
    public static final MarketplaceSubCategoryActionData i;
    public static final MarketplaceSubCategoryActionData j;
    public static final /* synthetic */ MarketplaceSubCategoryActionData[] k;
    public static final /* synthetic */ EnumEntries l;
    public final Screens d = Screens.m;

    static {
        MarketplaceSubCategoryActionData marketplaceSubCategoryActionData = new MarketplaceSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.MarketplaceSubCategoryActionData.SERVER_ERROR
            public final Category m = Category.v;
            public final String n = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.m;
            }
        };
        e = marketplaceSubCategoryActionData;
        MarketplaceSubCategoryActionData marketplaceSubCategoryActionData2 = new MarketplaceSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.MarketplaceSubCategoryActionData.NETWORK_ERROR
            public final Category m = Category.v;
            public final String n = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.m;
            }
        };
        f = marketplaceSubCategoryActionData2;
        MarketplaceSubCategoryActionData marketplaceSubCategoryActionData3 = new MarketplaceSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.MarketplaceSubCategoryActionData.NO_RESULT
            public final Category m = Category.v;
            public final String n = "No Results Found";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.m;
            }
        };
        g = marketplaceSubCategoryActionData3;
        MarketplaceSubCategoryActionData marketplaceSubCategoryActionData4 = new MarketplaceSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.MarketplaceSubCategoryActionData.SERVER_ERROR_TRY_AGAIN
            public final Category m = Category.v;
            public final String n = "Server Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.m;
            }
        };
        h = marketplaceSubCategoryActionData4;
        MarketplaceSubCategoryActionData marketplaceSubCategoryActionData5 = new MarketplaceSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.MarketplaceSubCategoryActionData.NETWORK_ERROR_TRY_AGAIN
            public final Category m = Category.v;
            public final String n = "Network Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.m;
            }
        };
        i = marketplaceSubCategoryActionData5;
        MarketplaceSubCategoryActionData marketplaceSubCategoryActionData6 = new MarketplaceSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.MarketplaceSubCategoryActionData.SEARCH_ICON_CLICK
            public final Category m = Category.m;
            public final String n = "Tap Search Icon";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.m;
            }
        };
        j = marketplaceSubCategoryActionData6;
        MarketplaceSubCategoryActionData[] marketplaceSubCategoryActionDataArr = {marketplaceSubCategoryActionData, marketplaceSubCategoryActionData2, marketplaceSubCategoryActionData3, marketplaceSubCategoryActionData4, marketplaceSubCategoryActionData5, marketplaceSubCategoryActionData6};
        k = marketplaceSubCategoryActionDataArr;
        l = EnumEntriesKt.a(marketplaceSubCategoryActionDataArr);
    }

    public MarketplaceSubCategoryActionData(String str, int i2) {
    }

    public static MarketplaceSubCategoryActionData valueOf(String str) {
        return (MarketplaceSubCategoryActionData) Enum.valueOf(MarketplaceSubCategoryActionData.class, str);
    }

    public static MarketplaceSubCategoryActionData[] values() {
        return (MarketplaceSubCategoryActionData[]) k.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
