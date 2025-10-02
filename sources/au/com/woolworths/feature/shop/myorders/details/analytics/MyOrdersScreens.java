package au.com.woolworths.feature.shop.myorders.details.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/analytics/MyOrdersScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MyOrdersScreens implements Screen {
    public static final MyOrdersScreens d;
    public static final MyOrdersScreens e;
    public static final MyOrdersScreens f;
    public static final MyOrdersScreens g;
    public static final MyOrdersScreens h;
    public static final MyOrdersScreens i;
    public static final /* synthetic */ MyOrdersScreens[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        MyOrdersScreens myOrdersScreens = new MyOrdersScreens() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens.EDIT_ORDER_CONDITIONS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "My Orders";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Change My Order Conditions screen";
            }
        };
        d = myOrdersScreens;
        MyOrdersScreens myOrdersScreens2 = new MyOrdersScreens() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens.LOCATION_PERMISSION_PRIMING
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "My Orders";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Location Priming screen";
            }
        };
        e = myOrdersScreens2;
        MyOrdersScreens myOrdersScreens3 = new MyOrdersScreens() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens.MY_ORDERS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "My Orders";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "My Orders screen";
            }
        };
        f = myOrdersScreens3;
        MyOrdersScreens myOrdersScreens4 = new MyOrdersScreens() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens.ORDER_CANCEL
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "My Orders";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Cancel Order screen";
            }
        };
        g = myOrdersScreens4;
        MyOrdersScreens myOrdersScreens5 = new MyOrdersScreens() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens.ORDER_DETAILS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "My Orders";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "orderdetails_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Order Details screen";
            }
        };
        h = myOrdersScreens5;
        MyOrdersScreens myOrdersScreens6 = new MyOrdersScreens() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens.YOUR_GROCERIES
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "My Orders";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "yourgroceries_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Your Groceries Screen";
            }
        };
        i = myOrdersScreens6;
        MyOrdersScreens[] myOrdersScreensArr = {myOrdersScreens, myOrdersScreens2, myOrdersScreens3, myOrdersScreens4, myOrdersScreens5, myOrdersScreens6, new MyOrdersScreens() { // from class: au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens.YOUR_ORDER
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "My Orders";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "yourorder_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Your Order screen";
            }
        }};
        j = myOrdersScreensArr;
        k = EnumEntriesKt.a(myOrdersScreensArr);
    }

    public static MyOrdersScreens valueOf(String str) {
        return (MyOrdersScreens) Enum.valueOf(MyOrdersScreens.class, str);
    }

    public static MyOrdersScreens[] values() {
        return (MyOrdersScreens[]) j.clone();
    }
}
