package au.com.woolworths.product.offers;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostResult;", "", "Success", "Failure", "Lau/com/woolworths/product/offers/ProductBoostResult$Failure;", "Lau/com/woolworths/product/offers/ProductBoostResult$Success;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductBoostResult {

    /* renamed from: a, reason: collision with root package name */
    public final TrackableBoostMetadata f9327a;
    public final Object b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostResult$Failure;", "Lau/com/woolworths/product/offers/ProductBoostResult;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure extends ProductBoostResult {
        public final ProductBoostFailureCause c;
        public final List d;
        public final TrackableBoostMetadata e;
        public final Object f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(ProductBoostFailureCause productBoostFailureCause, List originalProducts, TrackableBoostMetadata trackableBoostMetadata, Object obj) {
            super(trackableBoostMetadata, obj);
            Intrinsics.h(originalProducts, "originalProducts");
            Intrinsics.h(trackableBoostMetadata, "trackableBoostMetadata");
            this.c = productBoostFailureCause;
            this.d = originalProducts;
            this.e = trackableBoostMetadata;
            this.f = obj;
        }

        @Override // au.com.woolworths.product.offers.ProductBoostResult
        /* renamed from: a, reason: from getter */
        public final TrackableBoostMetadata getF9327a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.c(this.c, failure.c) && Intrinsics.c(this.d, failure.d) && Intrinsics.c(this.e, failure.e) && Intrinsics.c(this.f, failure.f);
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + b.d(this.c.hashCode() * 31, 31, this.d)) * 31;
            Object obj = this.f;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "Failure(cause=" + this.c + ", originalProducts=" + this.d + ", trackableBoostMetadata=" + this.e + ", requestTag=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostResult$Success;", "Lau/com/woolworths/product/offers/ProductBoostResult;", "Companion", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends ProductBoostResult {
        public final Object c;
        public final boolean d;
        public final TrackableBoostMetadata e;
        public final Object f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostResult$Success$Companion;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(List list, boolean z, TrackableBoostMetadata trackableBoostMetadata, Object obj) {
            super(trackableBoostMetadata, obj);
            Intrinsics.h(trackableBoostMetadata, "trackableBoostMetadata");
            this.c = list;
            this.d = z;
            this.e = trackableBoostMetadata;
            this.f = obj;
        }

        @Override // au.com.woolworths.product.offers.ProductBoostResult
        /* renamed from: a, reason: from getter */
        public final TrackableBoostMetadata getF9327a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.c.equals(success.c) && this.d == success.d && Intrinsics.c(this.e, success.e) && Intrinsics.c(this.f, success.f);
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + b.e(this.c.hashCode() * 31, 31, this.d)) * 31;
            Object obj = this.f;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "Success(updatedProducts=" + this.c + ", isRetry=" + this.d + ", trackableBoostMetadata=" + this.e + ", requestTag=" + this.f + ")";
        }
    }

    public ProductBoostResult(TrackableBoostMetadata trackableBoostMetadata, Object obj) {
        this.f9327a = trackableBoostMetadata;
        this.b = obj;
    }

    /* renamed from: a, reason: from getter */
    public TrackableBoostMetadata getF9327a() {
        return this.f9327a;
    }
}
