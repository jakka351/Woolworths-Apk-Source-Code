package au.com.woolworths.feature.shop.storelocator.legacy.pickup.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/analytics/PickUpLocatorActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PickUpLocatorActions implements Action {
    public static final PickUpLocatorActions d;
    public static final PickUpLocatorActions e;
    public static final PickUpLocatorActions f;
    public static final /* synthetic */ PickUpLocatorActions[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        PickUpLocatorActions pickUpLocatorActions = new PickUpLocatorActions() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.analytics.PickUpLocatorActions.NETWORK_ERROR_IMPRESSION
            public final Screen i = Screens.q;
            public final Category j = Category.v;
            public final String k = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.Action
            /* renamed from: f, reason: from getter */
            public final Screen getI() {
                return this.i;
            }
        };
        d = pickUpLocatorActions;
        PickUpLocatorActions pickUpLocatorActions2 = new PickUpLocatorActions() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.analytics.PickUpLocatorActions.SERVER_ERROR_IMPRESSION
            public final Screen i = Screens.q;
            public final Category j = Category.v;
            public final String k = "API Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.Action
            /* renamed from: f, reason: from getter */
            public final Screen getI() {
                return this.i;
            }
        };
        e = pickUpLocatorActions2;
        PickUpLocatorActions pickUpLocatorActions3 = new PickUpLocatorActions() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.analytics.PickUpLocatorActions.ON_TRY_AGAIN_CLICKED
            public final Screen i = Screens.q;
            public final Category j = Category.m;
            public final String k = "Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.Action
            /* renamed from: f, reason: from getter */
            public final Screen getI() {
                return this.i;
            }
        };
        f = pickUpLocatorActions3;
        PickUpLocatorActions[] pickUpLocatorActionsArr = {pickUpLocatorActions, pickUpLocatorActions2, pickUpLocatorActions3};
        g = pickUpLocatorActionsArr;
        h = EnumEntriesKt.a(pickUpLocatorActionsArr);
    }

    public static PickUpLocatorActions valueOf(String str) {
        return (PickUpLocatorActions) Enum.valueOf(PickUpLocatorActions.class, str);
    }

    public static PickUpLocatorActions[] values() {
        return (PickUpLocatorActions[]) g.clone();
    }
}
