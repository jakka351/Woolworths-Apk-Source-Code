package au.com.woolworths.feature.shop.myorders.pickup.analytics;

import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.NotificationAction;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/pickup/analytics/PickupNotificationAction;", "Lau/com/woolworths/android/onesite/analytics/NotificationAction;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PickupNotificationAction implements NotificationAction {
    public static final PickupNotificationAction d;
    public static final PickupNotificationAction e;
    public static final PickupNotificationAction f;
    public static final /* synthetic */ PickupNotificationAction[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        PickupNotificationAction pickupNotificationAction = new PickupNotificationAction() { // from class: au.com.woolworths.feature.shop.myorders.pickup.analytics.PickupNotificationAction.ORDER_READY_IMPRESSION
            public final Category i = Category.H;
            public final String j = "Pickup Order: Ready";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.i;
            }
        };
        d = pickupNotificationAction;
        PickupNotificationAction pickupNotificationAction2 = new PickupNotificationAction() { // from class: au.com.woolworths.feature.shop.myorders.pickup.analytics.PickupNotificationAction.ORDER_ACKNOWLEDGED_IMPRESSION
            public final Category i = Category.H;
            public final String j = "Pickup Order: Acknowledged";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.i;
            }
        };
        e = pickupNotificationAction2;
        PickupNotificationAction pickupNotificationAction3 = new PickupNotificationAction() { // from class: au.com.woolworths.feature.shop.myorders.pickup.analytics.PickupNotificationAction.ORDER_DTB_ACKNOWLEDGED_IMPRESSION
            public final Category i = Category.H;
            public final String j = "Pickup Order: Acknowledged DTB";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.i;
            }
        };
        f = pickupNotificationAction3;
        PickupNotificationAction[] pickupNotificationActionArr = {pickupNotificationAction, pickupNotificationAction2, pickupNotificationAction3, new PickupNotificationAction() { // from class: au.com.woolworths.feature.shop.myorders.pickup.analytics.PickupNotificationAction.ENTER_GEOFENCE_WITH_ATTENDANT_ON_IMPRESSION
            public final Category i = Category.H;
            public final String j = "Pickup Order: Entered Geofence with Attendant Available";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.i;
            }
        }, new PickupNotificationAction() { // from class: au.com.woolworths.feature.shop.myorders.pickup.analytics.PickupNotificationAction.ENTER_GEOFENCE_WITH_ATTENDANT_OFF_IMPRESSION
            public final Category i = Category.H;
            public final String j = "Pickup Order: Entered Geofence with Attendant Unavailable";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.i;
            }
        }, new PickupNotificationAction() { // from class: au.com.woolworths.feature.shop.myorders.pickup.analytics.PickupNotificationAction.ORDER_READY_CLICK
            public final Category i = Category.G;
            public final String j = "Pickup Order: Ready";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.i;
            }
        }, new PickupNotificationAction() { // from class: au.com.woolworths.feature.shop.myorders.pickup.analytics.PickupNotificationAction.ORDER_ACKNOWLEDGED_CLICK
            public final Category i = Category.G;
            public final String j = "Pickup Order: Acknowledged";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.i;
            }
        }, new PickupNotificationAction() { // from class: au.com.woolworths.feature.shop.myorders.pickup.analytics.PickupNotificationAction.ENTER_GEOFENCE_WITH_ATTENDANT_ON_CLICK
            public final Category i = Category.G;
            public final String j = "Pickup Order: Entered Geofence with Attendant Available";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.i;
            }
        }, new PickupNotificationAction() { // from class: au.com.woolworths.feature.shop.myorders.pickup.analytics.PickupNotificationAction.ENTER_GEOFENCE_WITH_ATTENDANT_OFF_CLICK
            public final Category i = Category.G;
            public final String j = "Pickup Order: Entered Geofence with Attendant Unavailable";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.i;
            }
        }};
        g = pickupNotificationActionArr;
        h = EnumEntriesKt.a(pickupNotificationActionArr);
    }

    public static PickupNotificationAction valueOf(String str) {
        return (PickupNotificationAction) Enum.valueOf(PickupNotificationAction.class, str);
    }

    public static PickupNotificationAction[] values() {
        return (PickupNotificationAction[]) g.clone();
    }
}
