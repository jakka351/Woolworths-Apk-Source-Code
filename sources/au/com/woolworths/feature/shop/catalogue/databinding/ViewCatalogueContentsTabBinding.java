package au.com.woolworths.feature.shop.catalogue.databinding;

import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;

/* loaded from: classes3.dex */
public final class ViewCatalogueContentsTabBinding implements ViewBinding {
    public final ConstraintLayout d;
    public final IncludeGenericErrorStateBinding e;
    public final ProgressBar f;

    public ViewCatalogueContentsTabBinding(ConstraintLayout constraintLayout, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, ProgressBar progressBar, RecyclerView recyclerView) {
        this.d = constraintLayout;
        this.e = includeGenericErrorStateBinding;
        this.f = progressBar;
    }
}
