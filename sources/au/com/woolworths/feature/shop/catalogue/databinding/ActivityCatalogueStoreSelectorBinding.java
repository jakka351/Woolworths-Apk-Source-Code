package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBinding;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityCatalogueStoreSelectorBinding extends ViewDataBinding {
    public final RecyclerView A;
    public final IncludeSearchableToolbarWrapperBinding B;
    public CatalogueStoreSelectorViewModel C;
    public final IncludeGenericErrorStateBinding y;
    public final ProgressBar z;

    public ActivityCatalogueStoreSelectorBinding(View view, ProgressBar progressBar, DataBindingComponent dataBindingComponent, RecyclerView recyclerView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, IncludeSearchableToolbarWrapperBinding includeSearchableToolbarWrapperBinding) {
        super(dataBindingComponent, view, 3);
        this.y = includeGenericErrorStateBinding;
        this.z = progressBar;
        this.A = recyclerView;
        this.B = includeSearchableToolbarWrapperBinding;
    }

    public abstract void L(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel);
}
