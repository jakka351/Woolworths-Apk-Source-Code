package au.com.woolworths.shop.product.navigation.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/ProductCategoryFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "Lau/com/woolworths/shop/product/navigation/ui/ConnectionErrorState;", "Lau/com/woolworths/shop/product/navigation/ui/NoResultState;", "Lau/com/woolworths/shop/product/navigation/ui/ServerErrorState;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductCategoryFullPageErrorState implements FullPageErrorCause {
    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public int getSecondaryActionRes() {
        return R.string.try_again_button_text;
    }
}
