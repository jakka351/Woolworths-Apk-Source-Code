package au.com.woolworths.shop.checkout.ui.confirmation;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OrderConfirmationErrorState implements FullPageErrorCause {
    public static final OrderConfirmationErrorState d;
    public static final OrderConfirmationErrorState e;
    public static final /* synthetic */ OrderConfirmationErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        OrderConfirmationErrorState orderConfirmationErrorState = new OrderConfirmationErrorState() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationErrorState.CONNECTION
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.message_order_confirmation_error_network);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.title_order_confirmation_error_network);
            }
        };
        d = orderConfirmationErrorState;
        OrderConfirmationErrorState orderConfirmationErrorState2 = new OrderConfirmationErrorState() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationErrorState.SERVER
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.message_order_confirmation_error_server);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.title_order_confirmation_error_server);
            }
        };
        e = orderConfirmationErrorState2;
        OrderConfirmationErrorState[] orderConfirmationErrorStateArr = {orderConfirmationErrorState, orderConfirmationErrorState2};
        f = orderConfirmationErrorStateArr;
        g = EnumEntriesKt.a(orderConfirmationErrorStateArr);
    }

    public static OrderConfirmationErrorState valueOf(String str) {
        return (OrderConfirmationErrorState) Enum.valueOf(OrderConfirmationErrorState.class, str);
    }

    public static OrderConfirmationErrorState[] values() {
        return (OrderConfirmationErrorState[]) f.clone();
    }
}
