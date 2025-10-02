package au.com.woolworths.shop.cart.ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/ui/CartSectionOptionsBottomSheetArgs;", "Landroidx/navigation/NavArgs;", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartSectionOptionsBottomSheetArgs implements NavArgs {

    /* renamed from: a, reason: collision with root package name */
    public final String f10454a;
    public final boolean b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/CartSectionOptionsBottomSheetArgs$Companion;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CartSectionOptionsBottomSheetArgs(String str, boolean z) {
        this.f10454a = str;
        this.b = z;
    }

    @JvmStatic
    @NotNull
    public static final CartSectionOptionsBottomSheetArgs fromBundle(@NotNull Bundle bundle) {
        Intrinsics.h(bundle, "bundle");
        bundle.setClassLoader(CartSectionOptionsBottomSheetArgs.class.getClassLoader());
        if (!bundle.containsKey("sectionTitle")) {
            throw new IllegalArgumentException("Required argument \"sectionTitle\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("sectionTitle");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"sectionTitle\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("isMarketplace")) {
            return new CartSectionOptionsBottomSheetArgs(string, bundle.getBoolean("isMarketplace"));
        }
        throw new IllegalArgumentException("Required argument \"isMarketplace\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartSectionOptionsBottomSheetArgs)) {
            return false;
        }
        CartSectionOptionsBottomSheetArgs cartSectionOptionsBottomSheetArgs = (CartSectionOptionsBottomSheetArgs) obj;
        return Intrinsics.c(this.f10454a, cartSectionOptionsBottomSheetArgs.f10454a) && this.b == cartSectionOptionsBottomSheetArgs.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f10454a.hashCode() * 31);
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.j("CartSectionOptionsBottomSheetArgs(sectionTitle=", this.f10454a, ", isMarketplace=", this.b, ")");
    }
}
