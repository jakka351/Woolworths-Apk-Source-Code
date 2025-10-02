package au.com.woolworths.feature.rewards.account.callback;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.DownloadListener;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.rewards.account.callback.DownloadBlobJavascriptInterface;
import au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlContract;
import au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel;
import au.com.woolworths.feature.rewards.account.databinding.ActivityRewardsCallbackUrlBinding;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/feature/rewards/account/callback/DownloadBlobJavascriptInterface$Listener;", "<init>", "()V", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsCallbackUrlActivity extends Hilt_RewardsCallbackUrlActivity implements DownloadBlobJavascriptInterface.Listener {
    public static final /* synthetic */ int B = 0;
    public final Lazy A;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(RewardsCallbackUrlViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public ActivityRewardsCallbackUrlBinding y;
    public final Lazy z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlActivity$onCreate$2", f = "RewardsCallbackUrlActivity.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<RewardsCallbackUrlContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RewardsCallbackUrlContract.Actions actions = (RewardsCallbackUrlContract.Actions) obj;
                RewardsCallbackUrlActivity rewardsCallbackUrlActivity = (RewardsCallbackUrlActivity) this.d;
                if (actions instanceof RewardsCallbackUrlContract.Actions.OpenInWebView) {
                    ActivityRewardsCallbackUrlBinding activityRewardsCallbackUrlBinding = rewardsCallbackUrlActivity.y;
                    if (activityRewardsCallbackUrlBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    RewardsCallbackUrlContract.Actions.OpenInWebView openInWebView = (RewardsCallbackUrlContract.Actions.OpenInWebView) actions;
                    activityRewardsCallbackUrlBinding.A.loadUrl(openInWebView.f5677a, openInWebView.b);
                } else {
                    int i = RewardsCallbackUrlActivity.B;
                    rewardsCallbackUrlActivity.getClass();
                    if (actions instanceof RewardsCallbackUrlContract.Actions.CloseScreen) {
                        Intent intent = new Intent();
                        intent.putExtra("SUCCESS", true);
                        rewardsCallbackUrlActivity.setResult(-1, intent);
                        rewardsCallbackUrlActivity.finish();
                    } else {
                        if (!Intrinsics.c(actions, RewardsCallbackUrlContract.Actions.Retry.f5678a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rewardsCallbackUrlActivity.P4();
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsCallbackUrlActivity.this.new AnonymousClass2(continuation);
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
                int i2 = RewardsCallbackUrlActivity.B;
                RewardsCallbackUrlActivity rewardsCallbackUrlActivity = RewardsCallbackUrlActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, rewardsCallbackUrlActivity, RewardsCallbackUrlActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$Actions;)V", 4), rewardsCallbackUrlActivity.O4().j);
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

    public RewardsCallbackUrlActivity() {
        final int i = 0;
        this.z = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.rewards.account.callback.b
            public final /* synthetic */ RewardsCallbackUrlActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                final RewardsCallbackUrlActivity rewardsCallbackUrlActivity = this.e;
                switch (i2) {
                    case 0:
                        int i3 = RewardsCallbackUrlActivity.B;
                        Activities.RewardsCallbackUrlActivity.Extras extras = (Activities.RewardsCallbackUrlActivity.Extras) rewardsCallbackUrlActivity.getIntent().getParcelableExtra("EXTRAS");
                        if (extras != null) {
                            return extras;
                        }
                        throw new IllegalArgumentException("EXTRAS cannot be null");
                    default:
                        int i4 = RewardsCallbackUrlActivity.B;
                        return new WebViewClient() { // from class: au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlActivity$callbackUrlWebViewClient$2$1
                            public final boolean a(Uri uri) {
                                int i5 = RewardsCallbackUrlActivity.B;
                                RewardsCallbackUrlActivity rewardsCallbackUrlActivity2 = rewardsCallbackUrlActivity;
                                RewardsCallbackUrlViewModel rewardsCallbackUrlViewModelO4 = rewardsCallbackUrlActivity2.O4();
                                Activities.RewardsCallbackUrlActivity.Extras extras2 = (Activities.RewardsCallbackUrlActivity.Extras) rewardsCallbackUrlActivity2.z.getD();
                                String string = uri != null ? uri.toString() : null;
                                if (string == null) {
                                    string = "";
                                }
                                Intrinsics.h(extras2, "extras");
                                if (!StringsKt.o(string, extras2.g, false)) {
                                    return StringsKt.W(string, "intent://", false);
                                }
                                if (RewardsCallbackUrlViewModel.WhenMappings.f5680a[extras2.f.ordinal()] != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                BuildersKt.c(ViewModelKt.a(rewardsCallbackUrlViewModelO4), null, null, new RewardsCallbackUrlViewModel$performLogout$1(rewardsCallbackUrlViewModelO4, null), 3);
                                return true;
                            }

                            @Override // android.webkit.WebViewClient
                            public final void onPageFinished(WebView webView, String str) {
                                super.onPageFinished(webView, str);
                                int i5 = RewardsCallbackUrlActivity.B;
                                RewardsCallbackUrlViewModel rewardsCallbackUrlViewModelO4 = rewardsCallbackUrlActivity.O4();
                                RewardsCallbackUrlViewModel.p6(rewardsCallbackUrlViewModelO4, rewardsCallbackUrlViewModelO4.g, false, null, null, null, 14);
                            }

                            @Override // android.webkit.WebViewClient
                            public final void onReceivedError(WebView webView, int i5, String str, String str2) {
                                super.onReceivedError(webView, i5, str, str2);
                                int i6 = RewardsCallbackUrlActivity.B;
                                RewardsCallbackUrlViewModel rewardsCallbackUrlViewModelO4 = rewardsCallbackUrlActivity.O4();
                                RewardsCallbackUrlViewModel.p6(rewardsCallbackUrlViewModelO4, rewardsCallbackUrlViewModelO4.g, false, null, null, RewardsCallbackUrlErrorState.e, 6);
                            }

                            @Override // android.webkit.WebViewClient
                            public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                                return a(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                            }

                            @Override // android.webkit.WebViewClient
                            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                                return a(str != null ? Uri.parse(str) : null);
                            }
                        };
                }
            }
        });
        final int i2 = 1;
        this.A = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.rewards.account.callback.b
            public final /* synthetic */ RewardsCallbackUrlActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                final RewardsCallbackUrlActivity rewardsCallbackUrlActivity = this.e;
                switch (i22) {
                    case 0:
                        int i3 = RewardsCallbackUrlActivity.B;
                        Activities.RewardsCallbackUrlActivity.Extras extras = (Activities.RewardsCallbackUrlActivity.Extras) rewardsCallbackUrlActivity.getIntent().getParcelableExtra("EXTRAS");
                        if (extras != null) {
                            return extras;
                        }
                        throw new IllegalArgumentException("EXTRAS cannot be null");
                    default:
                        int i4 = RewardsCallbackUrlActivity.B;
                        return new WebViewClient() { // from class: au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlActivity$callbackUrlWebViewClient$2$1
                            public final boolean a(Uri uri) {
                                int i5 = RewardsCallbackUrlActivity.B;
                                RewardsCallbackUrlActivity rewardsCallbackUrlActivity2 = rewardsCallbackUrlActivity;
                                RewardsCallbackUrlViewModel rewardsCallbackUrlViewModelO4 = rewardsCallbackUrlActivity2.O4();
                                Activities.RewardsCallbackUrlActivity.Extras extras2 = (Activities.RewardsCallbackUrlActivity.Extras) rewardsCallbackUrlActivity2.z.getD();
                                String string = uri != null ? uri.toString() : null;
                                if (string == null) {
                                    string = "";
                                }
                                Intrinsics.h(extras2, "extras");
                                if (!StringsKt.o(string, extras2.g, false)) {
                                    return StringsKt.W(string, "intent://", false);
                                }
                                if (RewardsCallbackUrlViewModel.WhenMappings.f5680a[extras2.f.ordinal()] != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                BuildersKt.c(ViewModelKt.a(rewardsCallbackUrlViewModelO4), null, null, new RewardsCallbackUrlViewModel$performLogout$1(rewardsCallbackUrlViewModelO4, null), 3);
                                return true;
                            }

                            @Override // android.webkit.WebViewClient
                            public final void onPageFinished(WebView webView, String str) {
                                super.onPageFinished(webView, str);
                                int i5 = RewardsCallbackUrlActivity.B;
                                RewardsCallbackUrlViewModel rewardsCallbackUrlViewModelO4 = rewardsCallbackUrlActivity.O4();
                                RewardsCallbackUrlViewModel.p6(rewardsCallbackUrlViewModelO4, rewardsCallbackUrlViewModelO4.g, false, null, null, null, 14);
                            }

                            @Override // android.webkit.WebViewClient
                            public final void onReceivedError(WebView webView, int i5, String str, String str2) {
                                super.onReceivedError(webView, i5, str, str2);
                                int i6 = RewardsCallbackUrlActivity.B;
                                RewardsCallbackUrlViewModel rewardsCallbackUrlViewModelO4 = rewardsCallbackUrlActivity.O4();
                                RewardsCallbackUrlViewModel.p6(rewardsCallbackUrlViewModelO4, rewardsCallbackUrlViewModelO4.g, false, null, null, RewardsCallbackUrlErrorState.e, 6);
                            }

                            @Override // android.webkit.WebViewClient
                            public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                                return a(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                            }

                            @Override // android.webkit.WebViewClient
                            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                                return a(str != null ? Uri.parse(str) : null);
                            }
                        };
                }
            }
        });
    }

    public final RewardsCallbackUrlViewModel O4() {
        return (RewardsCallbackUrlViewModel) this.x.getD();
    }

    public final void P4() {
        RewardsCallbackUrlViewModel rewardsCallbackUrlViewModelO4 = O4();
        String url = ((Activities.RewardsCallbackUrlActivity.Extras) this.z.getD()).e;
        Intrinsics.h(url, "url");
        BuildersKt.c(ViewModelKt.a(rewardsCallbackUrlViewModelO4), null, null, new RewardsCallbackUrlViewModel$launchUrl$1(rewardsCallbackUrlViewModelO4, url, null), 3);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityRewardsCallbackUrlBinding activityRewardsCallbackUrlBinding = this.y;
        if (activityRewardsCallbackUrlBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        if (!activityRewardsCallbackUrlBinding.A.canGoBack()) {
            super.onBackPressed();
            return;
        }
        ActivityRewardsCallbackUrlBinding activityRewardsCallbackUrlBinding2 = this.y;
        if (activityRewardsCallbackUrlBinding2 != null) {
            activityRewardsCallbackUrlBinding2.A.goBack();
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }

    @Override // au.com.woolworths.feature.rewards.account.callback.Hilt_RewardsCallbackUrlActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityRewardsCallbackUrlBinding activityRewardsCallbackUrlBinding = (ActivityRewardsCallbackUrlBinding) DataBindingUtil.d(this, R.layout.activity_rewards_callback_url);
        activityRewardsCallbackUrlBinding.D(this);
        activityRewardsCallbackUrlBinding.L(O4());
        setSupportActionBar(activityRewardsCallbackUrlBinding.z);
        this.y = activityRewardsCallbackUrlBinding;
        final WebView webView = activityRewardsCallbackUrlBinding.A;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient((WebViewClient) this.A.getD());
        webView.setDownloadListener(new DownloadListener() { // from class: au.com.woolworths.feature.rewards.account.callback.a
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                int i = RewardsCallbackUrlActivity.B;
                Intrinsics.e(str);
                if (StringsKt.W(str, "blob:", false)) {
                    Intrinsics.e(str3);
                    Intrinsics.e(str4);
                    StringBuilder sb = new StringBuilder("\n                (async () => {\n                  const response = await fetch('");
                    sb.append(str);
                    sb.append("', {\n                    headers: {\n                      'Content-Type': '");
                    androidx.constraintlayout.core.state.a.B(sb, str4, "',\n                    }\n                  });\n                  const blob = await response.blob();\n \n                  const reader = new FileReader();\n                  reader.addEventListener('load', () => {\n                    const base64 = reader.result.replace(/^data:.+;base64,/, '');\n                    DownloadBlob.downloadBase64DataToStorage(\n                      base64,\n                      '", str, "',\n                      '");
                    sb.append(str3);
                    sb.append("',\n                      '");
                    sb.append(str4);
                    sb.append("'\n                    );\n                  });\n                  reader.readAsDataURL(blob);\n                })();\n            ");
                    webView.evaluateJavascript(StringsKt.m0(sb.toString()), null);
                }
            }
        });
        webView.addJavascriptInterface(new DownloadBlobJavascriptInterface(this, this), "DownloadBlob");
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        RewardsCallbackUrlViewModel rewardsCallbackUrlViewModelO4 = O4();
        String title = ((Activities.RewardsCallbackUrlActivity.Extras) this.z.getD()).d;
        Intrinsics.h(title, "title");
        RewardsCallbackUrlViewModel.p6(rewardsCallbackUrlViewModelO4, rewardsCallbackUrlViewModelO4.g, false, title, null, null, 13);
        if (bundle == null) {
            P4();
        }
    }

    @Override // au.com.woolworths.feature.rewards.account.callback.Hilt_RewardsCallbackUrlActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ActivityRewardsCallbackUrlBinding activityRewardsCallbackUrlBinding = this.y;
        if (activityRewardsCallbackUrlBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityRewardsCallbackUrlBinding.A.destroy();
        super.onDestroy();
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.h(permissions, "permissions");
        Intrinsics.h(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        if (i == 9000) {
            if (grantResults.length != 0 && grantResults[0] == 0) {
                return;
            }
            ActivityRewardsCallbackUrlBinding activityRewardsCallbackUrlBinding = this.y;
            if (activityRewardsCallbackUrlBinding != null) {
                Snackbar.i(activityRewardsCallbackUrlBinding.A, R.string.storage_permission_needed, 0).l();
            } else {
                Intrinsics.p("binding");
                throw null;
            }
        }
    }
}
