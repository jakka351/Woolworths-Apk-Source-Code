package au.com.woolworths.feature.shop.recipes.freshmag.home.domain;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.recipes.freshmag.FreshMagScreen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/domain/FreshMagHomeAction;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FreshMagHomeAction implements Action {
    public static final FreshMagHomeAction e;
    public static final FreshMagHomeAction f;
    public static final FreshMagHomeAction g;
    public static final FreshMagHomeAction h;
    public static final FreshMagHomeAction i;
    public static final FreshMagHomeAction j;
    public static final FreshMagHomeAction k;
    public static final FreshMagHomeAction l;
    public static final FreshMagHomeAction m;
    public static final /* synthetic */ FreshMagHomeAction[] n;
    public static final /* synthetic */ EnumEntries o;
    public final Screen d = FreshMagScreen.e;

    static {
        FreshMagHomeAction freshMagHomeAction = new FreshMagHomeAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeAction.API_CONTENT_UNAVAILABLE
            public final Category p = Category.v;
            public final String q = "Content Unavailable";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.p;
            }
        };
        e = freshMagHomeAction;
        FreshMagHomeAction freshMagHomeAction2 = new FreshMagHomeAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeAction.API_NETWORK_ERROR
            public final Category p = Category.v;
            public final String q = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.p;
            }
        };
        f = freshMagHomeAction2;
        FreshMagHomeAction freshMagHomeAction3 = new FreshMagHomeAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeAction.API_SERVER_ERROR
            public final Category p = Category.v;
            public final String q = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.p;
            }
        };
        g = freshMagHomeAction3;
        FreshMagHomeAction freshMagHomeAction4 = new FreshMagHomeAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeAction.DATA_LOADED
            public final Category p = Category.B;
            public final String q = "Fresh Ideas Magazine Data Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.p;
            }
        };
        h = freshMagHomeAction4;
        FreshMagHomeAction freshMagHomeAction5 = new FreshMagHomeAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeAction.VIEW_FRESH_MAG_CONTENT
            public final Category p = Category.m;
            public final String q = "View Fresh Ideas Magazine";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.p;
            }
        };
        i = freshMagHomeAction5;
        FreshMagHomeAction freshMagHomeAction6 = new FreshMagHomeAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeAction.SEE_ALL_CARD_SHOWN
            public final Category p = Category.B;
            public final String q = "See All Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.p;
            }
        };
        j = freshMagHomeAction6;
        FreshMagHomeAction freshMagHomeAction7 = new FreshMagHomeAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeAction.SEE_ALL_CARD
            public final Category p = Category.m;
            public final String q = "See All Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.p;
            }
        };
        k = freshMagHomeAction7;
        FreshMagHomeAction freshMagHomeAction8 = new FreshMagHomeAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeAction.SEE_ALL_LINK
            public final Category p = Category.m;
            public final String q = "See All Link";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.p;
            }
        };
        l = freshMagHomeAction8;
        FreshMagHomeAction freshMagHomeAction9 = new FreshMagHomeAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeAction.RECIPES_CARD
            public final Category p = Category.m;
            public final String q = "Recipes Card";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.p;
            }
        };
        m = freshMagHomeAction9;
        FreshMagHomeAction[] freshMagHomeActionArr = {freshMagHomeAction, freshMagHomeAction2, freshMagHomeAction3, freshMagHomeAction4, freshMagHomeAction5, freshMagHomeAction6, freshMagHomeAction7, freshMagHomeAction8, freshMagHomeAction9};
        n = freshMagHomeActionArr;
        o = EnumEntriesKt.a(freshMagHomeActionArr);
    }

    public FreshMagHomeAction(String str, int i2) {
    }

    public static FreshMagHomeAction valueOf(String str) {
        return (FreshMagHomeAction) Enum.valueOf(FreshMagHomeAction.class, str);
    }

    public static FreshMagHomeAction[] values() {
        return (FreshMagHomeAction[]) n.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getN() {
        return this.d;
    }
}
