package au.com.woolworths.shop.checkout.ui.content.bottomsheet;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/bottomsheet/MarketplacePickupBottomSheetFragmentArgs;", "Landroidx/navigation/NavArgs;", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MarketplacePickupBottomSheetFragmentArgs implements NavArgs {

    /* renamed from: a, reason: collision with root package name */
    public final Screens f10768a;
    public final BottomSheetContent.MarketplacePickUp b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/bottomsheet/MarketplacePickupBottomSheetFragmentArgs$Companion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public MarketplacePickupBottomSheetFragmentArgs(Screens screens, BottomSheetContent.MarketplacePickUp marketplacePickUp) {
        this.f10768a = screens;
        this.b = marketplacePickUp;
    }

    @JvmStatic
    @NotNull
    public static final MarketplacePickupBottomSheetFragmentArgs fromBundle(@NotNull Bundle bundle) {
        Intrinsics.h(bundle, "bundle");
        bundle.setClassLoader(MarketplacePickupBottomSheetFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("screen")) {
            throw new IllegalArgumentException("Required argument \"screen\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Screens.class) && !Serializable.class.isAssignableFrom(Screens.class)) {
            throw new UnsupportedOperationException(Screens.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Screens screens = (Screens) bundle.get("screen");
        if (screens == null) {
            throw new IllegalArgumentException("Argument \"screen\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("bottomSheetContent")) {
            throw new IllegalArgumentException("Required argument \"bottomSheetContent\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(BottomSheetContent.MarketplacePickUp.class) && !Serializable.class.isAssignableFrom(BottomSheetContent.MarketplacePickUp.class)) {
            throw new UnsupportedOperationException(BottomSheetContent.MarketplacePickUp.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        BottomSheetContent.MarketplacePickUp marketplacePickUp = (BottomSheetContent.MarketplacePickUp) bundle.get("bottomSheetContent");
        if (marketplacePickUp != null) {
            return new MarketplacePickupBottomSheetFragmentArgs(screens, marketplacePickUp);
        }
        throw new IllegalArgumentException("Argument \"bottomSheetContent\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplacePickupBottomSheetFragmentArgs)) {
            return false;
        }
        MarketplacePickupBottomSheetFragmentArgs marketplacePickupBottomSheetFragmentArgs = (MarketplacePickupBottomSheetFragmentArgs) obj;
        return this.f10768a == marketplacePickupBottomSheetFragmentArgs.f10768a && Intrinsics.c(this.b, marketplacePickupBottomSheetFragmentArgs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10768a.hashCode() * 31);
    }

    public final String toString() {
        return "MarketplacePickupBottomSheetFragmentArgs(screen=" + this.f10768a + ", bottomSheetContent=" + this.b + ")";
    }
}
