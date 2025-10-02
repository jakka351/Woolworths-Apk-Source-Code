package com.woolworths.scanlibrary.ui.tap.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/analytics/TapOnActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TapOnActionData implements Action {
    public static final TapOnActionData e;
    public static final TapOnActionData f;
    public static final TapOnActionData g;
    public static final TapOnActionData h;
    public static final /* synthetic */ TapOnActionData[] i;
    public static final /* synthetic */ EnumEntries j;
    public final Screens d = Screens.r;

    static {
        TapOnActionData tapOnActionData = new TapOnActionData() { // from class: com.woolworths.scanlibrary.ui.tap.analytics.TapOnActionData.START_SHOP_CLICK
            public final Category k = Category.m;
            public final String l = "Start Shop";

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
        e = tapOnActionData;
        TapOnActionData tapOnActionData2 = new TapOnActionData() { // from class: com.woolworths.scanlibrary.ui.tap.analytics.TapOnActionData.START_SHOP_TIMEOUT
            public final Category k = Category.v;
            public final String l = "unable to connect as Scan&Go is only available in selected woolworths stores";

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
        f = tapOnActionData2;
        TapOnActionData tapOnActionData3 = new TapOnActionData() { // from class: com.woolworths.scanlibrary.ui.tap.analytics.TapOnActionData.MAIN_MENU_CLICK
            public final Category k = Category.m;
            public final String l = "Menu Hamburger";

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
        g = tapOnActionData3;
        TapOnActionData tapOnActionData4 = new TapOnActionData() { // from class: com.woolworths.scanlibrary.ui.tap.analytics.TapOnActionData.AVAILABLE_STORE_CLICK
            public final Category k = Category.D;
            public final String l = "Woolworths stores";

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
        h = tapOnActionData4;
        TapOnActionData[] tapOnActionDataArr = {tapOnActionData, tapOnActionData2, tapOnActionData3, tapOnActionData4};
        i = tapOnActionDataArr;
        j = EnumEntriesKt.a(tapOnActionDataArr);
    }

    public TapOnActionData(String str, int i2) {
    }

    public static TapOnActionData valueOf(String str) {
        return (TapOnActionData) Enum.valueOf(TapOnActionData.class, str);
    }

    public static TapOnActionData[] values() {
        return (TapOnActionData[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
