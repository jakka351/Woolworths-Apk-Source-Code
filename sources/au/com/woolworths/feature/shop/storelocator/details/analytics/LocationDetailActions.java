package au.com.woolworths.feature.shop.storelocator.details.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/details/analytics/LocationDetailActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class LocationDetailActions implements Action {
    public static final LocationDetailActions e;
    public static final LocationDetailActions f;
    public static final /* synthetic */ LocationDetailActions[] g;
    public static final /* synthetic */ EnumEntries h;
    public final Screen d = Screens.s;

    static {
        LocationDetailActions locationDetailActions = new LocationDetailActions() { // from class: au.com.woolworths.feature.shop.storelocator.details.analytics.LocationDetailActions.IN_STORE_BUTTON_CLICK
            public final Category i = Category.m;
            public final String j = "In Store Pick Up";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        };
        e = locationDetailActions;
        LocationDetailActions locationDetailActions2 = new LocationDetailActions() { // from class: au.com.woolworths.feature.shop.storelocator.details.analytics.LocationDetailActions.DRIVE_THRU_BUTTON_CLICK
            public final Category i = Category.m;
            public final String j = "Drive Thru Pick Up";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        };
        f = locationDetailActions2;
        LocationDetailActions[] locationDetailActionsArr = {locationDetailActions, locationDetailActions2, new LocationDetailActions() { // from class: au.com.woolworths.feature.shop.storelocator.details.analytics.LocationDetailActions.SET_AS_MY_STORE
            public final Category i = Category.m;
            public final String j = "Set as my store";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        }, new LocationDetailActions() { // from class: au.com.woolworths.feature.shop.storelocator.details.analytics.LocationDetailActions.CONTACT_NUMBER_CLICK
            public final Category i = Category.m;
            public final String j = "Call Icon";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        }, new LocationDetailActions() { // from class: au.com.woolworths.feature.shop.storelocator.details.analytics.LocationDetailActions.PICK_UP_LOCATION_IN_MAP_CLICK
            public final Category i = Category.m;
            public final String j = "Directions Icon";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        }};
        g = locationDetailActionsArr;
        h = EnumEntriesKt.a(locationDetailActionsArr);
    }

    public LocationDetailActions(String str, int i) {
    }

    public static LocationDetailActions valueOf(String str) {
        return (LocationDetailActions) Enum.valueOf(LocationDetailActions.class, str);
    }

    public static LocationDetailActions[] values() {
        return (LocationDetailActions[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
