package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class FragmentSuggestedListsBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public SuggestedListsViewModel A;
    public final IncludeGenericErrorStateBinding y;
    public final EpoxyRecyclerView z;

    public FragmentSuggestedListsBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, EpoxyRecyclerView epoxyRecyclerView) {
        super(dataBindingComponent, view, 2);
        this.y = includeGenericErrorStateBinding;
        this.z = epoxyRecyclerView;
    }

    public abstract void L(SuggestedListsViewModel suggestedListsViewModel);
}
