package au.com.woolworths.feature.shop.myorders.orders;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "NetworkError", "ServerError", "NoOrders", "PastOrderEmptyState", "PastOrderNetworkErrorState", "PastOrderServerErrorState", "ServerErrorWithMessage", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$NetworkError;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$NoOrders;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$PastOrderEmptyState;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$PastOrderNetworkErrorState;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$PastOrderServerErrorState;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$ServerError;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$ServerErrorWithMessage;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OrdersFullPageErrorState implements FullPageErrorCause {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$NetworkError;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkError extends OrdersFullPageErrorState {
        public static final NetworkError d = new NetworkError();

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.empty_connection_error;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        /* renamed from: getMessage */
        public final Text getD() {
            return new ResText(R.string.orders_network_error_subtitle);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.my_orders_network_error_heading);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$NoOrders;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoOrders extends OrdersFullPageErrorState {
        public static final NoOrders d = new NoOrders();

        @Override // au.com.woolworths.feature.shop.myorders.orders.OrdersFullPageErrorState
        public final boolean a() {
            return true;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.ic_order_not_found;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        /* renamed from: getMessage */
        public final Text getD() {
            return new ResText(R.string.orders_no_order_message);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.orders_no_order_title);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$PastOrderEmptyState;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PastOrderEmptyState extends OrdersFullPageErrorState {
        public static final PastOrderEmptyState d = new PastOrderEmptyState();

        @Override // au.com.woolworths.feature.shop.myorders.orders.OrdersFullPageErrorState
        public final boolean a() {
            return true;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.ic_order_not_found;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        /* renamed from: getMessage */
        public final Text getD() {
            return new ResText(R.string.orders_past_order_empty_message);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.orders_past_order_empty_title);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$PastOrderNetworkErrorState;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PastOrderNetworkErrorState extends OrdersFullPageErrorState {
        public static final PastOrderNetworkErrorState d = new PastOrderNetworkErrorState();

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.ic_order_network_error;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        /* renamed from: getMessage */
        public final Text getD() {
            return new ResText(R.string.order_history_past_orders_network_error_message);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.order_history_past_orders_network_error_heading);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$PastOrderServerErrorState;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PastOrderServerErrorState extends OrdersFullPageErrorState {
        public static final PastOrderServerErrorState d = new PastOrderServerErrorState();

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.ic_order_server_error;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        /* renamed from: getMessage */
        public final Text getD() {
            return new ResText(R.string.order_history_past_orders_server_error_message);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.order_history_past_orders_server_error_heading);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$ServerError;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerError extends OrdersFullPageErrorState {
        public static final ServerError d = new ServerError();

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.empty_server_error;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        /* renamed from: getMessage */
        public final Text getD() {
            return new ResText(R.string.orders_server_error_subtitle);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.server_error_heading);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState$ServerErrorWithMessage;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersFullPageErrorState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServerErrorWithMessage extends OrdersFullPageErrorState {
        public final String d;
        public final String e;

        public ServerErrorWithMessage(String str, String str2) {
            this.d = str;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServerErrorWithMessage)) {
                return false;
            }
            ServerErrorWithMessage serverErrorWithMessage = (ServerErrorWithMessage) obj;
            return Intrinsics.c(this.d, serverErrorWithMessage.d) && Intrinsics.c(this.e, serverErrorWithMessage.e);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.cmo_error_state;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        /* renamed from: getMessage */
        public final Text getD() {
            return new PlainText(this.e);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new PlainText(this.d);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return a.j("ServerErrorWithMessage(title=", this.d, ", message=", this.e, ")");
        }
    }

    public boolean a() {
        return false;
    }
}
