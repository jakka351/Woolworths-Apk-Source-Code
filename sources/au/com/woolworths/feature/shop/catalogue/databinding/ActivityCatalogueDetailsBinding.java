package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityCatalogueDetailsBinding extends ViewDataBinding {
    public final ViewPager A;
    public final ConstraintLayout B;
    public final IncludeGenericErrorStateBinding C;
    public final ProgressBar D;
    public final Toolbar E;
    public CatalogueDetailsViewModel F;
    public final TextView y;
    public final AppCompatSeekBar z;

    public ActivityCatalogueDetailsBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, AppCompatSeekBar appCompatSeekBar, ViewPager viewPager, ConstraintLayout constraintLayout, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, ProgressBar progressBar, Toolbar toolbar) {
        super(dataBindingComponent, view, 2);
        this.y = textView;
        this.z = appCompatSeekBar;
        this.A = viewPager;
        this.B = constraintLayout;
        this.C = includeGenericErrorStateBinding;
        this.D = progressBar;
        this.E = toolbar;
    }

    public abstract void L(CatalogueDetailsViewModel catalogueDetailsViewModel);
}
