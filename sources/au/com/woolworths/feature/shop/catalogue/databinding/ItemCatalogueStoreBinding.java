package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel;

/* loaded from: classes3.dex */
public abstract class ItemCatalogueStoreBinding extends ViewDataBinding {
    public String A;
    public CharSequence B;
    public CatalogueStoreInfo C;
    public CatalogueStoreSelectorViewModel D;
    public final TextView y;
    public final TextView z;

    public ItemCatalogueStoreBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
    }

    public abstract void L(String str);

    public abstract void M(CharSequence charSequence);

    public abstract void N(CatalogueStoreInfo catalogueStoreInfo);

    public abstract void O(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel);
}
