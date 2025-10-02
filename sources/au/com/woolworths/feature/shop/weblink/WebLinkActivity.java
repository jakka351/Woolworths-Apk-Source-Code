package au.com.woolworths.feature.shop.weblink;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.a;
import au.com.woolworths.feature.shop.modeselector.ui.b;
import au.com.woolworths.feature.shop.weblink.databinding.ActivityWebLinkBinding;
import au.com.woolworths.feature.shop.weblink.model.Cookie;
import com.dynatrace.android.callback.Callback;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/weblink/WebLinkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WebLinkActivity extends Hilt_WebLinkActivity {
    public static final /* synthetic */ int z = 0;
    public ActivityWebLinkBinding x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(WebLinkViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.weblink.WebLinkActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.weblink.WebLinkActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.weblink.WebLinkActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    public final WebView O4() {
        ActivityWebLinkBinding activityWebLinkBinding = this.x;
        if (activityWebLinkBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        WebView webView = activityWebLinkBinding.A;
        Intrinsics.g(webView, "webView");
        return webView;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (O4().canGoBack()) {
            O4().goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // au.com.woolworths.feature.shop.weblink.Hilt_WebLinkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityWebLinkBinding activityWebLinkBinding = (ActivityWebLinkBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_web_link);
        activityWebLinkBinding.D(this);
        ViewModelLazy viewModelLazy = this.y;
        activityWebLinkBinding.L((WebLinkViewModel) viewModelLazy.getD());
        setSupportActionBar(activityWebLinkBinding.z);
        this.x = activityWebLinkBinding;
        WebView webView = activityWebLinkBinding.A;
        Intrinsics.g(webView, "webView");
        ViewExtKt.b(webView, new b(24));
        WebView webViewO4 = O4();
        WebSettings settings = webViewO4.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setJavaScriptEnabled(true);
        webViewO4.setWebViewClient(new WebLinkActivity$setUpWebView$1$2());
        ((WebLinkViewModel) viewModelLazy.getD()).h.f(this, new WebLinkActivity$sam$androidx_lifecycle_Observer$0(new a(this, 18)));
        Intent intent = getIntent();
        Intrinsics.g(intent, "getIntent(...)");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("Bundle cannot be null");
        }
        String string = extras.getString("webLinkId");
        if (string == null) {
            throw new IllegalArgumentException("webLinkId cannot be null");
        }
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("additionalCookies", Cookie.class) : extras.getParcelableArrayList("additionalCookies");
        WebLinkViewModel webLinkViewModel = (WebLinkViewModel) viewModelLazy.getD();
        webLinkViewModel.g = string;
        BuildersKt.c(ViewModelKt.a(webLinkViewModel), null, null, new WebLinkViewModel$loadWebLink$1(webLinkViewModel, string, parcelableArrayList, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
