package au.com.woolworths.feature.shop.product.availability;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiAction;", "", "OpenStoreDetails", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiAction$OpenStoreDetails;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductAvailabilityUiAction {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiAction$OpenStoreDetails;", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiAction;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenStoreDetails implements ProductAvailabilityUiAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f7986a;

        public OpenStoreDetails(String storeId) {
            Intrinsics.h(storeId, "storeId");
            this.f7986a = storeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenStoreDetails) && Intrinsics.c(this.f7986a, ((OpenStoreDetails) obj).f7986a);
        }

        public final int hashCode() {
            return this.f7986a.hashCode();
        }

        public final String toString() {
            return a.h("OpenStoreDetails(storeId=", this.f7986a, ")");
        }
    }
}
