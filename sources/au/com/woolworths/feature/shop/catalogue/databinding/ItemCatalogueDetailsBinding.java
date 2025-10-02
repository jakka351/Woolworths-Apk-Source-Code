package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.catalogue.details.CataloguePageView;
import au.com.woolworths.feature.shop.catalogue.models.CataloguePage;

/* loaded from: classes3.dex */
public abstract class ItemCatalogueDetailsBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final ImageView A;
    public CataloguePage B;
    public final CataloguePageView y;
    public final ProgressBar z;

    public ItemCatalogueDetailsBinding(DataBindingComponent dataBindingComponent, View view, CataloguePageView cataloguePageView, ProgressBar progressBar, ImageView imageView) {
        super(dataBindingComponent, view, 0);
        this.y = cataloguePageView;
        this.z = progressBar;
        this.A = imageView;
    }

    public abstract void L(CataloguePage cataloguePage);
}
