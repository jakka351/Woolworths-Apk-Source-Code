package au.com.woolworths.shop.cart.ui.productreview;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import au.com.woolworths.android.onesite.navigation.Activities;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewFragmentArgs;", "Landroidx/navigation/NavArgs;", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductReviewFragmentArgs implements NavArgs {

    /* renamed from: a, reason: collision with root package name */
    public final Activities.ProductsReviewActivity.Source f10524a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewFragmentArgs$Companion;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductReviewFragmentArgs(Activities.ProductsReviewActivity.Source source) {
        this.f10524a = source;
    }

    @JvmStatic
    @NotNull
    public static final ProductReviewFragmentArgs fromBundle(@NotNull Bundle bundle) {
        Intrinsics.h(bundle, "bundle");
        bundle.setClassLoader(ProductReviewFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("source")) {
            throw new IllegalArgumentException("Required argument \"source\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Activities.ProductsReviewActivity.Source.class) && !Serializable.class.isAssignableFrom(Activities.ProductsReviewActivity.Source.class)) {
            throw new UnsupportedOperationException(Activities.ProductsReviewActivity.Source.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Activities.ProductsReviewActivity.Source source = (Activities.ProductsReviewActivity.Source) bundle.get("source");
        if (source != null) {
            return new ProductReviewFragmentArgs(source);
        }
        throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductReviewFragmentArgs) && this.f10524a == ((ProductReviewFragmentArgs) obj).f10524a;
    }

    public final int hashCode() {
        return this.f10524a.hashCode();
    }

    public final String toString() {
        return "ProductReviewFragmentArgs(source=" + this.f10524a + ")";
    }
}
