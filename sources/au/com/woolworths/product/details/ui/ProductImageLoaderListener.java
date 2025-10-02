package au.com.woolworths.product.details.ui;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.product.details.databinding.EpoxyItemProductImageBinding;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ui/ProductImageLoaderListener;", "Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductImageLoaderListener implements ImageLoaderListener {
    public static void d(EpoxyItemProductImageBinding epoxyItemProductImageBinding) {
        epoxyItemProductImageBinding.z.setVisibility(0);
        epoxyItemProductImageBinding.y.setVisibility(8);
        epoxyItemProductImageBinding.l();
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean a(ViewDataBinding viewDataBinding) {
        EpoxyItemProductImageBinding epoxyItemProductImageBinding = viewDataBinding instanceof EpoxyItemProductImageBinding ? (EpoxyItemProductImageBinding) viewDataBinding : null;
        if (epoxyItemProductImageBinding == null) {
            return false;
        }
        d(epoxyItemProductImageBinding);
        return false;
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean b(ViewDataBinding viewDataBinding, Drawable drawable) {
        EpoxyItemProductImageBinding epoxyItemProductImageBinding = viewDataBinding instanceof EpoxyItemProductImageBinding ? (EpoxyItemProductImageBinding) viewDataBinding : null;
        if (epoxyItemProductImageBinding == null) {
            return false;
        }
        d(epoxyItemProductImageBinding);
        return false;
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final void c(ViewDataBinding viewDataBinding) {
        EpoxyItemProductImageBinding epoxyItemProductImageBinding = viewDataBinding instanceof EpoxyItemProductImageBinding ? (EpoxyItemProductImageBinding) viewDataBinding : null;
        if (epoxyItemProductImageBinding != null) {
            d(epoxyItemProductImageBinding);
        }
    }
}
