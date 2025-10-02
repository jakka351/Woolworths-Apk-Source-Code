package au.com.woolworths.feature.shop.product.availability;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiEvent;", "", "Refresh", "ShowStoreDetails", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiEvent$Refresh;", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiEvent$ShowStoreDetails;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductAvailabilityUiEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiEvent$Refresh;", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiEvent;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Refresh implements ProductAvailabilityUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final Refresh f7987a = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return 1641456938;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiEvent$ShowStoreDetails;", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiEvent;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowStoreDetails implements ProductAvailabilityUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f7988a;

        public ShowStoreDetails(String storeId) {
            Intrinsics.h(storeId, "storeId");
            this.f7988a = storeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowStoreDetails) && Intrinsics.c(this.f7988a, ((ShowStoreDetails) obj).f7988a);
        }

        public final int hashCode() {
            return this.f7988a.hashCode();
        }

        public final String toString() {
            return a.h("ShowStoreDetails(storeId=", this.f7988a, ")");
        }
    }
}
