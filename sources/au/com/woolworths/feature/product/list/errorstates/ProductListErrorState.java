package au.com.woolworths.feature.product.list.errorstates;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "ProductListConnectionError", "ProductListEmptyState", "ProductListNoResultsState", "ProductListServerError", "Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState$ProductListConnectionError;", "Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState$ProductListEmptyState;", "Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState$ProductListNoResultsState;", "Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState$ProductListServerError;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListErrorState implements FullPageErrorCause {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState$ProductListConnectionError;", "Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListConnectionError extends ProductListErrorState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductListConnectionError);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.empty_connection_error_old;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getMessage() {
            return new ResWithArgText(R.string.product_list_connection_error, null);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.no_network_heading);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ProductListConnectionError(title=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState$ProductListEmptyState;", "Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListEmptyState extends ProductListErrorState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductListEmptyState);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.ic_no_products;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getMessage() {
            return new ResWithArgText(R.string.product_list_no_products_message, null);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.product_list_no_products_heading);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ProductListEmptyState(title=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState$ProductListNoResultsState;", "Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListNoResultsState extends ProductListErrorState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductListNoResultsState);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.ic_no_products;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getMessage() {
            return new ResWithArgText(R.string.product_list_no_results_message, null);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.product_list_no_results_heading);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ProductListNoResultsState(searchTerm=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState$ProductListServerError;", "Lau/com/woolworths/feature/product/list/errorstates/ProductListErrorState;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListServerError extends ProductListErrorState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductListServerError);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.empty_server_error_old;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getMessage() {
            return new ResWithArgText(R.string.product_list_server_error, null);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.server_error_heading);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ProductListServerError(title=null)";
        }
    }
}
