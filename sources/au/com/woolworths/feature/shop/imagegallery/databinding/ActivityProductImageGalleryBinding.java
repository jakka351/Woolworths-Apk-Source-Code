package au.com.woolworths.feature.shop.imagegallery.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityProductImageGalleryBinding extends ViewDataBinding {
    public ProductImageGalleryViewModel A;
    public final Toolbar y;
    public final ViewPager z;

    public ActivityProductImageGalleryBinding(DataBindingComponent dataBindingComponent, View view, Toolbar toolbar, ViewPager viewPager) {
        super(dataBindingComponent, view, 1);
        this.y = toolbar;
        this.z = viewPager;
    }

    public abstract void L(ProductImageGalleryViewModel productImageGalleryViewModel);
}
