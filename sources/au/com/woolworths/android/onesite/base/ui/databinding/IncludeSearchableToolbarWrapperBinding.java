package au.com.woolworths.android.onesite.base.ui.databinding;

import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.SearchViewBindingAdapter;

/* loaded from: classes3.dex */
public abstract class IncludeSearchableToolbarWrapperBinding extends ViewDataBinding {
    public final Toolbar A;
    public String B;
    public SearchViewBindingAdapter.OnQueryTextChange C;
    public SearchViewBindingAdapter.OnQueryTextSubmit D;
    public View.OnFocusChangeListener E;
    public final CardView y;
    public final SearchView z;

    public IncludeSearchableToolbarWrapperBinding(DataBindingComponent dataBindingComponent, View view, CardView cardView, SearchView searchView, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = cardView;
        this.z = searchView;
        this.A = toolbar;
    }

    public abstract void L(SearchViewBindingAdapter.OnQueryTextChange onQueryTextChange);

    public abstract void M(View.OnFocusChangeListener onFocusChangeListener);

    public abstract void N(SearchViewBindingAdapter.OnQueryTextSubmit onQueryTextSubmit);

    public abstract void O(String str);
}
