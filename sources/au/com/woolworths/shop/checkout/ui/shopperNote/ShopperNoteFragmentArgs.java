package au.com.woolworths.shop.checkout.ui.shopperNote;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/shopperNote/ShopperNoteFragmentArgs;", "Landroidx/navigation/NavArgs;", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShopperNoteFragmentArgs implements NavArgs {

    /* renamed from: a, reason: collision with root package name */
    public final ShopperNoteExtras f10810a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/shopperNote/ShopperNoteFragmentArgs$Companion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShopperNoteFragmentArgs(ShopperNoteExtras shopperNoteExtras) {
        this.f10810a = shopperNoteExtras;
    }

    @JvmStatic
    @NotNull
    public static final ShopperNoteFragmentArgs fromBundle(@NotNull Bundle bundle) {
        Intrinsics.h(bundle, "bundle");
        bundle.setClassLoader(ShopperNoteFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("extras")) {
            throw new IllegalArgumentException("Required argument \"extras\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ShopperNoteExtras.class) && !Serializable.class.isAssignableFrom(ShopperNoteExtras.class)) {
            throw new UnsupportedOperationException(ShopperNoteExtras.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ShopperNoteExtras shopperNoteExtras = (ShopperNoteExtras) bundle.get("extras");
        if (shopperNoteExtras != null) {
            return new ShopperNoteFragmentArgs(shopperNoteExtras);
        }
        throw new IllegalArgumentException("Argument \"extras\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopperNoteFragmentArgs) && Intrinsics.c(this.f10810a, ((ShopperNoteFragmentArgs) obj).f10810a);
    }

    public final int hashCode() {
        return this.f10810a.hashCode();
    }

    public final String toString() {
        return "ShopperNoteFragmentArgs(extras=" + this.f10810a + ")";
    }
}
