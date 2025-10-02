package au.com.woolworths.shop.product.navigation.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/product/navigation/analytics/SpecialsSubCategoryActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SpecialsSubCategoryActionData implements Action {
    public static final SpecialsSubCategoryActionData e;
    public static final SpecialsSubCategoryActionData f;
    public static final SpecialsSubCategoryActionData g;
    public static final SpecialsSubCategoryActionData h;
    public static final SpecialsSubCategoryActionData i;
    public static final SpecialsSubCategoryActionData j;
    public static final /* synthetic */ SpecialsSubCategoryActionData[] k;
    public static final /* synthetic */ EnumEntries l;
    public final ProductCategoryScreens d = ProductCategoryScreens.f;

    static {
        SpecialsSubCategoryActionData specialsSubCategoryActionData = new SpecialsSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.SpecialsSubCategoryActionData.SERVER_ERROR
            public final Category m = Category.v;
            public final String n = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        e = specialsSubCategoryActionData;
        SpecialsSubCategoryActionData specialsSubCategoryActionData2 = new SpecialsSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.SpecialsSubCategoryActionData.NETWORK_ERROR
            public final Category m = Category.v;
            public final String n = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        f = specialsSubCategoryActionData2;
        SpecialsSubCategoryActionData specialsSubCategoryActionData3 = new SpecialsSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.SpecialsSubCategoryActionData.NO_RESULT
            public final Category m = Category.v;
            public final String n = "No Results Found";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        g = specialsSubCategoryActionData3;
        SpecialsSubCategoryActionData specialsSubCategoryActionData4 = new SpecialsSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.SpecialsSubCategoryActionData.SERVER_ERROR_TRY_AGAIN
            public final Category m = Category.v;
            public final String n = "Server Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        h = specialsSubCategoryActionData4;
        SpecialsSubCategoryActionData specialsSubCategoryActionData5 = new SpecialsSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.SpecialsSubCategoryActionData.NETWORK_ERROR_TRY_AGAIN
            public final Category m = Category.v;
            public final String n = "Network Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        i = specialsSubCategoryActionData5;
        SpecialsSubCategoryActionData specialsSubCategoryActionData6 = new SpecialsSubCategoryActionData() { // from class: au.com.woolworths.shop.product.navigation.analytics.SpecialsSubCategoryActionData.SEARCH_ICON_CLICK
            public final Category m = Category.m;
            public final String n = "Tap Search Icon";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        j = specialsSubCategoryActionData6;
        SpecialsSubCategoryActionData[] specialsSubCategoryActionDataArr = {specialsSubCategoryActionData, specialsSubCategoryActionData2, specialsSubCategoryActionData3, specialsSubCategoryActionData4, specialsSubCategoryActionData5, specialsSubCategoryActionData6};
        k = specialsSubCategoryActionDataArr;
        l = EnumEntriesKt.a(specialsSubCategoryActionDataArr);
    }

    public SpecialsSubCategoryActionData(String str, int i2) {
    }

    public static SpecialsSubCategoryActionData valueOf(String str) {
        return (SpecialsSubCategoryActionData) Enum.valueOf(SpecialsSubCategoryActionData.class, str);
    }

    public static SpecialsSubCategoryActionData[] values() {
        return (SpecialsSubCategoryActionData[]) k.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
