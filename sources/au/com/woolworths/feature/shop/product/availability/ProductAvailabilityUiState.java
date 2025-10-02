package au.com.woolworths.feature.shop.product.availability;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.product.models.ProductCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiState;", "", "Loading", "Content", "Error", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiState$Content;", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiState$Error;", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiState$Loading;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductAvailabilityUiState {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiState$Content;", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiState;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content implements ProductAvailabilityUiState {

        /* renamed from: a, reason: collision with root package name */
        public final String f7989a;
        public final ProductCard b;
        public final List c;

        public Content(String currentStore, ProductCard productCard, List list) {
            Intrinsics.h(currentStore, "currentStore");
            Intrinsics.h(productCard, "productCard");
            this.f7989a = currentStore;
            this.b = productCard;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.c(this.f7989a, content.f7989a) && Intrinsics.c(this.b, content.b) && Intrinsics.c(this.c, content.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f7989a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(currentStore=");
            sb.append(this.f7989a);
            sb.append(", productCard=");
            sb.append(this.b);
            sb.append(", nearByStores=");
            return a.t(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiState$Error;", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiState;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error implements ProductAvailabilityUiState {

        /* renamed from: a, reason: collision with root package name */
        public final FullPageMessage.Error f7990a;

        public Error(FullPageMessage.Error error) {
            this.f7990a = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.c(this.f7990a, ((Error) obj).f7990a);
        }

        public final int hashCode() {
            return this.f7990a.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.f7990a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiState$Loading;", "Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiState;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading implements ProductAvailabilityUiState {

        /* renamed from: a, reason: collision with root package name */
        public static final Loading f7991a = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -417374590;
        }

        public final String toString() {
            return "Loading";
        }
    }

    default String a() {
        return getClass().getSimpleName();
    }
}
