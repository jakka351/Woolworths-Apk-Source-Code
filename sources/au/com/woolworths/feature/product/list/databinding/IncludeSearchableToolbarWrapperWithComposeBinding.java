package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class IncludeSearchableToolbarWrapperWithComposeBinding extends ViewDataBinding {
    public View.OnFocusChangeListener A;
    public final SearchView y;
    public final Toolbar z;

    public IncludeSearchableToolbarWrapperWithComposeBinding(DataBindingComponent dataBindingComponent, View view, SearchView searchView, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = searchView;
        this.z = toolbar;
    }
}
