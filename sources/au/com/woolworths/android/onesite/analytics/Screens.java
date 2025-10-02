package au.com.woolworths.android.onesite.analytics;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/Screens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Screens implements Screen {
    public static final Screens A;
    public static final Screens B;
    public static final Screens C;
    public static final Screens D;
    public static final Screens E;
    public static final Screens F;
    public static final Screens G;
    public static final Screens H;
    public static final Screens I;
    public static final Screens J;
    public static final Screens K;
    public static final Screens L;
    public static final Screens M;
    public static final Screens N;
    public static final Screens O;
    public static final /* synthetic */ Screens[] P;
    public static final /* synthetic */ EnumEntries Q;
    public static final Screens d;
    public static final Screens e;
    public static final Screens f;
    public static final Screens g;
    public static final Screens h;
    public static final Screens i;
    public static final Screens j;
    public static final Screens k;
    public static final Screens l;
    public static final Screens m;
    public static final Screens n;
    public static final Screens o;
    public static final Screens p;
    public static final Screens q;
    public static final Screens r;
    public static final Screens s;
    public static final Screens t;
    public static final Screens u;
    public static final Screens v;
    public static final Screens w;
    public static final Screens x;
    public static final Screens y;
    public static final Screens z;

    static {
        Screens screens = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.ADD_DELIVERY_ADDRESS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Collection Mode";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Add Delivery Address screen";
            }
        };
        d = screens;
        Screens screens2 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.BACKGROUND
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Background";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Background screen";
            }
        };
        Screens screens3 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.BARCODE_SCANNER_ONBOARDING
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Barcode Scanner";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Barcode Scanner Onboarding screen";
            }
        };
        e = screens3;
        Screens screens4 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.BARCODE_SCANNER
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Barcode Scanner";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Barcode Scanner screen";
            }
        };
        f = screens4;
        Screens screens5 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.CHECKOUT_DETAILS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Checkout";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "checkoutdetails_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Checkout Details screen";
            }
        };
        g = screens5;
        Screens screens6 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.CHECKOUT_PAYMENT_DIGIPAY
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Checkout";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Checkout Payment DigiPay screen";
            }
        };
        h = screens6;
        Screens screens7 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.CHECKOUT_PRODUCTS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Checkout";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Checkout Products screen";
            }
        };
        i = screens7;
        Screens screens8 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.CHECKOUT_SUMMARY
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Checkout";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "checkoutsummary_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Checkout Summary screen";
            }
        };
        j = screens8;
        Screens screens9 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.HOME_MORE
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "More";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "more_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "More screen";
            }
        };
        k = screens9;
        Screens screens10 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.HOME_PAGE
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Homepage";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "home_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Home screen";
            }
        };
        l = screens10;
        Screens screens11 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.MARKETPLACE
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Marketplace";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "marketplacelanding_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Marketplace Landing screen";
            }
        };
        m = screens11;
        Screens screens12 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.MARKETPLACE_HOW_IT_WORKS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Marketplace";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "howitworks_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "How it works screen";
            }
        };
        n = screens12;
        Screens screens13 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.NOTIFICATION_SETTINGS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Settings";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Notifications Settings screen";
            }
        };
        Screens screens14 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.ONBOARDING_COLLECTION_MODE_SELECTOR
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Onboarding";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Onboarding Collection Mode screen";
            }
        };
        o = screens14;
        Screens screens15 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.ORDER_CONFIRMATION
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Order";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "orderconfirmation_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Order Confirmation screen";
            }
        };
        p = screens15;
        Screens screens16 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.PICKUP_ORDERS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Pick Up";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Pick Up Orders screen";
            }
        };
        Screens screens17 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.PICK_UP_LOCATOR
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Pick Up Locator";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Pick Up Locator screen";
            }
        };
        q = screens17;
        Screens screens18 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.PICK_UP_LOCATION_RESULT
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Pick Up Locator";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Locations in Suburb screen";
            }
        };
        r = screens18;
        Screens screens19 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.LOCATION_DETAILS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Location Details";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Location Details screen";
            }
        };
        s = screens19;
        Screens screens20 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.PRODUCT_DETAILS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "productdetails";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "productdetails_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Product Details screen";
            }
        };
        t = screens20;
        Screens screens21 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.PRODUCTS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Products";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "products_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Products screen";
            }
        };
        u = screens21;
        Screens screens22 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.SEARCH_RESULTS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Text Search";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Search Results screen";
            }
        };
        v = screens22;
        Screens screens23 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.ONBOARDING
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Onboarding";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "sm_onboarding_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Onboarding Walkthrough screen";
            }
        };
        w = screens23;
        Screens screens24 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_SPLASH
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Onboarding";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "splash_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Splash";
            }
        };
        x = screens24;
        Screens screens25 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_WELCOME
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Onboarding";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "welcome_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Welcome";
            }
        };
        Screens screens26 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_AUTHENTICATION
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards Account";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "rewardslogin_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Rewards Login";
            }
        };
        y = screens26;
        Screens screens27 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_SETUP
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Rewards Login or Signup";
            }
        };
        z = screens27;
        Screens screens28 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_REDEMPTION_SETTINGS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards Choice";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Redemption Settings";
            }
        };
        A = screens28;
        Screens screens29 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_FUEL_VOUCHERS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards Choice";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Fuel Vouchers";
            }
        };
        Screens screens30 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_SETTINGS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Rewards Settings screen";
            }
        };
        B = screens30;
        Screens screens31 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_PARTNER_OVERVIEW
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Discover";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "partneroverview_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Partner Overview";
            }
        };
        Screens screens32 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_CARD
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards Card";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "rewardscard_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String c() {
                return "screen_view_card";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Rewards Card";
            }
        };
        C = screens32;
        Screens screens33 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_WALLET
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "everydaypay_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Everyday Pay";
            }
        };
        Screens screens34 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_WALLET_PAYMENT_SETTINGS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "paymentsettings_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Payment settings";
            }
        };
        Screens screens35 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_WALLET_GIFT_CARDS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "giftcards_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Gift Cards";
            }
        };
        Screens screens36 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_WALLET_GIFT_CARD_TRANSACTIONS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "transactionhistory_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Transaction history";
            }
        };
        Screens screens37 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_WALLET_TERMS_AND_CONDITIONS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "terms&conditionswallet_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Terms & Conditions Wallet";
            }
        };
        Screens screens38 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_WALLET_ADD_GIFT_CARD
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "addgiftcard_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Add gift card";
            }
        };
        Screens screens39 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_WALLET_ADD_GIFT_CARD_SCAN
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "scangiftcardbarcode_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Scan gift card barcode";
            }
        };
        Screens screens40 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_WALLET_VIEW_CARD
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "carddetail_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Card detail";
            }
        };
        Screens screens41 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_WALLET_HOW_TO_REDEEM
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "howtoredeem_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "How to redeem";
            }
        };
        Screens screens42 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_WALLET_UPDATE_CARD
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "updatecard_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Update card";
            }
        };
        Screens screens43 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_QR_SCANNER
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "scanqrcode_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Scan QR code";
            }
        };
        Screens screens44 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_PARTNER_SEARCH
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Discover";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "discoversearch_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Rewards Partner Search";
            }
        };
        Screens screens45 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_ACCOUNT_SETTINGS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards Account";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "rewardsaccount_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String c() {
                return "screen_view_account";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Rewards Account";
            }
        };
        D = screens45;
        Screens screens46 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_ACCOUNT_MEDALLIA
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards Account";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "customer_feedback_medallia_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Customer Feedback Medallia";
            }
        };
        E = screens46;
        Screens screens47 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_PUSH_PREFERENCES
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards Account";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "push_notifications_preferences_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Push Notifications Preferences";
            }
        };
        F = screens47;
        Screens screens48 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_RECEIPT_PREFERENCES
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards Account";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "receipt_preferences_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Receipt Preferences";
            }
        };
        G = screens48;
        Screens screens49 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_ACTIVITY_RECEIPT_PREFERENCES
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards Activity";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "receipt_preferences_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Receipt Preferences";
            }
        };
        H = screens49;
        Screens screens50 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_PREFERENCE_DETAILS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards Account";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "preference_details_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Preference Details";
            }
        };
        I = screens50;
        Screens screens51 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_PARTNER_LOCATION_DETAIL
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Discover";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "partnerdetails_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Partners Details";
            }
        };
        Screens screens52 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.REWARDS_ERECEIPT_SCREEN
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Rewards Activity";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "receipt_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "In-Store Receipt";
            }
        };
        Screens screens53 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.SIGN_UP_TERMS_AND_CONDITIONS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "SignUp Terms of Use screen";
            }
        };
        Screens screens54 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.SIGN_UP_PRIVACY_POLICY
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "SignUp Privacy Policy screen";
            }
        };
        Screens screens55 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.SIGN_UP_COLLECTION_NOTICE
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "SignUp Collection Notice screen";
            }
        };
        Screens screens56 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.SHOP_APP_SPLASH
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Launch";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Splash screen";
            }
        };
        J = screens56;
        Screens screens57 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.TROLLEY
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Checkout";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "trolleyreview_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Trolley Review screen";
            }
        };
        Screens screens58 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.DELIVERY_UNLIMITED_SIGN_UP
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Delivery Unlimited";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Delivery Unlimited Sign Up Screen";
            }
        };
        K = screens58;
        Screens screens59 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.DELIVERY_UNLIMITED_SIGN_UP_SELECT_PLAN
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Delivery Unlimited";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Select Plan Screen";
            }
        };
        L = screens59;
        Screens screens60 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.DELIVERY_UNLIMITED_SIGN_UP_CONFIRMATION
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Delivery Unlimited";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "subscription_complete_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Subscription Completion Screen";
            }
        };
        M = screens60;
        Screens screens61 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.DELIVERY_UNLIMITED_SIGN_UP_CONFIRM_SUBSCRIPTION
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Delivery Unlimited";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Confirm Subscription Screen";
            }
        };
        N = screens61;
        Screens screens62 = new Screens() { // from class: au.com.woolworths.android.onesite.analytics.Screens.VOC_SURVEY
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "VOC";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "VOC Survey screen";
            }
        };
        O = screens62;
        Screens[] screensArr = {screens, screens2, screens3, screens4, screens5, screens6, screens7, screens8, screens9, screens10, screens11, screens12, screens13, screens14, screens15, screens16, screens17, screens18, screens19, screens20, screens21, screens22, screens23, screens24, screens25, screens26, screens27, screens28, screens29, screens30, screens31, screens32, screens33, screens34, screens35, screens36, screens37, screens38, screens39, screens40, screens41, screens42, screens43, screens44, screens45, screens46, screens47, screens48, screens49, screens50, screens51, screens52, screens53, screens54, screens55, screens56, screens57, screens58, screens59, screens60, screens61, screens62};
        P = screensArr;
        Q = EnumEntriesKt.a(screensArr);
    }

    public static Screens valueOf(String str) {
        return (Screens) Enum.valueOf(Screens.class, str);
    }

    public static Screens[] values() {
        return (Screens[]) P.clone();
    }
}
