package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.recipes.databinding.ItemZoomablePageBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/zoomablepage/ZoomablePageLoaderListener;", "Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZoomablePageLoaderListener implements ImageLoaderListener {
    public final ItemZoomablePageBinding d;

    public ZoomablePageLoaderListener(ItemZoomablePageBinding binding) {
        Intrinsics.h(binding, "binding");
        this.d = binding;
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean a(ViewDataBinding viewDataBinding) {
        View view;
        if (viewDataBinding == null || (view = viewDataBinding.h) == null) {
            return false;
        }
        view.post(new a(this, 1));
        return false;
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean b(ViewDataBinding viewDataBinding, Drawable drawable) {
        View view;
        if (viewDataBinding == null || (view = viewDataBinding.h) == null) {
            return false;
        }
        view.post(new a(this, 0));
        return false;
    }
}
