package au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/analytics/PickUpLocationResultActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PickUpLocationResultActions implements Action {
    public static final PickUpLocationResultActions d;
    public static final PickUpLocationResultActions e;
    public static final PickUpLocationResultActions f;
    public static final /* synthetic */ PickUpLocationResultActions[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        PickUpLocationResultActions pickUpLocationResultActions = new PickUpLocationResultActions() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.analytics.PickUpLocationResultActions.NETWORK_ERROR_IMPRESSION
            public final Screen i = Screens.r;
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
        d = pickUpLocationResultActions;
        PickUpLocationResultActions pickUpLocationResultActions2 = new PickUpLocationResultActions() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.analytics.PickUpLocationResultActions.SERVER_ERROR_IMPRESSION
            public final Screen i = Screens.r;
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
        e = pickUpLocationResultActions2;
        PickUpLocationResultActions pickUpLocationResultActions3 = new PickUpLocationResultActions() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.analytics.PickUpLocationResultActions.ON_TRY_AGAIN_CLICKED
            public final Screen i = Screens.r;
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
        f = pickUpLocationResultActions3;
        PickUpLocationResultActions[] pickUpLocationResultActionsArr = {pickUpLocationResultActions, pickUpLocationResultActions2, pickUpLocationResultActions3};
        g = pickUpLocationResultActionsArr;
        h = EnumEntriesKt.a(pickUpLocationResultActionsArr);
    }

    public static PickUpLocationResultActions valueOf(String str) {
        return (PickUpLocationResultActions) Enum.valueOf(PickUpLocationResultActions.class, str);
    }

    public static PickUpLocationResultActions[] values() {
        return (PickUpLocationResultActions[]) g.clone();
    }
}
