package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;

/* loaded from: classes3.dex */
public abstract class ActivityCatalogueHomeBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final RecyclerView A;
    public final Toolbar B;
    public final IncludeGenericErrorStateBinding y;
    public final ProgressBar z;

    public ActivityCatalogueHomeBinding(View view, ProgressBar progressBar, Toolbar toolbar, DataBindingComponent dataBindingComponent, RecyclerView recyclerView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding) {
        super(dataBindingComponent, view, 1);
        this.y = includeGenericErrorStateBinding;
        this.z = progressBar;
        this.A = recyclerView;
        this.B = toolbar;
    }
}
