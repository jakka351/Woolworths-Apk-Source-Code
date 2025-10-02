package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class IncludeSearchSuggestionBinding extends ViewDataBinding {
    public final ComposeView A;
    public final RecyclerView y;
    public final ComposeView z;

    public IncludeSearchSuggestionBinding(DataBindingComponent dataBindingComponent, View view, RecyclerView recyclerView, ComposeView composeView, ComposeView composeView2) {
        super(dataBindingComponent, view, 0);
        this.y = recyclerView;
        this.z = composeView;
        this.A = composeView2;
    }
}
