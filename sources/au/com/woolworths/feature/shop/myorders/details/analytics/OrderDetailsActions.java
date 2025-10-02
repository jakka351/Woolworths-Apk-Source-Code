package au.com.woolworths.feature.shop.myorders.details.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/analytics/OrderDetailsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OrderDetailsActions implements Action {
    public static final OrderDetailsActions A;
    public static final OrderDetailsActions B;
    public static final OrderDetailsActions C;
    public static final OrderDetailsActions D;
    public static final OrderDetailsActions E;
    public static final OrderDetailsActions F;
    public static final OrderDetailsActions G;
    public static final OrderDetailsActions H;
    public static final OrderDetailsActions I;
    public static final OrderDetailsActions J;
    public static final OrderDetailsActions K;
    public static final OrderDetailsActions L;
    public static final OrderDetailsActions M;
    public static final OrderDetailsActions N;
    public static final OrderDetailsActions O;
    public static final OrderDetailsActions P;
    public static final OrderDetailsActions Q;
    public static final OrderDetailsActions R;
    public static final OrderDetailsActions S;
    public static final OrderDetailsActions T;
    public static final OrderDetailsActions U;
    public static final OrderDetailsActions V;
    public static final OrderDetailsActions W;
    public static final OrderDetailsActions X;
    public static final OrderDetailsActions Y;
    public static final OrderDetailsActions Z;
    public static final OrderDetailsActions a0;
    public static final OrderDetailsActions b0;
    public static final /* synthetic */ OrderDetailsActions[] c0;
    public static final /* synthetic */ EnumEntries d0;
    public static final OrderDetailsActions e;
    public static final OrderDetailsActions f;
    public static final OrderDetailsActions g;
    public static final OrderDetailsActions h;
    public static final OrderDetailsActions i;
    public static final OrderDetailsActions j;
    public static final OrderDetailsActions k;
    public static final OrderDetailsActions l;
    public static final OrderDetailsActions m;
    public static final OrderDetailsActions n;
    public static final OrderDetailsActions o;
    public static final OrderDetailsActions p;
    public static final OrderDetailsActions q;
    public static final OrderDetailsActions r;
    public static final OrderDetailsActions s;
    public static final OrderDetailsActions t;
    public static final OrderDetailsActions u;
    public static final OrderDetailsActions v;
    public static final OrderDetailsActions w;
    public static final OrderDetailsActions x;
    public static final OrderDetailsActions y;
    public static final OrderDetailsActions z;
    public final MyOrdersScreens d = MyOrdersScreens.h;

    static {
        OrderDetailsActions orderDetailsActions = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CANCEL_BUTTON_START_CLICK
            public final Category e0 = Category.m;
            public final String f0 = "Cancel Button Tap - Start";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        e = orderDetailsActions;
        OrderDetailsActions orderDetailsActions2 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CANCEL_IMPRESSION
            public final Category e0 = Category.B;
            public final String f0 = "Cancel Button Impression";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        f = orderDetailsActions2;
        OrderDetailsActions orderDetailsActions3 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CANCEL_SUCCESS
            public final Category e0 = Category.g0;
            public final String f0 = "Order Cancellation Confirmation";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        g = orderDetailsActions3;
        OrderDetailsActions orderDetailsActions4 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CHANGE_MY_ORDER_BUTTON_CLICK
            public final Category e0 = Category.m;
            public final String f0 = "Change My Order Button";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        h = orderDetailsActions4;
        OrderDetailsActions orderDetailsActions5 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CHANGE_MY_ORDER_BUTTON_IMPRESSION
            public final Category e0 = Category.B;
            public final String f0 = "Change My Order Button Impression";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        i = orderDetailsActions5;
        OrderDetailsActions orderDetailsActions6 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CHANGE_MY_ORDER_FATAL_ERROR
            public final Category e0 = Category.v;
            public final String f0 = "Change My Order";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        j = orderDetailsActions6;
        OrderDetailsActions orderDetailsActions7 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CHAT_TO_OLIVE
            public final Category e0 = Category.D;
            public final String f0 = "Chat to Olive";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        k = orderDetailsActions7;
        OrderDetailsActions orderDetailsActions8 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CHECK_IN_15_TAPPED
            public final Category e0 = Category.m;
            public final String f0 = "I'm 15 mins away";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        l = orderDetailsActions8;
        OrderDetailsActions orderDetailsActions9 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CHECK_IN_ERROR_IMPRESSION
            public final Category e0 = Category.v;
            public final String f0 = "Check in Api call failure";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        m = orderDetailsActions9;
        OrderDetailsActions orderDetailsActions10 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CHECK_IN_NOW_TAPPED
            public final Category e0 = Category.m;
            public final String f0 = "I'm Here";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        n = orderDetailsActions10;
        OrderDetailsActions orderDetailsActions11 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CHECK_IN_ON_MY_WAY_ERROR_IMPRESSION
            public final Category e0 = Category.v;
            public final String f0 = "Check in on my way Api failure";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        o = orderDetailsActions11;
        OrderDetailsActions orderDetailsActions12 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CHECK_IN_ON_MY_WAY_TAPPED
            public final Category e0 = Category.m;
            public final String f0 = "I'm on my way";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        p = orderDetailsActions12;
        OrderDetailsActions orderDetailsActions13 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.COACH_MARK_IMPRESSION
            public final Category e0 = Category.r;
            public final String f0 = "Coachmark loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        q = orderDetailsActions13;
        OrderDetailsActions orderDetailsActions14 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.CONTACT_US
            public final Category e0 = Category.D;
            public final String f0 = "Contact Us - Pick up info";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        r = orderDetailsActions14;
        OrderDetailsActions orderDetailsActions15 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.COPY_ORDER_NUMBER_CLICK
            public final Category e0 = Category.m;
            public final String f0 = "Copy order number";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        s = orderDetailsActions15;
        OrderDetailsActions orderDetailsActions16 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.DRIVING_DIRECTIONS
            public final Category e0 = Category.m;
            public final String f0 = "Driving directions";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        t = orderDetailsActions16;
        OrderDetailsActions orderDetailsActions17 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.EDIT_DRIVER_INSTRUCTIONS_CLICK
            public final Category e0 = Category.m;
            public final String f0 = "Edit Driver Instruction - Start";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        u = orderDetailsActions17;
        OrderDetailsActions orderDetailsActions18 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.EDIT_DRIVER_INSTRUCTIONS_DISABLED
            public final Category e0 = Category.B;
            public final String f0 = "Edit Driver Instruction - Disabled";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        v = orderDetailsActions18;
        OrderDetailsActions orderDetailsActions19 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.EDIT_DRIVER_INSTRUCTIONS_ENABLED
            public final Category e0 = Category.B;
            public final String f0 = "Edit Driver Instruction - Enabled";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        w = orderDetailsActions19;
        OrderDetailsActions orderDetailsActions20 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.EDIT_DRIVER_INSTRUCTIONS_FAILURE_WINDOW_CLOSED
            public final Category e0 = Category.N;
            public final String f0 = "Edit Driver Instruction - Failure Window Closed";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        x = orderDetailsActions20;
        OrderDetailsActions orderDetailsActions21 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.EDIT_DRIVER_INSTRUCTIONS_SUCCESS
            public final Category e0 = Category.O;
            public final String f0 = "Edit Driver Instruction - Success";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        y = orderDetailsActions21;
        OrderDetailsActions orderDetailsActions22 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.LEAVE_UNATTENDED_EDIT_WINDOW_CLOSED_ERROR
            public final Category e0 = Category.P;
            public final String f0 = "Leave Unattended - Failure Window Closed";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        z = orderDetailsActions22;
        OrderDetailsActions orderDetailsActions23 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.LEAVE_UNATTENDED_NETWORK_ERROR
            public final Category e0 = Category.v;
            public final String f0 = "Leave Unattended - Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        A = orderDetailsActions23;
        OrderDetailsActions orderDetailsActions24 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.LEAVE_UNATTENDED_SERVER_ERROR
            public final Category e0 = Category.v;
            public final String f0 = "Leave Unattended - Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        B = orderDetailsActions24;
        OrderDetailsActions orderDetailsActions25 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.LEAVE_UNATTENDED_SUCCESS
            public final Category e0 = Category.Q;
            public final String f0 = "Leave Unattended - Success";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        C = orderDetailsActions25;
        OrderDetailsActions orderDetailsActions26 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.LOCATION_TRACKING_OFF
            public final Category e0 = Category.E;
            public final String f0 = "Pickup Location Tracking";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        D = orderDetailsActions26;
        OrderDetailsActions orderDetailsActions27 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.LOCATION_TRACKING_ON
            public final Category e0 = Category.F;
            public final String f0 = "Pickup Location Tracking";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        E = orderDetailsActions27;
        OrderDetailsActions orderDetailsActions28 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.LOCATION_TRACKING_STATUS_IMPRESSION
            public final Category e0 = Category.B;
            public final String f0 = "Location Tracking Status";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        F = orderDetailsActions28;
        OrderDetailsActions orderDetailsActions29 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.LOCATION_TRACKING_UPDATE_ERROR
            public final Category e0 = Category.c0;
            public final String f0 = "Pickup Location Tracking";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        G = orderDetailsActions29;
        OrderDetailsActions orderDetailsActions30 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.NETWORK_ERROR
            public final Category e0 = Category.v;
            public final String f0 = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        H = orderDetailsActions30;
        OrderDetailsActions orderDetailsActions31 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.NOT_FOUND_ERROR
            public final Category e0 = Category.v;
            public final String f0 = "30sec delay Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        I = orderDetailsActions31;
        OrderDetailsActions orderDetailsActions32 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.ORDER_DETAILS_BANNER_IMPRESSION
            public final Category e0 = Category.h;
            public final String f0 = "Order Details Banner";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        J = orderDetailsActions32;
        OrderDetailsActions orderDetailsActions33 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.ORDER_DETAILS_DELIGHT_ANIMATION_IMPRESSION
            public final Category e0 = Category.B;
            public final String f0 = "Order Details Delight Animation";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        K = orderDetailsActions33;
        OrderDetailsActions orderDetailsActions34 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.ORDER_DETAILS_LOADED
            public final Category e0 = Category.B;
            public final String f0 = "Order Details Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        L = orderDetailsActions34;
        OrderDetailsActions orderDetailsActions35 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.PARKING_GUIDE
            public final Category e0 = Category.m;
            public final String f0 = "Parking guide";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        M = orderDetailsActions35;
        OrderDetailsActions orderDetailsActions36 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.PROGRESS_STEPPER_INFO_ICON_CLICK
            public final Category e0 = Category.m;
            public final String f0 = "Progress Stepper Tool Tip";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        N = orderDetailsActions36;
        OrderDetailsActions orderDetailsActions37 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.PROOF_OF_DELIVERY_BANNER_IMPRESSION
            public final Category e0 = Category.U;
            public final String f0 = "Proof of delivery banner impression";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        O = orderDetailsActions37;
        OrderDetailsActions orderDetailsActions38 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.PROOF_OF_DELIVERY_CLOSE_IMAGE
            public final Category e0 = Category.V;
            public final String f0 = "Delivery close expanded image";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        P = orderDetailsActions38;
        OrderDetailsActions orderDetailsActions39 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.PROOF_OF_DELIVERY_EXPAND_IMAGE
            public final Category e0 = Category.W;
            public final String f0 = "Delivery expand image";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        Q = orderDetailsActions39;
        OrderDetailsActions orderDetailsActions40 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.PROOF_OF_DELIVERY_IMAGE_IMPRESSION
            public final Category e0 = Category.X;
            public final String f0 = "Delivery image impression";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        R = orderDetailsActions40;
        OrderDetailsActions orderDetailsActions41 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.REFRESH_NOT_FOUND_ERROR
            public final Category e0 = Category.m;
            public final String f0 = "30sec delay Error - Refresh";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        S = orderDetailsActions41;
        OrderDetailsActions orderDetailsActions42 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.SAVE_TIME_BANNER
            public final Category e0 = Category.h;
            public final String f0 = "Save Time Banner";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        T = orderDetailsActions42;
        OrderDetailsActions orderDetailsActions43 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.SEE_ALL_CLICK
            public final Category e0 = Category.m;
            public final String f0 = "See All";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        U = orderDetailsActions43;
        OrderDetailsActions orderDetailsActions44 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.SERVER_ERROR
            public final Category e0 = Category.v;
            public final String f0 = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        V = orderDetailsActions44;
        OrderDetailsActions orderDetailsActions45 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.TRY_AGAIN_NETWORK_ERROR
            public final Category e0 = Category.m;
            public final String f0 = "Network Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        W = orderDetailsActions45;
        OrderDetailsActions orderDetailsActions46 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.TRY_AGAIN_SERVER_ERROR
            public final Category e0 = Category.m;
            public final String f0 = "Server Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        X = orderDetailsActions46;
        OrderDetailsActions orderDetailsActions47 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.VIEW_INVOICE_BUTTON_CLICK
            public final Category e0 = Category.m;
            public final String f0 = "View Tax Invoice";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        Y = orderDetailsActions47;
        OrderDetailsActions orderDetailsActions48 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.VIEW_INVOICE_DOWNLOAD_NETWORK_ERROR
            public final Category e0 = Category.g0;
            public final String f0 = "Order Invoice - Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        Z = orderDetailsActions48;
        OrderDetailsActions orderDetailsActions49 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.VIEW_INVOICE_DOWNLOAD_SERVER_ERROR
            public final Category e0 = Category.g0;
            public final String f0 = "Order Invoice - Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        OrderDetailsActions orderDetailsActions50 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.VIEW_INVOICE_ERROR
            public final Category e0 = Category.g0;
            public final String f0 = "Order Invoice - Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        a0 = orderDetailsActions50;
        OrderDetailsActions orderDetailsActions51 = new OrderDetailsActions() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.VIEW_INVOICE_LOADED
            public final Category e0 = Category.B;
            public final String f0 = "Order Invoice Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.f0;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.e0;
            }
        };
        b0 = orderDetailsActions51;
        OrderDetailsActions[] orderDetailsActionsArr = {orderDetailsActions, orderDetailsActions2, orderDetailsActions3, orderDetailsActions4, orderDetailsActions5, orderDetailsActions6, orderDetailsActions7, orderDetailsActions8, orderDetailsActions9, orderDetailsActions10, orderDetailsActions11, orderDetailsActions12, orderDetailsActions13, orderDetailsActions14, orderDetailsActions15, orderDetailsActions16, orderDetailsActions17, orderDetailsActions18, orderDetailsActions19, orderDetailsActions20, orderDetailsActions21, orderDetailsActions22, orderDetailsActions23, orderDetailsActions24, orderDetailsActions25, orderDetailsActions26, orderDetailsActions27, orderDetailsActions28, orderDetailsActions29, orderDetailsActions30, orderDetailsActions31, orderDetailsActions32, orderDetailsActions33, orderDetailsActions34, orderDetailsActions35, orderDetailsActions36, orderDetailsActions37, orderDetailsActions38, orderDetailsActions39, orderDetailsActions40, orderDetailsActions41, orderDetailsActions42, orderDetailsActions43, orderDetailsActions44, orderDetailsActions45, orderDetailsActions46, orderDetailsActions47, orderDetailsActions48, orderDetailsActions49, orderDetailsActions50, orderDetailsActions51};
        c0 = orderDetailsActionsArr;
        d0 = EnumEntriesKt.a(orderDetailsActionsArr);
    }

    public OrderDetailsActions(String str, int i2) {
    }

    public static OrderDetailsActions valueOf(String str) {
        return (OrderDetailsActions) Enum.valueOf(OrderDetailsActions.class, str);
    }

    public static OrderDetailsActions[] values() {
        return (OrderDetailsActions[]) c0.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
