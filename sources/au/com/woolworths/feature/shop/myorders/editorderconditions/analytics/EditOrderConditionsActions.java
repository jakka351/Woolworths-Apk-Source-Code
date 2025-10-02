package au.com.woolworths.feature.shop.myorders.editorderconditions.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/analytics/EditOrderConditionsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EditOrderConditionsActions implements Action {
    public static final EditOrderConditionsActions e;
    public static final EditOrderConditionsActions f;
    public static final EditOrderConditionsActions g;
    public static final EditOrderConditionsActions h;
    public static final /* synthetic */ EditOrderConditionsActions[] i;
    public static final /* synthetic */ EnumEntries j;
    public final MyOrdersScreens d = MyOrdersScreens.d;

    static {
        EditOrderConditionsActions editOrderConditionsActions = new EditOrderConditionsActions() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.analytics.EditOrderConditionsActions.ACCEPT_EDIT_ORDER_CLICK
            public final Category k = Category.m;
            public final String l = "Change My Order - Accept";

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
        e = editOrderConditionsActions;
        EditOrderConditionsActions editOrderConditionsActions2 = new EditOrderConditionsActions() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.analytics.EditOrderConditionsActions.CANCEL_EDIT_ORDER_CLICK
            public final Category k = Category.m;
            public final String l = "Change My Order - Cancel";

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
        f = editOrderConditionsActions2;
        EditOrderConditionsActions editOrderConditionsActions3 = new EditOrderConditionsActions() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.analytics.EditOrderConditionsActions.SET_EDIT_ORDER_MODE_NETWORK_ERROR
            public final Category k = Category.v;
            public final String l = "CMO Condition - Network Error";

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
        g = editOrderConditionsActions3;
        EditOrderConditionsActions editOrderConditionsActions4 = new EditOrderConditionsActions() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.analytics.EditOrderConditionsActions.SET_EDIT_ORDER_MODE_SERVER_ERROR
            public final Category k = Category.v;
            public final String l = "CMO Condition - Server Error";

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
        h = editOrderConditionsActions4;
        EditOrderConditionsActions[] editOrderConditionsActionsArr = {editOrderConditionsActions, editOrderConditionsActions2, editOrderConditionsActions3, editOrderConditionsActions4};
        i = editOrderConditionsActionsArr;
        j = EnumEntriesKt.a(editOrderConditionsActionsArr);
    }

    public EditOrderConditionsActions(String str, int i2) {
    }

    public static EditOrderConditionsActions valueOf(String str) {
        return (EditOrderConditionsActions) Enum.valueOf(EditOrderConditionsActions.class, str);
    }

    public static EditOrderConditionsActions[] values() {
        return (EditOrderConditionsActions[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
