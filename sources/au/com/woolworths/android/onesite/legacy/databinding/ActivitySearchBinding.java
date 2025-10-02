package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;

/* loaded from: classes3.dex */
public abstract class ActivitySearchBinding extends ViewDataBinding {
    public final IncludeSearchSuggestionBinding A;
    public final SearchView B;
    public final Toolbar C;
    public final IncludeUnableToLoadBinding D;
    public final View E;
    public final ImageView F;
    public final ComposeView G;
    public Boolean H;
    public final IncludeConnectionErrorBinding y;
    public final ViewStubProxy z;

    public ActivitySearchBinding(DataBindingComponent dataBindingComponent, View view, IncludeConnectionErrorBinding includeConnectionErrorBinding, ViewStubProxy viewStubProxy, IncludeSearchSuggestionBinding includeSearchSuggestionBinding, SearchView searchView, Toolbar toolbar, IncludeUnableToLoadBinding includeUnableToLoadBinding, View view2, ImageView imageView, ComposeView composeView) {
        super(dataBindingComponent, view, 3);
        this.y = includeConnectionErrorBinding;
        this.z = viewStubProxy;
        this.A = includeSearchSuggestionBinding;
        this.B = searchView;
        this.C = toolbar;
        this.D = includeUnableToLoadBinding;
        this.E = view2;
        this.F = imageView;
        this.G = composeView;
    }

    public abstract void L(Boolean bool);
}
