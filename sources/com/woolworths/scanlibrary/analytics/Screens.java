package com.woolworths.scanlibrary.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/analytics/Screens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class Screens implements Screen {
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
    public static final /* synthetic */ Screens[] s;
    public static final /* synthetic */ EnumEntries t;

    static {
        Screens screens = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SCAN_AND_GO
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "scan&go_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Scan&Go screen";
            }
        };
        d = screens;
        Screens screens2 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_ADD_PAYMENT
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "addpaymentmethod_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Add payment method screen";
            }
        };
        e = screens2;
        Screens screens3 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_ADD_SECURE_PAYMENT
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "addasecurepaymentmethod_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Add a secure payment method screen";
            }
        };
        f = screens3;
        Screens screens4 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_CART
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "scan&gocart_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Scan&Go Cart screen";
            }
        };
        g = screens4;
        Screens screens5 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_EXIT_BARCODE
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "proceedtoscan&gocheckout_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Proceed to Scan&Go Checkout screen";
            }
        };
        h = screens5;
        Screens screens6 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_LINK_REWARD_CARD_SCREEN
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "linkrewardscard_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Link Rewards card screen";
            }
        };
        i = screens6;
        Screens screens7 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_MENU_MEDALLIA
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "feedbackmedalliamenu_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Feedback Medallia Menu screen";
            }
        };
        j = screens7;
        Screens screens8 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_MENU_SCREEN
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "s&gmenu_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "S&G Menu screen";
            }
        };
        k = screens8;
        Screens screens9 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_ON_BOARDING_SCREENS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "onboardingwalkthrough_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Onboarding Walkthrough screen";
            }
        };
        l = screens9;
        Screens screens10 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_SETTINGS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "scan&gosettings_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Scan&Go Settings screen";
            }
        };
        m = screens10;
        Screens screens11 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_SETUP_COMPLETE
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "allsettoscan&go_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "All set to Scan&Go screen";
            }
        };
        n = screens11;
        Screens screens12 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_SHOPPING_LIST
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "scan&golist_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Scan&Go List screen";
            }
        };
        Screens screens13 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_SPLASH_SCREEN
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "splash_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Splash screen";
            }
        };
        o = screens13;
        Screens screens14 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_STORE_LIST
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Available Stores screen";
            }
        };
        p = screens14;
        Screens screens15 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.SNG_WELCOME
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "onboardingwelcome_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Onboarding Welcome screen";
            }
        };
        q = screens15;
        Screens screens16 = new Screens() { // from class: com.woolworths.scanlibrary.analytics.Screens.TAP_ON
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Scan&Go";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Start Shop screen";
            }
        };
        r = screens16;
        Screens[] screensArr = {screens, screens2, screens3, screens4, screens5, screens6, screens7, screens8, screens9, screens10, screens11, screens12, screens13, screens14, screens15, screens16};
        s = screensArr;
        t = EnumEntriesKt.a(screensArr);
    }

    public static Screens valueOf(String str) {
        return (Screens) Enum.valueOf(Screens.class, str);
    }

    public static Screens[] values() {
        return (Screens[]) s.clone();
    }
}
