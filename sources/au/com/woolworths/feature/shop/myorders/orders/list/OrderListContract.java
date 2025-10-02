package au.com.woolworths.feature.shop.myorders.orders.list;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.myorders.orders.OrdersFullPageErrorState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract;", "", "ViewState", "Action", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderListContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$Action;", "", "ShowErrorMessage", "LaunchOrderDetails", "LaunchSeeAllWebOrders", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$Action$LaunchOrderDetails;", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$Action$LaunchSeeAllWebOrders;", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$Action$ShowErrorMessage;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$Action$LaunchOrderDetails;", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$Action;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchOrderDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f7870a;

            public LaunchOrderDetails(String str) {
                this.f7870a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchOrderDetails) && Intrinsics.c(this.f7870a, ((LaunchOrderDetails) obj).f7870a);
            }

            public final int hashCode() {
                return this.f7870a.hashCode();
            }

            public final String toString() {
                return a.h("LaunchOrderDetails(id=", this.f7870a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$Action$LaunchSeeAllWebOrders;", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$Action;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchSeeAllWebOrders extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSeeAllWebOrders f7871a = new LaunchSeeAllWebOrders();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$Action$ShowErrorMessage;", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$Action;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowErrorMessage extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f7872a;

            public ShowErrorMessage(ResText resText) {
                this.f7872a = resText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowErrorMessage) && this.f7872a.equals(((ShowErrorMessage) obj).f7872a);
            }

            public final int hashCode() {
                return this.f7872a.hashCode();
            }

            public final String toString() {
                return "ShowErrorMessage(text=" + this.f7872a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListContract$ViewState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7873a;
        public final List b;
        public final OrdersFullPageErrorState c;
        public final Integer d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final ArrayList i;

        public /* synthetic */ ViewState(boolean z, List list, OrdersFullPageErrorState ordersFullPageErrorState, Integer num, int i) {
            this(z, list, ordersFullPageErrorState, (i & 16) != 0 ? null : num, false);
        }

        public static ViewState a(ViewState viewState, boolean z, OrdersFullPageErrorState ordersFullPageErrorState, boolean z2, int i) {
            List feeds = viewState.b;
            if ((i & 8) != 0) {
                ordersFullPageErrorState = viewState.c;
            }
            OrdersFullPageErrorState ordersFullPageErrorState2 = ordersFullPageErrorState;
            Integer num = viewState.d;
            if ((i & 32) != 0) {
                z2 = viewState.e;
            }
            Intrinsics.h(feeds, "feeds");
            return new ViewState(z, feeds, ordersFullPageErrorState2, num, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7873a == viewState.f7873a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && this.e == viewState.e;
        }

        public final int hashCode() {
            int iD = b.d(b.e(Boolean.hashCode(this.f7873a) * 31, 31, false), 31, this.b);
            OrdersFullPageErrorState ordersFullPageErrorState = this.c;
            int iHashCode = (iD + (ordersFullPageErrorState == null ? 0 : ordersFullPageErrorState.hashCode())) * 31;
            Integer num = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isRefreshing=");
            sb.append(this.f7873a);
            sb.append(", isRefreshingOnSwipe=false, feeds=");
            sb.append(this.b);
            sb.append(", errorState=");
            sb.append(this.c);
            sb.append(", nextPage=");
            sb.append(this.d);
            sb.append(", retryNextPage=");
            return a.k(")", sb, this.e);
        }

        public ViewState(boolean z, List list, OrdersFullPageErrorState ordersFullPageErrorState, Integer num, boolean z2) {
            this.f7873a = z;
            this.b = list;
            this.c = ordersFullPageErrorState;
            this.d = num;
            this.e = z2;
            boolean z3 = false;
            this.f = ordersFullPageErrorState == null;
            this.g = ordersFullPageErrorState != null;
            if (ordersFullPageErrorState != null && ordersFullPageErrorState.a()) {
                z3 = true;
            }
            this.h = z3;
            this.i = CollectionsKt.c0((num == null || !z2) ? num != null ? CollectionsKt.Q(new OrderListLoader(num.intValue())) : EmptyList.d : CollectionsKt.Q(new OrderListTryAgain(num.intValue())), list);
        }
    }
}
