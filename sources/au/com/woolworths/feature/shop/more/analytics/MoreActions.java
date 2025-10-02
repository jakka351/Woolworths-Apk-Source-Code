package au.com.woolworths.feature.shop.more.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/analytics/MoreActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MoreActions implements Action {
    public static final MoreActions e;
    public static final MoreActions f;
    public static final MoreActions g;
    public static final MoreActions h;
    public static final MoreActions i;
    public static final MoreActions j;
    public static final MoreActions k;
    public static final MoreActions l;
    public static final MoreActions m;
    public static final MoreActions n;
    public static final MoreActions o;
    public static final MoreActions p;
    public static final MoreActions q;
    public static final MoreActions r;
    public static final MoreActions s;
    public static final MoreActions t;
    public static final MoreActions u;
    public static final /* synthetic */ MoreActions[] v;
    public static final /* synthetic */ EnumEntries w;
    public final Screen d = Screens.k;

    static {
        MoreActions moreActions = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.CHAT_TO_US_CLICK
            public final Category x = Category.m;
            public final String y = "Chat to us";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        e = moreActions;
        MoreActions moreActions2 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.DELIVERY_UNLIMITED_FREE_TRIAL
            public final Category x = Category.B;
            public final String y = "Free Trial Badge";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        f = moreActions2;
        MoreActions moreActions3 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.DELIVERY_UNLIMITED_ERROR
            public final Category x = Category.v;
            public final String y = "Unable to load Delivery Unlimited";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        g = moreActions3;
        MoreActions moreActions4 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.DELIVERY_UNLIMITED_SUBSCRIBE
            public final Category x = Category.B;
            public final String y = "Subscribe Badge";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        h = moreActions4;
        MoreActions moreActions5 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.EVERYDAY_EXTRA_CLICK
            public final Category x = Category.m;
            public final String y = "Everyday Extra";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        i = moreActions5;
        MoreActions moreActions6 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.EXPLAINING_VALUE_CLICK
            public final Category x = Category.m;
            public final String y = "Explaining Value";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        j = moreActions6;
        MoreActions moreActions7 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.FOOD_TRACKER_CLICK
            public final Category x = Category.m;
            public final String y = "Food Tracker by Healthy Life";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        k = moreActions7;
        MoreActions moreActions8 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.SCAN_AND_GO_CLICK
            public final Category x = Category.m;
            public final String y = "Scan&Go";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        l = moreActions8;
        MoreActions moreActions9 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.MY_ORDERS_CLICK
            public final Category x = Category.m;
            public final String y = "My Orders";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        m = moreActions9;
        MoreActions moreActions10 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.IN_STORE_WIFI_CLICK
            public final Category x = Category.m;
            public final String y = "Instore Wi-Fi";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        n = moreActions10;
        MoreActions moreActions11 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.TWO_FACTOR_AUTH_CLICK
            public final Category x = Category.m;
            public final String y = "manage trusted devices";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        MoreActions moreActions12 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.NOTIFICATIONS_CLICK
            public final Category x = Category.m;
            public final String y = "Notifications";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        o = moreActions12;
        MoreActions moreActions13 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.E_RECEIPTS_CLICK
            public final Category x = Category.m;
            public final String y = "My eReceipts";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        p = moreActions13;
        MoreActions moreActions14 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.RECEIPT_PREFERENCES_CLICK
            public final Category x = Category.m;
            public final String y = "Receipt Preferences";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        q = moreActions14;
        MoreActions moreActions15 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.DISCOVER_ONLINE_SHOPPING_CLICK
            public final Category x = Category.m;
            public final String y = "Discover Online Shopping";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        r = moreActions15;
        MoreActions moreActions16 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.CLOSE_ACCOUNT_CLICK
            public final Category x = Category.m;
            public final String y = "Close Account";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        s = moreActions16;
        MoreActions moreActions17 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.CHANGE_COUNTRY_CLICK
            public final Category x = Category.m;
            public final String y = "Change Country";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        t = moreActions17;
        MoreActions moreActions18 = new MoreActions() { // from class: au.com.woolworths.feature.shop.more.analytics.MoreActions.LIQUOR_PURCHASE_NOTICES_CLICK
            public final Category x = Category.m;
            public final String y = "Liquor Purchase Notices";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getX() {
                return this.x;
            }
        };
        u = moreActions18;
        MoreActions[] moreActionsArr = {moreActions, moreActions2, moreActions3, moreActions4, moreActions5, moreActions6, moreActions7, moreActions8, moreActions9, moreActions10, moreActions11, moreActions12, moreActions13, moreActions14, moreActions15, moreActions16, moreActions17, moreActions18};
        v = moreActionsArr;
        w = EnumEntriesKt.a(moreActionsArr);
    }

    public MoreActions(String str, int i2) {
    }

    public static MoreActions valueOf(String str) {
        return (MoreActions) Enum.valueOf(MoreActions.class, str);
    }

    public static MoreActions[] values() {
        return (MoreActions[]) v.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
