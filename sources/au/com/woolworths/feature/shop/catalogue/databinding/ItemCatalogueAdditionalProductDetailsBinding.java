package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts.AdditionalProductItemState;

/* loaded from: classes3.dex */
public abstract class ItemCatalogueAdditionalProductDetailsBinding extends ViewDataBinding {
    public static final /* synthetic */ int G = 0;
    public final ImageView A;
    public final Button B;
    public final Button C;
    public AdditionalProductItemState D;
    public CatalogueProductListViewModel E;
    public ImageLoaderListener F;
    public final IncludeCartButtonBinding y;
    public final TextView z;

    public ItemCatalogueAdditionalProductDetailsBinding(DataBindingComponent dataBindingComponent, View view, IncludeCartButtonBinding includeCartButtonBinding, TextView textView, ImageView imageView, Button button, Button button2) {
        super(dataBindingComponent, view, 1);
        this.y = includeCartButtonBinding;
        this.z = textView;
        this.A = imageView;
        this.B = button;
        this.C = button2;
    }

    public abstract void L(AdditionalProductItemState additionalProductItemState);

    public abstract void M(CatalogueProductListViewModel catalogueProductListViewModel);
}
