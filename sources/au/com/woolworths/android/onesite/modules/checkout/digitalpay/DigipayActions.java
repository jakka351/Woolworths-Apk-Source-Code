package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigipayActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DigipayActions implements Action {
    public static final DigipayActions A;
    public static final DigipayActions B;
    public static final DigipayActions C;
    public static final /* synthetic */ DigipayActions[] D;
    public static final /* synthetic */ EnumEntries E;
    public static final DigipayActions e;
    public static final DigipayActions f;
    public static final DigipayActions g;
    public static final DigipayActions h;
    public static final DigipayActions i;
    public static final DigipayActions j;
    public static final DigipayActions k;
    public static final DigipayActions l;
    public static final DigipayActions m;
    public static final DigipayActions n;
    public static final DigipayActions o;
    public static final DigipayActions p;
    public static final DigipayActions q;
    public static final DigipayActions r;
    public static final DigipayActions s;
    public static final DigipayActions t;
    public static final DigipayActions u;
    public static final DigipayActions v;
    public static final DigipayActions w;
    public static final DigipayActions x;
    public static final DigipayActions y;
    public static final DigipayActions z;
    public final Screens d = Screens.h;

    static {
        DigipayActions digipayActions = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.ADD_GIFT_CARD
            public final Category F = Category.m;
            public final String G = "Add Gift Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        e = digipayActions;
        DigipayActions digipayActions2 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CHECK_SAVE_GIFT_CARD_FOR_LATER
            public final Category F = Category.i0;
            public final String G = "Save Gift Card for Later";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        f = digipayActions2;
        DigipayActions digipayActions3 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.UNCHECK_SAVE_GIFT_CARD_FOR_LATER
            public final Category F = Category.h0;
            public final String G = "Save Gift Card for Later";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        g = digipayActions3;
        DigipayActions digipayActions4 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CLEAR_GIFT_CARD_FORM
            public final Category F = Category.D;
            public final String G = "Clear Gift Card Form";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        h = digipayActions4;
        DigipayActions digipayActions5 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.MANAGE_GIFT_CARDS
            public final Category F = Category.D;
            public final String G = "Manage Gift Cards";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        i = digipayActions5;
        DigipayActions digipayActions6 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.REMOVE_SAVED_GIFT_CARD
            public final Category F = Category.D;
            public final String G = "Remove Saved Gift Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        j = digipayActions6;
        DigipayActions digipayActions7 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CANCEL_REMOVING_SAVED_GIFT_CARD
            public final Category F = Category.m;
            public final String G = "Cancel Deleting Saved Gift Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        k = digipayActions7;
        DigipayActions digipayActions8 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CONFIRM_REMOVING_SAVED_GIFT_CARD
            public final Category F = Category.m;
            public final String G = "Confirm Deleting Saved Gift Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        l = digipayActions8;
        DigipayActions digipayActions9 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.REMOVE_NEWLY_ADDED_GIFT_CARD
            public final Category F = Category.D;
            public final String G = "Remove New Gift Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        m = digipayActions9;
        DigipayActions digipayActions10 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CANCEL_REMOVING_NEWLY_ADDED_GIFT_CARD
            public final Category F = Category.m;
            public final String G = "Cancel Deleting Newly Added Gift Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        n = digipayActions10;
        DigipayActions digipayActions11 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CONFIRM_REMOVING_NEWLY_ADDED_GIFT_CARD
            public final Category F = Category.m;
            public final String G = "Confirm Deleting Newly Added Gift Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        o = digipayActions11;
        DigipayActions digipayActions12 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.ADD_CREDIT_CARD
            public final Category F = Category.m;
            public final String G = "Add Credit Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        p = digipayActions12;
        DigipayActions digipayActions13 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CHECK_SAVE_CREDIT_CARD_FOR_LATER
            public final Category F = Category.i0;
            public final String G = "Save Credit Card for Later";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        q = digipayActions13;
        DigipayActions digipayActions14 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.UNCHECK_SAVE_CREDIT_CARD_FOR_LATER
            public final Category F = Category.h0;
            public final String G = "Save Credit Card for Later";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        r = digipayActions14;
        DigipayActions digipayActions15 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CLEAR_CREDIT_CARD_FORM
            public final Category F = Category.D;
            public final String G = "Clear Credit Card Form";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        s = digipayActions15;
        DigipayActions digipayActions16 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.REMOVE_SAVED_CREDIT_CARD
            public final Category F = Category.D;
            public final String G = "Remove Credit Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        t = digipayActions16;
        DigipayActions digipayActions17 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CANCEL_REMOVING_SAVED_CREDIT_CARD
            public final Category F = Category.m;
            public final String G = "Cancel Deleting Saved Credit Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        u = digipayActions17;
        DigipayActions digipayActions18 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CONFIRM_REMOVING_SAVED_CREDIT_CARD
            public final Category F = Category.m;
            public final String G = "Confirm Deleting Saved Credit Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        v = digipayActions18;
        DigipayActions digipayActions19 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.MANAGE_CREDIT_CARDS
            public final Category F = Category.D;
            public final String G = "Manage Credit Cards";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        w = digipayActions19;
        DigipayActions digipayActions20 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.LINK_PAYPAL
            public final Category F = Category.D;
            public final String G = "Link PayPal Account";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        x = digipayActions20;
        DigipayActions digipayActions21 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.UNLINK_PAYPAL
            public final Category F = Category.D;
            public final String G = "Unlink PayPal Account";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        y = digipayActions21;
        DigipayActions digipayActions22 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CONFIRM_UNLINK_PAYPAL
            public final Category F = Category.m;
            public final String G = "Confirm Unlink PayPal";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        z = digipayActions22;
        DigipayActions digipayActions23 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.CANCEL_UNLINK_PAYPAL
            public final Category F = Category.m;
            public final String G = "Cancel Unlinking PayPal";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        A = digipayActions23;
        DigipayActions digipayActions24 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.PLACE_ORDER
            public final Category F = Category.m;
            public final String G = "Place Order";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        B = digipayActions24;
        DigipayActions digipayActions25 = new DigipayActions() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions.ERROR_IMPRESSION
            public final Category F = Category.v;
            public final String G = "Inset Error Message";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.G;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.F;
            }
        };
        C = digipayActions25;
        DigipayActions[] digipayActionsArr = {digipayActions, digipayActions2, digipayActions3, digipayActions4, digipayActions5, digipayActions6, digipayActions7, digipayActions8, digipayActions9, digipayActions10, digipayActions11, digipayActions12, digipayActions13, digipayActions14, digipayActions15, digipayActions16, digipayActions17, digipayActions18, digipayActions19, digipayActions20, digipayActions21, digipayActions22, digipayActions23, digipayActions24, digipayActions25};
        D = digipayActionsArr;
        E = EnumEntriesKt.a(digipayActionsArr);
    }

    public DigipayActions(String str, int i2) {
    }

    public static DigipayActions valueOf(String str) {
        return (DigipayActions) Enum.valueOf(DigipayActions.class, str);
    }

    public static DigipayActions[] values() {
        return (DigipayActions[]) D.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
