package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartEmptyState;", "Lau/com/woolworths/shop/cart/ui/cart/CartFullErrorMessage;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartEmptyState implements CartFullErrorMessage {
    public static final CartEmptyState d = new CartEmptyState();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CartEmptyState);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getDrawableRes() {
        return R.drawable.ic_no_products;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getMessage() {
        return new ResWithArgText(R.string.cart_page_no_product_error_body, new Object[0]);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getPrimaryActionRes() {
        return R.string.cart_page_no_product_action;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getTitle() {
        return new ResText(R.string.cart_page_no_product_error_title);
    }

    public final int hashCode() {
        return -1763731301;
    }

    public final String toString() {
        return "CartEmptyState";
    }
}
