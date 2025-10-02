package au.com.woolworths.feature.shop.voc.databinding;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityVocSurveyWebViewBinding extends ViewDataBinding {
    public final View A;
    public final Toolbar B;
    public final WebView C;
    public VocSurveyWebViewViewModel D;
    public final IncludeGenericErrorStateBinding y;
    public final ContentLoadingProgressBar z;

    public ActivityVocSurveyWebViewBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, ContentLoadingProgressBar contentLoadingProgressBar, View view2, Toolbar toolbar, WebView webView) {
        super(dataBindingComponent, view, 2);
        this.y = includeGenericErrorStateBinding;
        this.z = contentLoadingProgressBar;
        this.A = view2;
        this.B = toolbar;
        this.C = webView;
    }

    public abstract void L(VocSurveyWebViewViewModel vocSurveyWebViewViewModel);
}
