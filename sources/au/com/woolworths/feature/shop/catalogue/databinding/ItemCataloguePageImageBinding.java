package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.catalogue.models.CataloguePage;

/* loaded from: classes3.dex */
public abstract class ItemCataloguePageImageBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public ImageLoaderListener A;
    public final ImageView y;
    public CataloguePage z;

    public ItemCataloguePageImageBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
    }

    public abstract void L(CataloguePage cataloguePage);

    public abstract void M(ImageLoaderListener imageLoaderListener);
}
