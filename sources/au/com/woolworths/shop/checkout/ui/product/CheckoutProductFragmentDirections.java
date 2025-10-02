package au.com.woolworths.shop.checkout.ui.product;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDirections;
import au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteExtras;
import com.woolworths.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/product/CheckoutProductFragmentDirections;", "", "ActionCheckoutProductFragmentToShopperNoteFragment", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutProductFragmentDirections {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/product/CheckoutProductFragmentDirections$ActionCheckoutProductFragmentToShopperNoteFragment;", "Landroidx/navigation/NavDirections;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionCheckoutProductFragmentToShopperNoteFragment implements NavDirections {

        /* renamed from: a, reason: collision with root package name */
        public final ShopperNoteExtras f10806a;

        public ActionCheckoutProductFragmentToShopperNoteFragment(ShopperNoteExtras shopperNoteExtras) {
            this.f10806a = shopperNoteExtras;
        }

        @Override // androidx.navigation.NavDirections
        public final Bundle b() {
            Bundle bundle = new Bundle();
            boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(ShopperNoteExtras.class);
            Parcelable parcelable = this.f10806a;
            if (zIsAssignableFrom) {
                Intrinsics.f(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("extras", parcelable);
                return bundle;
            }
            if (!Serializable.class.isAssignableFrom(ShopperNoteExtras.class)) {
                throw new UnsupportedOperationException(ShopperNoteExtras.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Intrinsics.f(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("extras", (Serializable) parcelable);
            return bundle;
        }

        @Override // androidx.navigation.NavDirections
        public final int c() {
            return R.id.action_checkout_product_fragment_to_shopper_note_fragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionCheckoutProductFragmentToShopperNoteFragment) && Intrinsics.c(this.f10806a, ((ActionCheckoutProductFragmentToShopperNoteFragment) obj).f10806a);
        }

        public final int hashCode() {
            return this.f10806a.hashCode();
        }

        public final String toString() {
            return "ActionCheckoutProductFragmentToShopperNoteFragment(extras=" + this.f10806a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/product/CheckoutProductFragmentDirections$Companion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }
}
