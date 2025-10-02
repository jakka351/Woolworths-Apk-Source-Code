package au.com.woolworths.shop.product.navigation.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/NoResultState;", "Lau/com/woolworths/shop/product/navigation/ui/ProductCategoryFullPageErrorState;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NoResultState extends ProductCategoryFullPageErrorState {
    public static final NoResultState d = new NoResultState();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof NoResultState);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getDrawableRes() {
        return R.drawable.ic_product_category_no_result;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getMessage() {
        return new ResText(R.string.product_categories_no_results);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getTitle() {
        return new ResText(R.string.product_category_no_result_heading);
    }

    public final int hashCode() {
        return 497326153;
    }

    public final String toString() {
        return "NoResultState";
    }
}
