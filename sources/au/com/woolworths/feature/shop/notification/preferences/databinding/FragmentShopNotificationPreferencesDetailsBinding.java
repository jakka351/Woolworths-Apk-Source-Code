package au.com.woolworths.feature.shop.notification.preferences.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentShopNotificationPreferencesDetailsBinding extends ViewDataBinding {
    public static final /* synthetic */ int D = 0;
    public final ContentLoadingProgressBar A;
    public final EpoxyRecyclerView B;
    public ShopNotificationPreferencesDetailsViewModel C;
    public final ConstraintLayout y;
    public final IncludeGenericErrorStateBinding z;

    public FragmentShopNotificationPreferencesDetailsBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, ContentLoadingProgressBar contentLoadingProgressBar, EpoxyRecyclerView epoxyRecyclerView) {
        super(dataBindingComponent, view, 2);
        this.y = constraintLayout;
        this.z = includeGenericErrorStateBinding;
        this.A = contentLoadingProgressBar;
        this.B = epoxyRecyclerView;
    }

    public abstract void L(ShopNotificationPreferencesDetailsViewModel shopNotificationPreferencesDetailsViewModel);
}
