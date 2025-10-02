package au.com.woolworths.feature.shop.recipes.freshmag.home.presentation;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.recipes.databinding.EpoxyItemFreshMagHomeBinding;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagImageLoaderListener;", "Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FreshMagImageLoaderListener implements ImageLoaderListener {
    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean a(ViewDataBinding viewDataBinding) {
        EpoxyItemFreshMagHomeBinding epoxyItemFreshMagHomeBinding = viewDataBinding instanceof EpoxyItemFreshMagHomeBinding ? (EpoxyItemFreshMagHomeBinding) viewDataBinding : null;
        if (epoxyItemFreshMagHomeBinding == null) {
            return false;
        }
        epoxyItemFreshMagHomeBinding.h.post(new a(epoxyItemFreshMagHomeBinding, 0));
        return false;
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean b(ViewDataBinding viewDataBinding, Drawable drawable) {
        EpoxyItemFreshMagHomeBinding epoxyItemFreshMagHomeBinding = viewDataBinding instanceof EpoxyItemFreshMagHomeBinding ? (EpoxyItemFreshMagHomeBinding) viewDataBinding : null;
        if (epoxyItemFreshMagHomeBinding == null) {
            return false;
        }
        epoxyItemFreshMagHomeBinding.h.post(new a(epoxyItemFreshMagHomeBinding, 1));
        return false;
    }
}
