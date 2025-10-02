package au.com.woolworths.shop.product.navigation.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class ActivitySubCategoryBinding extends ViewDataBinding {
    public final ContentLoadingProgressBar A;
    public final Toolbar B;
    public SubCategoryViewModel C;
    public final IncludeGenericErrorStateBinding y;
    public final EpoxyRecyclerView z;

    public ActivitySubCategoryBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, EpoxyRecyclerView epoxyRecyclerView, ContentLoadingProgressBar contentLoadingProgressBar, Toolbar toolbar) {
        super(dataBindingComponent, view, 2);
        this.y = includeGenericErrorStateBinding;
        this.z = epoxyRecyclerView;
        this.A = contentLoadingProgressBar;
        this.B = toolbar;
    }

    public abstract void L(SubCategoryViewModel subCategoryViewModel);
}
