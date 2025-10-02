package au.com.woolworths.feature.shop.ask.olive.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.shared.web.file.uploader.WebChromeFileUploadHelper;
import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity;
import au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures;
import au.com.woolworths.feature.shop.ask.olive.analytics.AskOliveActions;
import au.com.woolworths.feature.shop.ask.olive.databinding.ActivityChatWithOliveBinding;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveContract;
import au.com.woolworths.feature.shop.ask.olive.ui.jsbridge.AskOliveJsInterface;
import au.com.woolworths.feature.shop.ask.olive.ui.jsbridge.MagicLinkAuthentication;
import au.com.woolworths.feature.shop.ask.olive.ui.link.LinkAction;
import au.com.woolworths.feature.shop.ask.olive.ui.model.EndChatAction;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.net.URI;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "CameraPermissionActivityContract", "Companion", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AskOliveActivity extends Hilt_AskOliveActivity {
    public static final /* synthetic */ int I = 0;
    public FeatureToggleManager A;
    public ActivityChatWithOliveBinding B;
    public WebChromeFileUploadHelper D;
    public Intent E;
    public boolean F;
    public TextView x;
    public AskOliveJsInterface y;
    public AnalyticsManager z;
    public final ViewModelLazy C = new ViewModelLazy(Reflection.f24268a.b(AskOliveViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final ActivityResultLauncher G = registerForActivityResult(new CameraPermissionActivityContract(), new ActivityResultCallback() { // from class: au.com.woolworths.feature.shop.ask.olive.ui.c
        @Override // androidx.activity.result.ActivityResultCallback
        public final void a(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            AskOliveActivity askOliveActivity = this.d;
            if (!zBooleanValue) {
                int i = AskOliveActivity.I;
                askOliveActivity.Q4().d();
            } else {
                Intent intent = askOliveActivity.E;
                if (intent != null) {
                    askOliveActivity.startActivityForResult(intent, 1010);
                }
            }
        }
    });
    public final AskOliveActivity$onBackPressedCallback$1 H = new OnBackPressedCallback() { // from class: au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity$onBackPressedCallback$1
        {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            AskOliveActivity askOliveActivity = this.d;
            ActivityChatWithOliveBinding activityChatWithOliveBinding = askOliveActivity.B;
            if (activityChatWithOliveBinding == null) {
                Intrinsics.p("binding");
                throw null;
            }
            if (activityChatWithOliveBinding.A.canGoBack()) {
                ActivityChatWithOliveBinding activityChatWithOliveBinding2 = askOliveActivity.B;
                if (activityChatWithOliveBinding2 != null) {
                    activityChatWithOliveBinding2.A.goBack();
                    return;
                } else {
                    Intrinsics.p("binding");
                    throw null;
                }
            }
            askOliveActivity.O4().c(AskOliveActions.f);
            if (askOliveActivity.P4().c(AskOliveFeatures.e)) {
                askOliveActivity.finish();
            } else {
                askOliveActivity.S4(new b(askOliveActivity, 1));
            }
        }
    };

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveActivity$CameraPermissionActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CameraPermissionActivityContract extends ActivityResultContract<Unit, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Unit input = (Unit) obj;
            Intrinsics.h(input, "input");
            return new Intent(context, (Class<?>) CameraPermissionActivity.class);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Boolean parseResult(int i, Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveActivity$Companion;", "", "", "REQUEST_CODE_TAKE_PHOTO", "I", "REQUEST_PICK_FILE_FILE", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[EndChatAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EndChatAction[] endChatActionArr = EndChatAction.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final AnalyticsManager O4() {
        AnalyticsManager analyticsManager = this.z;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.p("analyticsManager");
        throw null;
    }

    public final FeatureToggleManager P4() {
        FeatureToggleManager featureToggleManager = this.A;
        if (featureToggleManager != null) {
            return featureToggleManager;
        }
        Intrinsics.p("featureToggleManager");
        throw null;
    }

    public final WebChromeFileUploadHelper Q4() {
        WebChromeFileUploadHelper webChromeFileUploadHelper = this.D;
        if (webChromeFileUploadHelper != null) {
            return webChromeFileUploadHelper;
        }
        Intrinsics.p("fileUploadHelper");
        throw null;
    }

    public final AskOliveViewModel R4() {
        return (AskOliveViewModel) this.C.getD();
    }

    public final void S4(Function0 function0) {
        new AlertDialog.Builder(this).setTitle(R.string.chat_close_dialog_title).setMessage(R.string.chat_close_dialog_message).setPositiveButton(R.string.yes, new au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.a(this, function0, 1)).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.shop.ask.olive.ui.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = AskOliveActivity.I;
                this.d.O4().c(AskOliveActions.g);
            }
        }).show();
        O4().c(AskOliveActions.e);
    }

    public final void T4(boolean z) {
        TextView textView = this.x;
        if (textView != null) {
            if (z) {
                textView.setTextAppearance(R.style.TextAppearance_Body_Medium);
                textView.setTextColor(getColor(R.color.color_accent));
            } else {
                textView.setTextAppearance(R.style.TextAppearance_Body);
                textView.setTextColor(getColor(R.color.tertiary_text_color));
            }
            textView.setEnabled(z);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1010) {
            if (i2 != -1) {
                Q4().d();
                return;
            }
            WebChromeFileUploadHelper webChromeFileUploadHelperQ4 = Q4();
            ValueCallback valueCallback = webChromeFileUploadHelperQ4.f6561a;
            if (valueCallback != null) {
                Uri uri = webChromeFileUploadHelperQ4.b;
                valueCallback.onReceiveValue(uri != null ? new Uri[]{uri} : new Uri[0]);
            }
            webChromeFileUploadHelperQ4.f6561a = null;
            return;
        }
        if (i != 1011) {
            return;
        }
        if (i2 != -1) {
            Q4().d();
            return;
        }
        if (intent == null) {
            Q4().d();
            return;
        }
        WebChromeFileUploadHelper webChromeFileUploadHelperQ42 = Q4();
        ValueCallback valueCallback2 = webChromeFileUploadHelperQ42.f6561a;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
        }
        webChromeFileUploadHelperQ42.f6561a = null;
    }

    @Override // au.com.woolworths.feature.shop.ask.olive.ui.Hilt_AskOliveActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        OnBackPressedDispatcher f = getF();
        f.getClass();
        AskOliveActivity$onBackPressedCallback$1 onBackPressedCallback = this.H;
        Intrinsics.h(onBackPressedCallback, "onBackPressedCallback");
        f.b(onBackPressedCallback);
        ActivityChatWithOliveBinding activityChatWithOliveBinding = (ActivityChatWithOliveBinding) DataBindingUtil.d(this, R.layout.activity_chat_with_olive);
        activityChatWithOliveBinding.D(this);
        activityChatWithOliveBinding.L(R4());
        setSupportActionBar(activityChatWithOliveBinding.z);
        WebView webView = activityChatWithOliveBinding.A;
        Intrinsics.g(webView, "webView");
        ViewExtKt.b(webView, new au.com.woolworths.feature.shared.instore.wifi.ui.b(10));
        this.B = activityChatWithOliveBinding;
        WebSettings settings = webView.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient() { // from class: au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity$initWebView$1$2
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str3) {
                super.onPageFinished(webView2, str3);
                AskOliveActivity askOliveActivity = this.f6614a;
                if (askOliveActivity.P4().c(AskOliveFeatures.e)) {
                    ActivityChatWithOliveBinding activityChatWithOliveBinding2 = askOliveActivity.B;
                    if (activityChatWithOliveBinding2 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    activityChatWithOliveBinding2.A.evaluateJavascript("getSessionId()", new a(askOliveActivity));
                }
                MutableLiveData mutableLiveData = askOliveActivity.R4().p;
                AskOliveContract.ViewState viewState = (AskOliveContract.ViewState) mutableLiveData.e();
                AskOliveViewModel.r6(mutableLiveData, null, false, viewState != null ? viewState.c : null);
                askOliveActivity.F = true;
                askOliveActivity.R4().a();
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                Intrinsics.h(view, "view");
                Intrinsics.h(request, "request");
                Intrinsics.h(error, "error");
                super.onReceivedError(view, request, error);
                int i = AskOliveActivity.I;
                AskOliveViewModel.r6(this.f6614a.R4().p, null, false, AskOliveErrorState.d);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                LinkAction noOverride;
                Intrinsics.h(view, "view");
                Intrinsics.h(request, "request");
                int i = AskOliveActivity.I;
                AskOliveActivity askOliveActivity = this.f6614a;
                AskOliveViewModel askOliveViewModelR4 = askOliveActivity.R4();
                String string = request.getUrl().toString();
                Intrinsics.g(string, "toString(...)");
                askOliveViewModelR4.g.getClass();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < string.length(); i2++) {
                    char cCharAt = string.charAt(i2);
                    if (!CharsKt.c(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string2 = sb.toString();
                try {
                    String scheme = new URI(string2).getScheme();
                    Intrinsics.g(scheme, "getScheme(...)");
                    String lowerCase = scheme.toLowerCase(Locale.ROOT);
                    Intrinsics.g(lowerCase, "toLowerCase(...)");
                    int iHashCode = lowerCase.hashCode();
                    if (iHashCode == -2117795491) {
                        noOverride = !lowerCase.equals("com.woolworths.shop") ? new LinkAction.OpenAsIntent(string2) : new LinkAction.OpenAsIntent(string2);
                    } else if (iHashCode != 3213448) {
                        if (iHashCode != 99617003 || !lowerCase.equals("https")) {
                        }
                        noOverride = new LinkAction.OpenInTab(string2);
                    } else {
                        if (!lowerCase.equals("http")) {
                        }
                        noOverride = new LinkAction.OpenInTab(string2);
                    }
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.toString();
                    }
                    noOverride = new LinkAction.NoOverride(message);
                }
                if (noOverride instanceof LinkAction.OpenAsIntent) {
                    ContextExtKt.e(askOliveActivity, ((LinkAction.OpenAsIntent) noOverride).f6631a);
                } else if (noOverride instanceof LinkAction.OpenInTab) {
                    ContextExtKt.j(askOliveActivity, ((LinkAction.OpenInTab) noOverride).f6632a, null, null, null, 62);
                }
                return !(noOverride instanceof LinkAction.NoOverride);
            }
        });
        if (P4().c(AskOliveFeatures.d)) {
            webView.setWebChromeClient(new AskOliveActivity$initWebView$1$3(this));
        }
        AskOliveJsInterface askOliveJsInterface = this.y;
        if (askOliveJsInterface == null) {
            Intrinsics.p("jsInterface");
            throw null;
        }
        webView.addJavascriptInterface(askOliveJsInterface, "androidBridge");
        if (P4().c(AskOliveFeatures.e)) {
            webView.addJavascriptInterface(new MagicLinkAuthentication(R4()), "MagicLinkAuthentication");
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AskOliveActivity$subscribeActions$1(this, null), 3);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
        R4().p.f(this, new AskOliveActivity$sam$androidx_lifecycle_Observer$0(new f(this, 0)));
        Intent intent = getIntent();
        Intrinsics.g(intent, "getIntent(...)");
        Activities.AskOliveActivity.Extras extras = (Activities.AskOliveActivity.Extras) intent.getParcelableExtra("EXTRA_DATA");
        String string = (P4().c(BaseShopAppFeature.d) && R4().f.d()) ? getString(R.string.title_message_us) : getString(R.string.title_chat_to_us);
        Intrinsics.e(string);
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.A(string);
        }
        if (extras != null && (str2 = extras.e) != null) {
            R4().o = str2;
        }
        if (extras != null && (str = extras.f) != null) {
            R4().u = str;
        }
        R4().q6();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (P4().c(AskOliveFeatures.f)) {
            getMenuInflater().inflate(R.menu.menu_end_chat, menu);
            MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.action_end_chat) : null;
            View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
            TextView textView = actionView != null ? (TextView) actionView.findViewById(R.id.btn_end_chat) : null;
            if (textView != null) {
                textView.setAllCaps(false);
                textView.setEnabled(false);
            }
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.feature.shop.ask.olive.ui.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AskOliveActivity askOliveActivity = this.d;
                        int i = AskOliveActivity.I;
                        Callback.g(view);
                        try {
                            BuildersKt.c(LifecycleOwnerKt.a(askOliveActivity), null, null, new AskOliveActivity$onCreateOptionsMenu$2$1(askOliveActivity, null), 3);
                        } finally {
                            Callback.h();
                        }
                    }
                });
            }
            this.x = textView;
        }
        return true;
    }

    @Override // au.com.woolworths.feature.shop.ask.olive.ui.Hilt_AskOliveActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ActivityChatWithOliveBinding activityChatWithOliveBinding = this.B;
        if (activityChatWithOliveBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityChatWithOliveBinding.A.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean zOnOptionsItemSelected;
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() == 16908332) {
                O4().c(AskOliveActions.f);
                if (P4().c(AskOliveFeatures.e)) {
                    finish();
                } else {
                    S4(new b(this, 0));
                }
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            }
            return zOnOptionsItemSelected;
        } finally {
            Callback.q();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.F) {
            R4().a();
        }
    }
}
