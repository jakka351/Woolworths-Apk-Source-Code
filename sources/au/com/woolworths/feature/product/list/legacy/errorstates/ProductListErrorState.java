package au.com.woolworths.feature.product.list.legacy.errorstates;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "ProductListConnectionError", "ProductListEmptyState", "ProductListNoResultsState", "ProductListServerError", "Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState$ProductListConnectionError;", "Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState$ProductListEmptyState;", "Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState$ProductListNoResultsState;", "Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState$ProductListServerError;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductListErrorState implements FullPageErrorCause {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState$ProductListConnectionError;", "Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListConnectionError extends ProductListErrorState {
        public final String d;

        public ProductListConnectionError(String title) {
            Intrinsics.h(title, "title");
            this.d = title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductListConnectionError) && Intrinsics.c(this.d, ((ProductListConnectionError) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.empty_connection_error_old;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        /* renamed from: getMessage */
        public final Text getD() {
            return new ResWithArgText(R.string.product_list_connection_error, this.d);
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
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("ProductListConnectionError(title=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState$ProductListEmptyState;", "Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListEmptyState extends ProductListErrorState {
        public final String d;

        public ProductListEmptyState(String title) {
            Intrinsics.h(title, "title");
            this.d = title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductListEmptyState) && Intrinsics.c(this.d, ((ProductListEmptyState) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.ic_no_products;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        /* renamed from: getMessage */
        public final Text getD() {
            return new ResWithArgText(R.string.product_list_no_products_message, this.d);
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
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("ProductListEmptyState(title=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState$ProductListNoResultsState;", "Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListNoResultsState extends ProductListErrorState {
        public final String d;

        public ProductListNoResultsState(String searchTerm) {
            Intrinsics.h(searchTerm, "searchTerm");
            this.d = searchTerm;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductListNoResultsState) && Intrinsics.c(this.d, ((ProductListNoResultsState) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.ic_no_products;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        /* renamed from: getMessage */
        public final Text getD() {
            return new ResWithArgText(R.string.product_list_no_results_message, this.d);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.product_list_no_results_heading);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("ProductListNoResultsState(searchTerm=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState$ProductListServerError;", "Lau/com/woolworths/feature/product/list/legacy/errorstates/ProductListErrorState;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListServerError extends ProductListErrorState {
        public final String d;

        public ProductListServerError(String title) {
            Intrinsics.h(title, "title");
            this.d = title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductListServerError) && Intrinsics.c(this.d, ((ProductListServerError) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.empty_server_error_old;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        /* renamed from: getMessage */
        public final Text getD() {
            return new ResWithArgText(R.string.product_list_server_error, this.d);
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
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("ProductListServerError(title=", this.d, ")");
        }
    }
}
