package au.com.woolworths.shop.cart.ui.productreview;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDirections;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewFragmentDirections;", "", "ActionProductReviewFragmentToAlternative", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductReviewFragmentDirections {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewFragmentDirections$ActionProductReviewFragmentToAlternative;", "Landroidx/navigation/NavDirections;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionProductReviewFragmentToAlternative implements NavDirections {

        /* renamed from: a, reason: collision with root package name */
        public final String f10525a;

        public ActionProductReviewFragmentToAlternative(String str) {
            this.f10525a = str;
        }

        @Override // androidx.navigation.NavDirections
        public final Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("productId", this.f10525a);
            return bundle;
        }

        @Override // androidx.navigation.NavDirections
        public final int c() {
            return R.id.action_productReviewFragment_to_Alternative;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionProductReviewFragmentToAlternative) && Intrinsics.c(this.f10525a, ((ActionProductReviewFragmentToAlternative) obj).f10525a);
        }

        public final int hashCode() {
            return this.f10525a.hashCode();
        }

        public final String toString() {
            return YU.a.h("ActionProductReviewFragmentToAlternative(productId=", this.f10525a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewFragmentDirections$Companion;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }
}
