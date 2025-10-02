package au.com.woolworths.shop.product.details.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.foundation.ui.image.gallery.ImageCarouselItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ProductImage;", "Lau/com/woolworths/foundation/ui/image/gallery/ImageCarouselItem;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductImage implements ImageCarouselItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f12615a;
    public final String b;
    public final AnalyticsData c;
    public final AnalyticsData d;
    public final AnalyticsData e;
    public final AnalyticsData f;
    public final AnalyticsData g;

    public ProductImage(String str, String str2, AnalyticsData analyticsData, AnalyticsData analyticsData2, AnalyticsData analyticsData3, AnalyticsData analyticsData4, AnalyticsData analyticsData5) {
        this.f12615a = str;
        this.b = str2;
        this.c = analyticsData;
        this.d = analyticsData2;
        this.e = analyticsData3;
        this.f = analyticsData4;
        this.g = analyticsData5;
    }

    @Override // au.com.woolworths.foundation.ui.image.gallery.ImageCarouselItem
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductImage)) {
            return false;
        }
        ProductImage productImage = (ProductImage) obj;
        return Intrinsics.c(this.f12615a, productImage.f12615a) && Intrinsics.c(this.b, productImage.b) && Intrinsics.c(this.c, productImage.c) && Intrinsics.c(this.d, productImage.d) && Intrinsics.c(this.e, productImage.e) && Intrinsics.c(this.f, productImage.f) && Intrinsics.c(this.g, productImage.g);
    }

    @Override // au.com.woolworths.foundation.ui.image.gallery.ImageCarouselItem
    /* renamed from: getImageUrl, reason: from getter */
    public final String getF12615a() {
        return this.f12615a;
    }

    public final int hashCode() {
        String str = this.f12615a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AnalyticsData analyticsData = this.c;
        int iHashCode3 = (iHashCode2 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.d;
        int iHashCode4 = (iHashCode3 + (analyticsData2 == null ? 0 : analyticsData2.hashCode())) * 31;
        AnalyticsData analyticsData3 = this.e;
        int iHashCode5 = (iHashCode4 + (analyticsData3 == null ? 0 : analyticsData3.hashCode())) * 31;
        AnalyticsData analyticsData4 = this.f;
        int iHashCode6 = (iHashCode5 + (analyticsData4 == null ? 0 : analyticsData4.hashCode())) * 31;
        AnalyticsData analyticsData5 = this.g;
        return iHashCode6 + (analyticsData5 != null ? analyticsData5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ProductImage(imageUrl=", this.f12615a, ", altText=", this.b, ", imageGalleryClickAnalytics=");
        sbV.append(this.c);
        sbV.append(", imageGalleryScrollAnalytics=");
        sbV.append(this.d);
        sbV.append(", imageGalleryCloseAnalytics=");
        sbV.append(this.e);
        sbV.append(", imageGalleryThumbnailClickAnalytics=");
        sbV.append(this.f);
        sbV.append(", productDetailsThumbnailClickAnalytics=");
        return au.com.woolworths.android.onesite.a.n(sbV, this.g, ")");
    }
}
