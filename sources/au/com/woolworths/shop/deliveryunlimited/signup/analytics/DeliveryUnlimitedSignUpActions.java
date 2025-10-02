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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/analytics/DeliveryUnlimitedSignUpActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DeliveryUnlimitedSignUpActions implements Action {
    public static final DeliveryUnlimitedSignUpActions e;
    public static final DeliveryUnlimitedSignUpActions f;
    public static final DeliveryUnlimitedSignUpActions g;
    public static final DeliveryUnlimitedSignUpActions h;
    public static final /* synthetic */ DeliveryUnlimitedSignUpActions[] i;
    public static final /* synthetic */ EnumEntries j;
    public final Screen d = Screens.K;

    static {
        DeliveryUnlimitedSignUpActions deliveryUnlimitedSignUpActions = new DeliveryUnlimitedSignUpActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.DeliveryUnlimitedSignUpActions.CALL_TO_ACTION_BUTTON_CLICK
            public final Category k = Category.m;
            public final String l = "DU - Subscribe";

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
        DeliveryUnlimitedSignUpActions deliveryUnlimitedSignUpActions2 = new DeliveryUnlimitedSignUpActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.DeliveryUnlimitedSignUpActions.SERVER_ERROR
            public final Category k = Category.v;
            public final String l = "Delivery Unlimited - Server Error";

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
        e = deliveryUnlimitedSignUpActions2;
        DeliveryUnlimitedSignUpActions deliveryUnlimitedSignUpActions3 = new DeliveryUnlimitedSignUpActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.DeliveryUnlimitedSignUpActions.SERVER_ERROR_TRY_AGAIN
            public final Category k = Category.m;
            public final String l = "Server Error - Try Again";

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
        f = deliveryUnlimitedSignUpActions3;
        DeliveryUnlimitedSignUpActions deliveryUnlimitedSignUpActions4 = new DeliveryUnlimitedSignUpActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.DeliveryUnlimitedSignUpActions.NETWORK_ERROR
            public final Category k = Category.v;
            public final String l = "Delivery Unlimited - Network Error";

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
        g = deliveryUnlimitedSignUpActions4;
        DeliveryUnlimitedSignUpActions deliveryUnlimitedSignUpActions5 = new DeliveryUnlimitedSignUpActions() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.analytics.DeliveryUnlimitedSignUpActions.NETWORK_ERROR_TRY_AGAIN
            public final Category k = Category.m;
            public final String l = "Network Error - Try Again";

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
        h = deliveryUnlimitedSignUpActions5;
        DeliveryUnlimitedSignUpActions[] deliveryUnlimitedSignUpActionsArr = {deliveryUnlimitedSignUpActions, deliveryUnlimitedSignUpActions2, deliveryUnlimitedSignUpActions3, deliveryUnlimitedSignUpActions4, deliveryUnlimitedSignUpActions5};
        i = deliveryUnlimitedSignUpActionsArr;
        j = EnumEntriesKt.a(deliveryUnlimitedSignUpActionsArr);
    }

    public DeliveryUnlimitedSignUpActions(String str, int i2) {
    }

    public static DeliveryUnlimitedSignUpActions valueOf(String str) {
        return (DeliveryUnlimitedSignUpActions) Enum.valueOf(DeliveryUnlimitedSignUpActions.class, str);
    }

    public static DeliveryUnlimitedSignUpActions[] values() {
        return (DeliveryUnlimitedSignUpActions[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
