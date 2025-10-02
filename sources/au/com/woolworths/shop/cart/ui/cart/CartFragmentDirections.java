package au.com.woolworths.shop.cart.ui.cart;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDirections;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartFragmentDirections;", "", "ActionCartFragmentToCartSectionOptionsBottomSheet", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartFragmentDirections {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartFragmentDirections$ActionCartFragmentToCartSectionOptionsBottomSheet;", "Landroidx/navigation/NavDirections;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionCartFragmentToCartSectionOptionsBottomSheet implements NavDirections {

        /* renamed from: a, reason: collision with root package name */
        public final String f10491a;
        public final boolean b;

        public ActionCartFragmentToCartSectionOptionsBottomSheet(String str, boolean z) {
            this.f10491a = str;
            this.b = z;
        }

        @Override // androidx.navigation.NavDirections
        public final Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("sectionTitle", this.f10491a);
            bundle.putBoolean("isMarketplace", this.b);
            return bundle;
        }

        @Override // androidx.navigation.NavDirections
        public final int c() {
            return R.id.action_cartFragment_to_cartSectionOptionsBottomSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionCartFragmentToCartSectionOptionsBottomSheet)) {
                return false;
            }
            ActionCartFragmentToCartSectionOptionsBottomSheet actionCartFragmentToCartSectionOptionsBottomSheet = (ActionCartFragmentToCartSectionOptionsBottomSheet) obj;
            return Intrinsics.c(this.f10491a, actionCartFragmentToCartSectionOptionsBottomSheet.f10491a) && this.b == actionCartFragmentToCartSectionOptionsBottomSheet.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.f10491a.hashCode() * 31);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.j("ActionCartFragmentToCartSectionOptionsBottomSheet(sectionTitle=", this.f10491a, ", isMarketplace=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartFragmentDirections$Companion;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }
}
