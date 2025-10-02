package au.com.woolworths.feature.shop.catalogue.details;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueDetailsBinding;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsImageLoaderListener;", "Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueDetailsImageLoaderListener implements ImageLoaderListener {
    public final ItemCatalogueDetailsBinding d;

    public CatalogueDetailsImageLoaderListener(ItemCatalogueDetailsBinding itemCatalogueDetailsBinding) {
        this.d = itemCatalogueDetailsBinding;
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean a(ViewDataBinding viewDataBinding) {
        ItemCatalogueDetailsBinding itemCatalogueDetailsBinding = viewDataBinding instanceof ItemCatalogueDetailsBinding ? (ItemCatalogueDetailsBinding) viewDataBinding : null;
        if (itemCatalogueDetailsBinding != null) {
            itemCatalogueDetailsBinding.z.setVisibility(8);
            itemCatalogueDetailsBinding.A.setVisibility(0);
            itemCatalogueDetailsBinding.l();
        }
        return false;
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean b(ViewDataBinding viewDataBinding, Drawable drawable) {
        ItemCatalogueDetailsBinding itemCatalogueDetailsBinding = this.d;
        itemCatalogueDetailsBinding.z.setVisibility(8);
        itemCatalogueDetailsBinding.A.setVisibility(8);
        itemCatalogueDetailsBinding.l();
        return false;
    }
}
