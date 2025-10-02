package au.com.woolworths.shop.checkout.ui.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDirections;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsExtras;
import com.woolworths.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsFragmentDirections;", "", "ActionCheckoutDetailsFragmentToMarketplacePickupDialog", "ActionCheckoutDetailsFragmentToCheckoutContactDetailsFragment", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutDetailsFragmentDirections {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsFragmentDirections$ActionCheckoutDetailsFragmentToCheckoutContactDetailsFragment;", "Landroidx/navigation/NavDirections;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionCheckoutDetailsFragmentToCheckoutContactDetailsFragment implements NavDirections {

        /* renamed from: a, reason: collision with root package name */
        public final ContactDetailsExtras f10772a;

        public ActionCheckoutDetailsFragmentToCheckoutContactDetailsFragment(ContactDetailsExtras contactDetailsExtras) {
            this.f10772a = contactDetailsExtras;
        }

        @Override // androidx.navigation.NavDirections
        public final Bundle b() {
            Bundle bundle = new Bundle();
            boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(ContactDetailsExtras.class);
            Parcelable parcelable = this.f10772a;
            if (zIsAssignableFrom) {
                Intrinsics.f(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("extras", parcelable);
                return bundle;
            }
            if (!Serializable.class.isAssignableFrom(ContactDetailsExtras.class)) {
                throw new UnsupportedOperationException(ContactDetailsExtras.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Intrinsics.f(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("extras", (Serializable) parcelable);
            return bundle;
        }

        @Override // androidx.navigation.NavDirections
        public final int c() {
            return R.id.action_checkout_details_fragment_to_checkout_contact_details_fragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionCheckoutDetailsFragmentToCheckoutContactDetailsFragment) && Intrinsics.c(this.f10772a, ((ActionCheckoutDetailsFragmentToCheckoutContactDetailsFragment) obj).f10772a);
        }

        public final int hashCode() {
            return this.f10772a.hashCode();
        }

        public final String toString() {
            return "ActionCheckoutDetailsFragmentToCheckoutContactDetailsFragment(extras=" + this.f10772a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsFragmentDirections$ActionCheckoutDetailsFragmentToMarketplacePickupDialog;", "Landroidx/navigation/NavDirections;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionCheckoutDetailsFragmentToMarketplacePickupDialog implements NavDirections {

        /* renamed from: a, reason: collision with root package name */
        public final BottomSheetContent.MarketplacePickUp f10773a;

        public ActionCheckoutDetailsFragmentToMarketplacePickupDialog(BottomSheetContent.MarketplacePickUp marketplacePickUp) {
            Screens screens = Screens.d;
            this.f10773a = marketplacePickUp;
        }

        @Override // androidx.navigation.NavDirections
        public final Bundle b() {
            Serializable serializable = Screens.g;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(Screens.class)) {
                bundle.putParcelable("screen", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(Screens.class)) {
                    throw new UnsupportedOperationException(Screens.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("screen", serializable);
            }
            boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(BottomSheetContent.MarketplacePickUp.class);
            Parcelable parcelable = this.f10773a;
            if (zIsAssignableFrom) {
                bundle.putParcelable("bottomSheetContent", parcelable);
                return bundle;
            }
            if (!Serializable.class.isAssignableFrom(BottomSheetContent.MarketplacePickUp.class)) {
                throw new UnsupportedOperationException(BottomSheetContent.MarketplacePickUp.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("bottomSheetContent", (Serializable) parcelable);
            return bundle;
        }

        @Override // androidx.navigation.NavDirections
        public final int c() {
            return R.id.action_checkout_details_fragment_to_marketplace_pickup_dialog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionCheckoutDetailsFragmentToMarketplacePickupDialog)) {
                return false;
            }
            Screens screens = Screens.d;
            return this.f10773a.equals(((ActionCheckoutDetailsFragmentToMarketplacePickupDialog) obj).f10773a);
        }

        public final int hashCode() {
            return this.f10773a.hashCode() + (Screens.g.hashCode() * 31);
        }

        public final String toString() {
            return "ActionCheckoutDetailsFragmentToMarketplacePickupDialog(screen=" + Screens.g + ", bottomSheetContent=" + this.f10773a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsFragmentDirections$Companion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static NavDirections a(BottomSheetContent.MarketplacePickUp marketplacePickUp) {
            Screens screens = Screens.d;
            return new ActionCheckoutDetailsFragmentToMarketplacePickupDialog(marketplacePickUp);
        }
    }
}
