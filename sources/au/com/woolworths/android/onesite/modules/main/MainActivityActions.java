package au.com.woolworths.android.onesite.modules.main;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainActivityActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MainActivityActions implements Action {
    public static final MainActivityActions e;
    public static final MainActivityActions f;
    public static final MainActivityActions g;
    public static final MainActivityActions h;
    public static final MainActivityActions i;
    public static final MainActivityActions j;
    public static final MainActivityActions k;
    public static final MainActivityActions l;
    public static final /* synthetic */ MainActivityActions[] m;
    public static final /* synthetic */ EnumEntries n;
    public Screen d;

    static {
        MainActivityActions mainActivityActions = new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.BELL_ICON_CLICKED
            public final Category o = Category.m;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "bell icon";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        e = mainActivityActions;
        MainActivityActions mainActivityActions2 = new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.DELIVERY_NOW_BANNER_CLICKED
            public final Category o = Category.m;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "Header Nav - Delivery Now Callout";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        f = mainActivityActions2;
        MainActivityActions mainActivityActions3 = new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.DELIVERY_NOW_BANNER_IMPRESSION
            public final Category o = Category.B;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "Header Nav - Delivery Now Callout";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        MainActivityActions mainActivityActions4 = new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.SCAN_BARCODE_CLICKED
            public final Category o = Category.m;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "Scan Barcode";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        g = mainActivityActions4;
        MainActivityActions mainActivityActions5 = new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.SEARCH_BAR_CLICKED
            public final Category o = Category.m;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "Tap Search Bar";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        h = mainActivityActions5;
        MainActivityActions mainActivityActions6 = new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.SEARCH_ICON_CLICKED
            public final Category o = Category.m;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "Tap Search Icon";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        i = mainActivityActions6;
        MainActivityActions mainActivityActions7 = new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.UPFRONT_FULFILMENT_CLICK
            public final Category o = Category.m;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "Select Fulfilment Window";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        j = mainActivityActions7;
        MainActivityActions mainActivityActions8 = new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.UPFRONT_FULFILMENT_DELIVERY_NOW_VARIANT_B_CLICK
            public final Category o = Category.m;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "Delivery Now";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        k = mainActivityActions8;
        MainActivityActions mainActivityActions9 = new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.UPFRONT_FULFILMENT_DELIVERY_NOW_VARIANT_B_IMPRESSION
            public final Category o = Category.B;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "Select Delivery Window - Delivery Now";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        MainActivityActions mainActivityActions10 = new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.UPFRONT_FULFILMENT_EDIT
            public final Category o = Category.m;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "Edit Fulfilment Window";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        };
        l = mainActivityActions10;
        MainActivityActions[] mainActivityActionsArr = {mainActivityActions, mainActivityActions2, mainActivityActions3, mainActivityActions4, mainActivityActions5, mainActivityActions6, mainActivityActions7, mainActivityActions8, mainActivityActions9, mainActivityActions10, new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.UPFRONT_FULFILMENT_NO_WINDOW_IMPRESSION
            public final Category o = Category.B;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "Select Fulfilment Window";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        }, new MainActivityActions() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivityActions.UPFRONT_FULFILMENT_WITH_WINDOW_IMPRESSION
            public final Category o = Category.B;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getI() {
                return "Fulfilment Window Selected";
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.o;
            }
        }};
        m = mainActivityActionsArr;
        n = EnumEntriesKt.a(mainActivityActionsArr);
    }

    public static MainActivityActions valueOf(String str) {
        return (MainActivityActions) Enum.valueOf(MainActivityActions.class, str);
    }

    public static MainActivityActions[] values() {
        return (MainActivityActions[]) m.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        Screen screen = this.d;
        if (screen != null) {
            return screen;
        }
        Intrinsics.p("screen");
        throw null;
    }
}
