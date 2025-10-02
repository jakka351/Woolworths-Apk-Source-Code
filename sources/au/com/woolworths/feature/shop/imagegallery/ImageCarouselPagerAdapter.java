package au.com.woolworths.feature.shop.imagegallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import au.com.woolworths.android.onesite.modules.search.searchscreen.h;
import au.com.woolworths.feature.shop.imagegallery.databinding.ItemCarouselImageBinding;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.github.piasy.biv.view.BigImageView;
import com.github.piasy.biv.view.ImageViewFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/imagegallery/ImageCarouselPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "image-gallery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageCarouselPagerAdapter extends PagerAdapter {
    public final ProductImageGalleryActivity f;
    public final List g;
    public final boolean h;

    public ImageCarouselPagerAdapter(ProductImageGalleryActivity productImageGalleryActivity, List images) {
        Intrinsics.h(images, "images");
        this.f = productImageGalleryActivity;
        this.g = images;
        this.h = true;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void e(ViewPager viewPager, Object object) {
        Intrinsics.h(object, "object");
        viewPager.removeView((View) object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int g() {
        return this.g.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object h(ViewPager viewPager, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f);
        int i2 = ItemCarouselImageBinding.A;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ItemCarouselImageBinding itemCarouselImageBinding = (ItemCarouselImageBinding) ViewDataBinding.q(layoutInflaterFrom, com.woolworths.R.layout.item_carousel_image, viewPager, false, null);
        Intrinsics.g(itemCarouselImageBinding, "inflate(...)");
        itemCarouselImageBinding.L((String) this.g.get(i));
        BigImageView bigImageView = itemCarouselImageBinding.y;
        bigImageView.setImageViewFactory(new ImageViewFactory() { // from class: au.com.woolworths.feature.shop.imagegallery.ImageCarouselPagerAdapter$buildCustomSsivFactory$1
            @Override // com.github.piasy.biv.view.ImageViewFactory
            public final SubsamplingScaleImageView a(Context context) {
                Intrinsics.h(context, "context");
                View viewInflate = LayoutInflater.from(context).inflate(com.woolworths.R.layout.carousel_subsampled_imageview, (ViewGroup) null);
                Intrinsics.f(viewInflate, "null cannot be cast to non-null type com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView");
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) viewInflate;
                subsamplingScaleImageView.setZoomEnabled(this.f7258a.h);
                return subsamplingScaleImageView;
            }
        });
        bigImageView.setOnClickListener(new h(this));
        View view = itemCarouselImageBinding.h;
        viewPager.addView(view);
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean i(View view, Object viewObject) {
        Intrinsics.h(view, "view");
        Intrinsics.h(viewObject, "viewObject");
        return view.equals(viewObject);
    }
}
