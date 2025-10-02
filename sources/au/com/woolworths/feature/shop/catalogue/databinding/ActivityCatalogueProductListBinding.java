package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericInlineErrorStateBinding;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityCatalogueProductListBinding extends ViewDataBinding {
    public final IncludeGenericInlineErrorStateBinding A;
    public final ProgressBar B;
    public final Toolbar C;
    public CatalogueProductListViewModel D;
    public final RecyclerView y;
    public final IncludeGenericErrorStateBinding z;

    public ActivityCatalogueProductListBinding(DataBindingComponent dataBindingComponent, View view, RecyclerView recyclerView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, IncludeGenericInlineErrorStateBinding includeGenericInlineErrorStateBinding, ProgressBar progressBar, Toolbar toolbar) {
        super(dataBindingComponent, view, 3);
        this.y = recyclerView;
        this.z = includeGenericErrorStateBinding;
        this.A = includeGenericInlineErrorStateBinding;
        this.B = progressBar;
        this.C = toolbar;
    }

    public abstract void L(CatalogueProductListViewModel catalogueProductListViewModel);
}
