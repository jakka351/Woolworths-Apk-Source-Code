package au.com.woolworths.feature.shop.myorders.details.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/analytics/LocationPermissionPrimingActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class LocationPermissionPrimingActions implements Action {
    public static final LocationPermissionPrimingActions e;
    public static final LocationPermissionPrimingActions f;
    public static final LocationPermissionPrimingActions g;
    public static final LocationPermissionPrimingActions h;
    public static final LocationPermissionPrimingActions i;
    public static final /* synthetic */ LocationPermissionPrimingActions[] j;
    public static final /* synthetic */ EnumEntries k;
    public final MyOrdersScreens d = MyOrdersScreens.e;

    static {
        LocationPermissionPrimingActions locationPermissionPrimingActions = new LocationPermissionPrimingActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.LocationPermissionPrimingActions.SET_LOCATION_PERMISSION_BUTTON_CLICK
            public final Category l = Category.m;
            public final String m = "Set Permission";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        e = locationPermissionPrimingActions;
        LocationPermissionPrimingActions locationPermissionPrimingActions2 = new LocationPermissionPrimingActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.LocationPermissionPrimingActions.SET_LOCATION_PERMISSION_IMPRESSION
            public final Category l = Category.B;
            public final String m = "Set Permission";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        f = locationPermissionPrimingActions2;
        LocationPermissionPrimingActions locationPermissionPrimingActions3 = new LocationPermissionPrimingActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.LocationPermissionPrimingActions.UPDATE_LOCATION_PERMISSION_BUTTON_CLICK
            public final Category l = Category.m;
            public final String m = "Update Permission";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        g = locationPermissionPrimingActions3;
        LocationPermissionPrimingActions locationPermissionPrimingActions4 = new LocationPermissionPrimingActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.LocationPermissionPrimingActions.UPDATE_LOCATION_PERMISSION_IMPRESSION
            public final Category l = Category.B;
            public final String m = "Update Permission";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        h = locationPermissionPrimingActions4;
        LocationPermissionPrimingActions locationPermissionPrimingActions5 = new LocationPermissionPrimingActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.LocationPermissionPrimingActions.UPDATE_LOCATION_PERMISSION_LATER_BUTTON_CLICK
            public final Category l = Category.m;
            public final String m = "Update Maybe Later";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        i = locationPermissionPrimingActions5;
        LocationPermissionPrimingActions[] locationPermissionPrimingActionsArr = {locationPermissionPrimingActions, locationPermissionPrimingActions2, locationPermissionPrimingActions3, locationPermissionPrimingActions4, locationPermissionPrimingActions5};
        j = locationPermissionPrimingActionsArr;
        k = EnumEntriesKt.a(locationPermissionPrimingActionsArr);
    }

    public LocationPermissionPrimingActions(String str, int i2) {
    }

    public static LocationPermissionPrimingActions valueOf(String str) {
        return (LocationPermissionPrimingActions) Enum.valueOf(LocationPermissionPrimingActions.class, str);
    }

    public static LocationPermissionPrimingActions[] values() {
        return (LocationPermissionPrimingActions[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
