package au.com.woolworths.feature.shop.myorders;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/MyOrdersFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class MyOrdersFeature implements Feature {
    public static final MyOrdersFeature d;
    public static final MyOrdersFeature e;
    public static final MyOrdersFeature f;
    public static final MyOrdersFeature g;
    public static final MyOrdersFeature h;
    public static final MyOrdersFeature i;
    public static final MyOrdersFeature j;
    public static final MyOrdersFeature k;
    public static final MyOrdersFeature l;
    public static final MyOrdersFeature m;
    public static final MyOrdersFeature n;
    public static final MyOrdersFeature o;
    public static final MyOrdersFeature p;
    public static final /* synthetic */ MyOrdersFeature[] q;
    public static final /* synthetic */ EnumEntries r;

    static {
        MyOrdersFeature myOrdersFeature = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_ASYNC_CHAT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_async_chat";
            }

            @Override // au.com.woolworths.feature.shop.myorders.MyOrdersFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = myOrdersFeature;
        MyOrdersFeature myOrdersFeature2 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_CHANGE_MY_ORDER_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_change_my_order_popup_uplift";
            }

            @Override // au.com.woolworths.feature.shop.myorders.MyOrdersFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = myOrdersFeature2;
        MyOrdersFeature myOrdersFeature3 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_CURRENT_DELIVERY_ORDER_OVERVIEW_REDESIGN
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_current_delivery_order_overview_redesign";
            }
        };
        f = myOrdersFeature3;
        MyOrdersFeature myOrdersFeature4 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_DELIVERY_METHOD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_delivery_method";
            }

            @Override // au.com.woolworths.feature.shop.myorders.MyOrdersFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        g = myOrdersFeature4;
        MyOrdersFeature myOrdersFeature5 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_DRIVER_RATING
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_driver_rating";
            }

            @Override // au.com.woolworths.feature.shop.myorders.MyOrdersFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        h = myOrdersFeature5;
        MyOrdersFeature myOrdersFeature6 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_FLEET_LIVE_TRACKING
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_fleet_live_tracking";
            }

            @Override // au.com.woolworths.feature.shop.myorders.MyOrdersFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        i = myOrdersFeature6;
        MyOrdersFeature myOrdersFeature7 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_HANDOVER_INFO
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_handover_info";
            }

            @Override // au.com.woolworths.feature.shop.myorders.MyOrdersFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        j = myOrdersFeature7;
        MyOrdersFeature myOrdersFeature8 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_P2P_LIVE_TRACKING
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_p2p_live_tracking";
            }

            @Override // au.com.woolworths.feature.shop.myorders.MyOrdersFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        k = myOrdersFeature8;
        MyOrdersFeature myOrdersFeature9 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_PICKUP_AUTO_REFRESH
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_pickup_auto_refresh";
            }
        };
        l = myOrdersFeature9;
        MyOrdersFeature myOrdersFeature10 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_REDESIGN
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_redesign";
            }
        };
        MyOrdersFeature myOrdersFeature11 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_SPLIT_ORDER_FULFILMENT_DETAILS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_split_order_fulfilment_details";
            }
        };
        m = myOrdersFeature11;
        MyOrdersFeature myOrdersFeature12 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_STATUS_TIMELINE_REDESIGN
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_status_timeline_redesign";
            }

            @Override // au.com.woolworths.feature.shop.myorders.MyOrdersFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        n = myOrdersFeature12;
        MyOrdersFeature myOrdersFeature13 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_STORE_DETAILS_REDESIGN
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_store_details_redesign";
            }

            @Override // au.com.woolworths.feature.shop.myorders.MyOrdersFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        o = myOrdersFeature13;
        MyOrdersFeature myOrdersFeature14 = new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.ORDER_DETAILS_YOUR_GROCERIES_ROW_REDESIGN
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_details_your_groceries_redesign";
            }

            @Override // au.com.woolworths.feature.shop.myorders.MyOrdersFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        p = myOrdersFeature14;
        MyOrdersFeature[] myOrdersFeatureArr = {myOrdersFeature, myOrdersFeature2, myOrdersFeature3, myOrdersFeature4, myOrdersFeature5, myOrdersFeature6, myOrdersFeature7, myOrdersFeature8, myOrdersFeature9, myOrdersFeature10, myOrdersFeature11, myOrdersFeature12, myOrdersFeature13, myOrdersFeature14, new MyOrdersFeature() { // from class: au.com.woolworths.feature.shop.myorders.MyOrdersFeature.WITH_PICKUP_SERVICE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_pickup_service";
            }

            @Override // au.com.woolworths.feature.shop.myorders.MyOrdersFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        }};
        q = myOrdersFeatureArr;
        r = EnumEntriesKt.a(myOrdersFeatureArr);
    }

    public static MyOrdersFeature valueOf(String str) {
        return (MyOrdersFeature) Enum.valueOf(MyOrdersFeature.class, str);
    }

    public static MyOrdersFeature[] values() {
        return (MyOrdersFeature[]) q.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public boolean getDefaultValue() {
        return false;
    }
}
