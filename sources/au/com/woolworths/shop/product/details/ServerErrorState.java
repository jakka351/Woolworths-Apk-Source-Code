package au.com.woolworths.shop.product.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ServerErrorState;", "Lau/com/woolworths/shop/product/details/ProductDetailsPageErrorState;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ServerErrorState extends ProductDetailsPageErrorState {
    public static final ServerErrorState d = new ServerErrorState();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ServerErrorState);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getDrawableRes() {
        return com.woolworths.R.drawable.empty_server_error;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getMessage() {
        return new ResText(com.woolworths.R.string.product_details_server_error);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getSecondaryActionRes() {
        return com.woolworths.R.string.try_again_button_text;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getTitle() {
        return new ResText(com.woolworths.R.string.server_error_heading);
    }

    public final int hashCode() {
        return -477283998;
    }

    public final String toString() {
        return "ServerErrorState";
    }
}
