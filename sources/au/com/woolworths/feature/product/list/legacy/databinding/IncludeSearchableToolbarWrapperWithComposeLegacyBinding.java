package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class IncludeSearchableToolbarWrapperWithComposeLegacyBinding extends ViewDataBinding {
    public final Toolbar A;
    public final ComposeView B;
    public View.OnFocusChangeListener C;
    public final ConstraintLayout y;
    public final SearchView z;

    public IncludeSearchableToolbarWrapperWithComposeLegacyBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, SearchView searchView, Toolbar toolbar, ComposeView composeView) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = searchView;
        this.A = toolbar;
        this.B = composeView;
    }

    public abstract void L(View.OnFocusChangeListener onFocusChangeListener);
}
