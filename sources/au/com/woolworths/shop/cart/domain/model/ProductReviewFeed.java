package au.com.woolworths.shop.cart.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductReviewFeed;", "", "ProductReviewGroup", "Lau/com/woolworths/shop/cart/domain/model/ProductReviewFeed$ProductReviewGroup;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductReviewFeed {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductReviewFeed$ProductReviewGroup;", "Lau/com/woolworths/shop/cart/domain/model/ProductReviewFeed;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductReviewGroup extends ProductReviewFeed {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerApiData f10446a;
        public final ProductReviewGroupType b;
        public final List c;
        public final AnalyticsData d;

        public ProductReviewGroup(InsetBannerApiData insetBannerApiData, ProductReviewGroupType productReviewGroupType, List list, AnalyticsData analyticsData) {
            this.f10446a = insetBannerApiData;
            this.b = productReviewGroupType;
            this.c = list;
            this.d = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductReviewGroup)) {
                return false;
            }
            ProductReviewGroup productReviewGroup = (ProductReviewGroup) obj;
            return Intrinsics.c(this.f10446a, productReviewGroup.f10446a) && this.b == productReviewGroup.b && Intrinsics.c(this.c, productReviewGroup.c) && Intrinsics.c(this.d, productReviewGroup.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.d((this.b.hashCode() + (this.f10446a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            return "ProductReviewGroup(banner=" + this.f10446a + ", type=" + this.b + ", products=" + this.c + ", analytics=" + this.d + ")";
        }
    }
}
