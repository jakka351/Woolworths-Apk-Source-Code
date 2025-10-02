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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/analytics/ConfirmationActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ConfirmationActions implements Action {
    public static final ConfirmationActions e;
    public static final ConfirmationActions f;
    public static final ConfirmationActions g;
    public static final /* synthetic */ ConfirmationActions[] h;
    public static final /* synthetic */ EnumEntries i;
    public final Screens d = Screens.M;

    static {
        ConfirmationActions confirmationActions = new ConfirmationActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmationActions.START_SHOPPING_CLICK
            public final Category j = Category.m;
            public final String k = "Start Shopping";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        e = confirmationActions;
        ConfirmationActions confirmationActions2 = new ConfirmationActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmationActions.SUBSCRIPTION_COMPLETE_INFO_IMPRESSION
            public final Category j = Category.B;
            public final String k = "Subscription Complete";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        f = confirmationActions2;
        ConfirmationActions confirmationActions3 = new ConfirmationActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmationActions.BANNER_IMPRESSION
            public final Category j = Category.h;
            public final String k = "Subscription Banner";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        g = confirmationActions3;
        ConfirmationActions[] confirmationActionsArr = {confirmationActions, confirmationActions2, confirmationActions3};
        h = confirmationActionsArr;
        i = EnumEntriesKt.a(confirmationActionsArr);
    }

    public ConfirmationActions(String str, int i2) {
    }

    public static ConfirmationActions valueOf(String str) {
        return (ConfirmationActions) Enum.valueOf(ConfirmationActions.class, str);
    }

    public static ConfirmationActions[] values() {
        return (ConfirmationActions[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getF() {
        return this.d;
    }
}
