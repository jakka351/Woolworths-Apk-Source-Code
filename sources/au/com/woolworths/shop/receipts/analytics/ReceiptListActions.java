package au.com.woolworths.shop.receipts.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/analytics/ReceiptListActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ReceiptListActions implements Action {
    public static final ReceiptListActions e;
    public static final ReceiptListActions f;
    public static final ReceiptListActions g;
    public static final ReceiptListActions h;
    public static final ReceiptListActions i;
    public static final ReceiptListActions j;
    public static final ReceiptListActions k;
    public static final ReceiptListActions l;
    public static final ReceiptListActions m;
    public static final ReceiptListActions n;
    public static final ReceiptListActions o;
    public static final ReceiptListActions p;
    public static final ReceiptListActions q;
    public static final ReceiptListActions r;
    public static final ReceiptListActions s;
    public static final ReceiptListActions t;
    public static final ReceiptListActions u;
    public static final /* synthetic */ ReceiptListActions[] v;
    public static final /* synthetic */ EnumEntries w;
    public final Screen d = ShopReceiptsScreens.e;

    static {
        ReceiptListActions receiptListActions = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.RECEIPT_ITEM_CLICK
            public final Category x = Category.m;
            public final String y = "eReceipt";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        e = receiptListActions;
        ReceiptListActions receiptListActions2 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.VIEW_MY_ORDERS_CLICK
            public final Category x = Category.D;
            public final String y = "View";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        f = receiptListActions2;
        ReceiptListActions receiptListActions3 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.PULL_TO_REFRESH
            public final Category x = Category.a0;
            public final String y = "Pull to Refresh";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        g = receiptListActions3;
        ReceiptListActions receiptListActions4 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.PULL_TO_REFRESH_ERROR_IMPRESSION
            public final Category x = Category.g0;
            public final String y = "unable to fetch ereceipts";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        h = receiptListActions4;
        ReceiptListActions receiptListActions5 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.PULL_TO_REFRESH_ERROR_RETRY_CLICK
            public final Category x = Category.f0;
            public final String y = "retry - unable to fetch ereceipts";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        i = receiptListActions5;
        ReceiptListActions receiptListActions6 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.ALL_RECEIPTS_LOADED_IMPRESSION
            public final Category x = Category.B;
            public final String y = "all receipts loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        j = receiptListActions6;
        ReceiptListActions receiptListActions7 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.ALL_RECEIPTS_LOADED_MORE_INFO_CLICK
            public final Category x = Category.A;
            public final String y = "all receipts loaded - looking for older activity";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        k = receiptListActions7;
        ReceiptListActions receiptListActions8 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.ALL_RECEIPTS_LOADED_BOTTOM_SHEET_IMPRESSION
            public final Category x = Category.k;
            public final String y = "ereceipt older activity";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        l = receiptListActions8;
        ReceiptListActions receiptListActions9 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.ALL_RECEIPTS_LOADED_MORE_INFO_GOT_IT_CLICK
            public final Category x = Category.m;
            public final String y = "Got it";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        m = receiptListActions9;
        ReceiptListActions receiptListActions10 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.ALL_RECEIPTS_LOADED_MORE_INFO_CHAT_TO_US_CLICK
            public final Category x = Category.m;
            public final String y = "Chat to us";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        n = receiptListActions10;
        ReceiptListActions receiptListActions11 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.PAGINATION_ERROR_IMPRESSION
            public final Category x = Category.g0;
            public final String y = "unable to fetch additional ereceipts";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        o = receiptListActions11;
        ReceiptListActions receiptListActions12 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.PAGINATION_ERROR_RETRY_CLICK
            public final Category x = Category.f0;
            public final String y = "retry - unable to fetch additional ereceipts";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        p = receiptListActions12;
        ReceiptListActions receiptListActions13 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.NETWORK_ERROR_IMPRESSION
            public final Category x = Category.v;
            public final String y = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        q = receiptListActions13;
        ReceiptListActions receiptListActions14 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.NETWORK_ERROR_TRY_AGAIN_CLICK
            public final Category x = Category.m;
            public final String y = "Network Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        r = receiptListActions14;
        ReceiptListActions receiptListActions15 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.SERVER_ERROR_IMPRESSION
            public final Category x = Category.v;
            public final String y = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        s = receiptListActions15;
        ReceiptListActions receiptListActions16 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.SERVER_ERROR_TRY_AGAIN_CLICK
            public final Category x = Category.m;
            public final String y = "Server Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        t = receiptListActions16;
        ReceiptListActions receiptListActions17 = new ReceiptListActions() { // from class: au.com.woolworths.shop.receipts.analytics.ReceiptListActions.NO_RECEIPTS_IMPRESSION
            public final Category x = Category.B;
            public final String y = "no receipts available";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.x;
            }
        };
        u = receiptListActions17;
        ReceiptListActions[] receiptListActionsArr = {receiptListActions, receiptListActions2, receiptListActions3, receiptListActions4, receiptListActions5, receiptListActions6, receiptListActions7, receiptListActions8, receiptListActions9, receiptListActions10, receiptListActions11, receiptListActions12, receiptListActions13, receiptListActions14, receiptListActions15, receiptListActions16, receiptListActions17};
        v = receiptListActionsArr;
        w = EnumEntriesKt.a(receiptListActionsArr);
    }

    public ReceiptListActions(String str, int i2) {
    }

    public static ReceiptListActions valueOf(String str) {
        return (ReceiptListActions) Enum.valueOf(ReceiptListActions.class, str);
    }

    public static ReceiptListActions[] values() {
        return (ReceiptListActions[]) v.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
