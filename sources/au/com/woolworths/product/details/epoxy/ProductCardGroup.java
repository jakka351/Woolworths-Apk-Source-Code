package au.com.woolworths.product.details.epoxy;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.k;
import au.com.woolworths.android.onesite.epoxy.CarouselWithPagerSnapExpoxyModel;
import au.com.woolworths.android.onesite.epoxy.CirclePageIndicatorDecoration;
import au.com.woolworths.product.details.ItemProductBadgeImageBindingModel_;
import au.com.woolworths.product.details.ItemProductHeadingBindingModel_;
import au.com.woolworths.product.details.ItemProductImageBindingModel_;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.models.ProductImage;
import au.com.woolworths.product.details.ui.ProductImageLoaderListener;
import au.com.woolworths.product.models.ProductCard;
import com.airbnb.epoxy.EpoxyModelGroup;
import com.airbnb.epoxy.EpoxyVisibilityTracker;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/details/epoxy/ProductCardGroup;", "Lcom/airbnb/epoxy/EpoxyModelGroup;", "Companion", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardGroup extends EpoxyModelGroup {
    public static CirclePageIndicatorDecoration r;
    public static final EpoxyVisibilityTracker s = new EpoxyVisibilityTracker();
    public final List p;
    public final ProductDetailsClickHandler q;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/product/details/epoxy/ProductCardGroup$Companion;", "", "Lau/com/woolworths/android/onesite/epoxy/CirclePageIndicatorDecoration;", "pageIndicatorDecoration", "Lau/com/woolworths/android/onesite/epoxy/CirclePageIndicatorDecoration;", "Lcom/airbnb/epoxy/EpoxyVisibilityTracker;", "epoxyVisibilityTracker", "Lcom/airbnb/epoxy/EpoxyVisibilityTracker;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public ProductCardGroup(List list, ProductCard productCard, ProductDetailsClickHandler clickHandler, boolean z) {
        Intrinsics.h(clickHandler, "clickHandler");
        CarouselWithPagerSnapExpoxyModel carouselWithPagerSnapExpoxyModel = new CarouselWithPagerSnapExpoxyModel();
        carouselWithPagerSnapExpoxyModel.E("product_image_carousel");
        List<ProductImage> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (ProductImage productImage : list2) {
            ItemProductImageBindingModel_ itemProductImageBindingModel_ = new ItemProductImageBindingModel_();
            itemProductImageBindingModel_.M(productImage.getLargeUrl());
            itemProductImageBindingModel_.t();
            itemProductImageBindingModel_.o = productImage;
            itemProductImageBindingModel_.t();
            itemProductImageBindingModel_.p = clickHandler;
            ProductImageLoaderListener productImageLoaderListener = new ProductImageLoaderListener();
            itemProductImageBindingModel_.t();
            itemProductImageBindingModel_.q = productImageLoaderListener;
            a aVar = new a(clickHandler, 1);
            itemProductImageBindingModel_.t();
            itemProductImageBindingModel_.n = aVar;
            arrayList.add(itemProductImageBindingModel_);
        }
        carouselWithPagerSnapExpoxyModel.F(arrayList);
        k kVar = new k(list);
        carouselWithPagerSnapExpoxyModel.t();
        carouselWithPagerSnapExpoxyModel.o = kVar;
        au.com.woolworths.feature.product.list.legacy.k kVar2 = new au.com.woolworths.feature.product.list.legacy.k(23);
        carouselWithPagerSnapExpoxyModel.t();
        carouselWithPagerSnapExpoxyModel.p = kVar2;
        ItemProductBadgeImageBindingModel_ itemProductBadgeImageBindingModel_ = new ItemProductBadgeImageBindingModel_();
        itemProductBadgeImageBindingModel_.M();
        String badgeImage = productCard.getBadgeImage();
        itemProductBadgeImageBindingModel_.t();
        itemProductBadgeImageBindingModel_.n = badgeImage;
        ItemProductHeadingBindingModel_ itemProductHeadingBindingModel_ = new ItemProductHeadingBindingModel_();
        itemProductHeadingBindingModel_.M();
        itemProductHeadingBindingModel_.t();
        itemProductHeadingBindingModel_.o = productCard;
        itemProductHeadingBindingModel_.t();
        itemProductHeadingBindingModel_.q = z;
        itemProductHeadingBindingModel_.t();
        itemProductHeadingBindingModel_.p = clickHandler;
        a aVar2 = new a(productCard, 2);
        itemProductHeadingBindingModel_.t();
        itemProductHeadingBindingModel_.n = aVar2;
        super(R.layout.group_product_card, CollectionsKt.R(carouselWithPagerSnapExpoxyModel, itemProductBadgeImageBindingModel_, itemProductHeadingBindingModel_));
        this.p = list;
        this.q = clickHandler;
    }
}
