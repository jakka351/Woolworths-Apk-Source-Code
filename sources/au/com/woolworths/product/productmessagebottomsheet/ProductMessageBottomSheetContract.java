package au.com.woolworths.product.productmessagebottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetContract;", "", "ViewState", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProductMessageBottomSheetContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetContract$ViewState;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCard f9332a;

        public ViewState(ProductCard productData) {
            Intrinsics.h(productData, "productData");
            this.f9332a = productData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f9332a, ((ViewState) obj).f9332a);
        }

        public final int hashCode() {
            return this.f9332a.hashCode();
        }

        public final String toString() {
            return d.n("ViewState(productData=", this.f9332a, ")");
        }
    }
}
