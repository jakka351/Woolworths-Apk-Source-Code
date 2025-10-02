package au.com.woolworths.shop.cart.ui.productalternative;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeFragmentArgs;", "Landroidx/navigation/NavArgs;", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductReviewAlternativeFragmentArgs implements NavArgs {

    /* renamed from: a, reason: collision with root package name */
    public final String f10507a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeFragmentArgs$Companion;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductReviewAlternativeFragmentArgs(String str) {
        this.f10507a = str;
    }

    @JvmStatic
    @NotNull
    public static final ProductReviewAlternativeFragmentArgs fromBundle(@NotNull Bundle bundle) {
        Intrinsics.h(bundle, "bundle");
        bundle.setClassLoader(ProductReviewAlternativeFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("productId")) {
            throw new IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("productId");
        if (string != null) {
            return new ProductReviewAlternativeFragmentArgs(string);
        }
        throw new IllegalArgumentException("Argument \"productId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductReviewAlternativeFragmentArgs) && Intrinsics.c(this.f10507a, ((ProductReviewAlternativeFragmentArgs) obj).f10507a);
    }

    public final int hashCode() {
        return this.f10507a.hashCode();
    }

    public final String toString() {
        return YU.a.h("ProductReviewAlternativeFragmentArgs(productId=", this.f10507a, ")");
    }
}
