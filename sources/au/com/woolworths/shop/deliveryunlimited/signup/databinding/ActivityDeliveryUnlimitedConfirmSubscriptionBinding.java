package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel;

/* loaded from: classes4.dex */
public abstract class ActivityDeliveryUnlimitedConfirmSubscriptionBinding extends ViewDataBinding {
    public final TextView A;
    public final IncludeHorizontalDividerBinding B;
    public final IncludeGenericErrorStateBinding C;
    public final ContentLoadingProgressBar D;
    public final FrameLayout E;
    public final View F;
    public final ImageView G;
    public final ConstraintLayout H;
    public final Toolbar I;
    public final StatefulButton J;
    public ConfirmSubscriptionViewModel K;
    public final TextView y;
    public final FrameLayout z;

    public ActivityDeliveryUnlimitedConfirmSubscriptionBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, FrameLayout frameLayout, TextView textView2, IncludeHorizontalDividerBinding includeHorizontalDividerBinding, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, ContentLoadingProgressBar contentLoadingProgressBar, FrameLayout frameLayout2, View view2, ImageView imageView, ConstraintLayout constraintLayout, Toolbar toolbar, StatefulButton statefulButton) {
        super(dataBindingComponent, view, 3);
        this.y = textView;
        this.z = frameLayout;
        this.A = textView2;
        this.B = includeHorizontalDividerBinding;
        this.C = includeGenericErrorStateBinding;
        this.D = contentLoadingProgressBar;
        this.E = frameLayout2;
        this.F = view2;
        this.G = imageView;
        this.H = constraintLayout;
        this.I = toolbar;
        this.J = statefulButton;
    }

    public abstract void L(ConfirmSubscriptionViewModel confirmSubscriptionViewModel);
}
