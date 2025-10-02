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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/analytics/ConfirmSubscriptionActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ConfirmSubscriptionActions implements Action {
    public static final ConfirmSubscriptionActions e;
    public static final ConfirmSubscriptionActions f;
    public static final ConfirmSubscriptionActions g;
    public static final ConfirmSubscriptionActions h;
    public static final ConfirmSubscriptionActions i;
    public static final /* synthetic */ ConfirmSubscriptionActions[] j;
    public static final /* synthetic */ EnumEntries k;
    public final Screens d = Screens.N;

    static {
        ConfirmSubscriptionActions confirmSubscriptionActions = new ConfirmSubscriptionActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmSubscriptionActions.CONTINUE_CALL_TO_ACTION_CLICK
            public final Category l = Category.m;
            public final String m = "Continue";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.l;
            }
        };
        e = confirmSubscriptionActions;
        ConfirmSubscriptionActions confirmSubscriptionActions2 = new ConfirmSubscriptionActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmSubscriptionActions.PAYMENT_ERROR_IMPRESSION
            public final Category l = Category.v;
            public final String m = "Subscription Payment Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.l;
            }
        };
        f = confirmSubscriptionActions2;
        ConfirmSubscriptionActions confirmSubscriptionActions3 = new ConfirmSubscriptionActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmSubscriptionActions.TERMS_AND_CONDITIONS_IMPRESSION
            public final Category l = Category.B;
            public final String m = "Terms & Conditions";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.l;
            }
        };
        ConfirmSubscriptionActions confirmSubscriptionActions4 = new ConfirmSubscriptionActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmSubscriptionActions.TERMS_AND_CONDITIONS_ACCEPT_BUTTON_CLICK
            public final Category l = Category.m;
            public final String m = "Accept Terms & Conditions";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.l;
            }
        };
        g = confirmSubscriptionActions4;
        ConfirmSubscriptionActions confirmSubscriptionActions5 = new ConfirmSubscriptionActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmSubscriptionActions.SERVER_ERROR_TRY_AGAIN
            public final Category l = Category.m;
            public final String m = "Server Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.l;
            }
        };
        h = confirmSubscriptionActions5;
        ConfirmSubscriptionActions confirmSubscriptionActions6 = new ConfirmSubscriptionActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmSubscriptionActions.NETWORK_ERROR_TRY_AGAIN
            public final Category l = Category.m;
            public final String m = "Network Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.l;
            }
        };
        i = confirmSubscriptionActions6;
        ConfirmSubscriptionActions[] confirmSubscriptionActionsArr = {confirmSubscriptionActions, confirmSubscriptionActions2, confirmSubscriptionActions3, confirmSubscriptionActions4, confirmSubscriptionActions5, confirmSubscriptionActions6};
        j = confirmSubscriptionActionsArr;
        k = EnumEntriesKt.a(confirmSubscriptionActionsArr);
    }

    public ConfirmSubscriptionActions(String str, int i2) {
    }

    public static ConfirmSubscriptionActions valueOf(String str) {
        return (ConfirmSubscriptionActions) Enum.valueOf(ConfirmSubscriptionActions.class, str);
    }

    public static ConfirmSubscriptionActions[] values() {
        return (ConfirmSubscriptionActions[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getF() {
        return this.d;
    }
}
