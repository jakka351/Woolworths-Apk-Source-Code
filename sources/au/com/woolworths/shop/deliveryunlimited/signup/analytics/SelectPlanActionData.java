package au.com.woolworths.shop.deliveryunlimited.signup.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/analytics/SelectPlanActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SelectPlanActionData implements Action {
    public static final SelectPlanActionData e;
    public static final SelectPlanActionData f;
    public static final SelectPlanActionData g;
    public static final SelectPlanActionData h;
    public static final /* synthetic */ SelectPlanActionData[] i;
    public static final /* synthetic */ EnumEntries j;
    public final Screen d = Screens.L;

    static {
        SelectPlanActionData selectPlanActionData = new SelectPlanActionData() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.SelectPlanActionData.BANNER_CLICK
            public final Category k = Category.g;
            public final String l = "Click on Inset Banner";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        e = selectPlanActionData;
        SelectPlanActionData selectPlanActionData2 = new SelectPlanActionData() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.SelectPlanActionData.BANNER_IMPRESSION
            public final Category k = Category.h;
            public final String l = "Banner";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        f = selectPlanActionData2;
        SelectPlanActionData selectPlanActionData3 = new SelectPlanActionData() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.SelectPlanActionData.CALL_TO_ACTION_BUTTON_CLICK
            public final Category k = Category.m;
            public final String l = "Continue";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        g = selectPlanActionData3;
        SelectPlanActionData selectPlanActionData4 = new SelectPlanActionData() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.SelectPlanActionData.PLAN_TYPE_SELECTION
            public final Category k = Category.m;
            public final String l = "Plan Type Selection";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        h = selectPlanActionData4;
        SelectPlanActionData[] selectPlanActionDataArr = {selectPlanActionData, selectPlanActionData2, selectPlanActionData3, selectPlanActionData4};
        i = selectPlanActionDataArr;
        j = EnumEntriesKt.a(selectPlanActionDataArr);
    }

    public SelectPlanActionData(String str, int i2) {
    }

    public static SelectPlanActionData valueOf(String str) {
        return (SelectPlanActionData) Enum.valueOf(SelectPlanActionData.class, str);
    }

    public static SelectPlanActionData[] values() {
        return (SelectPlanActionData[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
