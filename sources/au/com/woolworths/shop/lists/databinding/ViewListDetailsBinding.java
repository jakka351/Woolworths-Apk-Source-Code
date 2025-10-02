package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public abstract class ViewListDetailsBinding extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;
    public final ComposeView y;
    public final ComposeView z;

    public ViewListDetailsBinding(DataBindingComponent dataBindingComponent, View view, ComposeView composeView, ComposeView composeView2) {
        super(dataBindingComponent, view, 0);
        this.y = composeView;
        this.z = composeView2;
    }
}
