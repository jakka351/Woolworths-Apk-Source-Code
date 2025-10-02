package au.com.woolworths.feature.shop.myorders.orders;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.orders.data.DeliveryOrder;
import au.com.woolworths.feature.shop.myorders.orders.data.PickUpOrder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract;", "", "ViewState", "Actions", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OrdersContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions;", "", "OpenStoreInMaps", "ShowErrorMessage", "ShowAttendantAppOffMessage", "LaunchLogin", "LaunchProducts", "LaunchSeeAllWebOrders", "LaunchPickUpOrderDetails", "LaunchDeliveryOrderDetails", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$LaunchDeliveryOrderDetails;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$LaunchPickUpOrderDetails;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$LaunchProducts;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$LaunchSeeAllWebOrders;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$OpenStoreInMaps;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$ShowAttendantAppOffMessage;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$ShowErrorMessage;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$LaunchDeliveryOrderDetails;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeliveryOrderDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final DeliveryOrder f7854a;

            public LaunchDeliveryOrderDetails(DeliveryOrder order) {
                Intrinsics.h(order, "order");
                this.f7854a = order;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeliveryOrderDetails) && Intrinsics.c(this.f7854a, ((LaunchDeliveryOrderDetails) obj).f7854a);
            }

            public final int hashCode() {
                return this.f7854a.hashCode();
            }

            public final String toString() {
                return "LaunchDeliveryOrderDetails(order=" + this.f7854a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchLogin extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogin f7855a = new LaunchLogin();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$LaunchPickUpOrderDetails;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchPickUpOrderDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PickUpOrder f7856a;

            public LaunchPickUpOrderDetails(PickUpOrder order) {
                Intrinsics.h(order, "order");
                this.f7856a = order;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchPickUpOrderDetails) && Intrinsics.c(this.f7856a, ((LaunchPickUpOrderDetails) obj).f7856a);
            }

            public final int hashCode() {
                return this.f7856a.hashCode();
            }

            public final String toString() {
                return "LaunchPickUpOrderDetails(order=" + this.f7856a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$LaunchProducts;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchProducts extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchProducts f7857a = new LaunchProducts();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$LaunchSeeAllWebOrders;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchSeeAllWebOrders extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSeeAllWebOrders f7858a = new LaunchSeeAllWebOrders();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$OpenStoreInMaps;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenStoreInMaps extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7859a;

            public OpenStoreInMaps(String str) {
                this.f7859a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenStoreInMaps) && Intrinsics.c(this.f7859a, ((OpenStoreInMaps) obj).f7859a);
            }

            public final int hashCode() {
                return this.f7859a.hashCode();
            }

            public final String toString() {
                return a.h("OpenStoreInMaps(address=", this.f7859a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$ShowAttendantAppOffMessage;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowAttendantAppOffMessage extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowAttendantAppOffMessage);
            }

            public final int hashCode() {
                Integer.hashCode(0);
                throw null;
            }

            public final String toString() {
                return "ShowAttendantAppOffMessage(messageResId=0, collectionMode=null)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions$ShowErrorMessage;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowErrorMessage extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowErrorMessage);
            }

            public final int hashCode() {
                return Integer.hashCode(0);
            }

            public final String toString() {
                return "ShowErrorMessage(messageResId=0)";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersContract$ViewState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final List f7860a;
        public final boolean b;

        public ViewState(List list) {
            this.f7860a = list;
            this.b = list.size() > 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f7860a, ((ViewState) obj).f7860a);
        }

        public final int hashCode() {
            return this.f7860a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.l("ViewState(orderTabs=", ")", this.f7860a);
        }
    }
}
