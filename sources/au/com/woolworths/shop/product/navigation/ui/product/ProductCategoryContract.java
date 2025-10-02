package au.com.woolworths.shop.product.navigation.ui.product;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePrompt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/product/ProductCategoryContract;", "", "Actions", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProductCategoryContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/product/ProductCategoryContract$Actions;", "", "ShowInstorePrompt", "Lau/com/woolworths/shop/product/navigation/ui/product/ProductCategoryContract$Actions$ShowInstorePrompt;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/product/ProductCategoryContract$Actions$ShowInstorePrompt;", "Lau/com/woolworths/shop/product/navigation/ui/product/ProductCategoryContract$Actions;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowInstorePrompt extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final InstorePresencePrompt f12640a;

            public ShowInstorePrompt(InstorePresencePrompt instorePresencePrompt) {
                this.f12640a = instorePresencePrompt;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowInstorePrompt) && Intrinsics.c(this.f12640a, ((ShowInstorePrompt) obj).f12640a);
            }

            public final int hashCode() {
                return this.f12640a.hashCode();
            }

            public final String toString() {
                return "ShowInstorePrompt(instorePrompt=" + this.f12640a + ")";
            }
        }
    }
}
