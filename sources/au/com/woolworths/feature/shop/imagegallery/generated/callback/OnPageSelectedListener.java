package au.com.woolworths.feature.shop.imagegallery.generated.callback;

import androidx.databinding.ObservableField;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryViewModel;
import au.com.woolworths.feature.shop.imagegallery.analytics.ProductImageGalleryActions;
import au.com.woolworths.feature.shop.imagegallery.databinding.ActivityProductImageGalleryBindingImpl;

/* loaded from: classes3.dex */
public final class OnPageSelectedListener implements au.com.woolworths.android.onesite.bindings.OnPageSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityProductImageGalleryBindingImpl f7261a;

    public interface Listener {
    }

    public OnPageSelectedListener(ActivityProductImageGalleryBindingImpl activityProductImageGalleryBindingImpl) {
        this.f7261a = activityProductImageGalleryBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.bindings.OnPageSelectedListener
    public final void a(int i) throws Throwable {
        ProductImageGalleryViewModel productImageGalleryViewModel = this.f7261a.A;
        if (productImageGalleryViewModel != null) {
            ObservableField observableField = productImageGalleryViewModel.g;
            Activities.ImageGallery.Extras extras = (Activities.ImageGallery.Extras) observableField.e;
            if (extras != null) {
                observableField.i(new Activities.ImageGallery.Extras(extras.d, i, extras.e));
                productImageGalleryViewModel.f.c(ProductImageGalleryActions.f);
            }
        }
    }
}
