package au.com.woolworths.feature.shop.myorders.details;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OrderDetailsFullPageErrorState implements FullPageErrorCause {
    public static final OrderDetailsFullPageErrorState d;
    public static final OrderDetailsFullPageErrorState e;
    public static final OrderDetailsFullPageErrorState f;
    public static final /* synthetic */ OrderDetailsFullPageErrorState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        OrderDetailsFullPageErrorState orderDetailsFullPageErrorState = new OrderDetailsFullPageErrorState() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsFullPageErrorState.NETWORK_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_order_network_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.order_details_network_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = orderDetailsFullPageErrorState;
        OrderDetailsFullPageErrorState orderDetailsFullPageErrorState2 = new OrderDetailsFullPageErrorState() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsFullPageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_order_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.order_details_server_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.server_error_heading);
            }
        };
        e = orderDetailsFullPageErrorState2;
        OrderDetailsFullPageErrorState orderDetailsFullPageErrorState3 = new OrderDetailsFullPageErrorState() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsFullPageErrorState.NOT_FOUND_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_order_not_found;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.order_details_not_found_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.refresh_button;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.order_details_not_found_error_heading);
            }
        };
        f = orderDetailsFullPageErrorState3;
        OrderDetailsFullPageErrorState[] orderDetailsFullPageErrorStateArr = {orderDetailsFullPageErrorState, orderDetailsFullPageErrorState2, orderDetailsFullPageErrorState3};
        g = orderDetailsFullPageErrorStateArr;
        h = EnumEntriesKt.a(orderDetailsFullPageErrorStateArr);
    }

    public static OrderDetailsFullPageErrorState valueOf(String str) {
        return (OrderDetailsFullPageErrorState) Enum.valueOf(OrderDetailsFullPageErrorState.class, str);
    }

    public static OrderDetailsFullPageErrorState[] values() {
        return (OrderDetailsFullPageErrorState[]) g.clone();
    }
}
