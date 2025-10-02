package au.com.woolworths.feature.shop.recipes.freshmag.content.domain;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.recipes.freshmag.FreshMagScreen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentAction;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FreshMagContentAction implements Action {
    public static final FreshMagContentAction e;
    public static final FreshMagContentAction f;
    public static final FreshMagContentAction g;
    public static final FreshMagContentAction h;
    public static final FreshMagContentAction i;
    public static final FreshMagContentAction j;
    public static final /* synthetic */ FreshMagContentAction[] k;
    public static final /* synthetic */ EnumEntries l;
    public final Screen d = FreshMagScreen.d;

    static {
        FreshMagContentAction freshMagContentAction = new FreshMagContentAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentAction.API_CONTENT_UNAVAILABLE
            public final Category m = Category.v;
            public final String n = "Content Unavailable";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.m;
            }
        };
        e = freshMagContentAction;
        FreshMagContentAction freshMagContentAction2 = new FreshMagContentAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentAction.API_NETWORK_ERROR
            public final Category m = Category.v;
            public final String n = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.m;
            }
        };
        f = freshMagContentAction2;
        FreshMagContentAction freshMagContentAction3 = new FreshMagContentAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentAction.API_SERVER_ERROR
            public final Category m = Category.v;
            public final String n = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.m;
            }
        };
        g = freshMagContentAction3;
        FreshMagContentAction freshMagContentAction4 = new FreshMagContentAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentAction.CAROUSEL_SWIPE_LEFT
            public final Category m = Category.n;
            public final String n = "Swipe Left";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.m;
            }
        };
        h = freshMagContentAction4;
        FreshMagContentAction freshMagContentAction5 = new FreshMagContentAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentAction.CAROUSEL_SWIPE_RIGHT
            public final Category m = Category.n;
            public final String n = "Swipe Right";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.m;
            }
        };
        i = freshMagContentAction5;
        FreshMagContentAction freshMagContentAction6 = new FreshMagContentAction() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentAction.DATA_LOADED
            public final Category m = Category.B;
            public final String n = "Fresh Ideas Magazine Data Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getQ() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getP() {
                return this.m;
            }
        };
        j = freshMagContentAction6;
        FreshMagContentAction[] freshMagContentActionArr = {freshMagContentAction, freshMagContentAction2, freshMagContentAction3, freshMagContentAction4, freshMagContentAction5, freshMagContentAction6};
        k = freshMagContentActionArr;
        l = EnumEntriesKt.a(freshMagContentActionArr);
    }

    public FreshMagContentAction(String str, int i2) {
    }

    public static FreshMagContentAction valueOf(String str) {
        return (FreshMagContentAction) Enum.valueOf(FreshMagContentAction.class, str);
    }

    public static FreshMagContentAction[] values() {
        return (FreshMagContentAction[]) k.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
