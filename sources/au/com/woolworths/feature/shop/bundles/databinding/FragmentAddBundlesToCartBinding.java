package au.com.woolworths.feature.shop.bundles.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;

/* loaded from: classes3.dex */
public abstract class FragmentAddBundlesToCartBinding extends ViewDataBinding {
    public static final /* synthetic */ int G = 0;
    public final HorizontalSelectorView A;
    public final FrameLayout B;
    public final StatefulButton C;
    public final StatefulButton D;
    public AddBundlesToCartViewModel E;
    public Bundle F;
    public final StatefulButton y;
    public final ComposeView z;

    public FragmentAddBundlesToCartBinding(DataBindingComponent dataBindingComponent, View view, StatefulButton statefulButton, ComposeView composeView, HorizontalSelectorView horizontalSelectorView, FrameLayout frameLayout, StatefulButton statefulButton2, StatefulButton statefulButton3) {
        super(dataBindingComponent, view, 1);
        this.y = statefulButton;
        this.z = composeView;
        this.A = horizontalSelectorView;
        this.B = frameLayout;
        this.C = statefulButton2;
        this.D = statefulButton3;
    }

    public abstract void L(Bundle bundle);

    public abstract void M(AddBundlesToCartViewModel addBundlesToCartViewModel);
}
