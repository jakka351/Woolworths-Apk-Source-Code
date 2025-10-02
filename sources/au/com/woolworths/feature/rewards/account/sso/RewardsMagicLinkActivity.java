package au.com.woolworths.feature.rewards.account.sso;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.product.list.legacy.a0;
import au.com.woolworths.feature.rewards.account.data.EndChatAction;
import au.com.woolworths.feature.rewards.account.databinding.ActivityRewardsMagicLinkBinding;
import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkContract;
import au.com.woolworths.feature.shared.web.file.uploader.WebChromeFileUploadHelper;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import com.dynatrace.android.callback.Callback;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsMagicLinkActivity extends Hilt_RewardsMagicLinkActivity {
    public static final /* synthetic */ int F = 0;
    public MandyJsInterface A;
    public Intent B;
    public final ActivityResultLauncher C = registerForActivityResult(new CameraPermissionActivityContract(), new ActivityResultCallback() { // from class: au.com.woolworths.feature.rewards.account.sso.b
        @Override // androidx.activity.result.ActivityResultCallback
        public final void a(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            RewardsMagicLinkActivity rewardsMagicLinkActivity = this.d;
            if (!zBooleanValue) {
                int i = RewardsMagicLinkActivity.F;
                rewardsMagicLinkActivity.O4().d();
            } else {
                Intent intent = rewardsMagicLinkActivity.B;
                if (intent != null) {
                    rewardsMagicLinkActivity.startActivityForResult(intent, 1010);
                }
            }
        }
    });
    public final ViewModelLazy D = new ViewModelLazy(Reflection.f24268a.b(RewardsMagicLinkViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public ActivityRewardsMagicLinkBinding E;
    public TextView x;
    public FeatureToggleManager y;
    public WebChromeFileUploadHelper z;

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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity$onCreate$2", f = "RewardsMagicLinkActivity.kt", l = {148}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity$onCreate$2$1", f = "RewardsMagicLinkActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity$onCreate$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<RewardsMagicLinkContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ RewardsMagicLinkActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RewardsMagicLinkActivity rewardsMagicLinkActivity, Continuation continuation) {
                super(2, continuation);
                this.q = rewardsMagicLinkActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((RewardsMagicLinkContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                RewardsMagicLinkContract.Actions actions = (RewardsMagicLinkContract.Actions) this.p;
                int i = RewardsMagicLinkActivity.F;
                boolean z = actions instanceof RewardsMagicLinkContract.Actions.OpenInChromeTab;
                RewardsMagicLinkActivity rewardsMagicLinkActivity = this.q;
                if (z) {
                    RewardsMagicLinkContract.Actions.OpenInChromeTab openInChromeTab = (RewardsMagicLinkContract.Actions.OpenInChromeTab) actions;
                    ContextExtKt.j(rewardsMagicLinkActivity, openInChromeTab.f5804a, openInChromeTab.b, null, null, 60);
                    rewardsMagicLinkActivity.finish();
                } else if (actions instanceof RewardsMagicLinkContract.Actions.OpenInWebView) {
                    ActivityRewardsMagicLinkBinding activityRewardsMagicLinkBinding = rewardsMagicLinkActivity.E;
                    if (activityRewardsMagicLinkBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    RewardsMagicLinkContract.Actions.OpenInWebView openInWebView = (RewardsMagicLinkContract.Actions.OpenInWebView) actions;
                    activityRewardsMagicLinkBinding.A.loadUrl(openInWebView.f5805a, openInWebView.b);
                } else if (Intrinsics.c(actions, RewardsMagicLinkContract.Actions.RetryChatbotSessionId.f5806a)) {
                    ActivityRewardsMagicLinkBinding activityRewardsMagicLinkBinding2 = rewardsMagicLinkActivity.E;
                    if (activityRewardsMagicLinkBinding2 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    activityRewardsMagicLinkBinding2.A.evaluateJavascript("getSessionId()", new c(rewardsMagicLinkActivity));
                } else if (actions instanceof RewardsMagicLinkContract.Actions.ForwardAccessTokenToWebview) {
                    ActivityRewardsMagicLinkBinding activityRewardsMagicLinkBinding3 = rewardsMagicLinkActivity.E;
                    if (activityRewardsMagicLinkBinding3 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    activityRewardsMagicLinkBinding3.A.loadUrl("javascript:setToken(`" + ((RewardsMagicLinkContract.Actions.ForwardAccessTokenToWebview) actions).f5803a + "`)");
                } else {
                    if (!(actions instanceof RewardsMagicLinkContract.Actions.EndChat)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActivityRewardsMagicLinkBinding activityRewardsMagicLinkBinding4 = rewardsMagicLinkActivity.E;
                    if (activityRewardsMagicLinkBinding4 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    activityRewardsMagicLinkBinding4.A.evaluateJavascript("endChat()", new d(0));
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsMagicLinkActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = RewardsMagicLinkActivity.F;
                RewardsMagicLinkActivity rewardsMagicLinkActivity = RewardsMagicLinkActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(rewardsMagicLinkActivity, null), rewardsMagicLinkActivity.P4().l);
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    public final WebChromeFileUploadHelper O4() {
        WebChromeFileUploadHelper webChromeFileUploadHelper = this.z;
        if (webChromeFileUploadHelper != null) {
            return webChromeFileUploadHelper;
        }
        Intrinsics.p("fileUploadHelper");
        throw null;
    }

    public final RewardsMagicLinkViewModel P4() {
        return (RewardsMagicLinkViewModel) this.D.getD();
    }

    public final void Q4(boolean z) {
        TextView textView = this.x;
        if (textView != null) {
            if (z) {
                textView.setTextAppearance(R.style.TextAppearance_Body_Medium);
                textView.setTextColor(getColor(R.color.rewards_color_primary));
            } else {
                textView.setTextAppearance(R.style.TextAppearance_Body);
                textView.setTextColor(getColor(R.color.rewards_color_text_disabled));
            }
            textView.setEnabled(z);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1010) {
            if (i2 != -1) {
                O4().d();
                return;
            }
            WebChromeFileUploadHelper webChromeFileUploadHelperO4 = O4();
            ValueCallback valueCallback = webChromeFileUploadHelperO4.f6561a;
            if (valueCallback != null) {
                Uri uri = webChromeFileUploadHelperO4.b;
                valueCallback.onReceiveValue(uri != null ? new Uri[]{uri} : new Uri[0]);
            }
            webChromeFileUploadHelperO4.f6561a = null;
            return;
        }
        if (i != 1011) {
            return;
        }
        if (i2 != -1) {
            O4().d();
            return;
        }
        if (intent == null) {
            O4().d();
            return;
        }
        WebChromeFileUploadHelper webChromeFileUploadHelperO42 = O4();
        ValueCallback valueCallback2 = webChromeFileUploadHelperO42.f6561a;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
        }
        webChromeFileUploadHelperO42.f6561a = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityRewardsMagicLinkBinding activityRewardsMagicLinkBinding = this.E;
        if (activityRewardsMagicLinkBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        if (!activityRewardsMagicLinkBinding.A.canGoBack()) {
            super.onBackPressed();
            return;
        }
        ActivityRewardsMagicLinkBinding activityRewardsMagicLinkBinding2 = this.E;
        if (activityRewardsMagicLinkBinding2 != null) {
            activityRewardsMagicLinkBinding2.A.goBack();
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }

    @Override // au.com.woolworths.feature.rewards.account.sso.Hilt_RewardsMagicLinkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityRewardsMagicLinkBinding activityRewardsMagicLinkBinding = (ActivityRewardsMagicLinkBinding) DataBindingUtil.d(this, R.layout.activity_rewards_magic_link);
        activityRewardsMagicLinkBinding.D(this);
        activityRewardsMagicLinkBinding.L(P4());
        setSupportActionBar(activityRewardsMagicLinkBinding.z);
        WebView webView = activityRewardsMagicLinkBinding.A;
        Intrinsics.g(webView, "webView");
        ViewExtKt.b(webView, new a0(12));
        this.E = activityRewardsMagicLinkBinding;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.addJavascriptInterface(new MagicLinkTokenInterface(P4()), "MagicLinkAuthentication");
        MandyJsInterface mandyJsInterface = this.A;
        if (mandyJsInterface == null) {
            Intrinsics.p("mandyInterface");
            throw null;
        }
        webView.addJavascriptInterface(mandyJsInterface, "androidBridge");
        webView.setWebViewClient(new WebViewClient() { // from class: au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity$initWebView$1$1
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
                int i = RewardsMagicLinkActivity.F;
                RewardsMagicLinkActivity rewardsMagicLinkActivity = this.f5800a;
                ActivityRewardsMagicLinkBinding activityRewardsMagicLinkBinding2 = rewardsMagicLinkActivity.E;
                if (activityRewardsMagicLinkBinding2 != null) {
                    activityRewardsMagicLinkBinding2.A.evaluateJavascript("getSessionId()", new c(rewardsMagicLinkActivity));
                } else {
                    Intrinsics.p("binding");
                    throw null;
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                boolean z;
                Intrinsics.h(view, "view");
                Intrinsics.h(request, "request");
                int i = RewardsMagicLinkActivity.F;
                RewardsMagicLinkActivity rewardsMagicLinkActivity = this.f5800a;
                rewardsMagicLinkActivity.P4();
                Uri url = request.getUrl();
                Intrinsics.g(url, "getUrl(...)");
                ArrayList arrayList = RewardsMagicLinkViewModel.p;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        String host = url.getHost();
                        if (host != null ? StringsKt.v(host, str, false) : false) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    return false;
                }
                String string = request.getUrl().toString();
                Intrinsics.g(string, "toString(...)");
                ContextExtKt.e(rewardsMagicLinkActivity, string);
                return true;
            }
        });
        webView.setWebChromeClient(new RewardsMagicLinkActivity$initWebView$1$2(this));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new RewardsMagicLinkActivity$subscribeMandyJsActions$1(this, null), 3);
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.isMagicLink", false)) {
            RewardsMagicLinkViewModel rewardsMagicLinkViewModelP4 = P4();
            String stringExtra = getIntent().getStringExtra("title");
            if (stringExtra == null) {
                throw new IllegalArgumentException("title cannot be null");
            }
            RewardsMagicLinkViewModel.p6(rewardsMagicLinkViewModelP4, rewardsMagicLinkViewModelP4.i, false, null, null, stringExtra, 7);
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        String stringExtra2 = getIntent().getStringExtra("page");
        if (stringExtra2 == null) {
            throw new IllegalArgumentException("page cannot be null");
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("magic_link_preferred_launch_mode");
        Activities.MagicLinkActivity.PreferredLaunchMode preferredLaunchMode = serializableExtra instanceof Activities.MagicLinkActivity.PreferredLaunchMode ? (Activities.MagicLinkActivity.PreferredLaunchMode) serializableExtra : null;
        RewardsMagicLinkViewModel rewardsMagicLinkViewModelP42 = P4();
        rewardsMagicLinkViewModelP42.m = preferredLaunchMode;
        BuildersKt.c(ViewModelKt.a(rewardsMagicLinkViewModelP42), null, null, new RewardsMagicLinkViewModel$getMagicLink$1(rewardsMagicLinkViewModelP42, stringExtra2, preferredLaunchMode, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        String stringExtra = getIntent().getStringExtra("page");
        FeatureToggleManager featureToggleManager = this.y;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (!featureToggleManager.c(RewardsBaseFeature.f) || !Intrinsics.c(stringExtra, "mandy") || RewardsAccountInteractorKt.a(P4().g) == Region.j) {
            return true;
        }
        getMenuInflater().inflate(R.menu.menu_end_chat, menu);
        MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.action_end_chat) : null;
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        TextView textView = actionView != null ? (TextView) actionView.findViewById(R.id.btn_end_chat) : null;
        if (textView != null) {
            textView.setAllCaps(false);
        }
        if (textView != null) {
            textView.setEnabled(false);
        }
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.feature.rewards.account.sso.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RewardsMagicLinkActivity rewardsMagicLinkActivity = this.d;
                    int i = RewardsMagicLinkActivity.F;
                    Callback.g(view);
                    try {
                        BuildersKt.c(LifecycleOwnerKt.a(rewardsMagicLinkActivity), null, null, new RewardsMagicLinkActivity$setupEndChatButton$1$1(rewardsMagicLinkActivity, null), 3);
                    } finally {
                        Callback.h();
                    }
                }
            });
        }
        this.x = textView;
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
