package au.com.woolworths.shop.checkout.ui.content;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CheckoutFullPageErrorState implements FullPageErrorCause {
    public static final CheckoutFullPageErrorState d;
    public static final CheckoutFullPageErrorState e;
    public static final CheckoutFullPageErrorState f;
    public static final /* synthetic */ CheckoutFullPageErrorState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        CheckoutFullPageErrorState checkoutFullPageErrorState = new CheckoutFullPageErrorState() { // from class: au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState
            public final void a(CheckoutContentViewModel checkoutContentViewModel) {
            }

            @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState
            public final void b(CheckoutContentViewModel checkoutContentViewModel) {
                checkoutContentViewModel.x6();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.legacy_error_no_network_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getSecondaryActionRes */
            public final int getF() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = checkoutFullPageErrorState;
        CheckoutFullPageErrorState checkoutFullPageErrorState2 = new CheckoutFullPageErrorState() { // from class: au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState
            public final void a(CheckoutContentViewModel checkoutContentViewModel) {
            }

            @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState
            public final void b(CheckoutContentViewModel checkoutContentViewModel) {
                checkoutContentViewModel.x6();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.legacy_error_server_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getSecondaryActionRes */
            public final int getF() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.server_error_heading);
            }
        };
        e = checkoutFullPageErrorState2;
        CheckoutFullPageErrorState checkoutFullPageErrorState3 = new CheckoutFullPageErrorState() { // from class: au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState.NO_ITEMS_IN_CART
            @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState
            public final void a(CheckoutContentViewModel checkoutContentViewModel) {
                checkoutContentViewModel.o0();
            }

            @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState
            public final void b(CheckoutContentViewModel checkoutContentViewModel) {
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.ic_no_products_go_shopping;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.no_product_go_shopping_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getPrimaryActionRes() {
                return R.string.no_product_go_shopping_action;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.no_product_go_shopping_title);
            }
        };
        f = checkoutFullPageErrorState3;
        CheckoutFullPageErrorState[] checkoutFullPageErrorStateArr = {checkoutFullPageErrorState, checkoutFullPageErrorState2, checkoutFullPageErrorState3};
        g = checkoutFullPageErrorStateArr;
        h = EnumEntriesKt.a(checkoutFullPageErrorStateArr);
    }

    public static CheckoutFullPageErrorState valueOf(String str) {
        return (CheckoutFullPageErrorState) Enum.valueOf(CheckoutFullPageErrorState.class, str);
    }

    public static CheckoutFullPageErrorState[] values() {
        return (CheckoutFullPageErrorState[]) g.clone();
    }

    public abstract void a(CheckoutContentViewModel checkoutContentViewModel);

    public abstract void b(CheckoutContentViewModel checkoutContentViewModel);
}
